class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        switch (employee.getRole()) {
            case "Developer":
                return 60000;
            case "Manager":
                return 80000;
            default:
                return 50000;
        }
    }
}