/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao.impl;

import java.util.Properties;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import org.junit.*;

/**
 *
 * @author cam
 */
@Ignore
public abstract class OpenEJBServerAwareTest {

    protected EJBContainer container;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        final Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.LocalInitialContextFactory");
        props.put("jdbc/ksSampleDs", "new://Resource?type=DataSource");
        props.put("jdbc/ksSampleDs.JdbcDriver", "com.mysql.jdbc.Driver");
        props.put("jdbc/ksSampleDs.JdbcUrl", "jdbc:mysql://localhost:3306/mytest");
        props.put("jdbc/ksSampleDs.UserName", "root");
        props.put("jdbc/ksSampleDs.Password", "kingking");
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer(props);
    }

    @After
    public void tearDown() {
        container.close();
    }
}
