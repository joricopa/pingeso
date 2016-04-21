/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionsbeans;

import entities.alumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gior
 */
@Stateless
public class alumnoFacade extends AbstractFacade<alumno> implements alumnoFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_prueba-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public alumnoFacade() {
        super(alumno.class);
    }
    
}
