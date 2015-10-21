package br.eng.rafaelpsouza.planout.server;

import br.eng.rafaelpsouza.planout.service.ExperimentService;
import java.util.Map;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author rafael
 */
@RestController
@RequestMapping(value="/experiments")
public class ExperimentController {
    
    private ExperimentService experimentService = new ExperimentService();
    
    @RequestMapping(value="/{name}", method=RequestMethod.GET)
    public Map<String, ?> getUser(@PathVariable String name, @RequestParam Map<String, String> inputs) {
        return experimentService.run(name, inputs);
    }
    
    
}
