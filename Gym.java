package exn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gym extends JFrame {
	public Gym() {
		this.setSize(1000, 700);
		setTitle("Alix gym");
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null); 
		
		
		panel();
		//panel2();
		
		
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
		
		/*
		JLabel img = new JLabel("",0);
		img.setIcon(new ImageIcon(getClass().getResource("chica2.jpg")));
		img.setOpaque(true);
		img.setBackground(Color.white);
		img.setBounds(10,10, 420, 700);
		panelGym.add(img);
		*/
		
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
		
		
		
		
		JLabel contraseña = new JLabel("pin: ", SwingConstants.CENTER);
		contraseña.setFont(new Font("juma", Font.BOLD, 25));
		contraseña.setBounds(140, 300, 220, 35);
		panelGym2.add(contraseña);
		
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBackground(panelGym2.getBackground());
		contrasena.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, panelGym2.getBackground()));

		contrasena.setBounds(140, 360, 220, 30);
		panelGym2.add(contrasena);
		

		
		
		JButton boton = new JButton("Acceder");
		boton.setFont(new Font("juma", Font.BOLD, 25));
		boton.setBackground(Color.decode("#714597"));
	    boton.setForeground(Color.WHITE);
		boton.setBounds(160, 440, 180, 35);
		panelGym2.add(boton);
		 
	}
	
	void panel2 () {
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
	
}
