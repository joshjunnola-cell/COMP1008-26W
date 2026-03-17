import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOFileExample {
    public static void main(String[] args) throws IOException {
        String fileName = "nioFile.txt";
        String content = "Modern File Operations with NIO";

        // Write using NIO
        Path path = Paths.get(fileName);
        System.out.println(path);
        Files.write(path, content.getBytes());

        // Read using NIO
        byte[] bytes = Files.readAllBytes(path);
        String readContent = new String(bytes);
        System.out.println(readContent);
    }
}