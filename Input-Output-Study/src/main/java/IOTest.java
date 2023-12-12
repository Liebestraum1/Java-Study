import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IOTest {
    private static final String path = "src/main/resources/test.txt";
    public void ReadUsingBufferedInputStream() throws IOException{
        int data;
        int bufferSize = 1024;
        byte[] buffer = new byte[1024];

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path), bufferSize)){
            while((data = bis.read(buffer, 0, bufferSize)) != -1){
                System.out.println("읽어온 데이터 양 : " + data);
                System.out.write(buffer, 0, data);
            }
        }
    }
    // 한글이 깨지는 문제가 있다.
    public void ReadUsingFileInputStream() throws IOException{
        int data;
        try (FileInputStream fis = new FileInputStream(path)){
            while((data = fis.read()) != -1){
                System.out.write(data);
            }
        }
    }
    public void ReadUsingNIOFiles() throws IOException {
        List<String> lines = Files.readAllLines(Path.of(path));
        lines.forEach(System.out::println);
    }
    public void ReadUsingBufferedReader() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            br.lines().forEach(System.out::println);
        }
    }
}