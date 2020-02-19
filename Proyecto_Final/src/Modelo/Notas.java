/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Bryan
 */
public class Notas{
    
    int id;
    
    float ingles;
    float lenguaje;
    float fisica;
    float matematica;
    float quimica;
    float edu_fisica;
    float geometria;
    float computacion;
    float biologia;
    float anatomia;
    
    float Promedio;

    public Notas(int id, float ingles, float lenguaje, float fisica, float matematica, float quimica, float edu_fisica, float geometria, float computacion, float biologia, float anatomia, float Promedio) {
        this.id = id;
        this.ingles = ingles;
        this.lenguaje = lenguaje;
        this.fisica = fisica;
        this.matematica = matematica;
        this.quimica = quimica;
        this.edu_fisica = edu_fisica;
        this.geometria = geometria;
        this.computacion = computacion;
        this.biologia = biologia;
        this.anatomia = anatomia;
        this.Promedio = Promedio;
    }

    public int getId() {
        return id;
    }

    public float getIngles() {
        return ingles;
    }

    public float getLenguaje() {
        return lenguaje;
    }

    public float getFisica() {
        return fisica;
    }

    public float getMatematica() {
        return matematica;
    }

    public float getQuimica() {
        return quimica;
    }

    public float getEdu_fisica() {
        return edu_fisica;
    }

    public float getGeometria() {
        return geometria;
    }

    public float getComputacion() {
        return computacion;
    }

    public float getBiologia() {
        return biologia;
    }

    public float getAnatomia() {
        return anatomia;
    }

    public float getPromedio() {
        return Promedio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIngles(float ingles) {
        this.ingles = ingles;
    }

    public void setLenguaje(float lenguaje) {
        this.lenguaje = lenguaje;
    }

    public void setFisica(float fisica) {
        this.fisica = fisica;
    }

    public void setMatematica(float matematica) {
        this.matematica = matematica;
    }

    public void setQuimica(float quimica) {
        this.quimica = quimica;
    }

    public void setEdu_fisica(float edu_fisica) {
        this.edu_fisica = edu_fisica;
    }

    public void setGeometria(float geometria) {
        this.geometria = geometria;
    }

    public void setComputacion(float computacion) {
        this.computacion = computacion;
    }

    public void setBiologia(float biologia) {
        this.biologia = biologia;
    }

    public void setAnatomia(float anatomia) {
        this.anatomia = anatomia;
    }

    public void setPromedio(float Promedio) {
        this.Promedio = Promedio;
    }
    
    
    
}
