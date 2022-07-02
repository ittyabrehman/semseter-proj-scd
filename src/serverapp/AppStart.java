/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp;

import app.ISoftware;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BSE193139
 */
public class AppStart {
    /**
     * @param args the command line arguments
     * @throws java.rmi.AccessException
     */
    public static void main(String[] args) throws AccessException {
     
        ISoftware software = new SoftwareRemote();       
        try {
            ISoftware stub = (ISoftware) UnicastRemoteObject.exportObject(software,0);
              
            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("software", stub);

            System.out.println("Server ready");
            
        } catch (RemoteException | AlreadyBoundException ex ) {
            Logger.getLogger(AppStart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
