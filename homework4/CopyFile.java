package Homework.hw4;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        String source = "D:java\\test.txt"; // user source
        String destination = "D:\java\out.txt"; // user destination
        File in = new File(source);
        if (!in.isFile()){
            in.createNewFile();
            String text = " test case";
            FileOutputStream os = new FileOutputStream(in);
            os.write(text.getBytes());
            os.close();
        }
        File out = new File(destination);
//        File out = new File(in.getParent() + File.separator + "out.txt"); // copy file to auto destination
        FileInputStream fileInputStream = new FileInputStream(in);
        FileOutputStream outputStream = new FileOutputStream(out, true);
        byte[] data = new byte[1024];

        while (fileInputStream.read()!=-1){
            fileInputStream.read(data);
            outputStream.write(data);
            outputStream.flush();
        }

        outputStream.close();

    }
}
