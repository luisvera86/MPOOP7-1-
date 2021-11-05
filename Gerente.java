public class Gerente extends Empleado{
  private int presupuesto;
  public Gerente(){

  }
  public Gerente(String nombre, int numEmpleado,int sueldo,int presupuesto){
    super(nombre,numEmpleado,sueldo);
    this.presupuesto=presupuesto;
  }

  public int getPresupuesto(){
    return presupuesto;
  }

  public void setPresupuesto(int presupuesto){
    if(presupuesto >0)

     this.presupuesto=presupuesto;

  }
  @Override
  public String getNombre(){
    return super.getNombre()+" Mucho gusto";
  }
  @Override
 public String toString(){
   return super.toString()+"Gerente{ presupuesto= "+presupuesto+"}";
 }



}