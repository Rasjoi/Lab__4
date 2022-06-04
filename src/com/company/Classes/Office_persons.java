package com.company.Classes;

import java.time.LocalDate;

public class Office_persons {
    private Office_person[] employees;
    private int currentEmployeeNumber;


    public String findAgeAbove10() {
        {

            String result = "" + System.lineSeparator();

            for (final Office_person employee : employees) {


                if (LocalDate.now().getYear() - employee.getEmployment_date().getYear() > 10) {

                    if (employee.getEmployment_date().getMonthValue() * 100 + employee.getEmployment_date().getDayOfMonth() + 1 <= LocalDate.now().getMonthValue() * 100 + LocalDate.now().getDayOfMonth() + 1) {

                        result += employee + System.lineSeparator();
                    }

                } else {

                }
            }
            return result;
        }
    }

    public Office_persons(final int employeesNumber) {
        this.employees = new Office_person[employeesNumber];
        currentEmployeeNumber = -1;
    }

    public void addOOffice_persons(final Office_person employee) {
        if (++currentEmployeeNumber < employees.length) {
            employees[currentEmployeeNumber] = employee;
        }
    }

    public String toString() {
        String result = "Employees: " + System.lineSeparator();

        for (final Office_person employee : employees) {

            result += employee + System.lineSeparator();

        }

        return result;
    }
}
