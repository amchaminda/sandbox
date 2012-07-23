/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao;

import chams.open.kssample.core.Designation;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author cam
 */
@Remote
public interface DesignationDaoRemote {

    void create(Designation role);

    void edit(Designation role);

    void remove(Designation role);

    Designation find(Object id);

    List<Designation> findAll();

    List<Designation> findRange(int[] range);

    int count();
    
}
