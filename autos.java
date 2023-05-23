package com.example.parcial_2_grupo6;

class autos {
    private String marca, modelo, descripcion;
    private int minitu;


    public autos (String marca, String modelo, String descripcion, int minitu){
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.minitu = minitu;
    }

    public String getMarca() {return marca;}

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getMinitu() {
        return minitu;
    }

    public void setTitulo(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMinitu(int minitu) {
        this.minitu = minitu;
    }
}
