package javaadvanced;

import comun.LeerProperties;

public class TestProprerties {

	public static void main(String[] args) {
	
		LeerProperties prop = new LeerProperties();
		prop.getSystemProperties();
		String mensaje = System.getProperty("MENSAJE");

		System.out.println(mensaje);

		prop.setSystemPropFileName(System.getProperty("user.dir")+"\\src\\main\\resources\\datafiles\\data2.properties");
		prop.getSystemProperties();

		String mensaje1 = System.getProperty("MENSAJE");
		System.out.println(mensaje1);
	}

}
