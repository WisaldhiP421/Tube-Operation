

public class Tabung {
    public int jari;
    public int tinggi;

    public void setJari(int jari){
        this.jari = jari;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public double getLuas(){
        return 2 * 3.14 * jari * (jari + tinggi);
    }
}
