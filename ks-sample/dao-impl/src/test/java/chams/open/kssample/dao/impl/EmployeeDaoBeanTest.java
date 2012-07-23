/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao.impl;

import chams.open.kssample.core.Designation;
import chams.open.kssample.core.Employee;
import chams.open.kssample.dao.DesignationDaoLocal;
import chams.open.kssample.dao.EmployeeDaoLocal;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

/**
 *
 * @author cam
 */
public class EmployeeDaoBeanTest extends OpenEJBServerAwareTest {

    private EmployeeDaoLocal employeeDao;
    private DesignationDaoLocal designationDao;

    @Before
    public void before() throws Exception {
        employeeDao = (EmployeeDaoLocal) container.getContext().lookup("java:global/dao-impl/EmployeeDaoBean!chams.open.kssample.dao.EmployeeDaoLocal");
        designationDao = (DesignationDaoLocal) container.getContext().lookup("java:global/dao-impl/DesignationDaoBean!chams.open.kssample.dao.DesignationDaoLocal");

    }

    /**
     * Test of create method, of class EmployeeDaoBean.
     */
    @Test
    public void testCreate() throws Exception {
        final Employee entity = new Employee();
        final Designation des = new Designation();
        designationDao.create(des);
        entity.setDesignation(des);
        employeeDao.create(entity);
        assertEquals(1, employeeDao.count());
        assertNotNull(entity.getId());

//        container.close();
    }
//    /**
//     * Test of edit method, of class EmployeeDaoBean.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        Employee entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
//        instance.edit(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class EmployeeDaoBean.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        Employee entity = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
//        instance.remove(entity);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of find method, of class EmployeeDaoBean.
//     */
//    @Test
//    public void testFind() throws Exception {
//        Object id = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
//        Employee expResult = null;
//        Employee result = instance.find(id);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findAll method, of class EmployeeDaoBean.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
//        List expResult = null;
//        List result = instance.findAll();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findRange method, of class EmployeeDaoBean.
//     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        int[] range = null;
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/dao-impl/EmployeeDaoBean!chams.open.kssample.dao.EmployeeDaoLocal");
//        List expResult = null;
//        List result = instance.findRange(range);
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of count method, of class EmployeeDaoBean.
//     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
//        int expResult = 0;
//        int result = instance.count();
//        assertEquals(expResult, result);
//        container.close();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
