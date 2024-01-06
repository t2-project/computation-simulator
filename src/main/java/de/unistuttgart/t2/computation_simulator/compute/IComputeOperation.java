package de.unistuttgart.t2.computation_simulator.compute;

public interface IComputeOperation<T> {

    String getName();

    T doCompute();
}
