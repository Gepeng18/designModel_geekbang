package com.gc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.nio.ch.DirectBuffer;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DirectMemoryTest {

    //-XX:MaxDirectMemorySize=40m -verbose:gc -XX:+PrintGCDetails -XX:+DisableExplicitGC
    public static void main(String args[]) {
        List<ByteBuffer> list = new ArrayList<ByteBuffer>();
        while(true) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(1 * 1024 * 1024);
//            ((DirectBuffer) buffer).cleaner().clean();
//            list.add(buffer);
    }
    }
}
