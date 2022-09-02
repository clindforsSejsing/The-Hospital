package edu.lernia.labb3;
//Hospital fetches from Patient
public class Patient {
   private String name;
   private String sickness = null; //default null for testing to pass if sickness is empty.


   public Patient(String name, String sickness) { //constructor
      this.name = name;
      this.sickness = sickness;
   }

   public Patient(String name) { //making a second constructor with only one parameter
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSickness() {
      return sickness;
   }

   public void setSickness(String sickness) {
      this.sickness = sickness;
   }

   public Boolean isSick() {
      if (this.sickness != null) {
         return true;
      } else {
         return false;
      }
   }

   public void takeMedication(Medicine medicine) {
      if (medicine.getTreatmentName().equals(this.sickness)) {
          this.sickness = null;
      }
   }
}
