package ec.edu.ups.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductoView extends JFrame {

    private JPanel panelPrincipal;
    private JPanel intermedio;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JButton btnAceptar;
    private JButton btnRechazar;
    private JPanel Arriba;
    private JPanel Abajo;

    public ProductoView(){
        setTitle(" Datos del producto ");
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datosIngresados();
            }
        });
    }
    public static void main(String [] args){
        new ProductoView();
    }
    public void datosIngresados(){
        System.out.println("Ingrese los datos");
        System.out.println(txtCodigo.getX());
    }

}
