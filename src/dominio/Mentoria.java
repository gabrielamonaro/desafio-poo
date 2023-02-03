package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data)
    {
        setDescricao(descricao);
        this.data = data;
        setTitulo(titulo);    
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao ='" + getDescricao() + '\'' +
                ", data ='" + data + '\'' +
                '}';
            }
  
}
