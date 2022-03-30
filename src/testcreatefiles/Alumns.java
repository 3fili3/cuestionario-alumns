/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcreatefiles;

/**
 *
 * @author oem
 */
public class Alumns {

    protected String Name;
    protected String Email;
    protected String Level;
    protected String Carrera;

    public Alumns(String name, String email, String level, String carrera) {
        this.Name = name;
        this.Email = email;
        this.Level = level;
        this.Carrera = carrera;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

}
