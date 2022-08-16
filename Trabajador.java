public class Trabajador extends Persona{
    public double salario;

    public Trabajador() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+ "Trabajador [salario=" + salario + "]";
    }
    
}
