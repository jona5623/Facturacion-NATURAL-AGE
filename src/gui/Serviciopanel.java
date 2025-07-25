package gui;

import modelo.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Serviciopanel extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JTextField textField_nombre;
	private JTextField textField_valor;
	private JLabel lbl_nombre, lbl_valor;
	private JButton btn_agregar;


	public Serviciopanel()
	{
		setTitle("Nuevo Servicio");
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		this.lbl_nombre = new JLabel("Nombre: ");
		this.lbl_nombre.setBounds(10, 11, 71, 14);
		this.contentPane.add(this.lbl_nombre);
		
		this.lbl_valor = new JLabel("Valor: ");
		this.lbl_valor.setBounds(10, 46, 71, 14);
		this.contentPane.add(this.lbl_valor);
		
		this.textField_nombre = new JTextField();
		this.textField_nombre.setBounds(107, 8, 200, 20);
		this.contentPane.add(textField_nombre);
		this.textField_nombre.setColumns(10);
		
		this.textField_valor = new JTextField();
		this.textField_valor.setBounds(107, 43, 71, 20);
		this.contentPane.add(this.textField_valor);
		this.textField_valor.setColumns(10);
		
		this.btn_agregar = new JButton("Agregar");
		this.btn_agregar.setBounds(169, 216, 89, 23);
		this.btn_agregar.addActionListener(this);
		this.contentPane.add(this.btn_agregar);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent event) 
	
	{
		
		if(event.getSource() == this.btn_agregar)
		{
			
			
			
		}
		
		
	}

}
