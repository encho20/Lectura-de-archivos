package modelo_entities;
 
import java.util.List;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name="Reporte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reporte {
	
	@XmlElement(name="Cliente")
	private List<Adminfo> Cliente;
	
	@XmlElement(name="producto")
	private List<Producto> producto;
 
	public Reporte() {}
 
	public List<Adminfo> getCliente() {
		return Cliente;
	}
 
	public void setCliente(List<Adminfo> Cliente) {
		this.Cliente = Cliente;
	}
 
	public List<Producto> getProducto() {
		return producto;
	}
 
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
 
 
}