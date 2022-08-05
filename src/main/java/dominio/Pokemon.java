package dominio;

public class Pokemon {
	private String nombre;
	private int hp;
	private int danioAtaque;
	
	public Pokemon(String nombre, int hp, int danioAtaque) {
		super();
		this.nombre = nombre;
		this.hp = hp;
		this.danioAtaque = danioAtaque;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDanioAtaque() {
		return danioAtaque;
	}
	public void setDanioAtaque(int danioAtaque) {
		this.danioAtaque = danioAtaque;
	}
}
