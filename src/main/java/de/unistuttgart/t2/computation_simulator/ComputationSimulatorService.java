package de.unistuttgart.t2.computation_simulator;

import de.unistuttgart.t2.computation_simulator.compute.IComputeOperation;
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

    public double doCompute() {
        LOG.info("Start compute operation '{}'.", computeOperation.getName());
        long startTime = System.currentTimeMillis();

        computeOperation.doCompute();

        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime);
        LOG.info("Compute operation finished after {} ms.", elapsedTime);
        return elapsedTime;
    }
}
