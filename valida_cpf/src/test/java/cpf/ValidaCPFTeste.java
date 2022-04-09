package cpf;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class ValidaCPFTeste {

    private validaCPF app;

    @Before
    public void setup(){
        app = new validaCPF();
    }

    @Test
    public void testValidaCPF() {
        String CPF = "000.000.000-00";
        assertFalse(app.isCPF(CPF));
    }

    @Test
    public void testTamanho(){
        String CPF = "00000000000" ;
        assertTrue(app.validaTamanho(CPF));
        CPF = "000000000";
        assertTrue(app.validaTamanho(CPF));
        CPF = "00000000000";
        assertTrue(app.validaTamanho(CPF));
    }

    @Test
    public void testSomenteDigito(){
        String CPF = "000.000.000 - 00";
        assertFalse(app.somenteDigitos(CPF));
        CPF = "00000000000";
        assertTrue(app.somenteDigitos(CPF));
    }

    @Test
    public void testTodosNumerosIguais(){
        int[] numerosCpf = new int[11];
                numerosCpf[0] =1;
                numerosCpf[1] =1;
                numerosCpf[2] =1;
                numerosCpf[3] =1;
                numerosCpf[4] =1;
                numerosCpf[5] =1;
                numerosCpf[6] =1;
                numerosCpf[7] =1;
                numerosCpf[8] =1;
                numerosCpf[9] =1;
        assertTrue(app.todosNumerosIguais(numerosCpf));
    }


}
