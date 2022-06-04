package com.company.Classes;

import java.time.LocalDate;


public class Office_person {
    private String first_Name;
    private String second_Name;
    private String patronymic;
    private String position;
    private String gender;
    private LocalDate employment_date;

  public Office_person(String first_Name, String second_Name, String patronymic, String position, String gender) {
    this.setFirst_Name(first_Name);
    this.setFirst_Name(second_Name);
    this.setPatronymic(patronymic);
    this.setPosition(position);
    this.setGender(gender);
    this.employment_date = LocalDate.now().minusYears((int) (Math.random() * 30));;
  }



  public String getFirst_Name() {
    return first_Name;
  }

  public void setFirst_Name(String first_Name) {
    this.first_Name = first_Name.strip();
    first_Name = first_Name.substring(0,1).toUpperCase()+first_Name.substring(1).toLowerCase();
  }

  public String getSecond_Name() {
    return second_Name;
  }

  public void setSecond_Name(String second_Name) {
    this.second_Name = second_Name;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public LocalDate getEmployment_date() {
    return employment_date;
  }


  @Override
  public String toString() {
    return "Office{" +
            "first_Name='" + first_Name + '\'' +
            ", second_Name='" + second_Name + '\'' +
            ", patronymic='" + patronymic + '\'' +
            ", position='" + position + '\'' +
            ", gender='" + gender + '\'' +
            ", employment_date=" + employment_date +
            '}';
  }
}
