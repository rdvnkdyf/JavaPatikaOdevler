package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if(this.salary<=1000){
            return 0;
        }
        return this.salary*0.03;
    }

    public int bonus(){
        return (this.workHours-40)*30;
    }

    public double raiseSalary(){
        int years=2021-this.hireYear;
        if(years<10)
           return this.salary*0.05;
        
        if(years>9 && years<20)
           return this.salary*0.01;
        
        return this.salary*0.15;
    }

    public String toString(){
        double salaryWithTaxesAndBonuses = this.salary - tax() + bonus();
		double totalSalary = this.salary + raiseSalary();

        return "Adi: "+this.name
              +"\n Maasi: "+this.salary
              +"\n Çalışma Saati : "+this.workHours
              +"\n Başlangıç Saati : "+this.hireYear
              +"\n Vergi: "+tax()
              +"\n Bonus: "+bonus()
              +"\n Maaş Artışı : "+raiseSalary()
              +"\n Vergi ve Bonuslar ile birlikte maaş: "+salaryWithTaxesAndBonuses
              +"\n Toplam Maaş: "+totalSalary;
              
    }
}
