/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao.impl;

import chams.open.kssample.core.Designation;
import chams.open.kssample.dao.DesignationDaoLocal;
import chams.open.kssample.dao.DesignationDaoRemote;
import chams.open.kssample.dao.GenericDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cam
 */
@Stateless
public class DesignationDaoBean extends GenericDao<Designation> implements DesignationDaoLocal, DesignationDaoRemote {

    @PersistenceContext(unitName = "ks-sample-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DesignationDaoBean() {
        super(Designation.class);
    }
}
