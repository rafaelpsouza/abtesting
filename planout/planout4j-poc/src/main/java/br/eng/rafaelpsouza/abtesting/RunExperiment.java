package br.eng.rafaelpsouza.abtesting;

import com.glassdoor.planout4j.Namespace;
import com.glassdoor.planout4j.NamespaceConfig;
import com.glassdoor.planout4j.compiler.YAMLConfigParser;
import com.google.common.collect.ImmutableMap;
import java.io.FileReader;
import java.nio.file.Paths;

/**
 *
 * @author Rafael
 */
public class RunExperiment {
    
    public String run(String name, Integer userId) throws Exception{
        FileReader reader = new FileReader(Paths.get("experiments", name + ".yaml").toFile());        
        NamespaceConfig namespaceConfig = new YAMLConfigParser().parseAndValidate(reader, name);
        Namespace namespace = new Namespace(namespaceConfig, ImmutableMap.of("userid", userId), null);
        return namespace.getParam("command_position", "");
    }
    
}
