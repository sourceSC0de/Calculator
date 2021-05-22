package hu.sourceSCOde;


import javax.swing.*;
import java.awt.*;

public class Calculator {

    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[9];
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton, negButton;
    private JPanel panel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    EventListener listener = new EventListener(this);

    Calculator() {

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 504);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(48, 16, 288, 48);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(listener);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(listener);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(48, 400, 96, 48);
        delButton.setBounds(144, 400, 96, 48);
        clrButton.setBounds(240, 400, 96, 48);

        panel = new JPanel();
        panel.setBounds(48, 96, 288, 288);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
    }

    public void show(){
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(String text){
        this.textField.setText(text);
    }

    public JButton[] getNumberButtons() {
        return numberButtons;
    }

    public JButton[] getFunctionButtons() {
        return functionButtons;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public JButton getDecButton() {
        return decButton;
    }

    public JButton getEquButton() {
        return equButton;
    }

    public JButton getDelButton() {
        return delButton;
    }

    public JButton getClrButton() {
        return clrButton;
    }

    public JButton getNegButton() {
        return negButton;
    }

    public JPanel getPanel() {
        return panel;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setNumberButtons(JButton[] numberButtons) {
        this.numberButtons = numberButtons;
    }

    public void setFunctionButtons(JButton[] functionButtons) {
        this.functionButtons = functionButtons;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public void setSubButton(JButton subButton) {
        this.subButton = subButton;
    }

    public void setMulButton(JButton mulButton) {
        this.mulButton = mulButton;
    }

    public void setDivButton(JButton divButton) {
        this.divButton = divButton;
    }

    public void setDecButton(JButton decButton) {
        this.decButton = decButton;
    }

    public void setEquButton(JButton equButton) {
        this.equButton = equButton;
    }

    public void setDelButton(JButton delButton) {
        this.delButton = delButton;
    }

    public void setClrButton(JButton clrButton) {
        this.clrButton = clrButton;
    }

    public void setNegButton(JButton negButton) {
        this.negButton = negButton;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }


}
