package br.sca.extension.glassfish.command;

import br.sca.extension.glassfish.util.ProcessConsole;
import br.sca.extension.glassfish.util.Util;

public class GlassfishStopCommand extends BaseCommand {
    
    public GlassfishStopCommand() {
        super(actionId(""));
    }

    @Override
    public int doit() throws Exception {
        try {
            String cmd = String.format("java -jar \"%s/modules/admin-cli.jar\" stop-domain", Util.getFullPathGlassfishHome());
            //
            new ProcessConsole().start(cmd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return CANCEL;
        }
        return OK;
    }
}
