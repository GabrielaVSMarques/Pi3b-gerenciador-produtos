/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CategoriaDAO;

/**
 *
 * @author paulobelfi
 */
public class CategoriaController {
        public static int Pesquisar(String nome) {
           return CategoriaDAO.pesquisar(nome);
    }
    
}
