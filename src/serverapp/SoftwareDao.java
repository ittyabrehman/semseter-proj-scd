/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverapp;

import app.ESoftware;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BSE193139
 */
public class SoftwareDao {

    private final DbManager manager;

    public SoftwareDao(DbManager manger) {
        this.manager = new DbManager();
    }

    public void Register(ESoftware software) {
        
        String query = "INSERT INTO SOFTWARES (id,name,company,date) values (" + software.getId() + "," + software.getName() + "," + software.getCompany() + "," + CurrentDate() + ");";
        manager.Insert(query);
        System.out.println("RECORD INSERTED SUCCESSFULLY");
    }

    public void Remove(ESoftware software) {
        String query = "DELETE FROM SOFTWARES where id= " + software.getId() + ";";
        manager.Delete(query);
        System.out.println("RECORD INSERTED SUCCESSFULLY");
    }

    public void Update(ESoftware software) {
        String query = "UPDATE SOFTWARES  SET nam=" + software.getName() + " and company=" + software.getCompany() + " and date= " + CurrentDate() + " where id =" + software.getId() + ";";
        manager.Update(query);
        System.out.println("RECORD UPDATED SUCCESSFULLY");
    }
    private String CurrentDate()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String currentDate = formatter.format(date);
        return currentDate;
    }
}
