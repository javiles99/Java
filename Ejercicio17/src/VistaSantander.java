import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class VistaSantander
{	
	public void Principal(List<ModeloSantander> lista)
	{
		JFrame ventana = new JFrame();
		ventana.setTitle("BANCO SANTANDER");
		ventana.setSize(700,300);
		ventana.setLayout(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        
        JLabel etiqueta = new JLabel("Bienvenid@ a nuestra aplicación de Banco Santander, si ya eres usuario por favor logueate, sino, registrate");
        etiqueta.setBounds(30,15,700,20);
		JButton pulsarlogin =  new JButton("LOGIN");
		pulsarlogin.setBounds(50,80,200,100);
        
        pulsarlogin.addActionListener(new ActionListener() {

    		public void actionPerformed(ActionEvent e) {
    			login(lista);
    		}
    		});
        ventana.add(etiqueta);
        ventana.add(pulsarlogin);
        
        
        JButton pulsarregistro = new JButton("REGISTRARSE");
        pulsarregistro.setBounds(440,80,200,100);
        pulsarregistro.addActionListener(new ActionListener() {

    		@Override
    		public void actionPerformed(ActionEvent e) {
    			registro(lista);
    		}
    		});
        ventana.add(pulsarregistro);
        ventana.setVisible(true);
	}
        
           
        public void login(List<ModeloSantander> lista){
        	JFrame login = new JFrame();
        	login.setTitle("LOGIN");
        	login.setLayout(null);
        	login.setSize(400,400);
        	login.setVisible(true);
        	
        	JLabel etiquetalogin = new JLabel("Por favor introduce tu nombre de usuario y tu contraseña");
        	etiquetalogin.setBounds(30,15,400,20);
        	JLabel usuarioLabel = new JLabel("Nombre de Usuario");
        	usuarioLabel.setBounds(140,50,120,20);
        	JTextField usuarioTextField = new JTextField(20);
        	usuarioTextField.setBounds(140,75,120,20);
        	JLabel contraseniaLabel = new JLabel("Contraseña");
        	contraseniaLabel.setBounds(140,100,120,20);
        	JTextField contraseniaPasswordField = new JPasswordField(20); 
        	contraseniaPasswordField.setBounds(140,125,120,20);
        	JButton pulsarlogin =  new JButton("ACCEDER A PRODUCTOS");
        	pulsarlogin.setBounds(100,175,200,20);
	
        	pulsarlogin.addActionListener(new ActionListener() {

        		@Override
        		public void actionPerformed(ActionEvent e) {
        			String usuario = usuarioTextField.getText();
        			String contrasenia = contraseniaPasswordField.getText();
        		}
        	});
        	login.add(etiquetalogin);
        	login.add(usuarioLabel); 
        	login.add(usuarioTextField);
        	login.add(contraseniaLabel);
        	login.add(contraseniaPasswordField);
        	login.add(pulsarlogin);
        }	

        public void registro(List<ModeloSantander> lista){
        	JFrame registro = new JFrame();
        	registro.setTitle("REGISTRARSE");
        	registro.setLayout(null);
        	registro.setSize(700,500);
        	registro.setVisible(true);
        	
        	
        	JLabel etiquetaregistro = new JLabel("Por favor introduce los siguientes datos para registrarte correctamente");
        	etiquetaregistro.setBounds(150,15,700,20);
        	
        	JLabel nombreLabel = new JLabel("Nombre");
        	nombreLabel.setBounds(100,50,700,20);
        	JTextField nombreTextField = new JTextField(20);
        	nombreTextField.setBounds(170,50,150,20);
        	
        	JLabel apellidoLabel = new JLabel("Apellido");
        	apellidoLabel.setBounds(100,90,700,20);
        	JTextField apellidoTextField = new JTextField(20);
        	apellidoTextField.setBounds(170,90,150,20);
        	
        	JLabel ciudadLabel = new JLabel("Ciudad");
        	ciudadLabel.setBounds(100,130,700,20);
        	JTextField ciudadTextField = new JTextField(20);
        	ciudadTextField.setBounds(170,130,150,20);
        	
        	JLabel correoLabel = new JLabel("Correo");
        	correoLabel.setBounds(100,170,700,20);
        	JTextField correoTextField = new JTextField(20);
        	correoTextField.setBounds(170,170,150,20);
        	
        	JLabel salarioLabel = new JLabel("Salario Bruto Anual");
        	salarioLabel.setBounds(100,210,700,20);
        	JTextField salarioTextField = new JTextField(20);
        	salarioTextField.setBounds(230,210,150,20);
        	
        	JLabel nacimientoLabel = new JLabel("Fecha de Nacimiento(YYYY/MM/dd)");
        	nacimientoLabel.setBounds(100,250,700,20);
        	JTextField nacimientoTextField = new JTextField(20); 
        	nacimientoTextField.setBounds(330,250,150,20);
        	
        	JLabel contraseniaLabel = new JLabel("Contraseña");
        	contraseniaLabel.setBounds(100,290,700,20);
        	JTextField contraseniaPasswordField = new JPasswordField(20); 
        	contraseniaPasswordField.setBounds(180,290,150,20);
        	
        	JButton pulsarregistro = new JButton("ACCEDER A PRODUCTOS");
        	pulsarregistro.setBounds(250,350,200,20);
	
			pulsarregistro.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String nombre = nombreTextField.getText();
		            String apellido = apellidoTextField.getText();
		            String ciudad = ciudadTextField.getText();
		            String correo = correoTextField.getText();
		            String salario = salarioTextField.getText();
		            String nacimiento = nacimientoTextField.getText();
					String contrasenia = contraseniaPasswordField.getText();
					System.out.println("El registro se ha realizado");		
					}
				});
			registro.add(etiquetaregistro); 
			registro.add(nombreLabel); 
			registro.add(nombreTextField);
			registro.add(apellidoLabel); 
			registro.add(apellidoTextField);
			registro.add(ciudadLabel); 
			registro.add(ciudadTextField);
			registro.add(correoLabel); 
			registro.add(correoTextField);
			registro.add(salarioLabel); 
			registro.add(salarioTextField);
			registro.add(nacimientoLabel);
			registro.add(nacimientoTextField);
			registro.add(contraseniaLabel);
			registro.add(contraseniaPasswordField);
			registro.add(pulsarregistro);
			
		}

		public void productos(ModeloSantander lista) {
    		JFrame ventanaproducto = new JFrame();
    		ventanaproducto.setTitle("PRODUCTOS");
    		ventanaproducto.setSize(800,500);
    		ventanaproducto.setLayout(null);
    		ventanaproducto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		JLabel texto = new JLabel("Bienvenido, "+lista.getNombre()+"!");
    		texto.setBounds(30,15,700,20);
    		ventanaproducto.add(texto);
    		
    		
    			ProductoSantander pro = lista.getProducto().get(0);
    			JLabel product = new JLabel(pro.getNumeroTarjeta()+": dinero actual: "+pro.getFechaVencimiento());
    			product.setBounds(10,40,600,30);

    			ventanaproducto.add(product);
  
    		
    		ventanaproducto.setVisible(true);
    	}
}
