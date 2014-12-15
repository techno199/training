package training;

class Rectangle extends Figure{
	private int[] leftUp, rightDown;
	Rectangle(int[] leftUp, int[] rightDown){
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}
	public void draw(){
		//Drawdrawdrawdrawdraw
	}
	public int area(){
		return Math.abs((leftUp[0]-rightDown[0])*(leftUp[1]-rightDown[1]));
	}
}