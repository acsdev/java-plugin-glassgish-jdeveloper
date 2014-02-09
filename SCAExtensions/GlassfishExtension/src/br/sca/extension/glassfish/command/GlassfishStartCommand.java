package br.sca.extension.glassfish.command;

import br.sca.extension.glassfish.util.ProcessConsole;

import br.sca.extension.glassfish.util.Util;

import java.io.File;

import oracle.ide.controller.Command;


public class GlassfishStartCommand extends BaseCommand {

    public GlassfishStartCommand() {
        super(actionId(""));
    }
    
    @Override
    public int doit() throws Exception {
        try {
            String cmd = String.format("java -jar \"%s/modules/admin-cli.jar\" start-domain --verbose", Util.getFullPathGlassfishHome());
            //
            new ProcessConsole().start(cmd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return CANCEL;
        }
        return OK;
    }
}
