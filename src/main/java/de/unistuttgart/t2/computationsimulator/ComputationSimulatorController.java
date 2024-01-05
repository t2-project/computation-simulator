package de.unistuttgart.t2.computationsimulator;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Defines the endpoints of the computation simulator.
 *
 * @author davidkopp
 */
@Controller
public class ComputationSimulatorController {

    @Autowired
    private ComputationSimulatorService service;

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    /**
     * Simulation of compute intensive task.
     */
    @Operation(summary = "Does Computation", description = "Does Computation to simulate a compute intensive task", tags = {"..."})
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Computation successful"),
        @ApiResponse(responseCode = "500", description = "Computation failed")})
    @PostMapping("/compute")
    @ResponseBody
    public Double doComputation(@RequestBody String sessionId) {
        LOG.info("Received request for session {}", sessionId);
        return service.doCompute();
    }
}
