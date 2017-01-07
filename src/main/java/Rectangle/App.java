package Rectangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rect prostokącik = new Rect(1,1,3,3);
        prostokącik.printCoordinates();
        Rect prostokącikOJedenWyżej = new Rect(1,2,3,4);
        System.out.println(prostokącik.distanceBeetweenRectCenters(prostokącikOJedenWyżej));
        prostokącik.commonFields(prostokącikOJedenWyżej).printCoordinates();
        System.out.println(prostokącik.crossing(prostokącikOJedenWyżej));
        System.out.println(prostokącik.contains(prostokącikOJedenWyżej));
        Rect prostokącikWewnatrzProstokącika = new Rect(1,2,3,3);
        System.out.println(prostokącik.contains(prostokącikWewnatrzProstokącika));
    }
}
