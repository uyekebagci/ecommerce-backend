package com.ecommerce.ecommercebackend.api.model;

import jakarta.validation.constraints.*;

public class RegistrationBody {
    @NotBlank
    @NotNull
    @Size(min=3, max =50)
    private String username;
    @Email
    @NotBlank
    @NotNull
    private String email;
    @NotBlank
    @NotNull
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$")
    @Size(min=3, max =50)
    private String password;
    @NotBlank
    @NotNull
    private String firstName;
    @NotBlank
    @NotNull
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
