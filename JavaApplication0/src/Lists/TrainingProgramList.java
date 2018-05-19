/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author 20160596
 */
public class TrainingProgramList extends GenericList {
    public TrainingProgramList(Connection outlet){
        super("Trainers List", "TRAININGPROGRAMS_FORM");
    }
    
    // should override the populateRows method 
    // code here . 
    
}
