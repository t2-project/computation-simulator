package de.unistuttgart.t2.computationsimulator;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Defines the endpoints of the computation simulator.
 *
 * @author davidkopp
 */
@Controller
public class ComputationSimulatorController {

    @Autowired
    private ComputationSimulatorService service;

    /**
     * Simulation of compute intensive task.
     */
    @Operation(summary = "Does Computation", description = "Does Computation to simulate a compute intensive task", tags = {"..."})
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Computation successful"),
        @ApiResponse(responseCode = "500", description = "Computation failed")})
    @PostMapping("/compute")
    public void doComputation() {
        service.doCompute();
    }
}
