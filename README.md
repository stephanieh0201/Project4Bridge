# Project4Bridge
Henry Remache

Stephanie Verlingo

COMP 473

###Problem Solved by Bridge Pattern
The bridge pattern "decouples an abstraction from its implementation so that the two can vary independently."

We created a program to create or build different vehicle types. We have decoupled the abstract Vehicle class from the 
implementation of manufacturing so we can use them separately. We used bridge to avoid permanently binding the abstraction
and implementation. It allows the two to function and change independently. So if we needed to add a new Warehouse process, 
we'd be able to simple add it as an implementation of the Warehouse interface instead of having to separately
add the function to each vehicle type. It allows us to use the implementation of the Warehouse among any vehicle type. 
We could easily add SUV, truck, bike, etc and utilize the Warehouse interface to create those new vehicles.
