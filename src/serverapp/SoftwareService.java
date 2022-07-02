/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp;

import app.ESoftware;

/**
 *
 * @author BSE193139
 */
public class SoftwareService {
    
    private SoftwareDao dao;
    public void Register(ESoftware software) {
        dao.Register(software);
    }

    public void Remove(ESoftware software) {
        dao.Remove(software);
    }

    public void Update(ESoftware software) {
        dao.Update(software);
    }
    
}
