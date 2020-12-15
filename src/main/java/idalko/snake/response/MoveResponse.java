package idalko.snake.response;

import com.idalko.battle_snake.fw.api.domain.move.IMoveResponse;
import com.idalko.battle_snake.fw.api.domain.move.Move;

public class MoveResponse implements IMoveResponse {
    private Move move;

    public MoveResponse(Move move) {
        this.move = move;
    }

    @Override
    public Move getMove() {
        return move;
    }
}
