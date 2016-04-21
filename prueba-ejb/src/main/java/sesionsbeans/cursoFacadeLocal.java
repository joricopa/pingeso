/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionsbeans;

import entities.curso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author gior
 */
@Local
public interface cursoFacadeLocal {

    void create(curso curso);

    void edit(curso curso);

    void remove(curso curso);

    curso find(Object id);

    List<curso> findAll();

    List<curso> findRange(int[] range);

    int count();
    
}
