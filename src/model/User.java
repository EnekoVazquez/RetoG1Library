/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Eneko.
 */
public class User implements Serializable {

    private String email;
    private String password;
    private String nombre;
    private LocalDate createDate;
    private LocalDate writeDate;
    private Boolean activo;
    private int compania;
    private UserType type;
    private int telefono;
    private int codigoPostal;
    private String direccion;

    public User() {
    }

    public User(String email, String password, String nombre, LocalDate createDate, LocalDate writeDate, Boolean activo, int compania, UserType type, int telefono, int codigoPostal, String direccion) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.createDate = LocalDate.now();
        this.writeDate = writeDate;
        this.activo = true;
        this.compania = 1;
        this.type = type;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
        this.type = UserType.USER;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDate writeDate) {
        this.writeDate = writeDate;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public int getCompania() {
        return compania;
    }

    public void setCompania(int compania) {
        this.compania = compania;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", password=" + password + ", nombre=" + nombre + ", createDate=" + createDate + ", writeDate=" + writeDate + ", activo=" + activo + ", compania=" + compania + ", type=" + type + ", telefono=" + telefono + ", codigoPostal=" + codigoPostal + ", Direccion=" + direccion + '}';
    }

}
