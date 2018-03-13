package dumbot

object Robot {

  def move(state: State, actions: List[String]): State =
    actions.foldLeft(state)(transition)

  def transition(state: State, action: String): State = action match {
    case "A" => advance(state)
    case "R" => state.copy(direction = rightTurn(state.direction))
    case "L" => state.copy(direction = leftTurn(state.direction))
  }

  def advance(state: State): State = state.direction match {
    case "N" => state.copy(y = state.y + 1)
    case "E" => state.copy(x = state.x + 1)
    case "S" => state.copy(y = state.y - 1)
    case "W" => state.copy(x = state.x - 1)
  }
  def leftTurn(direction: String): String = direction match {
    case "N" => "W"
    case "E" => "N"
    case "S" => "E"
    case "W" => "S"
  }
  def rightTurn(direction: String): String = direction match {
    case "N" => "E"
    case "E" => "S"
    case "S" => "W"
    case "W" => "N"
  }
}
case class State(x: Int, y: Int, direction: String)
