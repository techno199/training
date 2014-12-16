package training;
import java.lang.Math;
public class Circle extends Figure{
	private int radius;
	private int[] mid;
	public Circle(int[] mid, int radius){
		this.mid = mid;
		this.radius = radius;
	}
	public void draw(){
		//drawdrawdrawdrawdraw
	}
	public double area(){
		return  (3.1416*Math.pow(radius, 2));
	}
	public int[] get_center(){
		return mid;
	}
}
