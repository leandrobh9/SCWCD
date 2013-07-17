package cap5.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Classe entidade
 * o HttpSessionBindingListener escutará evento de adição de atributo
 * do tipo desta entidade em session
 * @author Leandro
 *
 */
public class Cachorro implements HttpSessionBindingListener {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("Foi adicionado um cachorro como atributo: " + event.getValue());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("Foi removido um cachorro como atributo: " + event.getValue());
		
	}
	
	
}
