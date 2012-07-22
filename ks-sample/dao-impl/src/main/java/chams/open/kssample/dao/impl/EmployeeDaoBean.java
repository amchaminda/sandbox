/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao.impl;

import chams.open.kssample.dao.GenericDao;
import chams.open.kssample.dao.EmployeeDaoLocal;
import chams.open.kssample.dao.EmployeeDaoRemote;
import chams.open.kssample.core.Employee;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cam
 */
@Stateless
public class EmployeeDaoBean extends GenericDao<Employee> implements EmployeeDaoLocal, EmployeeDaoRemote {
    @PersistenceContext(unitName = "ks-sample-PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeDaoBean() {
        super(Employee.class);
    }
    
}
