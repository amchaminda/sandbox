/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao.impl;

import chams.open.kssample.core.Role;
import chams.open.kssample.dao.GenericDao;
import chams.open.kssample.dao.RoleDaoLocal;
import chams.open.kssample.dao.RoleDaoRemote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cam
 */
@Stateless
public class RoleDaoBean extends GenericDao<Role> implements RoleDaoLocal, RoleDaoRemote {

    @PersistenceContext(unitName = "ks-sample-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RoleDaoBean() {
        super(Role.class);
    }
}
