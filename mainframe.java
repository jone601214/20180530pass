import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class mainframe extends JFrame {
    Scanner scn=new Scanner(System.in);
    private JButton jbtnencryption = new JButton("encryption");
    private JButton jbtnDecryption = new JButton("Decryption");
    private  JButton jbtnExit=new JButton("Exit");
    private JLabel jlb = new JLabel("加密");
    private JTextField jlf = new JTextField();
    private JTextArea jta1 = new JTextArea();
    private JTextArea jta2 = new JTextArea();

    public mainframe() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(1200,800);
        jbtnencryption.setLocation(550,400);
        jbtnDecryption.setLocation(550,500);
        jbtnExit.setLocation(550,600);
        jbtnencryption.setSize(120,80);
        jbtnDecryption.setSize(120,80);
        jbtnExit.setSize(120,80);
        jlb.setBounds(600,100,500,60);
        jlf.setBounds(570,200,100,100);
        jta1.setLocation(0,0);
        jta2.setLocation(700,0);
        jta1.setSize(500,800);
        jta2.setSize(500,800);
        this.add(jbtnencryption);
        this.add(jbtnDecryption);
        this.add(jbtnExit);
        this.add(jlb);
        this.add(jlf);
        this.add(jta1);
        this.add(jta2);
jbtnExit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }
});
jbtnDecryption.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        final Scanner scn = new Scanner(System.in);
        final int n=Integer.parseInt(jta1.getText());
        final char[] S = scn.nextLine().toCharArray();
        final int k = Integer.parseInt(scn.nextLine());
        for (int i = 0; i < n; ++i) {
            char c = S[i];
            if (c >= 'A' && c <= 'Z') {
                final int v = c - 'A';
                c = (char) ((v + k) % + 'A');
            } else if (c >= 'a' && c <= 'z') {
                final int v = c - 'a';
                c = (char) ((v + k) % 26 + 'a');
            }
            System.out.print(c);
        }
        System.out.println(jta2);
    }


});
    }
}