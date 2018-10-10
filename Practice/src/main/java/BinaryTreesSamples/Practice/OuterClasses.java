package BinaryTreesSamples.Practice;

public class OuterClasses {
private int a;
private String b;
	public OuterClasses(int a,String b){
		this.a=a;
		this.b=b;
	}
	private String getb() {
		return b;
	}
  class InnerClass{
	   private int c;
	   String d;
	   public int geta() {
		   c= OuterClasses.this.a;
		   return c;
		   
	   }
	   public String getName() {
		   if(OuterClasses.this.getb().equals("Hello")) {
			  d="World";
			  return d;
		   }else {
			   return "nothing";
		   }
	   }
	   
	   
	 
 }
	public static void main(String[] args) {
		OuterClasses outer = new OuterClasses(1,"Hello");
		String sal= outer.getb();
		InnerClass inner = outer.new InnerClass();
		int val = inner.geta();
		System.out.println(val);
		System.out.println(sal + inner.getName());
		//inner.getName();
		
	}

}
