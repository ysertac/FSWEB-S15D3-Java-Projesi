package com.workintech.company;

import com.workintech.company.models.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "Sertaç", "YILDIRIR"));
        employees.add(new Employee(2, "Ali", "YOLCU"));
        employees.add(new Employee(3, "Ahmet", "ANTA"));
        employees.add(new Employee(4, "Elif", "YILMAZ"));
        employees.add(new Employee(1, "Sertaç", "YILDIRIR"));
        employees.add(new Employee(4, "Ali", "ALTAY"));
        employees.add(new Employee(5, "Mahir", "KILIÇ"));
        employees.add(new Employee(5, "İrem", "OKAY"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee == null) {
                System.out.println("There is null data");
                continue;
            }
            if (employeeMap.containsKey(employee.getId())) {
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        System.out.println("Mevcut: ");
        System.out.println(employees);
        System.out.println("Tekiller: ");
        System.out.println(employeeMap);
        System.out.println("Silinenler: ");
        System.out.println(removedEmployees);
    }
}