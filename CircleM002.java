import javax.swing.JOptionPane;

public class CircleM002 {
	private static String[] strArr; //Declare a String Array
	public static void main(String[] args) {
		String msg,inS;
		int i;
		msg=String.format("%s\n%s\n%s\n","1.�p��ꭱ�n�ΩP��","2.�p�����έ��n�ΩP��","3.������۰��k�D�̤j���]��");
		for(;;) {
			inS=JOptionPane.showInputDialog
			(null,msg,"�D���",JOptionPane.QUESTION_MESSAGE);
			i=Integer.parseInt(inS);
			if(i==1) circleObj();
			else if(i==2) rectangleObj();
			else findGCD();
		}
	}
		public static void rectangleObj() {
		getData("�п�J���A�e","�p�����έ��n�ΩP��");
		double l=Double.parseDouble(strArr[0].strip());
		double w=Double.parseDouble(strArr[1].strip());
		Rectangle002 r = new Rectangle002(l,w);
		
		JOptionPane.showMessageDialog
		(null, r.toString(),"Rectangle Length and Area",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void circleObj() {
		Circle002 c;
		getData("�п�J�b�|","�p��ꭱ�n�ΩP��");
		double r=Double.parseDouble(strArr[0].strip());
		c=new Circle002(r); 

		JOptionPane.showMessageDialog
		(null, c.toString(),"Circle Length and Area",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void findGCD() {
		int dvdend, dvsor;
		getData("�ХѤp�Ӥj��J�⥿���","��X��Ƴ̤j���]��");
		dvsor=Integer.parseInt(strArr[0].strip());
		dvdend=Integer.parseInt(strArr[1].strip());
	}
	
	public static void getData(String dialogMsg,String titleMsg) {
		String inS=JOptionPane.showInputDialog(null,dialogMsg,titleMsg,JOptionPane.QUESTION_MESSAGE);
		strArr=inS.split(",");
	}


}
