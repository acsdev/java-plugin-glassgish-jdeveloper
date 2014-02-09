package br.sca.extension.glassfish.controller;

import br.sca.extension.glassfish.GlassfishDataStructure;

import java.io.BufferedInputStream;
import java.io.File;

import java.io.IOException;

import javax.swing.JOptionPane;

import oracle.ide.Context;
import oracle.ide.config.Preferences;
import oracle.ide.controller.Controller;
import oracle.ide.controller.IdeAction;

public final class GlassfishStopController implements Controller {
    
    public boolean update(IdeAction action, Context context) {
        // TODO Determine when glassfish.start is enabled, and call action.setEnabled().
        return true;
    }

    public boolean handleEvent(IdeAction action, Context context) {
        
        Preferences preferences = Preferences.getPreferences();
        GlassfishDataStructure dataStructure = GlassfishDataStructure.getInstance(preferences);
        
        try {
            String glassFishHomeDir = new File(dataStructure.getGlassfishHome()).getAbsolutePath();
            
            glassFishHomeDir = glassFishHomeDir.replaceAll("\\\\", "/").trim();
            
            String cmd = String.format("java -jar \"%s/modules/admin-cli.jar\" stop-domain", glassFishHomeDir);
            
            new ProcessConsole().start(cmd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}

