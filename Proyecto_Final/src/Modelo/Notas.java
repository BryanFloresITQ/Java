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
    float InglesN;
    float LenguajeN;
    float FisicaN;
    float MatematicaN;
    float QuimicaN;
    float EfisicaN;
    float GeometriaN;
    float ComputacionN;
    float BiologiaN;
    float AnatomiaN;
    float PromedioN;

    public Notas(int ci, float InglesN, float LenguajeN, float FisicaN, float MatematicaN, float QuimicaN, float EfisicaN, float GeometriaN, float ComputacionN, float BiologiaN, float AnatomiaN, float PromedioN) {
        this.ci = ci;
        this.InglesN = InglesN;
        this.LenguajeN = LenguajeN;
        this.FisicaN = FisicaN;
        this.MatematicaN = MatematicaN;
        this.QuimicaN = QuimicaN;
        this.EfisicaN = EfisicaN;
        this.GeometriaN = GeometriaN;
        this.ComputacionN = ComputacionN;
        this.BiologiaN = BiologiaN;
        this.AnatomiaN = AnatomiaN;
        this.PromedioN = PromedioN;
    }

    public void setInglesN(float InglesN) {
        this.InglesN = InglesN;
    }

    public void setLenguajeN(float LenguajeN) {
        this.LenguajeN = LenguajeN;
    }

    public void setFisicaN(float FisicaN) {
        this.FisicaN = FisicaN;
    }

    public void setMatematicaN(float MatematicaN) {
        this.MatematicaN = MatematicaN;
    }

    public void setQuimicaN(float QuimicaN) {
        this.QuimicaN = QuimicaN;
    }

    public void setEfisicaN(float EfisicaN) {
        this.EfisicaN = EfisicaN;
    }

    public void setGeometriaN(float GeometriaN) {
        this.GeometriaN = GeometriaN;
    }

    public void setComputacionN(float ComputacionN) {
        this.ComputacionN = ComputacionN;
    }

    public void setBiologiaN(float BiologiaN) {
        this.BiologiaN = BiologiaN;
    }

    public void setAnatomiaN(float AnatomiaN) {
        this.AnatomiaN = AnatomiaN;
    }

    public void setPromedioN(float PromedioN) {
        this.PromedioN = PromedioN;
    }

    
    
    public float getInglesN() {
        return InglesN;
    }

    public float getLenguajeN() {
        return LenguajeN;
    }

    public float getFisicaN() {
        return FisicaN;
    }

    public float getMatematicaN() {
        return MatematicaN;
    }

    public float getQuimicaN() {
        return QuimicaN;
    }

    public float getEfisicaN() {
        return EfisicaN;
    }

    public float getGeometriaN() {
        return GeometriaN;
    }

    public float getComputacionN() {
        return ComputacionN;
    }

    public float getBiologiaN() {
        return BiologiaN;
    }

    public float getAnatomiaN() {
        return AnatomiaN;
    }

    public float getPromedioN() {
        return PromedioN;
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
