package teste;

public class Teste {
	static void teste(){
		String fonte = "<p id=\"texto_sinopse\">" +
				"Durante o <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-periodo/'>período</a> glacial, um <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-bebe/'>bebê</a> é <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-separado/'>separado</a> de seus <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-pais/'>pais</a> <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-quando/'>quando</a> <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-tigres/'>tigres</a> <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-atacam/'>atacam</a> uma <a class='link_padrao' style='color: #666' href='http://www.filmesdecinema.com.br/filmes-de-aldeia/'>aldeia</a> de esquimós.";
		String pattern = "<.*?>";
		
		String resultado = fonte.replaceAll(pattern, "");
		System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		teste();
	}
	}

