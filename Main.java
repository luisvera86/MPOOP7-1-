class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Gerente ger=new Gerente();
    System.out.println(ger);

    ger.setNombre("Romina Perez");
    ger.setNumEmpleado(89788);
    ger.setSueldo(35_000);
    System.out.println(ger);
    System.out.println(ger.getNombre());
    ger.setPresupuesto(90_000);
    System.out.println(ger);


    Gerente ger2=new Gerente("Samuel Torres",89894,15_000,25_000);
    System.out.println(ger2);
    /*Ballena ballena1=new Ballena();
    ballena1.setNombre("Moby dik");
    System.out.println(ballena1.getNombre());*/
  }
}