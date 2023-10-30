import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JTextField txtDato;
    private JButton btnInsertar;
    private JButton btnEliminar;
    private JButton btnGenerar;
    private JTextArea areaTextoPila;
    private JButton btnTope;
    private Pila coleccion = new Pila();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ventana() {

        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //Insertar
                coleccion.agregar(Integer.parseInt(txtDato.getText()));
                JOptionPane.showMessageDialog(null,"Insertado correctamente");
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Eliminar
                try {
                    JOptionPane.showMessageDialog(null,"El elemento eliminado fue: "+coleccion.eliminar());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //listar
                areaTextoPila.setText(coleccion.toString());
            }
        });
        btnTope.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null,"El tope es: "+coleccion.observarTope());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });

    }
}
