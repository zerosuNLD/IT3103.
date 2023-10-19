import javax.swing.JOptionPane;

class test
{
    public static void main (String[] args)
    {
        String a,b;
        a = JOptionPane.showInputDialog(null, 
                                        "Please input the fisrt number: ", 
                                            "Input the fisrt number", 
                                            JOptionPane.INFORMATION_MESSAGE);


        b = JOptionPane.showInputDialog(null, 
                                        "Please input the second number: ", 
                                            "Input the second number", 
                                            JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(a);

        double num2 = Double.parseDouble(b);


        JOptionPane.showMessageDialog(null,
                                        "a + b = " + (num1 + num2) + 
                                        "\na - b = " + (num1 - num2) + 
                                        "\na * b = " + (num1 * num2 ) +
                                        "\na / b = " + (num1 / num2) , "Notification", 
                                        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
