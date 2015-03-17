# Intro #
La revue de code c'est cool, mais ça n'empêche pas de tomber de temps en temps sur de belles boulettes. Comment marquer rapidement du code suspicieux sans interrompre la tâche en cours et/ou sans faire appel à un outil de revue de code comme Crubicle ?

# Mais encore #
CRADOC est une librairie d'annotations permettant de marquer des éléments de code en fonction de l'humeur du jour. L'annotation peut rapidement être ajoutée dans le code source sans en impacter le contenu et restera par la suite tant que le problème identifié n'aura pas été pris en considération.

# Exemple #
```
public class Sample
{
    @tesSouhaits( value = "t'as avalé un becherel de travers ?", reviewer = "jtoubon" )
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
```

# Et après ? #
Dans une version à venir non planifiée, Cradoc pourrait intégrer un analyseur d'annotations utilisable sur JDK 6+ pour extraire ces commentaires de revue et les indiquer dans le log de compilation, et/ou un plugin Maven de reporting pour faire un joli rapport circonstancié de la revue de code.

# A propos #

Cradoc est une initiative du [BreizhJUG](http://www.breizhjug.org)
Les contributions sont les bienvenues