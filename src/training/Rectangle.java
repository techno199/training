package training;

public class Rectangle extends Figure{
	private int[] leftUp, rightDown;
	public Rectangle(int[] leftUp, int[] rightDown){
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}
	public void draw(){
		//Drawdrawdrawdrawdraw
	}
	public double area(){
		return Math.abs((leftUp[0]-rightDown[0])*(leftUp[1]-rightDown[1]));
	}
}