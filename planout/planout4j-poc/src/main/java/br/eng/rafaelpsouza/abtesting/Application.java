package br.eng.rafaelpsouza.abtesting;

import java.util.Map;

/**
 *
 * @author Rafael Souza
 */
public class Application {
    
    public static void main(String[] args) throws Exception {
        RunExperiment experiments = new RunExperiment();
        String experimentResults = experiments.run("commands_namespace", 1);
        System.out.println("Parameters: "+experimentResults);
    }
    
}
