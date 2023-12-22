package de.unistuttgart.t2.computationsimulator.compute;

public interface IComputeOperation<T> {

    String getName();

    T doCompute();
}
