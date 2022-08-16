public class principal {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setCredito(2000.45);
        c.setEdad(45);
        c.setNombre("Kevin");
        c.setTelefono(991713814);

        Trabajador t = new Trabajador();
        t.setSalario(450.45);
        t.setEdad(23);
        t.setNombre("Arnoldo");
        t.setTelefono(993629873);

        System.out.println(c.toString());
        System.out.println(t.toString());
    }
}
