package test;





import modelo.Profesor;

import org.hibernate.Query;
import org.hibernate.Session;


import dao.CorreoElectronicoDAO;
import dao.DireccionDAO;
import dao.moduloDAO;
import dao.profesorDAO;
import dominio.DAOfactory;
import dominio.oSessionFactory;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = oSessionFactory.getSession();
			
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
    
       
       ;
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
       Profesor profesor1=new Profesor(33, "Isabel", "Fuertes", "Gascón");
        Profesor profesor2=new Profesor(34, "Jose", "Valenciano", "Gimeno");
       
        Modulo modulo1=new Modulo(7, "Sistemas Operativos en Red");
        Modulo modulo2=new Modulo(8, "Entornos de desarrollo");
        Modulo modulo3=new Modulo(9, "Sistemas Informáticos");
        
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
       
       
       
	/**agregando atributo enum
       Profesor profesorn = new Profesor(50,"joel","enciso","saravia",tipofuncionario.Interino);
       profesorDao.insert(profesorn);
      Profesor profesorById = profesorDao.findById(50);
      System.out.println(profesorById.getNombre());
	*/

       
       
     /*  hql simple code lista       
	Query query = session.createQuery("SELECT p FROM Profesor p");
    List<Profesor> profesores = query.list();
    for (Profesor profesor : profesores) {
		System.out.println(profesor.toString());*/
	
       
       
   /* hql atributos 
    * Query query = session.createQuery("SELECT p.id,p.nombre,p.ape1 FROM Profesor p");
    List<Object[]> atrrPerson = query.list();
    for (Object[] datos : atrrPerson) {
		System.out.println(datos[0]+"--"+datos[1]+"--"+datos[2]+"");
	}*/
       
       

       /* hql where
       Profesor porfesor = (Profesor)session.createQuery("SELECT p FROM Profesor p WHERE id =1001 ").uniqueResult();
       System.out.println("profesor id =1 "+ porfesor.getNombre());
    */
    
       
       /*paginacion hql
       int tamanyopPagina=10;
      // int paginaAMostrar=7;
       
       long totalobjetos = (long)session.createQuery("SELECT COUNT(*) FROM Profesor p").uniqueResult();
       Query query = session.createQuery("SELECT p FROM Profesor p");
       int numPaginas = (int )Math.ceil((double)totalobjetos/(double)tamanyopPagina);
       query.setMaxResults(tamanyopPagina);
      query.setFirstResult(numPaginas*tamanyopPagina);
       List<Profesor> profesoresList = query.list();
       for (Profesor profesores : profesoresList) {
		System.out.println(profesoresList.toString());
	}*/
//       
       
//     Query query = session.createQuery("SELECT p.id FROM Profesor p WHERE nombre='joel' ");
//     List<Integer> nombres = query.list();
//     for (Integer object : nombres) {
//		System.out.println(object.toString());
//	}
//       
     
     
     Query query2 = session.createQuery("SELECT p FROM Profesor p WHERE nombre='ISABEL' AND ape1<>'ORELLANA'");  
    List<Profesor> profesoresList = query2.list();
    
    for (Profesor profesor : profesoresList) {
		System.out.println(profesor.getApe1());
	}
//	
//    Query query3 = session.createQuery("SELECT p.nombre FROM Profesor p WHERE id BETWEEN 1 AND 10");
//    List<String> nombress = query3.list();
//    for (String string : nombress) {
//		System.out.println(string);
//    }
//	
	Query query4 = session.createQuery("SELECT p.nombre FROM Profesor p WHERE nombre LIKE '_el%'");
	List<String> nombres2 = query4.list();
	for (String string : nombres2) {
		System.out.println("OPERADOR %_ "+string);
	}
	
	Query query5 = session.createQuery("SELECT p.nombre FROM Profesor p WHERE tipofuncionario IS NULL");
	List<String> id = query5.list();
	for (String string : id) {
		System.out.println("is null"+string);
	}
	
	
	
	}       				

	
}
