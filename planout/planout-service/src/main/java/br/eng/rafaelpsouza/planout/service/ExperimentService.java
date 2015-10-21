package br.eng.rafaelpsouza.planout.service;

import com.glassdoor.planout4j.Namespace;
import com.glassdoor.planout4j.NamespaceConfig;
import com.glassdoor.planout4j.compiler.YAMLConfigParser;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

/**
 *
 * @author Rafael
 */
public class ExperimentService {

    public ExperimentService() {
    }

    public Map<String, ?> run(String name, Map<String, String> inputs) {
        try {
            FileReader reader = new FileReader(Paths.get("experiments", name + ".yaml").toFile());
            NamespaceConfig namespaceConfig = new YAMLConfigParser().parseAndValidate(reader, name);
            Namespace namespace = new Namespace(namespaceConfig, inputs, null);
            return namespace.getParams();
        } catch (Exception ex) {
            System.out.println("fail"+ex.getMessage());
            ex.printStackTrace();
            return null;
        }

    }
    
    /*public static void main(String[] args) {
        ExperimentService experimentService = new ExperimentService();
        System.out.println("Results: "+experimentService.run("commands_side", ImmutableMap.of("userid", "1111")));
    }*/

}
