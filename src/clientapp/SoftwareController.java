/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import app.ESoftware;

/**
 *
 * @author BSE193139
 */
public class SoftwareController {

    private ClientService service;

    public void Register(String id, String name, String company) {
        ESoftware model = new ESoftware(name, id, company);
        service.Register(model);
    }

    public void Delete(String id) {
        ESoftware model = new ESoftware("", id, "");
        service.Remove(model);
    }

    public void Update(String id, String name, String company) {
        ESoftware model = new ESoftware(name, id, company);
        service.Update(model);
    }
}
