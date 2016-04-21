/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionsbeans;

import entities.alumno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gior
 */
@Local
public interface alumnoFacadeLocal {

    void create(alumno alumno);

    void edit(alumno alumno);

    void remove(alumno alumno);

    alumno find(Object id);

    List<alumno> findAll();

    List<alumno> findRange(int[] range);

    int count();
    
}
