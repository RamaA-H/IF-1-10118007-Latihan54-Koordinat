package latihan54.koordinat;
public class WarnaKoordinat extends Koordinat{
    
    public String namaWarna;
    
    public WarnaKoordinat (int x, int y, String namaWarna){
        super(x,y);
        this.x = x;
        this.y = y;
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
    
}
