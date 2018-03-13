# Simple moving robot task

Imagine a robot in a grid world. Robot has its coordinates x and y.
It can turn left or right and it can move forward selected direction.

The task is to write an algorithm that will return robot's coordinates
after executing a sequence of commands given ints initial position.

There are only three commands that robot should understand:

 - "R" - turn right
 - "L" - turn left
 - "A" - advance (or move forward)

Example:

Initial coordinates: (x = 0, y = 0)

Sequence of commands: "RAALAL"

Expected new coordinates: (x = 2, y = 1)
