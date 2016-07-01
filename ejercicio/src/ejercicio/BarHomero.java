package ejercicio;

import java.util.concurrent.*;
import java.util.*;

public class BarHomero {
	
	//solo es un practica para ver como va quedando el programa.
	
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		BarHomeroo mibar=new BarHomeroo();
		
		mibar.agregarClientes(new Clientes("jonatan",22));
		
		mibar.agregarClientes(new Clientes("buana Peres",25));
		
		mibar.agregarClientes(new Clientes("aucia garcia",23));
		
		mibar.agregarClientes(new Clientes("donatan  lopes",20));
		
		mibar.agregarClientes(new Clientes("jonatan",24));
		
		for(Clientes corre: mibar.listaDeClientes  )
		{
			
			System.out.println(" nombre "+corre.getNombre()+" edad "+ corre.getEdad());
		
		}
	//System.out.println("la cantidad"+mibar.getCantidadDeClientes());
	

	/*	ComparaClienteporEdad com_edad=new ComparaClienteporEdad();
	
		TreeSet<Clientes> orde_cliente=new TreeSet(com_edad);
	
		orde_cliente.addAll(mibar.listaDeClientes);
		
	//	System.out.println(orde_cliente);
		for (Clientes clientes : orde_cliente) {
			
			System.out.println(clientes.getNombre()+clientes.getEdad());
		}*/
//    mibar.comparandoLosClientes();




		Clientes Cli=new Clientes("jonatan",22);
       int posicion=0;
       
			Iterator<Clientes> ITlistaDeClientes=mibar.listaDeClientes.iterator();
			
			while(ITlistaDeClientes.hasNext()){
		  	  
		  	 // ITlistaDeClientes.next();
		  	  
		  	 Clientes unaPersona = (Clientes) ITlistaDeClientes.next();
		  	  
		  	 String nom=unaPersona.getNombre();
		  	 
		  	 if(Cli.getNombre().equals(nom)){
		  		 
		  		 System.out.println(" El Cliente de afuera TIENE el mismo nombre que un cliente en el bar "+"en la posicion"+posicion);
		  	 }else{
		  		 System.out.println("El Cliente de afuera NO TIENE el mismo nombre que un cliente en el bar"+"en la posicion"+posicion);
		  	 }
		                  posicion++;            }	
                       }
}
		



