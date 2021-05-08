package uia.com.api.ContabilidadUIA.controladores;

public class ParmsCliente {
	private int pagina=0;
	private int idProveedor=-1;
	private int tamanoPag=0;
	private String nombre="";
	
	
	
	
	public ParmsCliente() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPagina() {
		return pagina;
	}
	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	public int getTamanoPag() {
		return tamanoPag;
	}
	public void setTamanoPag(int tamanoPag) {
		this.tamanoPag = tamanoPag;
	}
	
}
