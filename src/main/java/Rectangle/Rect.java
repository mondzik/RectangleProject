package Rectangle;


public class Rect {

    int x1;
    int y1;

    int x2;
    int y2;    //określone koordynaty (przeciwległe)

    int x3;
    int y3;

    int x4;
    int y4;


    public Rect() {//konstruktor z gotowymi koordynatami
        x1 = 1;
        y1 = 3;
        x2 = 4;
        y2 = 3;
        x3 = 4;
        y3 = 1;
        x4 = 1;
        y4 = 1;


    }

    public Rect(int xA, int yA, int xB, int yB) {


        if (yA >= yB) {
            if (xA <= xB) {             //ustawiam pkty zgodnie ze wskazówkami zegara x1, y1 w lewym gornym rogu-> przeciwlegly to x3, y3
                this.x1 = xA;
                this.y1 = yA;
                this.x2 = xB;
                this.y2 = yA;
                this.x3 = xB;
                this.y3 = yB;
                this.x4 = xA;
                this.y4 = yB;

            } else {
                this.x1 = xB;
                this.y1 = yB;
                this.x2 = xA;
                this.y2 = yB;
                this.x3 = xA;
                this.y3 = yA;
                this.x4 = xB;
                this.y4 = yA;
            }
        } else {
            if (xA <= xB) {
                this.x1 = xA;
                this.y1 = yB;
                this.x2 = xB;
                this.y2 = yB;
                this.x3 = xB;
                this.y3 = yA;
                this.x4 = xA;
                this.y4 = yA;
            } else {
                this.x1 = xB;
                this.y1 = yA;
                this.x2 = xA;
                this.y2 = yA;
                this.x3 = xA;
                this.y3 = yB;
                this.x4 = xB;
                this.y4 = yB;
            }

        }

    }

    public double distanceBeetweenRectCenters(Rect rect) {
        double xRect1center = (this.x2 - this.x1) / 2 + this.x2;
        double yRect1center = (this.y2 - this.y1) / 2 + this.y2;
        double xRect2center = (rect.getX2() - rect.getX1()) / 2 + rect.getX2();
        double yRect2center = (rect.getY2() - rect.getY1()) / 2 + rect.getY2();
        return Math.hypot(xRect1center - xRect2center, yRect1center - yRect2center);
    }


    public boolean crossing(Rect rect) {//ma sprawdzać czy sie przecinają
        boolean isCrossing = false;
        return isCrossing;
    }

    public Rect commonFields(Rect rect) {//ma zwracać część wspólną
        Rect commonfield = new Rect(0, 0, 0, 0);
        return commonfield;
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
