import java.util.ArrayList;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    //Nombre del jugador
    private final String id;
    
    private ArrayList<Carta>cartas;
    

    /**
     * Constructor para crear al nuevo jugador
     */
    public Jugador(String id)
    {
        this.id = id;
        cartas = new ArrayList<Carta>();
    }
     /**
     * Metodo para que el jugador reciba una carta.
     */
    public void RecibirCarta(Carta unaCarta)
    {
        cartas.add(unaCarta);
    }
    
    /**
     * Metodo que devuelve el identificador del jugador.
     */
    public String getid()
    {
        return id;
    }
}
