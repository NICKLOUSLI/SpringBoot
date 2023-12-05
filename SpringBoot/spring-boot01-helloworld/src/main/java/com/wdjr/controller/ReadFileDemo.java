package com.wdjr.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFileDemo {

    private static  String filePath ="C:\\Learning\\123.txt";
    public static void main(String[] args) throws IOException {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            List<String> lineList = readFile();
            Scanner sc = new Scanner(System.in);
            String result = "";
            String name = "";
            int index = 0;
            // 使用快捷键上下翻页
            while (true) {
                name = sc.nextLine();
                if (name.equals("u")) {
                    if (index < 1) {
                        System.out.println("已到达文件头");
                    } else {
                        result = lineList.get(index--);
                    }
                } else if (name.equals("d")) {
                    result = lineList.get(index++);
                } else if (name.equals("x")) {
                    Runtime.getRuntime().exec("cls");
                    System.out.flush();
                    break;
                }
                Runtime.getRuntime().exec("cls");
                System.out.flush();
                System.out.println(result);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<String> readFile() throws IOException {
        ArrayList<String> lineList = new ArrayList<>();
        int lineNum = 1;
        // 创建一个文件读取器
        BufferedReader reader = new BufferedReader(new FileReader(new File(filePath)));
        // 创建一个 BufferedReader 对象
        BufferedReader bufferedReader = new BufferedReader(reader);
        // 循环读取文件中的每一行
        while (true) {
            // 读取一行数据
            String line ="";
            while ((line = bufferedReader.readLine()) != null) {
                // 将每一行添加到 List 中
                lineList.add(line);
            }
            // 关闭 BufferedReader 对象
            bufferedReader.close();
            // 如果读取到 null，则表示文件读取完毕
            if (line == null) {
                break;
            }
        }
        // 关闭 BufferedReader 对象
        bufferedReader.close();
        return lineList;
    }

}