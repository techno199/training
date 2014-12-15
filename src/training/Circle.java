package training;
import java.lang.Math;
class Circle extends Figure{
	private int radius;
	private int[] mid;
	Circle(int[] mid, int radius){
		this.mid = mid;
		this.radius = radius;
	}
	public void draw(){
		//drawdrawdrawdrawdraw
	}
	public int area(){
		return (int) (3.1416*Math.pow(radius, 2));
	}
	public int[] get_center(){
		return mid;
	}
}
