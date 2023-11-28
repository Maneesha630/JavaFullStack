
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		short b=a;//implicit
		System.out.println("a "+a);
		System.out.println("b "+b);
		short c=20;
		byte d=(byte)c;//explicit
		System.out.println("c "+c);
		System.out.println("d "+d);
	}

}
