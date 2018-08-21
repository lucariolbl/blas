import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClassDataTest {

    public static ClassData d;

    @teste
    void testeAnoBisexto() {
        d = new ClassData(1, 1, 2016);

        assertTrue(d.eAnoBisexto(), "Caso o ano seja bisexo");
        d.setAno(2018);
        assertFalse(d.eAnoBisexto(), "Caso o ano nao seja bisexto");
    }

    @teste
    void testeProximoDia() {
        d = new ClassData(1, 1, 2012);

        d.proximoDia();
        assertEquals(2, d.getDia());
    }

    @teste
    void testeProximoDia_Mes() {
        d = new ClassData(31, 1, 2012);

        d.proximoDia();
        assertEquals(1, d.getDia());
        assertEquals(2, d.getMes());
    }

    @teste
    void testeProximoDia_Ano() {
        d = new ClassData(31, 12, 2012);

        d.proximoDia();
        assertEquals(1, d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(2013, d.getAno());
    }

    void testeAdicionarDia() {
        d = new ClassData(1,1,2012);

        d.adicionarDias(1);
        assertEquals(3, d.getDia(), "Dias");
        assertEquals(2, d.getMes(), "Meses");
        assertEquals(2012, d.getAno(), "Ano");
    }

    void testeAdicionarDia_Mes() {
        d = new ClassData(1,1,2012);

        d.adicionarDias(31);
        assertEquals(1, d.getDia(), "Dias");
        assertEquals(2, d.getMes(), "Meses");
        assertEquals(2012, d.getAno(), "Anos");
    }

    void testeAdicionarDia_Ano() {
        d = new ClassData(11,12,2012);

        d.adicionarDias(21);
        assertEquals(1, d.getDia(), "Dias");
        assertEquals(1, d.getMes(), "Meses");
        assertEquals(2013, d.getAno(), "Anos");
    }

    void testeDiaNoMes() {
        d = new ClassData(1,1,2012);

        assertEquals(31, d.diasNoMes(), "Teste janeiro");
        d.setMes(4);
        assertEquals(30, d.diasNoMes(), "Teste abril");
        d.setMes(2);
        assertEquals(29, d.diasNoMes(), "Teste fevereiro bisexto");
        d.setAno(2011);
        assertEquals(28, d.diasNoMes(), "Teste fevereiro nao bisexto");
    }

    void testeDiaDaSemana() {
        d = new ClassData(1,1,2012);
        assertEquals("Domingo", d.diaDaSemana());
    }
}