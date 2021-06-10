package Commands;

class Calculator {
    static String Calculate(double x, double y, double R) {

        String result;

        if (x<-5 | x>3 | y<-3 | y>3 | R<1 | R>3){
            result = "not in area";
        } else if (x<=0 & y<=0 & x>=-R/2 & y>=-R){
            result = "successful hit";
        } else if (x>= 0 & y>=0 & y<=(-x + R/2) & x<=(-y + R/2)){
            result = "successful hit";
        } else if (x >= 0 & y<=0 & (x*x + y*y <= R*R)){
            result = "successful hit";
        } else result = "unsuccessful hit";

        return result;
    }

}
