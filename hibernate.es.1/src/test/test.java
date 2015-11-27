package test;

import modelo.Profesor;
import modelo.tipofuncionario;
import dao.CorreoElectronicoDAO;
import dao.DireccionDAO;
import dao.moduloDAO;
import dao.profesorDAO;
import dominio.DAOfactory;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
		DAOfactory mysqlFactory = DAOfactory.getDaoFactory(DAOfactory.MYSQL);
       profesorDAO profesorDao = mysqlFactory.getProfesorDao();
       DireccionDAO direccionDao = mysqlFactory.getDireccionDao();
       CorreoElectronicoDAO correoElectronicoDao = mysqlFactory.getcCorreoElectronicoDao();
       moduloDAO moduloDao = mysqlFactory.getModuloDao();
       
       //Profesor profesor2 = new Profesor();
       //Direccion direccion = direccionDao.findById(1199);
       //CorreoElectronico correoElectronico = correoElectronicoDao.findById(4200);
       
     // System.out.println(""+correoElectronico.getDireccionCorreo());
       
       /******encontrar datos
        profesor2 =profesorDao.findById(1194);
        System.out.println(direccion.getCalle());
        System.out.println(profesor2.getNombre());    
	***/
	
       
       
	/***ingresar cascada one to one unidreccional
       direccion.setId(12);
       direccion.setCalle("101010100");
       direccion.setNumero(4586387);
       direccion.setPoblacion("montejato");
       direccion.setProvincia("san vicente");
       
       profesor2.setId(13);
       profesor2.setApe1("enciso");
       profesor2.setApe2("saravia");
       profesor2.setNombre("joel");
       profesor2.setDireccion(direccion);
       profesorDao.insert(profesor2);
       profesor2 = profesorDao.findById(13);
       direccion =direccionDao.findById(12);
       System.out.println(profesor2.getId()+".."+direccion.getId());
       **/
       
  
       
       
       
       /***** ingresar onetoone bidireccional*
       Profesor profesor3 = new Profesor(6, "aaron", "enciso", "saravia" );
       Direccion direccion3 = new Direccion(6, "bruselas", 5, "arribas", "maala");
       direccion3.setProfesor(profesor3);
       direccionDao.insertar(direccion3);
       direccion =direccionDao.findById(6); 
       profesor2= profesorDao.findById(6);
       System.out.println(profesor2.getApe2()+direccion3);*/
    
       
       
     /***  one to manu--many to one
       Profesor profesor3 = new Profesor();
       profesor3.setId(23);
       profesor3.setNombre("abdu");
       profesor3. setApe1("kali");
       profesor3.setApe2("mali");
       
       CorreoElectronico correo1 = new CorreoElectronico();
       correo1.setIdcorreo(4);
       correo1.setDireccionCorreo("javahotmail.com");
       correo1.setProfesor(profesor3);
       CorreoElectronico correo2 = new CorreoElectronico();
       correo2.setIdcorreo(5);
       correo2.setDireccionCorreo("javahotmail.com");
       correo2.setProfesor(profesor3);
       CorreoElectronico correo3 = new CorreoElectronico();
       correo3.setIdcorreo(6);
       correo3.setDireccionCorreo("javahotmail.com");
       correo3.setProfesor(profesor3);
       Set<CorreoElectronico> correosElectronicos=new HashSet<>();
       correosElectronicos.add(correo1);
       correosElectronicos.add(correo2);
       correosElectronicos.add(correo3);
       profesor3.setCorreos(correosElectronicos);
       profesorDao.insert(profesor3);			
      
       
       Profesor profesorFind = (Profesor)profesorDao.findById(23);
       
       System.out.println("profesor 3 correos:"+profesorFind.getApe1()+profesorFind.getCorreos());
       */
       
       
       
       /*many to many
       Profesor profesor1=new Profesor(33, "Isabel", "Fuertes", "Gasc�n");
        Profesor profesor2=new Profesor(34, "Jose", "Valenciano", "Gimeno");
       
        Modulo modulo1=new Modulo(7, "Sistemas Operativos en Red");
        Modulo modulo2=new Modulo(8, "Entornos de desarrollo");
        Modulo modulo3=new Modulo(9, "Sistemas Inform�ticos");
        
        profesor1.getModulos().add(modulo1);
         profesor1.getModulos().add(modulo2);
        profesor2.getModulos().add(modulo3);
       
        modulo1.getProfesores().add(profesor1);
        modulo2.getProfesores().add(profesor1);
        modulo3.getProfesores().add(profesor2);
        profesorDao.insert(profesor1);
        profesorDao.insert(profesor2);
        Profesor profesorbyId= profesorDao.findById(31);
        
        
       System.out.println(profesorbyId.getNombre()); 
       */
	
       Profesor profesorn = new Profesor(50,"joel","enciso","saravia",tipofuncionario.Interino);
       profesorDao.insert(profesorn);
      Profesor profesorById = profesorDao.findById(50);
      System.out.println(profesorById.getNombre());
	}
		

}