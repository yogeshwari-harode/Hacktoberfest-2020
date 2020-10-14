package java_swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class calc {

private JFrame frame;
private JTextField textField;

double a;
double b;
double result;
String op;
String ans;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
calc window = new calc();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public calc() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 339, 448);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

textField = new JTextField();
textField.setBounds(10, 11, 268, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);

JButton btnArrow = new JButton("<-");
btnArrow.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String arrow = null;
if(textField.getText().length()>0)
{
StringBuilder str = new StringBuilder(textField.getText());
str.deleteCharAt(textField.getText().length() - 1);
arrow = str.toString();
textField.setText(arrow);
}
}
});
btnArrow.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnArrow.setBounds(20, 30, 60, 50);
frame.getContentPane().add(btnArrow);

JButton btnClear = new JButton("C");
btnClear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
textField.setText(null);
}
});
btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnClear.setBounds(80, 30, 50, 50);
frame.getContentPane().add(btnClear);

JButton btnPer = new JButton("%");
btnPer.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
a = Double.parseDouble(textField.getText());
textField.setText(" ");
op = "%";
}
});
btnPer.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnPer.setBounds(142, 30, 50, 50);
frame.getContentPane().add(btnPer);

JButton btnEqual = new JButton("=");
btnEqual.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

String answer;
b = Double.parseDouble(textField.getText());
if(op == "+")
{
result = a + b;
answer = String.format("%.2f", result);
textField.setText(answer);
}

else if(op == "-")
{
result = a - b;
answer = String.format("%.2f", result);
textField.setText(answer);
}

else if(op == "*")
{
result = a * b;
answer = String.format("%.2f", result);
textField.setText(answer);
}

else if(op == "/")
{
result = a / b;
answer = String.format("%.2f", result);
textField.setText(answer);
}

else if(op == "%")
{
result = a % b;
answer = String.format("%.2f", result);
textField.setText(answer);
}
}
});
btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnEqual.setBounds(202, 30, 50, 50);
frame.getContentPane().add(btnEqual);

JButton btn7 = new JButton("7");
btn7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn7.getText();
textField.setText(EnterNumber);
}
});
btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn7.setBounds(20, 80, 50, 50);
frame.getContentPane().add(btn7);

JButton btn8 = new JButton("8");
btn8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn8.getText();
textField.setText(EnterNumber);
}
});
btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn8.setBounds(80, 80, 50, 50);
frame.getContentPane().add(btn8);

JButton btn9 = new JButton("9");
btn9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn9.getText();
textField.setText(EnterNumber);
}
});
btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn9.setBounds(142, 80, 50, 50);
frame.getContentPane().add(btn9);

JButton btnPlus = new JButton("+");
btnPlus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
a = Double.parseDouble(textField.getText());
textField.setText(" ");
op = "+";
}
});
btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnPlus.setBounds(202, 80, 50, 50);
frame.getContentPane().add(btnPlus);


JButton btn4 = new JButton("4");
btn4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn4.getText();
textField.setText(EnterNumber);
}
});
btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn4.setBounds(20, 141, 50, 50);
frame.getContentPane().add(btn4);

JButton btn5 = new JButton("5");
btn5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn5.getText();
textField.setText(EnterNumber);
}
});
btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn5.setBounds(80, 141, 50, 50);
frame.getContentPane().add(btn5);

JButton btn6 = new JButton("6");
btn6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn6.getText();
textField.setText(EnterNumber);
}
});
btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn6.setBounds(142, 141, 50, 50);
frame.getContentPane().add(btn6);

JButton btnMinus = new JButton("-");
btnMinus.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
a = Double.parseDouble(textField.getText());
textField.setText(" ");
op = "-";
}
});
btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnMinus.setBounds(202, 141, 50, 50);
frame.getContentPane().add(btnMinus);


JButton btn1 = new JButton("1");
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn1.getText();
textField.setText(EnterNumber);
}
});
btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn1.setBounds(20, 205, 50, 50);
frame.getContentPane().add(btn1);

JButton btn2 = new JButton("2");
btn2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn2.getText();
textField.setText(EnterNumber);
}
});
btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn2.setBounds(80, 205, 50, 50);
frame.getContentPane().add(btn2);

JButton btn3 = new JButton("3");
btn3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn3.getText();
textField.setText(EnterNumber);
}
});
btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn3.setBounds(142, 205, 50, 50);
frame.getContentPane().add(btn3);

JButton btnMul = new JButton("*");
btnMul.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
a = Double.parseDouble(textField.getText());
textField.setText(" ");
op = "*";
}
});
btnMul.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnMul.setBounds(202, 205, 50, 50);
frame.getContentPane().add(btnMul);


JButton btn0 = new JButton("0");
btn0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btn0.getText();
textField.setText(EnterNumber);
}
});
btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
btn0.setBounds(20, 270, 50, 50);
frame.getContentPane().add(btn0);

JButton btnDot = new JButton(".");
btnDot.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
String EnterNumber = textField.getText() + btnDot.getText();
textField.setText(EnterNumber);
}
});
btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnDot.setBounds(80, 270, 50, 50);
frame.getContentPane().add(btnDot);

JButton btnPm = new JButton("+-");
btnPm.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnPm.setBounds(142, 270, 53, 50);
frame.getContentPane().add(btnPm);

JButton btnDiv = new JButton("/");
btnDiv.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
a = Double.parseDouble(textField.getText());
textField.setText(" ");
op = "/";
}
});
btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
btnDiv.setBounds(202, 270, 50, 50);
frame.getContentPane().add(btnDiv);


}
}
