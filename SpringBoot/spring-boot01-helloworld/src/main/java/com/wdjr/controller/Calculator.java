package com.wdjr.controller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField textField1;
    private TextField textField2;
    private Label labelResult;

    @Override
    public void start(Stage primaryStage) {
        // 创建 GridPane 布局
        GridPane gridPane = new GridPane();

        // 创建 TextField 控件
        textField1 = new TextField();
        textField2 = new TextField();
        labelResult = new Label("0");

        // 将 TextField 控件添加到 GridPane 布局
        gridPane.add(textField1, 0, 0);
        gridPane.add(textField2, 1, 0);
        gridPane.add(labelResult, 2, 0);

        // 创建 Button 控件
        Button buttonAdd = new Button("+");
        Button buttonSubtract = new Button("-");
        Button buttonMultiply = new Button("*");
        Button buttonDivide = new Button("/");

        // 将 Button 控件添加到 GridPane 布局
        gridPane.add(buttonAdd, 0, 1);
        gridPane.add(buttonSubtract, 1, 1);
        gridPane.add(buttonMultiply, 2, 1);
        gridPane.add(buttonDivide, 3, 1);

        // 创建 Scene 对象
        Scene scene = new Scene(gridPane, 400, 200);

        // 设置 Stage 的标题
        primaryStage.setTitle("Calculator");

        // 设置 Scene 对象
        primaryStage.setScene(scene);

        // 显示 Stage 窗口
        primaryStage.show();

        // 为 Button 控件注册监听器
        buttonAdd.setOnAction(event -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int result = num1 + num2;
            labelResult.setText(String.valueOf(result));
        });

        buttonSubtract.setOnAction(event -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int result = num1 - num2;
            labelResult.setText(String.valueOf(result));
        });

        buttonMultiply.setOnAction(event -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int result = num1 * num2;
            labelResult.setText(String.valueOf(result));
        });

        buttonDivide.setOnAction(event -> {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int result = num1 / num2;
            labelResult.setText(String.valueOf(result));
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}