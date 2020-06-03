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
public class Libros {
    
    ArrayList autores=new ArrayList();
    ArrayList anios=new ArrayList();
    ArrayList titulos=new ArrayList();
    ArrayList codigos=new ArrayList();
    ArrayList generos=new ArrayList();
    ArrayList descripciones=new ArrayList();
    ArrayList stocks=new ArrayList();
    ArrayList precios=new ArrayList();

    public Libros() {
    }

    public ArrayList getAutores() {
        return autores;
    }

    public ArrayList getAnios() {
        return anios;
    }

    public ArrayList getTitulos() {
        return titulos;
    }

    public ArrayList getCodigos() {
        return codigos;
    }

    public ArrayList getGeneros() {
        return generos;
    }

    public ArrayList getDescripciones() {
        return descripciones;
    }

    public ArrayList getStocks() {
        return stocks;
    }

    public ArrayList getPrecios() {
        return precios;
    }

    public void setAutores(ArrayList autores) {
        this.autores = autores;
    }

    public void setAnios(ArrayList anios) {
        this.anios = anios;
    }

    public void setTitulos(ArrayList titulos) {
        this.titulos = titulos;
    }

    public void setCodigos(ArrayList codigos) {
        this.codigos = codigos;
    }

    public void setGeneros(ArrayList generos) {
        this.generos = generos;
    }

    public void setDescripciones(ArrayList descripciones) {
        this.descripciones = descripciones;
    }

    public void setStocks(ArrayList stocks) {
        this.stocks = stocks;
    }

    public void setPrecios(ArrayList precios) {
        this.precios = precios;
    }
    
    
}
