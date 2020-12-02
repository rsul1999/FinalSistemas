/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.sistemasfinal.Challenge1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chris
 */
public class Owo {

    public Owo() {
   


}    
    Challenge1 X= new Challenge1();
    @Test
    public void testPruebaArea(){
        assertEquals(25,X.Atriangulo(10, 5));
    }
    @Test
    public void testPruebaPerimetro(){
        assertEquals(30,X.Prectangulo(5, 10));
    }
    @Test
    public void testPoder(){
        assertEquals(300,X.Poder(10, 30));
    }
    }
