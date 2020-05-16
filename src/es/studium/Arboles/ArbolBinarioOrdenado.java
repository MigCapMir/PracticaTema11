package es.studium.Arboles;

public class ArbolBinarioOrdenado
{
	private ArbolBinarioOrdenado izquierda;
	private Integer valor;
	private ArbolBinarioOrdenado derecha;

	// Constructores
	public ArbolBinarioOrdenado() 
	{
		this.izquierda = null;
		this.setValor(null);
		this.derecha = null;
	}
	public ArbolBinarioOrdenado(Integer v) 
	{
		this.izquierda = null;
		this.setValor(v);
		this.derecha = null;
	}
	public ArbolBinarioOrdenado(ArbolBinarioOrdenado i, Integer v, ArbolBinarioOrdenado d) 
	{
		this.izquierda = i;
		this.setValor(v);
		this.derecha = d;
	}

	// Setters y Getters
	public ArbolBinarioOrdenado getIzquierda()
	{
		return izquierda;
	}

	public void setIzquierda(ArbolBinarioOrdenado izquierda)
	{
		this.izquierda = izquierda;
	}

	public Integer getValor()
	{
		return valor;
	}

	public void setValor(Integer valor)
	{
		this.valor = valor;
	}

	public ArbolBinarioOrdenado getDerecha()
	{
		return derecha;
	}

	public void setDerecha(ArbolBinarioOrdenado derecha)
	{
		this.derecha = derecha;
	}

	// Otros inspectores
	public void add(Integer v) 
	{
		if (v < this.valor) 
		{
			if (izquierda != null) 
			{
				izquierda.add(v);
			} 
			else 
			{
				izquierda = new ArbolBinarioOrdenado(v);
			}
		} 
		else 
		{
			if (derecha != null) 
			{
				derecha.add(v);
			} 
			else 
			{
				derecha = new ArbolBinarioOrdenado(v);
			}
		}
	}
	public String mostrar()
	{
		String cadena = "[Valor="+getValor()+", Izquierda="+getIzquierda()+", Derecha="+getDerecha()+"]";
		return cadena;
	}
	public boolean buscar(Integer v) 
	{
		if (v == this.valor) 
		{
			return true;
		} 
		else if (v < this.valor) 
		{
			if (this.izquierda != null) 
			{
				return this.izquierda.buscar(v);
			} 
			else 
			{
				return false;
			}
		} 
		else 
		{
			if (this.derecha != null) 
			{
				return this.derecha.buscar(v);
			} 
			else 
			{
				return false;
			}
		}
	}
	public void mostrarIn()
	{
        if(izquierda!=null)
        {
        	izquierda.mostrarIn();
        }
        System.out.println(valor);
        if(derecha!=null)
        {
        	derecha.mostrarIn();
        }
    }
 
    public void mostrarPre()
    {
        System.out.println(valor);
        if(izquierda!=null)
        {
        	izquierda.mostrarPre();
        }
        if(derecha!=null)
        {
        	derecha.mostrarPre();
        }
    }
 
    public void mostrarPos()
    {
        if(izquierda!=null)
        {
        	izquierda.mostrarPre();
        }
        if(derecha!=null)
        {
        	derecha.mostrarPre();
        }
        System.out.println(valor);
    }
    /*
     * A partir de aquí    
     */
    public ArbolBinarioOrdenado anular()
    {
    	ArbolBinarioOrdenado resultado = new ArbolBinarioOrdenado();
    	return resultado;
    }
    public boolean arbolVacio()
    {
    	boolean vacio = false;
    	return vacio;
    }
    public ArbolBinarioOrdenado construirArbol(ArbolBinarioOrdenado izquierdo, int valor, ArbolBinarioOrdenado derecho)
    {
    	ArbolBinarioOrdenado union = new ArbolBinarioOrdenado();
    	return union;
    }
    public ArbolBinarioOrdenado hijoIzquierdo()
    {
    	ArbolBinarioOrdenado hijoI = new ArbolBinarioOrdenado();
    	return hijoI;
    }
    public ArbolBinarioOrdenado hijoDerecho()
    {
    	ArbolBinarioOrdenado hijoD = new ArbolBinarioOrdenado();
    	return hijoD;
    }
    public int raiz()
    {
    	return valor;
    }
    public boolean esHoja()
    {
    	boolean resultado = true;
    	return resultado;
    }
    public ArbolBinarioOrdenado eliminarArbol()
    {
    	ArbolBinarioOrdenado resultado = new ArbolBinarioOrdenado();
    	return resultado;
    }
    public int altura()
    {
    	int altura = 0;
    	return altura;
    }
    public int hojas()
    {
    	int hojas = 0;
    	return hojas;
    }
    public int contarDato(int x)
    {
    	int cuenta = 0;
    	return cuenta;
    }
    public int contarNodos()
    {
    	int cuenta = 0;
    	return cuenta;
    }
    public boolean existe(int x)
    {
    	boolean existe = false;
    	return existe;
    }
    public boolean comparar(ArbolBinarioOrdenado a, ArbolBinarioOrdenado b)
    {
    	boolean iguales = true;
    	return iguales;
    }
    public ArbolBinarioOrdenado espejo(ArbolBinarioOrdenado x)
    {
    	ArbolBinarioOrdenado espejo = new ArbolBinarioOrdenado();
    	return espejo;
    }
    public ArbolBinarioOrdenado buscarOrd(int valor)
    {
    	ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
    	return arbol;
    }
    public ArbolBinarioOrdenado insertarOrd(int valor)
    {
    	ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
    	return arbol;
    }
    public ArbolBinarioOrdenado extremoDerecho()
    {
    	ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
    	return arbol;
    }
    public ArbolBinarioOrdenado extremoIzquierdo()
    {
    	ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
    	return arbol;
    }
    public ArbolBinarioOrdenado eliminarOrd(int x)
    {
    	ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
    	return arbol;
    }
    public ArbolBinarioOrdenado hacerOrd(ArbolBinarioOrdenado a)
    {
    	ArbolBinarioOrdenado arbol = new ArbolBinarioOrdenado();
    	return arbol;
    }
    public int contarNodosEnNivel(int nivel)
    {
    	int nodos = 0;
    	return nodos;
    }
}
