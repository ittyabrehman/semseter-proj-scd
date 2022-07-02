/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.rmi.Remote;

/**
 *
 * @author BSE193139
 */
public interface ISoftware extends Remote {
    void Register(ESoftware software);
    void Remove(ESoftware software);
    void Update(ESoftware software);
}
