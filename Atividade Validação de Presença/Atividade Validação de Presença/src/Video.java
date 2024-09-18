import java.util.Date;
import java.util.List;

public class Video {
	private Usuario usuario;
	private String titulo;
	private String descricao;
	private Date criado;

	private List<String> comentarios;
	private int curtidos;
	private int visualizacoes;
	private int compartilhamentos;


	public void serVisualizado() {
		visualizacoes++;
	}

	public void receberCurtida() {
		curtidos++;
	}
	public void serCompartilhado() {
		compartilhamentos++;
	}


	public void adicionar() {}

	public void exibirVideo() {
		System.out.println("+---------------+");
		System.out.println("|               |");
		System.out.println("|               |");
		System.out.println("|               |");
		System.out.println("+---------------+");
		System.out.println(usuario.getNome());
		System.out.println(visualizacoes + " visualizacoes");
		System.out.println(curtidos + " curtidas");
		System.out.println(compartilhamentos + " compartilhamentos");	
	}


	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getCriado() {
		return criado;
	}
	public void setCriado(Date criado) {
		this.criado = criado;
	}
	public List<String> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<String> comentarios) {
		this.comentarios = comentarios;
	}
	public int getCurtidos() {
		return curtidos;
	}
	public void setCurtidos(int curtidos) {
		this.curtidos = curtidos;
	}
	public int getVisualizacoes() {
		return visualizacoes;
	}
	public void setVisualizacoes(int visualizacoes) {
		this.visualizacoes = visualizacoes;
	}
	public int getCompartilhamentos() {
		return compartilhamentos;
	}
	public void setCompartilhamentos(int compartilhamentos) {
		this.compartilhamentos = compartilhamentos;
	}
}