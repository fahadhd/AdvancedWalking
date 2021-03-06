package scripts.advancedwalking.game.path.steps;

import org.tribot.api.interfaces.Positionable;
import org.tribot.api2007.types.RSTile;
import scripts.advancedwalking.game.path.PathStep;
import scripts.advancedwalking.game.teleports.Teleport;

/**
 * A ShortcutStep is a agility shortcut in a path.
 *
 * @author Laniax
 */
public class ShortcutStep implements PathStep {

    private RSTile _destination;

    private RSTile _shortcutPos;

    public ShortcutStep(Positionable destination, Positionable objPosition) {
        this._destination = destination.getPosition();
        this._shortcutPos = objPosition.getPosition();
    }

    @Override
    public RSTile destination() {
        return _destination;
    }

    @Override

    public Teleport getTeleport() {
        return null;
    }

    @Override
    public boolean run() {
        return false;
    }
}
