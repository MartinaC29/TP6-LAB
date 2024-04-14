/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6_LAB.entidades;

/**
 *
 * @author pablo
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private double precio;
    private String rubro;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, String rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Producto o) {
        //0-->iguales
        //1-->mayor
        //-1-->menor
        if(this.codigo==o.codigo){
            
            return 0;
            
        }else if(this.codigo >o.codigo){
        
            return 1;
        }else {
        
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", rubro=" + rubro + ", stock=" + stock + '}';
    }
    
    
    
}
