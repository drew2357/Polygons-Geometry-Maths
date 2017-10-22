// playing around with some algorithms from the book
// "Computational Geometry In C" whilst remembering
// my way around Java 

import java.io.*;
import java.util.*;
import java.util.List;
class PolygonMaths {
  //private Polygon poly;





  private int Areax2(Point a, Point b, Point c){

    return a.getPoint()[0]*b.getPoint()[1]-a.getPoint()[1]*b.getPoint()[0]+
           a.getPoint()[1]*c.getPoint()[0]-a.getPoint()[0]*c.getPoint()[1]+
           b.getPoint()[0]*c.getPoint()[1]-c.getPoint()[0]*b.getPoint()[1];
  }

  private int AreaPolyx2(Polygon polyCalc){
    //polyCalc.getPoints
    int sum = 0;
    int degree = polyCalc.getPoints().size();

    for(int i=0; i <degree-1; ++i){
      sum+=Areax2(polyCalc.getPoints().get(0), polyCalc.getPoints().get(i), polyCalc.getPoints().get(i+1));
    }
    return sum;
  }


  private void run(){
    //create some points
    Point p1 = new Point(0,0);
    Point p2 = new Point(3,0);
    Point p3 = new Point(3,4);
    List<Point> tempPoly = new ArrayList<Point>();
    tempPoly.add(p1);
    tempPoly.add(p2);
    tempPoly.add(p3);
    //add those points to a list
    //give those
    Polygon poly1 = new Polygon(tempPoly);//give it a list of points
    int area = AreaPolyx2(poly1);
    System.out.println(area/2);
  }

  public static void main(String[] args){
    PolygonMaths program = new PolygonMaths();
    program.run();
  }
}
