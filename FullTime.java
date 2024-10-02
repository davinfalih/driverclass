package SOAL;

public class FullTime extends teacher{

    private String unit;
    private int anualsalary;
    
    public FullTime() {
        super();
        unit = "";
        anualsalary = 0;

    }
    
    public FullTime(String unit, int anualsalary,String name, int age, String subject) {
        super(name, age, subject);
        this.unit = unit;
        this.anualsalary = anualsalary;
    }
    
    public String getUnit() {
        return unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public int getAnualsalary() {
        return anualsalary;
    }
    
    public void setAnualsalary(int anualsalary) {
        this.anualsalary = anualsalary;
    }
    public void print() {
        System.out.println("----Full Time Teacher-----");
        super.print();
        System.out.println("Unit : " + unit);
        System.out.println("Anual salary : " + anualsalary);
    }

}

