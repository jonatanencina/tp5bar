package ejercicio;

import ejercicio.BarHomeroo;

import ejercicio.Clientes;

import ejercicio.ComparaClienteporEdad;
import junit.framework.Assert;

import org.junit.Test; 

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet; 

public class TestBarHomero {

       @Test
       public void BarAbiertoSinClientes(){
    	   BarHomeroo mibar=new BarHomeroo();
    	   
    	   assertEquals(0,mibar.getCantidadDeClientes(),0.01);
    	   
       }
     @Test
     public void  BarAbiertoConClientesOrdenadosAlfabeticamente(){
    	 
    	 BarHomeroo mibar=new BarHomeroo();
    	 Clientes cli1=new Clientes(" patricio wozniak",24);
    	 
    	 Clientes cli2=new  Clientes("bruno coronado",30);
    	 
    	Clientes cli3=new Clientes("Ana Maria",40);		 
    	
    	Clientes cli4=new Clientes("Josefina Flores",21);
    	 mibar.agregarClientes(cli1);
    	 
    	 mibar.agregarClientes(cli2);
    	 
    	 mibar.agregarClientes(cli3);
    	  
    	 mibar.agregarClientes(cli4);
    	 
    	 TreeSet<Clientes> listaEsperada=new TreeSet<Clientes>();
    	 
    	listaEsperada.add(cli3);
    	listaEsperada.add(cli2);
    	listaEsperada.add(cli4);
    	listaEsperada.add(cli1);
    	 assertEquals(listaEsperada,mibar.listaDeClientes);

    	 
    	  }
      @Test
      public void BarAbiertoConClientesOrdenadosPorEdad(){
    	  BarHomeroo mibar=new BarHomeroo();
     	 Clientes cli1=new Clientes(" patricio wozniak",21);
     	 
     	 Clientes cli2=new  Clientes("bruno coronado",24);
     	 
     	Clientes cli3=new Clientes("Ana Maria",23);		 
     	
     	Clientes cli4=new Clientes("Josefina Flores",22);
     	

     	
     	 mibar.agregarClientes(cli1);
     	 
     	 mibar.agregarClientes(cli2);
     	 
     	 mibar.agregarClientes(cli3);
     	  
     	 mibar.agregarClientes(cli4);
     	 
     	 TreeSet<Clientes> listaEsperada=new TreeSet<Clientes>();
     	 
     	listaEsperada.add(cli1);
     	listaEsperada.add(cli2);
     	listaEsperada.add(cli3);
     	listaEsperada.add(cli4);
     	System.out.println("\n aca se muestran ordenados por edad\n");
     	 assertEquals(listaEsperada,mibar.comparandoLosClientesPorEdad());

      }
      @Test 
      public void comparandoClientesAdentroYAfueraDelBar(){
    	  
    	  BarHomeroo mibar=new BarHomeroo();
    	  
    	  mibar.agregarClientes(new Clientes("jonatan",22));
    	  
    	  mibar.agregarClientes(new Clientes("arjona ",31));
    	  
    	  mibar.agregarClientes(new Clientes("florencia",25));
    	  
    	  mibar.agregarClientes(new Clientes("estefania",31));
    	  
    	  
    	  
    	  Clientes cli=new Clientes("jonatan",22);
                  
   		  assertTrue( mibar.ComparandoClientesAdentroYAfuera(mibar, cli)==true);               
    	  
    	  
    	  
   			                               }	
   			
                          
      }
	
    	  
      
      
      



