package dumbot

import org.scalatest._

class RobotSpec extends FlatSpec with Matchers {

  "robot" should "advance" in {
    val state = State(0, 0, "N")
    val action = List("A")
    Robot.move(state, action) shouldBe State(0, 1, "N")
  }
  "robot" should "turn right" in {
    val state = State(0, 0, "N")
    val action = List("R")
    Robot.move(state, action) shouldBe State(0, 0, "E")
  }
  "robot" should "turn left" in {
    val state = State(0, 0, "N")
    val action = List("L")
    Robot.move(state, action) shouldBe State(0, 0, "W")
  }
  "robot" should "pass AC" in {
    val state = State(0, 0, "N")
    val action = List("R", "A", "A", "L", "A", "L")
    Robot.move(state, action) shouldBe State(2, 1, "W")
  }

}
