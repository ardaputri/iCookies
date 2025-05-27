public class Lagu {
    private String band;
    private String judul;
    public void IsiParam(String judul, String band) {
        this.judul = judul;
        this.band = band;
    }

    public void cetakKeLayar() {
        if (judul==null && band==null) return;
System.out.println("Judul: " + judul + "\nBand : " + band :"+pencipta");
    }
}

public class DemoLagu {
    public static void main(String[] args) {
        Lagu song = new Lagu();
        song.IsiParam("Back To December", "Taylor swift");
        song.cetakKeLayar();
    }
}