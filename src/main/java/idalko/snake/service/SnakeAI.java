package idalko.snake.service;

import com.idalko.battle_snake.fw.api.domain.move.IPoint;
import com.idalko.battle_snake.fw.api.domain.move.Move;
import com.idalko.battle_snake.fw.api.domain.move.Point;
import idalko.snake.response.MoveResponse;

import java.util.List;

public class SnakeAI {

    List<IPoint> completeSnake;
    IPoint destination;

    private int previousX;
    private int previousY;

    public MoveResponse makeMove() {
        IPoint start = completeSnake.get(0);
        int snakeWidthCoordinate = start.getX();
        int snakeHeightCoordinate = start.getY();
        int foodWidthCoordinate = destination.getX();
        int foodHeightCoordinate = destination.getY();

        int leftXCoordinate = snakeWidthCoordinate - 1;
        int rightXCoordinate = snakeWidthCoordinate + 1;
        int upYCoordinate = snakeHeightCoordinate + 1;
        int downYCoordinate = snakeHeightCoordinate + 1;

        IPoint up = new Point(snakeWidthCoordinate, upYCoordinate, "");
        IPoint left = new Point(leftXCoordinate, snakeHeightCoordinate, "");
        IPoint right = new Point(rightXCoordinate, snakeHeightCoordinate, "");


        if (snakeWidthCoordinate > foodWidthCoordinate &&
                previousX != leftXCoordinate &&
                shouldProcess(left)
        ) {
           previousX = leftXCoordinate;
            return new MoveResponse(Move.LEFT);
        } else if (snakeWidthCoordinate < foodWidthCoordinate &&
               previousX != rightXCoordinate &&
                shouldProcess(right)
        ) {
            previousX = rightXCoordinate;
            return new MoveResponse(Move.RIGHT);
        } else if (snakeHeightCoordinate > foodHeightCoordinate &&
               previousY != upYCoordinate &&
                shouldProcess(up)
        ) {
       previousY = upYCoordinate;
            return new MoveResponse(Move.UP);
        } else {
           previousY = downYCoordinate;
            return new MoveResponse(Move.DOWN);
        }
    }

    public boolean shouldProcess(IPoint point) {
        return !completeSnake.contains(point);
    }
}
