import java.security.PublicKey;
import java.util.Stack;

public class Pila{
    private Stack<Integer> pila;

    public Pila() {
        pila= new Stack<Integer>();
    }
    public void agregar(Integer dato){
        pila.push(dato);
    }
    public Integer eliminar() throws Exception {
        if(pila.empty()){throw new Exception("Pila vacia");}
        return pila.pop();
    }
    public Integer observarTope() throws Exception {
        if(pila.empty()){throw new Exception("Pila vacia");}
        return pila.peek();
    }

    @Override
    public String toString() {
        String resulatdo="====PILA=====\n";
        for (int i=pila.size()-1;i>=0;i--){resulatdo+="\n"+pila.get(i);}
        return resulatdo;
    }

}
