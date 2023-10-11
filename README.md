# DARE 2023 - Implementing Delta-CRDTs in VeriFx

In this project we implemented the following 𝛿-CRDTs using the [VeriFx Language](https://github.com/verifx-prover/verifx):

* Delta Grow-Only Set (GSet)
* Delta Two-Phase Set (2PSet)
* Delta Grow-Only Counter (GCounter)
* Delta Positive-Negative Counter (PNCounter)
* Delta Enable-Wins Flag (EWFlag)
* Delta Multi-Value Registry (MVRegistry)

Also implemented in this repository are the Dor, DotSet and DotFun necessary for causal 𝛿-CRDTs

The specification of these CRDTs can be found in the [Delta State Replicated Data Types paper](https://doi.org/10.48550/arXiv.1603.01529). 

An implementation in C++ of these (and other) 𝛿-CRDTs is made available by one of the authors of the paper [here](https://github.com/CBaquero/delta-enabled-crdts)

The implemented 𝛿-CRDTs were also verified using VeriFx for merge associativity, merge commutativity and merge idempotence.

To verify this for yourself you just need to open the project using the IntelIJ IDE and execute the "ProofTests" test, which will parse the provided code and prove the aforementioned properties.