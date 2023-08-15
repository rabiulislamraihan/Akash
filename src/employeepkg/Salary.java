
package employeepkg;

import java.io.Serializable;
import java.time.LocalDate;


public class Salary implements Serializable {
    private LocalDate SalaryDate;
    private int EmployeeID;
    private int BaseSalary;
    private int Bonus;
    private int OvertimePay;
    private int PerformanceBasedPay;
    private int TotalPay;

    public Salary(LocalDate SalaryDate, int EmployeeID, int BaseSalary, int Bonus, int OvertimePay, int PerformanceBasedPay) {
        this.SalaryDate = SalaryDate;
        this.EmployeeID = EmployeeID;
        this.BaseSalary = BaseSalary;
        this.Bonus = Bonus;
        this.OvertimePay = OvertimePay;
        this.PerformanceBasedPay = PerformanceBasedPay;
        this.TotalPay = BaseSalary + Bonus + OvertimePay + PerformanceBasedPay;
        
    }

    public int getTotalPay() {
        return TotalPay;
    }

    public void setTotalPay(int TotalPay) {
        this.TotalPay = TotalPay;
    }
    

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    
    

    public LocalDate getSalaryDate() {
        return SalaryDate;
    }

    public void setSalaryDate(LocalDate SalaryDate) {
        this.SalaryDate = SalaryDate;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    public int getBonus() {
        return Bonus;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }

    public int getOvertimePay() {
        return OvertimePay;
    }

    public void setOvertimePay(int OvertimePay) {
        this.OvertimePay = OvertimePay;
    }

    public int getPerformanceBasedPay() {
        return PerformanceBasedPay;
    }

    public void setPerformanceBasedPay(int PerformanceBasedPay) {
        this.PerformanceBasedPay = PerformanceBasedPay;
    }
    
    
    
}
