package modelo;

public class Factura
{

	private Cliente cliente;
	private Detalle detalle;
	private double total;

	
	public Factura()
	{
		
		
	}

	public Cliente getCliente()
	{
		
		return cliente;
		
	}

	public void setCliente(Cliente cliente)
	{
		
		this.cliente = cliente;
		
	}
	
	
	public void setDetalle(Detalle detalle)
	{
		
		this.detalle = detalle;
	}
	
	public Detalle getDetalle()
	{
		
		return detalle;
		
	}
	

	public double getTotal() 
	{
		
		return total;
		
	}

	public void setTotal(double total) 
	{
		
		this.total = total;
		
	}

	
	
	
	
	
	
}
