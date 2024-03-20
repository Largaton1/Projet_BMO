import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GenerateurCode {

    public static void convertir(String inputFilePath, String outputDirPath) throws IOException {
        String dotUmlContent = lecture(inputFilePath);
        Map<String, String> classes = parseDotUml(dotUmlContent);

        if (!outputDirPath.endsWith("/")) {
            outputDirPath += "/";
        }

        for (Map.Entry<String, String> entry : classes.entrySet()) {
            String className = entry.getKey();
            String classContent = entry.getValue();

            String outputFilePath = outputDirPath + className + ".java";
            writeClassToFile(classContent, outputFilePath);
        }
    }

    private static String lecture(String inputFilePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }

    private static Map<String, String> parseDotUml(String dotUmlContent) {
        Map<String, String> classMap = new HashMap<>();

        String classPatternStr = "class\\s+(\\w+)\\s+\\{\\s*(.*?)\\s*\\}";
        Pattern classPattern = Pattern.compile(classPatternStr, Pattern.DOTALL);
        Matcher classMatcher = classPattern.matcher(dotUmlContent);

        while (classMatcher.find()) {
            String className = classMatcher.group(1);
            String attributesStr = classMatcher.group(2);
            String classContent = generateurCode(className, attributesStr);
            classMap.put(className, classContent);
        }

        return classMap;
    }

    private static String generateurCode(String className, String attributesStr) {
        StringBuilder classContentBuilder = new StringBuilder();
        classContentBuilder.append("@Entity\n");
        classContentBuilder.append("public class ").append(className).append(" {\n");

        String attributePatternStr = "(\\w+)\\s*:\\s*(\\w+)";
        Pattern attributePattern = Pattern.compile(attributePatternStr);
        Matcher attributeMatcher = attributePattern.matcher(attributesStr);

        while (attributeMatcher.find()) {
            String attributeName = attributeMatcher.group(1);
            String attributeType = attributeMatcher.group(2);
            classContentBuilder.append("\t@Column\n");
            classContentBuilder.append("\t").append(attributeType).append(" ").append(attributeName).append(";\n");
        }

        String methodPatternStr = "public\\s+(\\w+)\\s*\\([^)]*\\)";
        Pattern methodPattern = Pattern.compile(methodPatternStr);
        Matcher methodMatcher = methodPattern.matcher(attributesStr);

        while (methodMatcher.find()) {
            String methodName = methodMatcher.group(1);
            classContentBuilder.append("\tpublic void ").append(methodName).append("() {\n");
            classContentBuilder.append("\t\t// Implementation\n");
            classContentBuilder.append("\t}\n");
        }

        classContentBuilder.append("}\n\n");
        return classContentBuilder.toString();
    }

    private static void writeClassToFile(String classContent, String outputFilePath) throws IOException {
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            writer.write(classContent);
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "diagclass.txt";
        String outputDirPath = "output";

        try {
            convertir(inputFilePath, outputDirPath);
            System.out.println("Conversion réussie !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la conversion : " + e.getMessage());
            e.printStackTrace();
        }
    }

}
