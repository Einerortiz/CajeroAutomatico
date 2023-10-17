import javax.swing.*;
public class CageroAutomatico {
    public static void main(String[] args) {
        int saldo = 5000;
        int opcion = 0;
        float ingreso, retiro;
        while (opcion != 3) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero Andromeda\n"
                    + "1 abonar dinero a la cuenta\n"
                    + "2 retirar dinero de la cuenta\n"
                    + "3 gracias por utilizar nuestros servicios"));
            switch (opcion) {
                case 1:
                    ingreso = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad que desea ingresar a la cuenta"));
                    saldo = (int) (saldo + ingreso);
                    JOptionPane.showMessageDialog(null, "dinero en cuenta: " +saldo);
                    break;

                case 2:
                    retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea retirar"));

                    if (retiro > saldo) {
                        JOptionPane.showMessageDialog(null, "no cuenta con el saldo suficiente realizar la transaccion");
                    }
                    else {

                        saldo = (int) (saldo - retiro);
                        JOptionPane.showMessageDialog(null, "dinero en cuenta:" +saldo);
                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "se equivoco de opcion de menu");
                    break;

            }
        }
    }
}