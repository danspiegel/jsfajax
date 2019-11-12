package br.com.devmedia.cursos.oqueecdi.unitedburger.service;

import br.com.devmedia.cursos.oqueecdi.unitedburger.domain.dao.ContatoDao;
import br.com.devmedia.cursos.oqueecdi.unitedburger.domain.model.Contato;

public class ContatoService {

    private ContatoDao contatoDao = new ContatoDao();

    public void cadastrar(Contato contato) {
        contatoDao.cadastrar(contato);
    }
}
