package Week_one.Assignment_Three.practice.Interface;

/*
SalariedStaff is an interface that contains two methods setSalary(int) and getSalary(). AcademicStaff can declare
 itself as implementing the SalariedStaff interface, which means the AcademicStaff class must implement all the
 methods specified by the SalariedStaff interface i.e., setSalary(int) and getSalary()
 */
public class AcademicStaff implements SalariedStaff{
    @Override
    public int setSalary(int s) {
        return 0;
    }

    @Override
    public int getSalary() {
        return 0;
    }
}
