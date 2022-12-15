import java.util.ArrayList;
import java.util.List;

class main
{
    public static void main(String[] arg)
    {
        Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
        Trojkat rownoboczny = new Trojkat(7, 4, "biały");
        Kwadrat malyKwadrat= new Kwadrat(3, "zielony");
        Punkt testowyPunkt= new Punkt(0,3);
        Kwadrat kwadrat = new Kwadrat(9, "różowy");
        Prostokat prostokat = new Prostokat(4, 6, "czerwony");
        Trojkat trojkat = new Trojkat(2, 4, "biały");
        Trojkat trojkat2 = new Trojkat(22, 4, "biały");
        Trojkat trojkat3 = new Trojkat(22, 43, "biały");
        Trojkat trojkat4 = new Trojkat(22, 43, "czerwony");
        Trojkat trojkat5 = new Trojkat(22, 13, "czerwony");
        //Figura szesciobok=new Figura();
        //maly_punkt.zwieksz(3,4);
       System.out.println( maly_punkt.opis());
        //System.out.println( szesciobok.getKolor());
        System.out.println( rownoboczny.opis());
        Figura[] tablicaFigur = new Figura[10];
        tablicaFigur[0]=maly_punkt;
        tablicaFigur[1]=rownoboczny;
        tablicaFigur[2]=malyKwadrat;
        tablicaFigur[2]=malyKwadrat;
        tablicaFigur[3] = kwadrat;
        tablicaFigur[4] = prostokat;
        tablicaFigur[5] = trojkat;
        tablicaFigur[6] = trojkat2;
        tablicaFigur[7] = trojkat3;
        tablicaFigur[8] = trojkat4 ;
        tablicaFigur[9] = trojkat5 ;
        //polimorfizm nie bierzemy opis z figury a z odpowiednich klas obiektow
        for (Figura figura : tablicaFigur) {
            if (figura != null) {
                System.out.println(figura.opis());
            }
        }
        List<iFigury> figury = new ArrayList<>();
        // utworzenie obiektów różnych klas implementujących interfejs IFigury
        Prostokat prostokat6 = new Prostokat(10, 20,"bialy");
        Kwadrat kwadrat6 = new Kwadrat(5,"czarny");
        Trojkat trojkat6 = new Trojkat(10, 20,"pomarancz");

        // dodanie obiektów do listy figury
        figury.add(prostokat6);
        figury.add(kwadrat6);
        figury.add(trojkat6);
        System.out.println("################");
        for (int i = 0; i < figury.size(); i++) {
           System.out.println( figury.get(i).wPolu(testowyPunkt));
            System.out.println(figury.get(i).getPowierzchnia());
        }

    }
}