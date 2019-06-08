package com.jay;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xiang.wei on 2019/6/8
 *
 * @author xiang.wei
 */
public class BufferInputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream =  new BufferedInputStream(InputStreamTest.class.getResourceAsStream("/inputTest.txt"));
        try {
            int data;
            while ((data=inputStream.read()) != -1) {
                System.out.println(data);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}