/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.delivery.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC
 */

@Entity
@Table(name = "pedido")
public class Pedido {

    /**
     * @return the Restaurant
     */
    public String getRestaurant() {
        return Restaurant;
    }

    /**
     * @param Restaurant the Restaurant to set
     */
    public void setRestaurant(String Restaurant) {
        this.Restaurant = Restaurant;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "total")
    private String total;
    
    @Column(name = "restaurant")
    private String Restaurant;
    
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    
    
    public Pedido() {
        
    }
 
    public Pedido(String total, String restaurant, Cliente Cliente) {
        this.total = total;
        this.Restaurant = restaurant;
        this.cliente = cliente;

    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }


    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
