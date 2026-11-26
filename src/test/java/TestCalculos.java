/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import perla.itszn.edu.mx.calculadorabasica.Calculos;

/**
 *
 * @author Perla Castañeda
 */
public class TestCalculos {
    
    public TestCalculos() {
    }
    Calculos instancia=new Calculos();
   
    @Test
    public void pruebaSuma1(){
        int x=4;
        int y=2;
        int esperado=6;
        int obtenido=instancia.suma(x,y);
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaSuma2(){
        int x=6;
        int y=8;
        int esperado=14;
        int obtenido=instancia.suma(x,y);
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaResta1(){
        int x=4;
        int y=2;
        int esperado=2;
        int obtenido=instancia.resta(x,y);
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaResta2(){
        int x=6;
        int y=8;
        int esperado=-2;
        int obtenido=instancia.resta(x,y);
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaMulti1(){
        int x=4;
        int y=2;
        int esperado=8;
        int obtenido=instancia.multi(x,y);
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaMulti2(){
        int x=6;
        int y=-2;
        int esperado=-12;
        int obtenido=instancia.multi(x,y);
        assertEquals(esperado, obtenido);
    }
    
    @Test
    public void pruebaDivision1(){
        int x=8;
        int y=2;
        int esperado=4;
        int obtenido=instancia.division(x,y);
        assertEquals(esperado, obtenido);
    }
}