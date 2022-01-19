import java.util.Iterator;

public class Propaganda {

    public static Integer contarPerfilGeek(RedeSocial redeSocial) {
        int quantidade = 0;
        for (Perfil perfil : redeSocial) {
            if (perfil.getTipo() == "Geek") {
                quantidade++;
            }
        }
        return quantidade;
    }
    public static Integer contarPerfis(RedeSocial redeSocial) {
        int quantidade = 0;
        for (Iterator perfilIterator = redeSocial.iterator(); perfilIterator.hasNext(); ) {
            quantidade++;
            perfilIterator.next();
        }
        return quantidade;
    }
}
