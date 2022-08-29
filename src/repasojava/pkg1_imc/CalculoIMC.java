package repasojava.pkg1_imc;

public class CalculoIMC 
{
    public Persona calcularIMC(Persona person)
    {
        person.setIMC( person.getPeso() / (person.getEstatura() * person.getEstatura()) );        
        return person;
    }
    
    /**
     *
     * @param person
     * @return
     */
    public Persona escalaIMC(Persona persona)
    {
        
        if( persona.getIMC() < 18.5 )
        {
            System.out.println("está Bajo de Peso");
        }
        else if( persona.getIMC() >= 18.5 && persona.getIMC() < 24.99 )
        {
            System.out.println("tiene un peso normal");
        }
        else if( persona.getIMC() >= 25 )
        {
            System.out.println("tiene sobrepeso");
        }
        else
        {
            System.out.println("está Obeso");
        }
        return persona;
    }
}
