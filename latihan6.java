import javax.swing.JOptionPane;
public class latihan6 {

    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("masuakan namo yuang");
        String msg = "hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}