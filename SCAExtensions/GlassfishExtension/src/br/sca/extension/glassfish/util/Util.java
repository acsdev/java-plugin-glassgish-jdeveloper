package br.sca.extension.glassfish.util;

import br.sca.extension.glassfish.GlassfishDataStructure;

import java.io.File;

import oracle.ide.config.Preferences;

public class Util {

    public static String getFullPathGlassfishHome() {
        
        Preferences preferences = Preferences.getPreferences();
        GlassfishDataStructure dataStructure = GlassfishDataStructure.getInstance(preferences);
        
        String glassFishHomeDir = new File(dataStructure.getGlassfishHome()).getAbsolutePath();
        
        return glassFishHomeDir.replaceAll("\\\\", "/").trim();
    }

}
