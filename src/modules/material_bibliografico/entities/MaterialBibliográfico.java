package modules.material_bibliografico.entities;

import java.util.ArrayList;
import java.util.List;

public class MaterialBibliográfico{
  private List<Livro> arrayOfLivros = new ArrayList<Livro>();
  private List<Revista> arrayOfRevistas = new ArrayList<Revista>();

  public List<Livro> getLivros(){
    return this.arrayOfLivros;
  }

  public List<Revista> getRevistas(){
    return this.arrayOfRevistas;
  }

  public void addRevista(String titulo,String org, int vol, int nro, int ano){
      this.arrayOfRevistas.add(new Revista(titulo,org,vol,nro,ano));
  }

  public void addLivro(String titulo,String autor, int ano){
    this.arrayOfLivros.add(new Livro(titulo,autor,ano));
  }
}
