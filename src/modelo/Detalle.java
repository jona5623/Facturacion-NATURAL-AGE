package modelo;

public class Detalle
{
	
	private Producto producto;
	private Servicio servicio;
	
	public Detalle()
	{
		
		
		
	}
	
	
	public Detalle(Producto producto,Servicio servicio)
	{
		
		this.producto = producto;
		this.servicio = servicio;
		
	}
	
	public Detalle(Producto producto)
	{
		
		this.producto = producto;
		
	}
	
	public Detalle(Servicio servicio)
	{
		
		this.servicio = servicio;
		
	}
	
	

	public Producto getProducto() 
	{
		
		return producto;
		
	}

	public void setProducto(Producto producto) 
	{
		
		this.producto = producto;
		
	}

	public Servicio getServicio()
	{
		
		return servicio;
		
	}

	public void setServicio(Servicio servicio)
	{
		
		this.servicio = servicio;
		
	}
	
	
	

}
