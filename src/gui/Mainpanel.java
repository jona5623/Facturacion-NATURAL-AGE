package gui;

import modelo.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class Mainpanel extends JFrame implements ActionListener
{

	private JPanel contentPane;
	private JTextField field_buscar;
	private JButton btn_buscar;
	private JMenuBar menu_bar;
	private JMenu menu_agregar;
	private JMenuItem item_agregar_cliente,item_agregar_servicio, item_agregar_producto;
	
	public Mainpanel() 
	{
		setTitle("Esthetic Natural Age");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 603);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		this.btn_buscar = new JButton("Buscar");
		this.btn_buscar.setBounds(655, 91, 89, 23);
		this.btn_buscar.addActionListener(this);
		this.contentPane.add(btn_buscar);
		
		this.field_buscar = new JTextField();
		this.field_buscar.setBounds(167, 86, 470, 32);
		this.field_buscar.addActionListener(this);
		this.contentPane.add(field_buscar);
		field_buscar.setColumns(10);
		
		this.menu_bar = new JMenuBar();
		this.menu_bar.setBounds(0, 0, 926, 21);
		this.contentPane.add(menu_bar);
		
		this.menu_agregar = new JMenu("Agregar");
		this.menu_bar.add(this.menu_agregar);
		
		this.item_agregar_cliente = new JMenuItem("Agregar cliente:");
		this.menu_agregar.add(this.item_agregar_cliente);
		this.item_agregar_cliente.addActionListener(this);
		
		this.item_agregar_servicio = new JMenuItem("Agregar servicio:");
		this.menu_agregar.add(this.item_agregar_servicio);
		this.item_agregar_servicio.addActionListener(this);
		
		this.item_agregar_producto = new JMenuItem("Agregar producto:");
		this.menu_agregar.add(this.item_agregar_producto);
		
		JLabel lbl_fondo = new JLabel("");
		lbl_fondo.setIcon(new ImageIcon(Mainpanel.class.getResource("/recursos/cara_1.jpg")));
		lbl_fondo.setBounds(0, 22, 916, 542);
		contentPane.add(lbl_fondo);
		this.item_agregar_producto.addActionListener(this);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent event)
	{
		
		if(event.getSource() ==this.btn_buscar)
		{
			
			
			
			
			
		}
		
		if(event.getSource() == this.item_agregar_cliente)
		{
			
			
			Clientepanel panel = new Clientepanel();
			panel.setVisible(true);
			
			
			
			
			
		}
		
		if(event.getSource() == this.item_agregar_producto)
		{
			
			Productopanel panel = new Productopanel();
			panel.setVisible(true);
			
			
			
		}
		
		if(event.getSource() == this.item_agregar_servicio)
		{
			
			Serviciopanel panel = new Serviciopanel();
			panel.setVisible(true);
			
			
			
			
		}
		
		
		
		
	}
}
