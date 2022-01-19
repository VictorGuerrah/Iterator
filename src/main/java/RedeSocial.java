import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RedeSocial  implements  Iterable<Perfil>{
    public List<Perfil> perfis = new ArrayList<>();

    public RedeSocial(Perfil... perfil){this.perfis = Arrays.asList(perfil);}

    @Override
    public Iterator<Perfil> iterator() {
        return perfis.iterator();
    }
}
