package exn;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Calendar;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
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
		JFrame frame;
		setResizable(true);
		setLocationRelativeTo(null); 
		setMinimumSize(new Dimension (300,300));
		setLayout(null); 
		
		
		  panel(this);
		//inicio(this);
		
		 // cliente prueba
		 clientes.add(new Client("John", "Doe", fecha("1990-05-15"), "123456789", "$100", ""));
	     clientes.add(new Client("Jane", "Smith", fecha("1985-09-21"), "987654321", "$150", ""));
	     clientes.add(new Client("Michael", "Johnson",fecha( "1978-12-03"), "555555555", "$200", ""));
	     clientes.add(new Client("Emily", "Davis", fecha("1993-07-08"), "777777777", "$120", ""));
	     clientes.add(new Client("David", "Brown", fecha("1987-04-25"), "111111111", "$180", ""));
	     clientes.add(new Client("Jessica", "Miller", fecha("1991-11-12"), "222222222", "$130", ""));
	     clientes.add(new Client("Matthew", "Wilson", fecha("1983-08-17"), "333333333", "$160", ""));
	     clientes.add(new Client("Sarah", "Taylor", fecha("1995-06-30"), "444444444", "$140", ""));
	     clientes.add(new Client("Christopher", "Anderson", fecha("1980-03-05"), "666666666", "$170", ""));
	     clientes.add(new Client("Amanda", "Thomas", fecha("1989-09-08"), "888888888", "$190", ""));
	     clientes.add(new Client("James", "White", fecha("1982-01-20"), "999999999", "$110", ""));
	     clientes.add(new Client("Samantha", "Clark", fecha("1994-10-15"), "000000000", "$220", ""));
	     clientes.add(new Client("Ryan", "Harris", fecha("1986-07-02"), "101010101", "$210", ""));
	     clientes.add(new Client("Ashley", "Martinez", fecha("1984-12-18"), "121212121", "$230", ""));


	    
	    
		//clientes (this);
	    //tarifas (this);
		//checador(this);
		
		
	}
	private Date fecha(String date) {
	    try {
	        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	        return formatter.parse(date);
	    } catch (ParseException e) {
	        e.printStackTrace(); 
	        return null; 
	    }
	}
	//void panel (JFrame frame) {
		
	JPanel panel (JFrame frame) {
		
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
		
		boton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(cajaTexto.getText().isEmpty()) {
					cajaTexto.setBorder(new LineBorder(Color.red,4));
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un usuario", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}else {
					cajaTexto.setBorder(new LineBorder(Color.GREEN,4));
				}
				
				String contra = new String(contrasena.getPassword());
				
				
				if(contra.isEmpty()) {
					contrasena.setBorder(new LineBorder(Color.red,4));
					JOptionPane.showMessageDialog(null, "Por favor, ingrese una contraseña", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}else {
					contrasena.setBorder(new LineBorder(Color.GREEN,4));
				}
				
				
				
				
				panelGym2.setVisible(false);
				panelGym.setVisible(false);
				inicio(frame);
			 

			}
		});
		 return panelGym2;
	}
	
	void inicio (JFrame frame) {
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
		//////////////
		JButton salir = new JButton("Salir");
		salir.setBackground(Color.decode("#714597"));
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 90, 60);
		barra.add(salir);
		
		
		salir.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de querer salir?", "Salida", JOptionPane.YES_NO_OPTION);
		        if (opcion == JOptionPane.YES_OPTION) {
		           
		        	panel2.setVisible(false);
		        	panel(frame);
		        }
		    }
		});
		
		
		
		
		
		
		JLabel clientes = new JLabel("CLIENTES",0);
		clientes.setFont(new Font("monofonto", Font.BOLD, 25));
		clientes.setOpaque(true);
		clientes.setBackground(Color.white);
		clientes.setBounds(85,180, 220, 50);
		panel2.add(clientes);
		
		JButton clientesimg = new JButton("");
		clientesimg.setIcon(new ImageIcon(getClass().getResource("clientes_f.png")));
		clientesimg.setOpaque(true);
		clientesimg.setBackground(Color.white);
		clientesimg.setBounds(85,230, 220, 200);
		panel2.add(clientesimg);
		
		clientesimg.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				clientes(frame);
			 
			}
		});
		
		
		JLabel tarifas = new JLabel("TARIFAS",0);
		tarifas.setFont(new Font("monofonto", Font.BOLD, 25));
		tarifas.setOpaque(true);
		tarifas.setBackground(Color.white);
		tarifas.setBounds(390,180, 220, 50);
		panel2.add(tarifas);
		
		JButton tarifaimg = new JButton("");
		tarifaimg.setIcon(new ImageIcon(getClass().getResource("tarifa_p.png")));
		tarifaimg.setOpaque(true);
		tarifaimg.setBackground(Color.white);
		tarifaimg.setBounds(390,230, 220, 200);
		panel2.add(tarifaimg);
		tarifaimg.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				tarifas(frame);
			 
			}
		});
		
		JLabel checador = new JLabel("CHECADOR",0);
		checador.setFont(new Font("monofonto", Font.BOLD, 25));
		checador.setOpaque(true);
		checador.setBackground(Color.white);
		checador.setBounds(695,180, 220, 50);
		panel2.add(checador);
		
		JButton checadorimg = new JButton("");
		checadorimg.setIcon(new ImageIcon(getClass().getResource("checador.png")));
		checadorimg.setOpaque(true);
		checadorimg.setBackground(Color.white);
		checadorimg.setBounds(695,230, 220, 200);
		panel2.add(checadorimg);
		
		checadorimg.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				checador(frame);
			 
			}
		});
		 
		
	}
	void clientes (JFrame frame) {
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
		
		
		JLabel nombreubiClientes = new JLabel(" CLIENTES ",0);
		nombreubiClientes.setFont(new Font("juma", Font.BOLD, 25));
		nombreubiClientes.setForeground(Color.white);
		nombreubiClientes.setBounds(450,0, 150, 60);
		barra.add(nombreubiClientes);
		 
		
		
		JButton salir = new JButton();
		salir.setIcon(new ImageIcon(getClass().getResource("salida.png")));
		salir.setForeground(Color.white);
		salir.setBackground(Color.decode("#714597"));
		salir.setBounds(870,0, 100, 60);
		barra.add(salir);
		salir.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	panelClientes.setVisible(false);
		        	inicio(frame);
		        }
		    
		});
		
		
	    String[] columnas = {"Nombre", "Apellidos", "Fecha de nacimiento" ,"Teléfono", "Total Pagado", "Foto"};
	     
		
		 
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		for (Client cliente : clientes) {
	            Object[] fila = {cliente.getNombre(), cliente.getApellidos(), cliente.getFechaNacimiento(), cliente.getTelefono(), cliente.getTotalPagado(), cliente.getFoto()};
	            modelo.addRow(fila);
	        }
	        
	        
	    JTable tabla = new JTable(modelo);
	    
	    tabla.setBackground(Color.decode("#F7F0FD")); 
	    tabla.setForeground(Color.decode("#47066B"));
	    
	    JScrollPane scrollPane = new JScrollPane(tabla);
	    scrollPane.setBounds(50, 200, 900, 200);
	    scrollPane.setBackground(Color.decode("#15066B"));
	    panelClientes.add(scrollPane);
	    
	    
	    JLabel buscador = new JLabel();
	    buscador.setIcon(new ImageIcon(getClass().getResource("lupa.png")));
	    buscador.setForeground(Color.white);
	    buscador.setBackground(Color.decode("#714597"));
	    buscador.setBounds(575, 90, 300, 30);
		panelClientes.add(buscador);
	    
	    
	    JTextField buscar = new JTextField();
        buscar.setBounds(600, 90, 300, 30);
        panelClientes.add(buscar);

        buscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String buscarTexto = buscar.getText().toLowerCase();
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.setRowCount(0); 
                for (Client cliente : clientes) {
                    if (cliente.getNombre().toLowerCase().contains(buscarTexto)) {
                        Object[] fila = {cliente.getNombre(), cliente.getApellidos(), cliente.getFechaNacimiento(), cliente.getTelefono(), cliente.getTotalPagado(), cliente.getFoto()};
                        modelo.addRow(fila);
                    }
                }
            }
        });
	        
	        
	    JButton agregarCliente = new JButton("Crear");
	    agregarCliente.setFont(new Font("juma", Font.BOLD, 20)); 
	    agregarCliente.setBackground(Color.decode("#714597"));
	    agregarCliente.setForeground(Color.WHITE);
	    agregarCliente.setBounds(50, 150, 100, 30);
	    panelClientes.add(agregarCliente);
	    
	    
	       
	        
	    agregarCliente.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	                
	            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            String apellidos = JOptionPane.showInputDialog(null, "Ingrese los apellidos del nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            String fechaNacimientoTexto = JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento del nuevo cliente (YYYY-MM-DD):", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            
	            Date fechaNacimiento = null;
	            try {
	                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	                fechaNacimiento = formatter.parse(fechaNacimientoTexto);
	            } catch (ParseException x) {
	                x.printStackTrace();
	                
	            }
	            String telefono = JOptionPane.showInputDialog(null, "Ingrese el teléfono del nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	            String totalPagado = JOptionPane.showInputDialog(null, "Ingrese el monto total pagado por el nuevo cliente:", "Nuevo Cliente", JOptionPane.QUESTION_MESSAGE);
	                
	            Client nuevoCliente = new Client(nombre, apellidos, fechaNacimiento, telefono, totalPagado, "");

	                
	            clientes.add(nuevoCliente);

	            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
	            Object[] fila = {nuevoCliente.getNombre(), nuevoCliente.getApellidos(), nuevoCliente.getFechaNacimiento(), nuevoCliente.getTelefono(), nuevoCliente.getTotalPagado(), nuevoCliente.getFoto()};
	            modelo.addRow(fila);
	        }
	    });
	    
	    
	    JButton consultarCliente = new JButton("Consultar");
	    consultarCliente.setFont(new Font("juma", Font.BOLD, 20)); 
	    consultarCliente.setBackground(Color.decode("#714597"));
	    consultarCliente.setForeground(Color.WHITE);
	    consultarCliente.setBounds(200, 150, 130, 30);
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
	    
	   

	    JButton btnEliminarCliente = new JButton("Eliminar ");
	    btnEliminarCliente.setBounds(380, 150, 120, 30);
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
	
	
	
	void tarifas (JFrame frame) {
		JPanel panelTarifas = new JPanel (null);
		panelTarifas.setSize(this.getWidth(),this.getHeight());
		panelTarifas.setBackground(Color.decode("#F7F0FD"));
		add(panelTarifas);
		
	
		JLabel barra = new JLabel(" ",0);
		barra.setFont(new Font("monofonto", Font.BOLD, 25));
		barra.setOpaque(true);
		barra.setBackground(Color.decode("#714597"));
		barra.setBounds(0,0, 1000, 60);
		panelTarifas.add(barra);
		
		JLabel nombreubiTarifas = new JLabel(" TARIFAS ",0);
		nombreubiTarifas.setFont(new Font("juma", Font.BOLD, 25));
		nombreubiTarifas.setForeground(Color.white);
		nombreubiTarifas.setBounds(450,0, 150, 60);
		barra.add(nombreubiTarifas);
		
		
		
		
		JLabel nombregym = new JLabel("ALIX GYM ",0);
		nombregym.setFont(new Font("juma", Font.BOLD, 25));
		nombregym.setForeground(Color.white);
		nombregym.setBounds(10,0, 200, 60);
		barra.add(nombregym);
		
		JButton salir = new JButton();
		salir.setIcon(new ImageIcon(getClass().getResource("salida.png")));
		salir.setBackground(Color.decode("#714597"));
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 90, 60);
		barra.add(salir);
		
		salir.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	panelTarifas.setVisible(false);
		        	inicio(frame);
		        }
		    
		});
		
		
		JButton verEntrenadores = new JButton(" Ver Entrenadores");
		verEntrenadores.setBackground(Color.decode("#714597"));
		verEntrenadores.setFont(new Font("juma", Font.BOLD, 19));
		verEntrenadores.setForeground(Color.black);
		verEntrenadores.setBackground(Color.decode("#F2E7FC"));
		verEntrenadores.setOpaque(true); 
		verEntrenadores.setBounds(50,90, 220, 40);
		panelTarifas.add(verEntrenadores);
		
		verEntrenadores.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	panelTarifas.setVisible(false);
		        	perfilesEntrenador(frame);
		        }
		    
		});
		
		
		
		
		JLabel buscador = new JLabel();
		buscador.setIcon(new ImageIcon(getClass().getResource("lupa.png")));
		buscador.setForeground(Color.white);
		buscador.setBackground(Color.decode("#714597"));
		buscador.setBounds(575, 90, 300, 30);
		panelTarifas.add(buscador);
		    
		    

		
		
		String[] columnasTarifas = {"Cliente", "Cuota Mensual", "Fecha Inicial", "Fecha Final", "Entrenador"};
	    DefaultTableModel tarifas = new DefaultTableModel(columnasTarifas, 0);
	   
	    JTable tablaTarifas = new JTable(tarifas);
	    
	    
	    tablaTarifas.setBackground(Color.decode("#F7F0FD")); 
	    tablaTarifas.setForeground(Color.decode("#47066B"));
	   
	    
	    JScrollPane scrollPaneTarifas = new JScrollPane(tablaTarifas);
	    scrollPaneTarifas.setBounds(50, 150, 900, 200);
	    scrollPaneTarifas.setBackground(Color.decode("#15066B"));
	    panelTarifas.add(scrollPaneTarifas);
	    
	    
	    ArrayList<String> nombresClientes = new ArrayList<>();
	    for (Client cliente : clientes) {
	        nombresClientes.add(cliente.getNombre());
	    }

	   
	    String[] entrenadores = {"Arisu", "Olivia", "Kairi"};
	    int seOrdena= 0; 

	    for (String nombreCliente : nombresClientes) {
	        Date fechaInicio = new Date();
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(fechaInicio);
	        calendar.add(Calendar.DAY_OF_MONTH, 30);
	        Date fechaFin = calendar.getTime();

	        String seleccion = entrenadores[seOrdena];
	        seOrdena = (seOrdena + 1) % entrenadores.length; 

	        Object[] fila = {nombreCliente, "$1000", fechaInicio, fechaFin, seleccion};
	        tarifas.addRow(fila);
	    }
	    
	    
	    JTextField buscar = new JTextField();
        buscar.setBounds(600, 90, 300, 30);
        panelTarifas.add(buscar);

        buscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String buscarTexto = buscar.getText().toLowerCase();
                DefaultTableModel modelo = (DefaultTableModel) tablaTarifas.getModel();
                modelo.setRowCount(0); 
                for (Client cliente : clientes) {
                    if (cliente.getNombre().toLowerCase().contains(buscarTexto)) {
                        Object[] fila = {cliente.getNombre(), cliente.getApellidos(), cliente.getFechaNacimiento(), cliente.getTelefono(), cliente.getTotalPagado(), cliente.getFoto()};
                        modelo.addRow(fila);
                    }
                }
            }
        });
	        
		
	
    }
	void checador (JFrame frame) {
		
		
		
		
		JPanel panelClientes = new JPanel(null) {
	           @Override
	           protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2d = (Graphics2D) g;
	                g2d.setColor(Color.BLACK); 
	                g2d.drawLine(400, 250, 600, 250); 
	                g2d.drawLine(400, 390, 600, 390);
	                /*
	                 * g2d.drawLine(140, 250, 360, 250); 
	                g2d.drawLine(140, 390, 360, 390);
	                 */
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
		JLabel nombreubiTarifas = new JLabel("CHECADOR",0);
		nombreubiTarifas.setFont(new Font("juma", Font.BOLD, 25));
		nombreubiTarifas.setForeground(Color.white);
		nombreubiTarifas.setBounds(450,0, 150, 60);
		barra.add(nombreubiTarifas);
		
		
		
		JButton salir = new JButton();
		salir.setIcon(new ImageIcon(getClass().getResource("salida.png")));
		salir.setBackground(Color.decode("#714597"));
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 90, 60);
		barra.add(salir);
		
		salir.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	panelClientes.setVisible(false);
		        	inicio(frame);
		        }
		    
		});
		
		JLabel usuario = new JLabel("Usuario: ", SwingConstants.CENTER);
		usuario.setFont(new Font("juma", Font.BOLD, 25));
		usuario.setBounds(400, 150, 220, 50);
		panelClientes.add(usuario);
		
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, panelClientes.getBackground()));
		cajaTexto.setBackground(panelClientes.getBackground());
		cajaTexto.setOpaque(false);
		cajaTexto.setBounds(400, 220, 220, 35);
		panelClientes.add(cajaTexto);
		
		
		
		
		JLabel contraseña = new JLabel("Pin: ", SwingConstants.CENTER);
		contraseña.setFont(new Font("juma", Font.BOLD, 25));
		contraseña.setBounds(400, 300, 220, 35);
		panelClientes.add(contraseña);
		
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBackground(panelClientes.getBackground());
		contrasena.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, panelClientes.getBackground()));

		contrasena.setBounds(400, 360, 220, 30);
		panelClientes.add(contrasena);
		
		JButton boton = new JButton("Registrarse");
		boton.setFont(new Font("", Font.BOLD, 25));
		boton.setBackground(Color.decode("#714597"));
	    boton.setForeground(Color.WHITE);
		boton.setBounds(410, 440, 180, 35);
		panelClientes.add(boton);
		
		
		
	    
	        
	        
		boton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(cajaTexto.getText().isEmpty()) {
					cajaTexto.setBorder(new LineBorder(Color.red,4));
					JOptionPane.showMessageDialog(null, "Por favor, ingrese un usuario", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}else {
					cajaTexto.setBorder(new LineBorder(Color.GREEN,4));
				}
				
				
				String contra = new String(contrasena.getPassword());
		        
		        
		        if (contra.length() < 5) {
		            contrasena.setBorder(new LineBorder(Color.red, 4));
		            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 5 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        } else {
		            contrasena.setBorder(new LineBorder(Color.GREEN, 4));
		        }
		        
		        
		        JOptionPane.showMessageDialog(null, "El registro se ha realizado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
		    }
		});
		 
	

	
	}
	
	void perfilesEntrenador (JFrame frame) {
		JPanel panelEntrenador = new JPanel (null);
		panelEntrenador.setSize(this.getWidth(),this.getHeight());
		panelEntrenador.setBackground(Color.decode("#F7F0FD"));
		add(panelEntrenador);
		
	
		JLabel barra = new JLabel(" ",0);
		barra.setFont(new Font("monofonto", Font.BOLD, 25));
		barra.setOpaque(true);
		barra.setBackground(Color.decode("#714597"));
		barra.setBounds(0,0, 1000, 60);
		panelEntrenador.add(barra);
		
		JLabel nombreubiTarifas = new JLabel("Perfiles de Entrenadores",0);
		nombreubiTarifas.setFont(new Font("juma", Font.BOLD, 25));
		nombreubiTarifas.setForeground(Color.white);
		nombreubiTarifas.setBounds(350,0, 350, 60);
		barra.add(nombreubiTarifas);
		
		
		
		
		JLabel nombregym = new JLabel("ALIX GYM ",0);
		nombregym.setFont(new Font("juma", Font.BOLD, 25));
		nombregym.setForeground(Color.white);
		nombregym.setBounds(10,0, 200, 60);
		barra.add(nombregym);
		
		JButton salir = new JButton();
		salir.setIcon(new ImageIcon(getClass().getResource("salida.png")));
		salir.setBackground(Color.decode("#714597"));
		salir.setFont(new Font("juma", Font.BOLD, 25));
		salir.setForeground(Color.white);
		salir.setBounds(870,0, 90, 60);
		barra.add(salir);
		
		salir.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		    	panelEntrenador.setVisible(false);
		        	inicio(frame);
		        }
		    
		});
		
		
		
		
		JLabel labelkai = new JLabel("Nombre: Imai Kairi.");
		labelkai.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labelkai.setBounds(70,80, 250, 40);
		panelEntrenador.add(labelkai);
		JLabel labelkai1 = new JLabel("Fecha de nacimiento: 2003/02/24 ");
		labelkai1.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labelkai1.setBounds(70,120, 350, 40);
		panelEntrenador.add(labelkai1);
		
		JLabel labelkai2 = new JLabel("Teléfono: 612 144 56 24");
		labelkai2.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labelkai2.setBounds(70,160, 350, 40);
		panelEntrenador.add(labelkai2);

		JButton kaiimg = new JButton("");
		kaiimg.setIcon(new ImageIcon(getClass().getResource("kairi.jpg")));
		kaiimg.setOpaque(true);
		kaiimg.setBackground(Color.white);
		kaiimg.setBounds(450,80, 100, 100);
		panelEntrenador.add(kaiimg);
		
		
		JLabel labelarisu = new JLabel("Nombre: Arisu Junkook");
		labelarisu.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labelarisu.setBounds(70,250, 250, 40);
		panelEntrenador.add(labelarisu);
		
		JLabel labelarisu2 = new JLabel("Fecha de nacimiento: 1995/02/04 ");
		labelarisu2.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labelarisu2.setBounds(70,280, 350, 40);
		panelEntrenador.add(labelarisu2);
		
		JLabel labelarisut = new JLabel("Teléfono: 612 568 56 21");
		labelarisut.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labelarisut.setBounds(70,330, 350, 40);
		panelEntrenador.add(labelarisut);

		JButton jkimg = new JButton("");
		jkimg.setIcon(new ImageIcon(getClass().getResource("jk.jpg")));
		jkimg.setOpaque(true);
		jkimg.setBackground(Color.white);
		jkimg.setBounds(450,270, 100, 100);
		panelEntrenador.add(jkimg);
		
		
		JLabel labeloli = new JLabel("Nombre: Olivia Osorio");
		labeloli.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labeloli.setBounds(70,400, 250, 40);
		panelEntrenador.add(labeloli);
		
		JLabel labeloliv = new JLabel("Fecha de nacimiento: 200/09/01 ");
		labeloliv.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labeloliv.setBounds(70,440, 350, 40);
		panelEntrenador.add(labeloliv);
		
		JLabel labelolivi = new JLabel("Teléfono: 612 987 54 38");
		labelolivi.setFont(new Font("monofonto", Font.BOLD, 20)); 
		labelolivi.setBounds(70,480, 350, 40);
		panelEntrenador.add(labelolivi);

		JButton oliviaimg = new JButton("");
		oliviaimg.setIcon(new ImageIcon(getClass().getResource("entrenadora.jpg")));
		oliviaimg.setOpaque(true);
		oliviaimg.setBackground(Color.white);
		oliviaimg.setBounds(450,450, 100, 100);
		panelEntrenador.add(oliviaimg);
		 
		
		
		
	}
	
	
	
	
	
	
	
}
