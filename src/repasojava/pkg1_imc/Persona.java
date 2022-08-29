package repasojava.pkg1_imc;

public class Persona 
{
    private String name;
    private double peso;
    private double estatura;
    private double IMC;

    public Persona(String name, double peso, double estatura) 
    {
        this.name = name;
        this.peso = peso;
        this.estatura = estatura;
    }  
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getIMC() {
        return IMC;
    }
    
    

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }
    
    
    
}
