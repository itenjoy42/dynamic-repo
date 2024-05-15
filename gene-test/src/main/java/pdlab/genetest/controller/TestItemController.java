package pdlab.genetest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestItemController {

    @GetMapping("/test-items")
    public List<String> getTestItems() {
        return Arrays.asList("Gene Variation Analysis", "Disease Prediction Test", "Body Mass Index Measurement");
    }
}

