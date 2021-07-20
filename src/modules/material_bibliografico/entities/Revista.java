package modules.material_bibliografico.entities;

public class Revista{
  private String titulo;
  private String org;
  private int vol;
  private int nro;
  private int ano;

  public Revista(String titulo, String org, int vol, int nro, int ano){
    this.setTitulo(titulo);
    this.setOrg(org);
    this.setVol(vol);
    this.setNro(nro);
    this.setAno(ano);
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getNro() {
    return nro;
  }

  public void setNro(int nro) {
    this.nro = nro;
  }

  public int getVol() {
    return vol;
  }

  public void setVol(int vol) {
    this.vol = vol;
  }

  public String getOrg() {
    return org;
  }

  public void setOrg(String org) {
    this.org = org;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Revista get(){
    return this;
  }
}
