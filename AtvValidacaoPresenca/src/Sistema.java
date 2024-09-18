import java.util.ArrayList;

import java.util.List;




public class Sistema {

	private List <Usuario> usuarios;
	private List <Video> videos;

	public Sistema() {
		usuarios = new ArrayList<Usuario>();
		videos = new ArrayList<Video>();
	}

	public void buscarUsuarios() {}

	public void buscarVideo() {}

	public void adicionarVideo(Video v) {
		videos.add(v);
	}

	public void adicionarUsuario(Usuario u) {
		usuarios.add(u);
	}


	public void mostrarVideos() {
		for( Video v : videos ) {
			v.exibirVideo();			
		}
	}
}