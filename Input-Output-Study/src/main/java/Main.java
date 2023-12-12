import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IOTest iotest = new IOTest();

//        iotest.ReadUsingBufferedInputStream();
//        iotest.ReadUsingNIOFiles();
//        iotest.ReadUsingFileInputStream();
        iotest.ReadUsingBufferedReader();
    }
}