import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class JavaNIO_05_Main {

    public static void main(String[] args) throws IOException {

//        transferFrom();
//        transferTo();
    }

    private static void transferFrom() throws IOException {

        RandomAccessFile fromFile = new RandomAccessFile("fromFile.txt", "rw");
        FileChannel fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
        FileChannel toChannel = toFile.getChannel();
        long position = 0;
        long count = fromChannel.size();
        toChannel.transferFrom(fromChannel,position, count);

    }

    private static void transferTo() throws IOException {

        RandomAccessFile fromFile = new RandomAccessFile("fromFile.txt", "rw");
        FileChannel      fromChannel = fromFile.getChannel();
        RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
        FileChannel      toChannel = toFile.getChannel();
        long position = 0;
        long count = fromChannel.size();
        fromChannel.transferTo(position, count, toChannel);
    }

}
