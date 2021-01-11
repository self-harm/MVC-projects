package io.harmed.spring.mvc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min=2, max=16, message = "name must be between 2 and 16 symbols")
    private String name;
    /*@NotEmpty(message = "surname is required field")*/
    @NotBlank(message = "surname is required field") /*расширяет аннотацию @NotEmpty, запрещая использовать пробелы*/
    private String surname;
    private int salary;
    private String department;
    /*добавлять HashMap для значение из Departments и задаем в нашем .jsp(view)*/
    private Map<String, String> departments;
    /*для radiobutton формы*/
    private String carBrand;
    private Map<String, String> carBrands;
    /*для spring формы checkbox (выбор нескольких вариаций)*/
    private String[] languages;
    private Map<String, String> languageMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("MB", "Mercedes-Benz");
        carBrands.put("Audi", "Audi");

        languageMap = new HashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("Chinese", "CHN");
        languageMap.put("Japanese", "JAP");

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageMap() {
        return languageMap;
    }

    public void setLanguageMap(Map<String, String> languageMap) {
        this.languageMap = languageMap;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
