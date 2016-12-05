/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ab1065721
 */
public class InterfaceJogoTest {
    
    public InterfaceJogoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Pergunta method, of class InterfaceJogo.
     */
    @Test
    public void testPergunta() {
        System.out.println("Pergunta");
        InterfaceJogo instance = new InterfaceJogo();
        instance.Pergunta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PlayerAtivo method, of class InterfaceJogo.
     */
    @Test
    public void testPlayerAtivo() {
        System.out.println("PlayerAtivo");
        InterfaceJogo instance = new InterfaceJogo();
        instance.PlayerAtivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Limpajogo method, of class InterfaceJogo.
     */
    @Test
    public void testLimpajogo() {
        System.out.println("Limpajogo");
        InterfaceJogo instance = new InterfaceJogo();
        instance.Limpajogo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of JogadorVencedor method, of class InterfaceJogo.
     */
    @Test
    public void testJogadorVencedor() {
        System.out.println("JogadorVencedor");
        String Jogador = "";
        InterfaceJogo instance = new InterfaceJogo();
        instance.JogadorVencedor(Jogador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Vencedor method, of class InterfaceJogo.
     */
    @Test
    public void testVencedor() {
        System.out.println("Vencedor");
        String JogadorVencedor = "";
        InterfaceJogo instance = new InterfaceJogo();
        instance.Vencedor(JogadorVencedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LimparCampos method, of class InterfaceJogo.
     */
    @Test
    public void testLimparCampos() {
        System.out.println("LimparCampos");
        InterfaceJogo instance = new InterfaceJogo();
        instance.LimparCampos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class InterfaceJogo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        InterfaceJogo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
