package idalko.snake.response;

import com.idalko.battle_snake.fw.api.domain.start.HeadType;
import com.idalko.battle_snake.fw.api.domain.start.IStartResponse;
import com.idalko.battle_snake.fw.api.domain.start.TailType;

public class StartResponse implements IStartResponse {

    @Override
    public String getColor() {
        return "blue";
    }

    @Override
    public String getSecondaryColor() {
        return "red";
    }

    @Override
    public String getName() {
        return "MyPerfectSnake";
    }

    @Override
    public String getHeadUrl() {
        return "http://battlesnake.exalate.st:3000/9";
    }

    @Override
    public String getTaunt() {
        return "Taunt";
    }

    @Override
    public HeadType getHeadType() {
        return HeadType.REGULAR;
    }

    @Override
    public TailType getTailType() {
        return TailType.REGULAR;
    }
}
