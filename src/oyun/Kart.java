package oyun;

public class Kart {
	
	
	private char deger; // kartımızın degeri
	private boolean tahmin=false ; //kart tahmin edilmişse kartımızı ekranda göstericez edilmediyse göstermeyeceğiz
	//ilk başta hiçbir kart tahmin edilmediği için hiçbiri gözükmeyecek
	
public Kart(char deger) {
	this.deger=deger;	
}

public char getDeger() {
	return deger;
}

public void setDeger(char deger) {
	this.deger = deger;
}

public boolean isTahmin() {
	return tahmin;
}

public void setTahmin(boolean tahmin) {
	this.tahmin = tahmin;
}


}
