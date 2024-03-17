package Week_02;
class Emp{
	String empName;
	int empID;
	byte expYrs;
	String gender;
	double basicSalary;
	double bonus;
	double netSalary;
	void setEmp(String eN,int eID,byte exp,String gend,double basicsal) {
		empName=eN;
		empID=eID;
		expYrs=exp;
		gender=gend;
		basicSalary=basicsal;
	}
	void getEmp() {
		if(gender=="female") {
			bonus=basicSalary*10/100;
			netSalary=basicSalary+bonus;
		}
		else {
			netSalary=basicSalary;
		}
		System.out.println(empName+"\t"+empID+"\t"+expYrs+"\t"+gender+"\t\t"+basicSalary+"\t"+bonus+"\t\t"+netSalary);
	}
}
public class EmpDetails {
	public static void main(String[] args) {
		System.out.println("*****************************************");
		System.out.println("Name\tID\tExpYrs\tGender\t\tBasicSalary\tBonus\t\tNetSalary");
		System.out.println("*****************************************");
		Emp Emp1=new Emp();
		Emp Emp2=new Emp();
		Emp1.setEmp("Surya",34,(byte)10,"male",100000.0d);
		Emp2.setEmp("Manya",67,(byte)05,"female",150000.0d);
		Emp1.getEmp();
		Emp2.getEmp();
	}

}