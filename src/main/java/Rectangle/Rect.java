package Rectangle;


public class Rect {

    private int x1;
    private int y1;

    private int x2;
    private int y2;    //określone koordynaty (przeciwległe)

    private int x3;
    private int y3;

    private int x4;
    private int y4;


    public Rect() {//konstruktor z gotowymi koordynatami
        setX1(1);
        setY1(3);
        setX2(4);
        setY2(3);
        setX3(4);
        setY3(1);
        setX4(1);
        setY4(1);


    }

    public Rect(int xA, int yA, int xB, int yB) {


        if (yA >= yB) {
            if (xA <= xB) {             //ustawiam pkty zgodnie ze wskazówkami zegara x1, y1 w lewym gornym rogu-> przeciwlegly to x3, y3
                this.setX1(xA);
                this.setY1(yA);
                this.setX2(xB);
                this.setY2(yA);
                this.setX3(xB);
                this.setY3(yB);
                this.setX4(xA);
                this.setY4(yB);

            } else {
                this.setX1(xB);
                this.setY1(yB);
                this.setX2(xA);
                this.setY2(yB);
                this.setX3(xA);
                this.setY3(yA);
                this.setX4(xB);
                this.setY4(yA);
            }
        } else {
            if (xA <= xB) {
                this.setX1(xA);
                this.setY1(yB);
                this.setX2(xB);
                this.setY2(yB);
                this.setX3(xB);
                this.setY3(yA);
                this.setX4(xA);
                this.setY4(yA);
            } else {
                this.setX1(xB);
                this.setY1(yA);
                this.setX2(xA);
                this.setY2(yA);
                this.setX3(xA);
                this.setY3(yB);
                this.setX4(xB);
                this.setY4(yB);
            }

        }

    }

    double distanceBeetweenRectCenters(Rect rect) {
        double xRect1center = (this.getX2() - this.getX1()) / 2 + this.getX2();
        double yRect1center = (this.getY2() - this.getY1()) / 2 + this.getY2();
        double xRect2center = (rect.getX2() - rect.getX1()) / 2 + rect.getX2();
        double yRect2center = (rect.getY2() - rect.getY1()) / 2 + rect.getY2();
        return Math.hypot(xRect1center - xRect2center, yRect1center - yRect2center);
    }


    boolean crossing(Rect rect) {//ma sprawdzać czy sie przecinają

        boolean isCrossingInX = (this.getX1() <= rect.getX1() && this.getX3() >= rect.getX1()) || (this.getX1() <= rect.getX3() && this.getX3() >= rect.getX3());//sprawdza czy który z x1,x3 drugiego prostokąta zawiera sie między x1 a x3 drugiego, a potem analogicznie y-greki
        boolean isCrossingInY = (this.getY1() >= rect.getY1() && this.getY3() <= rect.getY1()) || (this.getY1() >= rect.getY3() && this.getY3() <= rect.getY3());
        return isCrossingInX && isCrossingInY;
    }



    boolean contains(Rect rect) {//ma sprawdzać czy sie zawiera jeden w drugim
        boolean isInXAxis = (this.getX1() <= rect.getX1() && this.getX3() >= rect.getX1()) && (this.getX1() <= rect.getX3() && this.getX3() >= rect.getX3());//sprawdza czy który z x1,x3 drugiego prostokąta zawiera sie między x1 a x3 drugiego, a potem analogicznie y-greki
        boolean isInYAxis = (this.getY1() >= rect.getY1() && this.getY3() <= rect.getY1()) && (this.getY1() >= rect.getY3() && this.getY3() <= rect.getY3());
        return isInXAxis && isInYAxis;
    }

    Rect commonFields(Rect rect) {//ma zwracać część wspólną

        Rect commonfield = new Rect(0, 0, 0, 0);
        if (this.crossing(rect)) {//sprawdzam czy sie pokrywają
            int x1CommonRect;
            int y1CommonRect;
            int x3CommonRect;
            int y3CommonRect;

            if (this.getX1() >= rect.getX1()) {//x1,y1 ogranicza z prawej i od gory wiec wybieram, x z prawej i y nizej)
                x1CommonRect = this.getX1();
            } else {
                x1CommonRect = rect.getX1();
            }

            if (this.getY1() <= rect.getY1()) {
                y1CommonRect = this.getY1();
            } else {
                y1CommonRect = rect.getY1();
            }

            //x3 y3 ogranicza na odwrót
            if (this.getX3() <= rect.getX3()) {
                x3CommonRect = this.getX3();
            } else {
                x3CommonRect = rect.getX3();
            }
            if (this.getY3() >= rect.getY3()) {
                y3CommonRect = this.getY3();
            } else {
                y3CommonRect = rect.getY3();
            }


            commonfield = new Rect(x1CommonRect, y1CommonRect, x3CommonRect, y3CommonRect);
        }
        return commonfield;
    }


    void printCoordinates(){

        System.out.println(this.getX1()+", "+this.getY1()+"; "+this.getX2()+", "+this.getY2()+"; "+this.getX3()+", "+this.getY3()+"; "+this.getX4()+", "+this.getY4()+"; ");
    }


    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }


}
