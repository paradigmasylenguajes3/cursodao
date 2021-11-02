/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursodev.controllers;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Administrador
 */
public interface ICrud<T> {
    public boolean insertObject(T entity);
    public boolean deleteObject(int id);
    public Optional<T> getObject(int id);
    public boolean modifiedObject(T entity);
    public List<T> getAllObjects();
}
