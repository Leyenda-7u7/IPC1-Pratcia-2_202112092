package snake.segmento;

public class Serpiente {

    private final Segmento[] segmentos;
    private volatile int velocidad;
    private volatile int largo;
    private volatile boolean viva;
    private int w =1;
    
    public Serpiente() {
        segmentos = new Segmento[25];
        segmentos[0] = new Segmento(5, 5);
        largo = 1;
        viva = true;
    }
public void Crecer (){
    segmentos[w] = new Segmento(segmentos[0].getPosX(), segmentos[0].getPosY());
    w++;
    largo++;
}
    public Segmento[] getSegmentos() {
        return segmentos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void moverArriba() {
        moverSegmentos();
        segmentos[0].setPosY(segmentos[0].getPosY() - 1);
    }

    public void moverAbajo() {
        moverSegmentos();
        segmentos[0].setPosY(segmentos[0].getPosY() + 1);
    }

    public void moverIzquierda() {
        moverSegmentos();
        segmentos[0].setPosX(segmentos[0].getPosX() - 1);
    }

    public void moverDerecha() {
        moverSegmentos();
        segmentos[0].setPosX(segmentos[0].getPosX() + 1);
    }

    public void moverSegmentos() {
        for (int i = largo - 1; i > 0; i--) {
            segmentos[i].setPosY(segmentos[i - 1].getPosY());
            segmentos[i].setPosX(segmentos[i - 1].getPosX());
        }
    }

    public int getLargo() {
        return largo;
    }

    public boolean puedeCrecer() {
        return largo < segmentos.length;
    }

    public boolean isViva() {
        return viva;
    }

    public void setViva(boolean viva) {
        this.viva = viva;
    }

}
