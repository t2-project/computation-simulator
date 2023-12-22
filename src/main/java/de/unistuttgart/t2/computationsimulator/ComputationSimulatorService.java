package de.unistuttgart.t2.computationsimulator;

import de.unistuttgart.t2.computationsimulator.compute.IComputeOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service that invokes the intensive computation simulation.
 *
 * @author davidkopp
 */
public class ComputationSimulatorService {

    private final Logger LOG = LoggerFactory.getLogger(getClass());
    private final IComputeOperation<?> computeOperation;

    public ComputationSimulatorService(IComputeOperation<?> computeOperation) {
        this.computeOperation = computeOperation;
    }

    void doCompute() {
        LOG.info("Start compute operation '{}'.", computeOperation.getName());
        long startTime = System.currentTimeMillis();

        computeOperation.doCompute();

        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        LOG.info("Compute operation finished after {} seconds.", elapsedTime);
    }
}
