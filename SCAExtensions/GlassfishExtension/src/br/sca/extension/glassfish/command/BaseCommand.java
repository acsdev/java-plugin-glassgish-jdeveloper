package br.sca.extension.glassfish.command;

import oracle.ide.Ide;
import oracle.ide.controller.Command;

public abstract class BaseCommand extends Command {

    BaseCommand(int actionId) {
        super(actionId);
    }

    protected static int actionId(String actionID) {
        final Integer cmdId = Ide.findCmdID(actionID);
        if (cmdId == null) {
            throw new IllegalStateException(String.format("Action %s not found.", actionID));
        }
        return cmdId;
    }
}
