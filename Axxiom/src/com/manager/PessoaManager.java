package com.manager;

import java.util.ArrayList;
import java.util.List;

import com.entidades.Pessoa;

public class PessoaManager {

	public List<Pessoa> getLista(){
		
		List<Pessoa> list = new ArrayList<Pessoa>();
		
		list.add(new Pessoa(1, "Leandro"));
		list.add(new Pessoa(2, "Lucas"));
		
		return list;
	}
}
