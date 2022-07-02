/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientapp;

import app.ESoftware;
import app.ISoftware;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BSE193139
 */
public class ClientService {

    private ISoftware stub;

    public ClientService() {

        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            stub = (ISoftware) registry.lookup("software");

            //  stub.Register(software);
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void Register(ESoftware software) {
       stub.Register(software);
    }

    public void Remove(ESoftware software) {
        stub.Remove(software);
    }

    public void Update(ESoftware software) {
        stub.Update(software);
    }
}
