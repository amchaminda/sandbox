/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chams.open.kssample.dao;

import chams.open.kssample.core.Role;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author cam
 */
@Remote
public interface RoleDaoRemote {

    void create(Role role);

    void edit(Role role);

    void remove(Role role);

    Role find(Object id);

    List<Role> findAll();

    List<Role> findRange(int[] range);

    int count();
    
}
