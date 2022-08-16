public class Cliente extends Persona {
    private double credito;

    public Cliente() {
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente [credito=" + credito + "]";
    }
    
}
