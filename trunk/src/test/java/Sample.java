import fr.loof.cradoc.bracadabra;
import fr.loof.cradoc.tesSouhaits;
import fr.loof.cradoc.ttention;

public class Sample
{
    @tesSouhaits( "t'as avalé un becherel de travers ?" )
    /**
     * Moi y'en a faire du JavaDoc pour le fun qu'il décrit rien de qu'est ce que dont ça fait la chose dessous là
     */
    public void codeDeMerde()
    {
        @ttention( "il existe une syntaxe pour créer des constantes primitives double" )
        double d = new Double( "1.0" ).doubleValue();

        @bracadabra( "fun, mais ça sert à quoi exactement ?" )
        double k = ( d + 2 - 2 );
    }
}
