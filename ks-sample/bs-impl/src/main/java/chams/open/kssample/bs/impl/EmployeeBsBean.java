/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.bs.impl;

import chams.open.kssample.dao.EmployeeDao;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author cam
 */
@Stateless
public class EmployeeBsBean implements EmployeeBsBeanRemote {

    @Inject
    private EmployeeDao employeeDao;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
