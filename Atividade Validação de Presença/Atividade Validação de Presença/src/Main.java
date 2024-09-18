public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sistema tiktok = new Sistema();

		Usuario us = new Usuario();
		us.setNome("Paulinho");		

		Usuario us2 = new Usuario();
		us2.setNome("Fefezinho");
		tiktok.adicionarUsuario(us2);

		Video video = new Video();
		video.setTitulo("Video Legal");
		video.setDescricao("Video Legalzinho");
		video.setUsuario(us);
		tiktok.adicionarVideo(video);	

		video = new Video();
		video.setTitulo("Video Bem mais Legal");
		video.setDescricao("Video meio Legalzinho");
		video.setUsuario(us2);		
		tiktok.adicionarVideo(video);	

		tiktok.mostrarVideos();


	}

}