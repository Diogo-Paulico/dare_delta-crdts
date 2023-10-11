package org.verifx.practical

import org.verifx.practical.Prover
import org.scalatest.FlatSpec

class ProofTests extends FlatSpec with Prover {

 "Delta2PSet" should "be a CRDT" in{
  val proof = ("Delta2PSet", "is_a_CvRDT")
  prove(proof)
 }

 "DeltaGSet" should "be a CRDT" in {
  val proof = ("DeltaGSet", "is_a_CvRDT")
  prove(proof)
 }

 "DeltaGCounter" should "be a CRDT" in {
  val proof = ("DeltaGCounter", "is_a_CvRDT")
  prove(proof)
 }

 "DeltaPNCounter" should "be a CRDT" in {
  val proof = ("DeltaPNCounter", "is_a_CvRDT")
  prove(proof)
 }

 "EWFlag" should "be a CRDT" in {
  val proof = ("EWFlag", "is_a_CvRDT")
  prove(proof)
 }

 "MVRegister" should "be a CRDT" in {
  val proof = ("MVRegister", "is_a_CvRDT")
  prove(proof)
 }

}