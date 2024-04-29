package exn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gym extends JFrame {
	 private ArrayList<Client> clientes = new ArrayList<Client>();
	public Gym() {
		this.setSize(1000, 700);
		setTitle("Alix gym");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null); 
		
		
		//panel();
		//inicio();
		 clientes.add(new Client("John", "Doe", "1990-05-15", "123456789", "$100", ""));
	     clientes.add(new Client("Jane", "Smith", "1985-09-21", "987654321", "$150", ""));
	     clientes.add(new Client("Michael", "Johnson", "1978-12-03", "555555555", "$200", ""));
	     clientes.add(new Client("Emily", "Davis", "1993-07-08", "777777777", "$120", ""));
	        
		//clientes ();
	    tarifas ();
		//checador();
		
		
	}
	
	void panel () {
		JPanel panelGym = new JPanel (null);
		panelGym.setSize(this.getWidth()/2,this.getHeight());
		panelGym.setBackground(Color.decode("#B9A7CA"));
		add(panelGym);
		
		 JPanel panelGym2 = new JPanel(null) {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2d = (Graphics2D) g;
	                g2d.setColor(Color.BLACK); 
	                g2d.drawLine(140, 250, 360, 250); 
	                g2d.drawLine(140, 390, 360, 390); 
	            }
	        };
		
		
		panelGym2.setSize(this.getWidth()/2,this.getHeight());
		panelGym2.setLocation(this.getWidth()/2,0);
		panelGym2.setBackground(Color.decode("#F7F0FD"));
		add(panelGym2);
		
		
		JLabel img = new JLabel("",0);
		img.setIcon(new ImageIcon(getClass().getResource("alixx.png")));
		img.setOpaque(false);
		img.setBackground(Color.white);
		img.setBounds(130, 200, 220, 200);
		panelGym.add(img);
		
		JLabel nombregym = new JLabel("ALIX GYM ",0);
		nombregym.setFont(new Font("juma", Font.BOLD, 45));
		nombregym.setForeground(Color.black);
		nombregym.setBounds(100, 330, 290, 100);
		panelGym.add(nombregym);
		
		
		JLabel usuario = new JLabel("Usuario: ", SwingConstants.CENTER);
		usuario.setFont(new Font("juma", Font.BOLD, 25));
		usuario.setBounds(140, 150, 220, 50);
		panelGym2.add(usuario);
		
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, panelGym2.getBackground()));
		cajaTexto.setBackground(panelGym2.getBackground());
		cajaTexto.setOpaque(false);
		cajaTexto.setBounds(140, 220, 220, 35);
		panelGym2.add(cajaTexto);
		
		
		
		
		JLabel contraseña = new JLabel("Clave: ", SwingConstants.CENTER);
		contraseña.setFont(new Font("juma", Font.BOLD, 25));
		contraseña.setBounds(140, 300, 220, 35);
		panelGym2.add(contraseña);
		
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBackground(panelGym2.getBackground());
		contrasena.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, panelGym2.getBackground()));

		contrasena.setBounds(140, 360, 220, 30);
		panelGym2.add(contrasena);
		

		
		
		JButton boton = new JButton("Acceder");
		boton.setFont(new Font("", Font.BOLD, 25));
		boton.setBackground(Color.decode("#714597"));
	    boton.setForeground(Color.WHITE);
		boton.setBounds(160, 440, 180, 35);
		panelGym2.add(boton);
		 
	}
	
	void inicio () {
		JPanel panel2 = new JPanel (null);
		panel2.setSize(this.getWidth(),this.getHeight());
		panel2.setBackground(Color.decode("#F7F0FD"));
		add(panel2);
		
		JLabel barra = new JLabel(" ",0);
		barra.setFont(new Font("monofonto", Font.BOLD, 25));
		barra.setOpaque(true);
		barra.setBackground(Color.decode("#714597"));
		barra.setBounds(0,0, 1000, 60);
		panel2.add(barra);
		
		JLabel nombregym = new JLabel("ALIX GYM ",0);
		nombregym.setFont(new Font("juma", Font.BOLD, 25));
		nombregym.setForeground(Color.white);
		nombregym.setBounds(10,0, 200, 60);
		barra.add(nombregym);
		
		JLabel salir = new JLabel("SALIR  ",0);
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 100, 60);
		barra.add(salir);
		
		
		
		
		JLabel clientes = new JLabel("CLIENTES",0);
		clientes.setFont(new Font("monofonto", Font.BOLD, 25));
		clientes.setOpaque(true);
		clientes.setBackground(Color.white);
		clientes.setBounds(85,180, 220, 50);
		panel2.add(clientes);
		
		JLabel clientesimg = new JLabel("",0);
		clientesimg.setIcon(new ImageIcon(getClass().getResource("clientes_f.png")));
		clientesimg.setOpaque(true);
		clientesimg.setBackground(Color.white);
		clientesimg.setBounds(85,210, 220, 200);
		panel2.add(clientesimg);
		
		
		JLabel tarifas = new JLabel("TARIFAS",0);
		tarifas.setFont(new Font("monofonto", Font.BOLD, 25));
		tarifas.setOpaque(true);
		tarifas.setBackground(Color.white);
		tarifas.setBounds(390,180, 220, 50);
		panel2.add(tarifas);
		
		JLabel tarifaimg = new JLabel("",0);
		tarifaimg.setIcon(new ImageIcon(getClass().getResource("tarifa_p.png")));
		tarifaimg.setOpaque(true);
		tarifaimg.setBackground(Color.white);
		tarifaimg.setBounds(390,210, 220, 200);
		panel2.add(tarifaimg);
		
		JLabel checador = new JLabel("CHECADOR",0);
		checador.setFont(new Font("monofonto", Font.BOLD, 25));
		checador.setOpaque(true);
		checador.setBackground(Color.white);
		checador.setBounds(695,180, 220, 50);
		panel2.add(checador);
		
		JLabel checadorimg = new JLabel("",0);
		checadorimg.setIcon(new ImageIcon(getClass().getResource("checador.png")));
		checadorimg.setOpaque(true);
		checadorimg.setBackground(Color.white);
		checadorimg.setBounds(695,210, 220, 200);
		panel2.add(checadorimg);
		 
		 
		
	}
	void clientes () {
		JPanel panelClientes = new JPanel (null);
		panelClientes.setSize(this.getWidth(),this.getHeight());
		panelClientes.setBackground(Color.decode("#F7F0FD"));
		add(panelClientes);
		
		JLabel barra = new JLabel(" ",0);
		barra.setFont(new Font("monofonto", Font.BOLD, 25));
		barra.setOpaque(true);
		barra.setBackground(Color.decode("#714597"));
		barra.setBounds(0,0, 1000, 60);
		panelClientes.add(barra);
		
		JLabel nombregym = new JLabel("ALIX GYM ",0);
		nombregym.setFont(new Font("juma", Font.BOLD, 25));
		nombregym.setForeground(Color.white);
		nombregym.setBounds(10,0, 200, 60);
		barra.add(nombregym);
		
		JLabel salir = new JLabel("SALIR  ",0);
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 100, 60);
		barra.add(salir);
		
	    String[] columnas = {"Nombre", "Apellidos", "Fecha de nacimiento" ,"Teléfono", "Total Pagado", "Foto"};
	     
		
		 
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		for (Client cliente : clientes) {
	            Object[] fila = {cliente.getNombre(), cliente.getApellidos(), cliente.getFechaNacimiento(), cliente.getTelefono(), cliente.getTotalPagado(), cliente.getFoto()};
	            modelo.addRow(fila);
	        }
	        
	        
	    JTable tabla = new JTable(modelo);
	        
	       
	    JScrollPane scrollPane = new JScrollPane(tabla);
	    scrollPane.setBounds(50, 150, 600, 200);
	    panelClientes.add(scrollPane);
	        
	        
	    JButton agregarCliente = new JButton("Crear Cliente");
	    agregarCliente.setFont(new Font("juma", Font.BOLD, 20)); 
	    agregarCliente.setBackground(Color.decode("#714597"));
	    agregarCliente.setForeground(Color.WHITE);
	    agregarCliente.setBounds(50, 100, 200, 30);
	    panelClientes.add(agregarCliente);
	       
	        
	    agregarCliente.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	                
	            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            String apellidos = JOptionPane.showInputDialog(null, "Ingrese los apellidos del nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            String fechaNacimiento = JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento del nuevo cliente (YYYY-MM-DD):", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            String totalPagado = JOptionPane.showInputDialog(null, "Ingrese el monto total pagado por el nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	                
	            Client nuevoCliente = new Client(nombre, apellidos, fechaNacimiento, telefono, totalPagado, "");

	                
	            clientes.add(nuevoCliente);

	            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
	            Object[] fila = {nuevoCliente.getNombre(), nuevoCliente.getApellidos(), nuevoCliente.getFechaNacimiento(), nuevoCliente.getTelefono(), nuevoCliente.getTotalPagado(), nuevoCliente.getFoto()};
	            modelo.addRow(fila);
	        }
	    });
	    
	    
	    JButton consultarCliente = new JButton("Consultar Cliente");
	    consultarCliente.setFont(new Font("juma", Font.BOLD, 20)); 
	    consultarCliente.setBackground(Color.decode("#714597"));
	    consultarCliente.setForeground(Color.WHITE);
	    consultarCliente.setBounds(300, 100, 250, 30);
	    panelClientes.add(consultarCliente);

	    consultarCliente.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	            String nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente a consultar:", "Consultar Cliente", JOptionPane.QUESTION_MESSAGE);
	            
	            
	            Client clienteConsultado = null;
	            for (Client cliente : clientes) {
	                if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
	                    clienteConsultado = cliente;
	                    break;
	                }
	            }
	            
	            
	            if (clienteConsultado != null) {
	                String detallesCliente = "Nombre: " + clienteConsultado.getNombre() + "\n"
	                                        + "Apellidos: " + clienteConsultado.getApellidos() + "\n"
	                                        + "Fecha de nacimiento: " + clienteConsultado.getFechaNacimiento() + "\n"
	                                        + "Teléfono: " + clienteConsultado.getTelefono() + "\n"
	                                        + "Total Pagado: " + clienteConsultado.getTotalPagado() + "\n"
	                                        + "Foto: " + clienteConsultado.getFoto();
	                JOptionPane.showMessageDialog(null, detallesCliente, "Detalles del Cliente", JOptionPane.INFORMATION_MESSAGE);
	            } else {
	                JOptionPane.showMessageDialog(null, "El cliente no fue encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    });
	    
	   

	    JButton btnEliminarCliente = new JButton("Eliminar Cliente");
	    btnEliminarCliente.setBounds(600, 100, 250, 30);
	    btnEliminarCliente.setFont(new Font("juma", Font.BOLD, 20));
	    btnEliminarCliente.setForeground(Color.WHITE);
	    btnEliminarCliente.setBackground(Color.decode("#714597"));
	    panelClientes.add(btnEliminarCliente);

	    btnEliminarCliente.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	            String nombreCliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente a eliminar:", "Eliminar Cliente", JOptionPane.QUESTION_MESSAGE);
	            
	            
	            Client clienteAEliminar = null;
	            for (Client cliente : clientes) {
	                if (cliente.getNombre().equalsIgnoreCase(nombreCliente)) {
	                    clienteAEliminar = cliente;
	                    break;
	                }
	            }
	            
	            
	            if (clienteAEliminar != null) {
	                clientes.remove(clienteAEliminar);
	                
	                JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado correctamente.", "Cliente Eliminado", JOptionPane.INFORMATION_MESSAGE);
	                
	                DefaultTableModel modeloActualizado = new DefaultTableModel(columnas, 0); 
                    for (Client cliente : clientes) {
                        Object[] fila = {cliente.getNombre(), cliente.getApellidos(), cliente.getFechaNacimiento(), cliente.getTelefono(), cliente.getTotalPagado(), cliente.getFoto()};
                        modeloActualizado.addRow(fila); 
                    }
                    tabla.setModel(modeloActualizado);
	            } else {
	                JOptionPane.showMessageDialog(null, "El cliente no fue encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    });
	    

	} 
	
	void tarifas () {
		JPanel panelClientes = new JPanel (null);
		panelClientes.setSize(this.getWidth(),this.getHeight());
		panelClientes.setBackground(Color.decode("#F7F0FD"));
		add(panelClientes);
		
		JLabel barra = new JLabel(" ",0);
		barra.setFont(new Font("monofonto", Font.BOLD, 25));
		barra.setOpaque(true);
		barra.setBackground(Color.decode("#714597"));
		barra.setBounds(0,0, 1000, 60);
		panelClientes.add(barra);
		
		JLabel nombregym = new JLabel("ALIX GYM ",0);
		nombregym.setFont(new Font("juma", Font.BOLD, 25));
		nombregym.setForeground(Color.white);
		nombregym.setBounds(10,0, 200, 60);
		barra.add(nombregym);
		
		JLabel salir = new JLabel("SALIR  ",0);
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 100, 60);
		barra.add(salir);
		
	}
	
	void checador () {
		/*
		JPanel panelClientes = new JPanel (null);
		panelClientes.setSize(this.getWidth(),this.getHeight());
		panelClientes.setBackground(Color.decode("#F7F0FD"));
		add(panelClientes);
		*/
		
		 JPanel panelClientes = new JPanel(null) {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2d = (Graphics2D) g;
	                g2d.setColor(Color.BLACK); 
	                g2d.drawLine(140, 250, 360, 250); 
	                g2d.drawLine(140, 390, 360, 390); 
	            }
	        };
		
		
	        panelClientes.setSize(this.getWidth(),this.getHeight());
	        
	        panelClientes.setBackground(Color.decode("#F7F0FD"));
		add(panelClientes);
		
		JLabel barra = new JLabel(" ",0);
		barra.setFont(new Font("monofonto", Font.BOLD, 25));
		barra.setOpaque(true);
		barra.setBackground(Color.decode("#714597"));
		barra.setBounds(0,0, 1000, 60);
		panelClientes.add(barra);
		
		JLabel nombregym = new JLabel("ALIX GYM ",0);
		nombregym.setFont(new Font("juma", Font.BOLD, 25));
		nombregym.setForeground(Color.white);
		nombregym.setBounds(10,0, 200, 60);
		barra.add(nombregym);
		
		JLabel salir = new JLabel("SALIR  ",0);
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 100, 60);
		barra.add(salir);
		
		JLabel usuario = new JLabel("Usuario: ", SwingConstants.CENTER);
		usuario.setFont(new Font("juma", Font.BOLD, 25));
		usuario.setBounds(140, 150, 220, 50);
		panelClientes.add(usuario);
		
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, panelClientes.getBackground()));
		cajaTexto.setBackground(panelClientes.getBackground());
		cajaTexto.setOpaque(false);
		cajaTexto.setBounds(140, 220, 220, 35);
		panelClientes.add(cajaTexto);
		
		
		
		
		JLabel contraseña = new JLabel("Pin: ", SwingConstants.CENTER);
		contraseña.setFont(new Font("juma", Font.BOLD, 25));
		contraseña.setBounds(140, 300, 220, 35);
		panelClientes.add(contraseña);
		
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBackground(panelClientes.getBackground());
		contrasena.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, panelClientes.getBackground()));

		contrasena.setBounds(140, 360, 220, 30);
		panelClientes.add(contrasena);
		
		JButton boton = new JButton("Registrarse");
		boton.setFont(new Font("", Font.BOLD, 25));
		boton.setBackground(Color.decode("#714597"));
	    boton.setForeground(Color.WHITE);
		boton.setBounds(160, 440, 180, 35);
		panelClientes.add(boton);
		

		//alertas necesarias y poder ingresar el pin
		//la idea es poner el nombre con el pin y luego que me aparescan pago pendiente de cada mes
		 
		
	   // un recordatorio de 3 reglas basicas 
		// si fue su coah
		// 
		
	}
	
	
	
	
	
}
