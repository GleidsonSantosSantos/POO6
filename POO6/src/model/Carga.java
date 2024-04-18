package model;

public class Carga extends Veiculo {
    private int cargaMax;
    private int tara;

  
    public Carga(String placa, String marca, String modelo, String cor, float velocMax, Motor motor, int cargaMax, int tara) {
        super(placa, marca, modelo, cor, velocMax, motor);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }


    public int getCargaMax() {
        return cargaMax;
    }

    public int getTara() {
        return tara;
    }


    @Override
    public float calcularVelocidade(float velocMax) {
        
        return velocMax * 100000;
    }
}
