package com.integrador.infop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInfoController {
    @GetMapping("/personal-info")
    public PersonalInfo getPersonalInfo() {
        return new PersonalInfo("Marcos", "Gamez", 17, "Marcos@example.com");
    }

    public static class PersonalInfo {
        private String firstName;
        private String lastName;
        private int age;
        private String email;

        public PersonalInfo(String firstName, String lastName, int age, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
        }

        // Getters y setters

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
