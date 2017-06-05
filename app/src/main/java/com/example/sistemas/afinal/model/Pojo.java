package com.example.sistemas.afinal.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sistemas on 1/06/17.
 */

public class Pojo {

    @SerializedName("biologia")
    @Expose
    private String biologia;

    @SerializedName("codmunicipio")
    @Expose
    private String codmunicipio;

    @SerializedName("f_sica")
    @Expose
    private String fSica;

    @SerializedName("filosofia")
    @Expose
    private String filosofia;

    @SerializedName("ingles")
    @Expose
    private String ingles;

    @SerializedName("institucioneducativa")
    @Expose
    private String institucioneducativa;

    @SerializedName("lenguaje")
    @Expose
    private String lenguaje;

    @SerializedName("matematicas")
    @Expose
    private String matematicas;

    @SerializedName("municipio")
    @Expose
    private String municipio;

    @SerializedName("periodo")
    @Expose
    private String periodo;

    @SerializedName("quimica")
    @Expose
    private String quimica;

    @SerializedName("vsociedad")
    @Expose
    private String vsociedad;


    public String getBiologia() {
        return biologia;
    }

    public void setBiologia(String biologia) {
        this.biologia = biologia;
    }

    public String getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(String codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public String getFSica() {
        return fSica;
    }

    public void setFSica(String fSica) {
        this.fSica = fSica;
    }

    public String getFilosofia() {
        return filosofia;
    }

    public void setFilosofia(String filosofia) {
        this.filosofia = filosofia;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getInstitucioneducativa() {
        return institucioneducativa;
    }

    public void setInstitucioneducativa(String institucioneducativa) {
        this.institucioneducativa = institucioneducativa;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(String matematicas) {
        this.matematicas = matematicas;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getQuimica() {
        return quimica;
    }

    public void setQuimica(String quimica) {
        this.quimica = quimica;
    }

    public String getVsociedad() {
        return vsociedad;
    }

    public void setVsociedad(String vsociedad) {
        this.vsociedad = vsociedad;
    }
}
