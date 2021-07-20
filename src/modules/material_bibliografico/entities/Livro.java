package modules.material_bibliografico.entities;

public class Livro {
  private String titulo;
  private String autor;
  private int ano;

  public Livro(String titulo, String autor, int ano){
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setAno(ano);
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Livro get(){
    return this;
  }
}
