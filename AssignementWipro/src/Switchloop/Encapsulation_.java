
package Switchloop;

class Employee {
	private int empid;
	public void setEmpid(int id)
	{
		empid=id;
	}
	public int getEmpid() {
		return empid;
	}
}class Encapsultion{
	

	public static void main(String[] args) {
Employee e= new Employee ();
e.setEmpid(101);
System.out.println(e.getEmpid());
	}

}
