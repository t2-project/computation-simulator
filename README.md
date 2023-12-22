# Computation Simulation Service

This service simulates an intensive computation scenario.
It is used for testing scaling scenarios.

## Build and Run

Refer to the [Documentation](https://t2-documentation.readthedocs.io/en/latest/microservices/deploy.html) on how to build, run or deploy and use the T2-Project services.

## Application Properties

(`./src/main/resources/application.yml`)

| property                                        | read from env var                                  | description                                                                                             |
|-------------------------------------------------|----------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| t2.computationSimulator.calculatePi.TotalPoints | T2_COMPUTATION_SIMULATOR_CALCULATE_PI_TOTAL_POINTS | total points that should be calculated of PI. 100000000 requires around 5 sec, 1000000000 around ~1 min |
