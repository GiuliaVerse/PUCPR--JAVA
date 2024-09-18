import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private String senha;
	private String email;
	private List<Usuario> seguidores;
	private List<Usuario> seguindo;
	private List<Video> videos;

	public Usuario() {
		seguidores = new ArrayList<Usuario>();
		seguindo = new ArrayList<Usuario>();
		videos = new ArrayList<Video>();
	}

	public void seguir(Usuario u) {
		seguindo.add(u);
	}

	public void deixarDeSeguir(Usuario u) {
		seguindo.remove(u);
	}

	public void postarVideo(Video v) {		
		videos.add(v);
	}	

	public void ComentarVideo(Video v) {}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}