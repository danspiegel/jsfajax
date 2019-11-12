package br.com.devmedia.cursos.oqueecdi.unitedburger.service;

import br.com.devmedia.cursos.oqueecdi.unitedburger.domain.dao.NotificacaoDao;
import br.com.devmedia.cursos.oqueecdi.unitedburger.domain.model.Notificacao;

public class NotificacaoService {

    private NotificacaoDao notificacaoDao = new NotificacaoDao();

    public void cadastrar(Notificacao notificacao) {
        notificacaoDao.cadastrar(notificacao);
    }
}
