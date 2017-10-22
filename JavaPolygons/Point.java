import java.io.*;
import java.util.List;
//class for a 2d point
class Point{
  int x_coord;
  int y_coord;
  Point(int x, int y){
    setPoint(x, y);
  }

  public void setPoint(int x, int y){
    this.x_coord = x;
    this.y_coord = y;
    System.out.println("x and y are:" + x + " and " + y);
  }
  public int[] getPoint(){
    int[] coords = {this.x_coord, this.y_coord};
    return coords;
  }
}


//tests, check for overflow


//
