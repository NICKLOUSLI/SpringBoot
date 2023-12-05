package com.wdjr.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        // 创建一个 File 对象
        File file = new File("D:\\test.txt");

        // 创建一个 FileReader 对象
        FileReader fileReader = new FileReader(file);

        // 创建一个 BufferedReader 对象
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // 创建一个 List 对象
        List<String> list = new ArrayList<>();

        // 读取文件中的每一行
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // 将每一行添加到 List 中
            list.add(line);
        }

        // 关闭 BufferedReader 对象
        bufferedReader.close();

        // 遍历 List 并打印每一行
        for (String str : list) {
            System.out.println(str);
        }
    }
}