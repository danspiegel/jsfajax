package br.com.devmedia.cursos.oqueecdi.unitedburger.domain.dao;

import br.com.devmedia.cursos.oqueecdi.unitedburger.domain.model.Notificacao;

import javax.persistence.EntityManager;

public class NotificacaoDao {

    public void cadastrar(Notificacao notificacao) {
        EntityManager em = JpaUtil.getParceriasEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(notificacao);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();

            e.printStackTrace();

            throw new RuntimeException("Erro ao realizar cadastro da notificacao");
        } finally {
            em.close();
        }
    }
}
