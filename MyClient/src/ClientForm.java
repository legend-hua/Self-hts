import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Sun Aug 20 20:20:51 CST 2017
 */



/**
 * @author unknown
 */
public class ClientForm extends JPanel {
    public ClientForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - legend hua
        label20 = new JLabel();
        panel1 = new JPanel();
        label9 = new JLabel();
        label10 = new JLabel();
        panel3 = new JPanel();
        label7 = new JLabel();
        textField7 = new JTextField();
        label8 = new JLabel();
        textField6 = new JTextField();
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField5 = new JTextField();
        panel4 = new JPanel();
        label11 = new JLabel();
        label12 = new JLabel();
        panel6 = new JPanel();
        label17 = new JLabel();
        textField8 = new JTextField();
        label18 = new JLabel();
        textField9 = new JTextField();
        label19 = new JLabel();
        textField10 = new JTextField();
        panel5 = new JPanel();
        label13 = new JLabel();
        label14 = new JLabel();
        label16 = new JLabel();
        label15 = new JLabel();

        //======== this ========
        setAlignmentX(1.0F);
        setBorder(new CompoundBorder(
            new TitledBorder("\u6e56\u5357\u7701\u9ad8\u901f\u516c\u8def\u65e0\u4eba\u6536\u8d39\u7cfb\u7edf"),
            Borders.DLU2));
        setAutoscrolls(true);
        setAlignmentY(1.0F);
        setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        setBackground(new Color(204, 204, 255));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new MigLayout(
            "fill,hidemode 3",
            // columns
            "[494,fill]" +
            "[234,fill]",
            // rows
            "[11]" +
            "[221,sizegroup 1]" +
            "[171,sizegroup 1]"));
        add(label20, "cell 0 0");

        //======== panel1 ========
        {
            panel1.setBackground(new Color(204, 204, 255));
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[282,fill]" +
                "[191,fill]",
                // rows
                "[39]" +
                "[191]"));

            //---- label9 ----
            label9.setText("\u8f66\u8f86\u8bc6\u522b\uff1a");
            panel1.add(label9, "cell 0 0");

            //---- label10 ----
            label10.setText("picture");
            panel1.add(label10, "cell 0 1,alignx center,growx 0");

            //======== panel3 ========
            {
                panel3.setBackground(new Color(204, 204, 255));
                panel3.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[fill]" +
                    "[169,fill]",
                    // rows
                    "[sizegroup 1]" +
                    "[34,sizegroup 1]"));

                //---- label7 ----
                label7.setText("\u8f93\u5165\u56fe\u7247\uff1a");
                panel3.add(label7, "cell 0 0");
                panel3.add(textField7, "cell 1 0");

                //---- label8 ----
                label8.setText("\u8f66\u724c\u53f7\uff1a");
                panel3.add(label8, "cell 0 1");
                panel3.add(textField6, "cell 1 1");
            }
            panel1.add(panel3, "cell 1 1");
        }
        add(panel1, "cell 0 1");

        //======== panel2 ========
        {
            panel2.setBackground(new Color(204, 204, 255));
            panel2.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[61,fill]" +
                "[147,fill]",
                // rows
                "[sizegroup 1]" +
                "[sizegroup 1]" +
                "[sizegroup 1]" +
                "[sizegroup 1]" +
                "[sizegroup 1]" +
                "[58,sizegroup 1]"));

            //---- label1 ----
            label1.setText("\u51fa\u5165\u7ad9\u4fe1\u606f\uff1a");
            panel2.add(label1, "cell 0 0 2 1");

            //---- label2 ----
            label2.setText("\u8f66\u724c\u53f7\uff1a");
            panel2.add(label2, "cell 0 1");
            panel2.add(textField1, "cell 1 1");

            //---- label3 ----
            label3.setText("\u5165\u7ad9\u65f6\u95f4\uff1a");
            panel2.add(label3, "cell 0 2");
            panel2.add(textField2, "cell 1 2");

            //---- label4 ----
            label4.setText("\u5165\u7ad9\u540d\uff1a");
            panel2.add(label4, "cell 0 3");
            panel2.add(textField3, "cell 1 3");

            //---- label5 ----
            label5.setText("\u51fa\u7ad9\u65f6\u95f4\uff1a");
            panel2.add(label5, "cell 0 4");
            panel2.add(textField4, "cell 1 4");

            //---- label6 ----
            label6.setText("\u51fa\u7ad9\u540d\uff1a");
            panel2.add(label6, "cell 0 5");
            panel2.add(textField5, "cell 1 5");
        }
        add(panel2, "cell 1 1");

        //======== panel4 ========
        {
            panel4.setBackground(new Color(204, 204, 255));
            panel4.setLayout(new MigLayout(
                "fill,novisualpadding,hidemode 3",
                // columns
                "[292,fill]" +
                "[176,fill]",
                // rows
                "[]" +
                "[161]" +
                "[]"));

            //---- label11 ----
            label11.setText("\u6536\u8d39\u4fe1\u606f\uff1a");
            label11.setBackground(new Color(204, 204, 255));
            panel4.add(label11, "cell 0 0");

            //---- label12 ----
            label12.setText("\u4e8c\u7ef4\u7801");
            panel4.add(label12, "cell 0 1,alignx center,growx 0");

            //======== panel6 ========
            {
                panel6.setBackground(new Color(204, 204, 255));
                panel6.setLayout(new MigLayout(
                    "hidemode 3",
                    // columns
                    "[56,fill]" +
                    "[96,fill]",
                    // rows
                    "[sizegroup 1]" +
                    "[sizegroup 1]" +
                    "[]" +
                    "[]" +
                    "[5,sizegroup 1]"));

                //---- label17 ----
                label17.setText("\u8f66\u724c\u53f7\uff1a");
                panel6.add(label17, "cell 0 0");
                panel6.add(textField8, "cell 1 0");

                //---- label18 ----
                label18.setText("\u884c\u9a76\u91cc\u7a0b\uff1a");
                panel6.add(label18, "cell 0 1");
                panel6.add(textField9, "cell 1 1");

                //---- label19 ----
                label19.setText("\u5e94\u6536\u8d39\u989d\uff1a");
                panel6.add(label19, "cell 0 2");
                panel6.add(textField10, "cell 1 2");
            }
            panel4.add(panel6, "cell 1 1");
        }
        add(panel4, "cell 0 2");

        //======== panel5 ========
        {
            panel5.setBackground(new Color(204, 204, 255));
            panel5.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[49,fill]" +
                "[139,fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label13 ----
            label13.setText("\u7248\u6743\u6240\u6709\u8005\uff1a");
            panel5.add(label13, "cell 0 1");

            //---- label14 ----
            label14.setText("XXXXXXXXXXXXXXXX");
            panel5.add(label14, "cell 1 1");

            //---- label16 ----
            label16.setText("2017\u5e748\u670820\u65e520:47:32");
            panel5.add(label16, "cell 1 2");

            //---- label15 ----
            label15.setText("\u65f6\u95f4\uff1a");
            panel5.add(label15, "cell 0 3");
        }
        add(panel5, "cell 1 2");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - legend hua
    private JLabel label20;
    private JPanel panel1;
    private JLabel label9;
    private JLabel label10;
    private JPanel panel3;
    private JLabel label7;
    private JTextField textField7;
    private JLabel label8;
    private JTextField textField6;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField5;
    private JPanel panel4;
    private JLabel label11;
    private JLabel label12;
    private JPanel panel6;
    private JLabel label17;
    private JTextField textField8;
    private JLabel label18;
    private JTextField textField9;
    private JLabel label19;
    private JTextField textField10;
    private JPanel panel5;
    private JLabel label13;
    private JLabel label14;
    private JLabel label16;
    private JLabel label15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
