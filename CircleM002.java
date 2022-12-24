import javax.swing.JOptionPane;

public class CircleM002 {
	private static String[] strArr; //Declare a String Array
	public static void main(String[] args) {
		String msg,inS;
		int i;
		msg=String.format("%s\n%s\n%s\n","1.計算圓面積及周長","2.計算長方形面積及周長","3.用輾轉相除法求最大公因數");
		for(;;) {
			inS=JOptionPane.showInputDialog
			(null,msg,"主選單",JOptionPane.QUESTION_MESSAGE);
			i=Integer.parseInt(inS);
			if(i==1) circleObj();
			else if(i==2) rectangleObj();
			else findGCD();
		}
	}
		public static void rectangleObj() {
		getData("請輸入長，寬","計算長方形面積及周長");
		double l=Double.parseDouble(strArr[0].strip());
		double w=Double.parseDouble(strArr[1].strip());
		Rectangle002 r = new Rectangle002(l,w);
		
		JOptionPane.showMessageDialog
		(null, r.toString(),"Rectangle Length and Area",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void circleObj() {
		Circle002 c;
		getData("請輸入半徑","計算圓面積及周長");
		double r=Double.parseDouble(strArr[0].strip());
		c=new Circle002(r); 

		JOptionPane.showMessageDialog
		(null, c.toString(),"Circle Length and Area",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void findGCD() {
		int dvdend, dvsor;
		getData("請由小而大輸入兩正整數","輸出兩數最大公因數");
		dvsor=Integer.parseInt(strArr[0].strip());
		dvdend=Integer.parseInt(strArr[1].strip());
	}
	
	public static void getData(String dialogMsg,String titleMsg) {
		String inS=JOptionPane.showInputDialog(null,dialogMsg,titleMsg,JOptionPane.QUESTION_MESSAGE);
		strArr=inS.split(",");
	}


}
