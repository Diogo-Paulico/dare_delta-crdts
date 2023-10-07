package org.verifx.practical

import org.verifx.practical.Prover
import org.scalatest.FlatSpec

class ProofTests extends FlatSpec with Prover {


 "DeltaGSet" should "be a CRDT" in {
  val proof = ("DeltaGSet", "is_a_CvRDT")
  prove(proof)
}

}