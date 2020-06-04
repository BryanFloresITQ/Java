/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Bryan
 */
public class Facturass {
    
    ArrayList ids=new ArrayList();
    ArrayList cedulas=new ArrayList();
    ArrayList cantidades=new ArrayList();
    ArrayList nombres=new ArrayList();
    ArrayList descripciones=new ArrayList();
    ArrayList totales=new ArrayList();

    public Facturass() {
    }

    public ArrayList getIds() {
        return ids;
    }

    public ArrayList getCedulas() {
        return cedulas;
    }

    public ArrayList getCantidades() {
        return cantidades;
    }

    public ArrayList getNombres() {
        return nombres;
    }

    public ArrayList getDescripciones() {
        return descripciones;
    }

    public ArrayList getTotales() {
        return totales;
    }

    public void setIds(ArrayList ids) {
        this.ids = ids;
    }

    public void setCedulas(ArrayList cedulas) {
        this.cedulas = cedulas;
    }

    public void setCantidades(ArrayList cantidades) {
        this.cantidades = cantidades;
    }

    public void setNombres(ArrayList nombres) {
        this.nombres = nombres;
    }
    public void setDescripciones(ArrayList descripciones) {
        this.descripciones = descripciones;
    }
    public void setTotales(ArrayList totales) {
        this.totales = totales;
    }}
