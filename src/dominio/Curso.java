package dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria)
    {
        this.cargaHoraria = cargaHoraria;
        setDescricao(descricao);
        setTitulo(titulo);
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int data) {
        this.cargaHoraria = data;
    }

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Curso{" +
        "titulo='" + getTitulo() + '\'' +
        ", descricao ='" + getDescricao() + '\'' +
        ", Carga Horária ='" + cargaHoraria + '\'' +
        '}';
    }
    }

