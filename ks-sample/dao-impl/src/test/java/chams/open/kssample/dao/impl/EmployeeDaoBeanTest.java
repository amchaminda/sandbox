/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao.impl;

import chams.open.kssample.core.Employee;
import chams.open.kssample.dao.EmployeeDaoLocal;
import java.util.List;
import java.util.Properties;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author cam
 */
public class EmployeeDaoBeanTest {
        
    private EJBContainer container;

    public EmployeeDaoBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");
        props.put("jdbc/ksSampleDs", "new://Resource?type=DataSource");
        props.put("jdbc/ksSampleDs.JdbcDriver", "com.mysql.jdbc.Driver");
        props.put("jdbc/ksSampleDs.JdbcUrl", "jdbc:mysql://localhost:3306/mytest");
        props.put("jdbc/ksSampleDs.UserName", "root");
        props.put("jdbc/ksSampleDs.Password", "password");
         container = javax.ejb.embeddable.EJBContainer.createEJBContainer(props);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class EmployeeDaoBean.
     */
    @Test
    public void testCreate() throws Exception {
        Employee entity = new Employee();
        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/dao-impl/EmployeeDaoBean!chams.open.kssample.dao.EmployeeDaoLocal");
        instance.create(entity);
        assertEquals(1, instance.count());
        assertNotNull(entity.getId());

        container.close();
    }

    /**
     * Test of edit method, of class EmployeeDaoBean.
     */
    @Test
    public void testEdit() throws Exception {
        Employee entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class EmployeeDaoBean.
     */
    @Test
    public void testRemove() throws Exception {
        Employee entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class EmployeeDaoBean.
     */
    @Test
    public void testFind() throws Exception {
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
        Employee expResult = null;
        Employee result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class EmployeeDaoBean.
     */
    @Test
    public void testFindAll() throws Exception {
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class EmployeeDaoBean.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/dao-impl/EmployeeDaoBean!chams.open.kssample.dao.EmployeeDaoLocal");
        List expResult = null;
        List result = instance.findRange(range);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class EmployeeDaoBean.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        EmployeeDaoLocal instance = (EmployeeDaoLocal) container.getContext().lookup("java:global/classes/EmployeeDaoBean");
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
