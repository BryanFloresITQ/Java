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
public class Notas{
    
    ArrayList CI = new ArrayList();
    
        ArrayList ingles = new ArrayList();
        ArrayList lenguaje = new ArrayList();
        ArrayList fisica = new ArrayList();
        ArrayList matematica = new ArrayList();
        ArrayList quimica = new ArrayList();
        ArrayList efisica = new ArrayList();
        ArrayList geometria = new ArrayList();
        ArrayList computacion = new ArrayList();
        ArrayList biologia = new ArrayList();
        ArrayList anatomia = new ArrayList();
        
    ArrayList promedio = new ArrayList();

    int ci;

    public Notas(int ci) {
        this.ci = ci;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    
    
    public Notas() {
    }
    
    public ArrayList getCI() {
        return CI;
    }

    public ArrayList getIngles() {
        return ingles;
    }

    public ArrayList getLenguaje() {
        return lenguaje;
    }

    public ArrayList getFisica() {
        return fisica;
    }

    public ArrayList getMatematica() {
        return matematica;
    }

    public ArrayList getQuimica() {
        return quimica;
    }

    public ArrayList getEfisica() {
        return efisica;
    }

    public ArrayList getGeometria() {
        return geometria;
    }

    public ArrayList getComputacion() {
        return computacion;
    }

    public ArrayList getBiologia() {
        return biologia;
    }

    public ArrayList getAnatomia() {
        return anatomia;
    }

    public ArrayList getPromedio() {
        return promedio;
    }

    public void setCI(ArrayList CI) {
        this.CI = CI;
    }

    public void setIngles(ArrayList ingles) {
        this.ingles = ingles;
    }

    public void setLenguaje(ArrayList lenguaje) {
        this.lenguaje = lenguaje;
    }

    public void setFisica(ArrayList fisica) {
        this.fisica = fisica;
    }

    public void setMatematica(ArrayList matematica) {
        this.matematica = matematica;
    }

    public void setQuimica(ArrayList quimica) {
        this.quimica = quimica;
    }

    public void setEfisica(ArrayList efisica) {
        this.efisica = efisica;
    }

    public void setGeometria(ArrayList geometria) {
        this.geometria = geometria;
    }

    public void setComputacion(ArrayList computacion) {
        this.computacion = computacion;
    }

    public void setBiologia(ArrayList biologia) {
        this.biologia = biologia;
    }

    public void setAnatomia(ArrayList anatomia) {
        this.anatomia = anatomia;
    }

    public void setPromedio(ArrayList promedio) {
        this.promedio = promedio;
    }

    
   
}
