import java.io.*;
import java.util.*;
import java.util.List;
class Polygon {
  private List<Point> points;



  Polygon(List<Point> inPoints){
    points = new ArrayList<Point>();
    for(Point p:inPoints){
      this.points.add(p);
    }
    for(Point p: this.points){
      System.out.println("x=" + p.getPoint()[0] + ", y=" + p.getPoint()[1] );
    }
  }
  public List<Point> getPoints(){
    return this.points;
  }
  // for adding subsequent points
  private void addPoint(int x, int y ){
    Point newPoint = new Point(x, y);
    this.points.add(newPoint);
  }
}
