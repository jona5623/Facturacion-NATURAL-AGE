package gui;

import modelo.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Clientepanel extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lbl_nombre,lbl_apellido,lbl_id;
	private JButton btn_agregar;
	
	private Cliente cliente;

	
	public Clientepanel() 
	{
		setTitle("Nuevo Cliente");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.lbl_nombre = new JLabel("Nombre: ");
		this.lbl_nombre.setBounds(23, 22, 83, 14);
		this.contentPane.add(this.lbl_nombre);
		
		this.lbl_apellido = new JLabel("Apellido: ");
		this.lbl_apellido.setBounds(23, 61, 83, 14);
		this.contentPane.add(lbl_apellido);
		
		this.lbl_id = new JLabel("C\u00E9dula: ");
		this.lbl_id.setBounds(23, 101, 83, 14);
		this.contentPane.add(this.lbl_id);
		
		textField = new JTextField();
		textField.setBounds(116, 19, 203, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 58, 203, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(116, 98, 203, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		this.btn_agregar = new JButton("Agregar");
		this.btn_agregar.setBounds(321, 215, 89, 23);
		this.contentPane.add(this.btn_agregar);
	}


	@Override
	public void actionPerformed(ActionEvent event)
	
	{
		
		if(event.getSource() == this.btn_agregar)
		{
			
			String nombre,apellido,cedula;
			nombre = this.textField.getText();
			apellido = this.textField_1.getText();
			cedula = this.textField_2.getText();
			cliente = new Cliente(nombre,apellido,cedula);
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			cliente.setCedula(cedula);
			
		}
		
		
	}
	
	
	public Cliente get_cliente()
	{
		
		return this.cliente;
		
	}
	
	
	

}
