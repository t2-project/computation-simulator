package de.unistuttgart.t2.computationsimulator;

import de.unistuttgart.t2.computationsimulator.compute.IComputeOperation;
import de.unistuttgart.t2.computationsimulator.compute.PiCalculator;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Simulates an intensive computation scenario.
 *
 * @author davidkopp
 */
@SpringBootApplication
public class ComputationSimulatorApplication {

    @Value("${t2.computationSimulator.calculatePi.TotalPoints}")
    int piCalculatorTotalPoints;

    public static void main(String[] args) {
        SpringApplication.run(ComputationSimulatorApplication.class, args);
    }

    @Bean
    public ComputationSimulatorService getComputationSimulatorService() {
        IComputeOperation<Double> piCalculator = new PiCalculator(piCalculatorTotalPoints);
        return new ComputationSimulatorService(piCalculator);
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${info.app.version:unknown}") String version) {
        return new OpenAPI().components(new Components()).info(new Info()
            .title("T2 Computation Simulation service API")
            .description("API of the T2-Project's intensive computation simulation service.")
            .version(version));
    }
}
