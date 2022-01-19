import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SpamTest {
    @Test
    void deveContarPerfilGeek() {
        RedeSocial redeSocial = new RedeSocial(
                new Perfil("A", 18,"Geek",3),
                new Perfil("B", 25,"Tech",20),
                new Perfil("C", 33,"Esportivo",5),
                new Perfil("D", 64,"Geek",100)
        );
        assertEquals(2, Propaganda.contarPerfilGeek(redeSocial));
    }

    @Test
    void deveContarTotalPerfis() {
        RedeSocial redeSocial = new RedeSocial(
                new Perfil("A", 18,"Geek",3),
                new Perfil("B", 25,"Tech",20),
                new Perfil("C", 33,"Esportivo",5),
                new Perfil("D", 64,"Geek",100)
        );
        assertEquals(4, Propaganda.contarPerfis(redeSocial));
    }


}