/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao;

import chams.open.kssample.core.Employee;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author cam
 */
@Remote
public interface EmployeeDaoRemote {

    void create(Employee employee);

    void edit(Employee employee);

    void remove(Employee employee);

    Employee find(Object id);

    List<Employee> findAll();

    List<Employee> findRange(int[] range);

    int count();
    
}
