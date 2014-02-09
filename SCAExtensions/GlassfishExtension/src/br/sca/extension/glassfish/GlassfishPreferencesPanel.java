package br.sca.extension.glassfish;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import oracle.ide.panels.DefaultTraversablePanel;
import oracle.ide.panels.TraversableContext;

import oracle.javatools.ui.layout.FieldLayoutBuilder;

/**
 * GlassfishPreferences preference page implementation.
 */
final class GlassfishPreferencesPanel extends DefaultTraversablePanel {
    
    @SuppressWarnings("compatibility:-7732810756608681341")
    private static final long serialVersionUID = 2330820719625959451L;
    
    private JTextField javaHome  = new JTextField();
    
    private JTextField javaArgs  = new JTextField();
    
    private JTextField glassfishAdmin   = new JTextField();
    
    private JTextField glassfishHome    = new JTextField();

    private JTextField glassfishArgs    = new JTextField();
    
    private JTextField domainName       = new JTextField();

    private JTextField domainHost       = new JTextField();

    private JTextField domainUsername   = new JTextField();
    
    private JTextField domainPassword   = new JTextField();
    
    private JTextField domainPortHTTP   = new JTextField();
    
    private JTextField domainPortRMI    = new JTextField();
    
    private JTextField domainPortADM    = new JTextField();
    
    private JCheckBox  domainEnableSSL  = new JCheckBox();
    
    public GlassfishPreferencesPanel() {
        
        FieldLayoutBuilder flb = new FieldLayoutBuilder(this);
        flb.addHintText("Insert the complete path to Glassfish home directory.");
        flb.add(flb.field().label().withText("Java Home:").component(javaHome));
        flb.add(flb.field().label().withText("Java Args:").component(javaArgs));
        
        flb.add(flb.field().label().withText("Glassfish Admin Directory:").component(glassfishAdmin));
        flb.add(flb.field().label().withText("Glassfish Home Directory:").component(glassfishHome));
        flb.add(flb.field().label().withText("Glassfish Args:").component(glassfishArgs));
        
        flb.add(flb.field().label().withText("Domain Name:").component(domainName));
        flb.add(flb.field().label().withText("Domain Host:").component(domainHost));
        flb.add(flb.field().label().withText("Domain HTTP Port:").component(domainPortHTTP));
        flb.add(flb.field().label().withText("Domain Username:").component(domainUsername));
        flb.add(flb.field().label().withText("Domain Password:").component(domainPassword));
        flb.add(flb.field().label().withText("Domain Enable SSL:").component(domainEnableSSL));
        
        flb.add(flb.field().label().withText("Domain RMI Port:").component(domainPortRMI));
        flb.add(flb.field().label().withText("Domain Admin Port:").component(domainPortADM));
        flb.addVerticalSpring();
    }

    public void onEntry(TraversableContext context) {
        final GlassfishDataStructure data = getGlassfishDataStructure(context);
        // TODO populate the controls in GlassfishPreferences from the data model
        String _javaHome = data.getJavaHome();
        if (_javaHome == null || _javaHome.isEmpty()) {
            _javaHome = System.getProperty("java.home");
        }
        javaHome.setText(_javaHome);
        javaArgs.setText(data.getJavaArgs());
       
        glassfishAdmin.setText(data.getGlassfishAdmin());
        glassfishHome.setText(data.getGlassfishHome());
        glassfishArgs.setText(data.getGlassfishArgs());
        
        domainName.setText(data.getDomainName());
        domainHost.setText(data.getDomainHost());
        domainPortHTTP.setText(data.getDomainPortHTTP());
        domainUsername.setText(data.getDomainUsername());
        domainPassword.setText(data.getDomainPassword());
        domainEnableSSL.setSelected(data.getDomainEnableSSL());
        
        domainPortRMI.setText(data.getDomainPortRMI());
        domainPortADM.setText(data.getDomainPortAdmin());
    }

    public void onExit(TraversableContext context) {
        final GlassfishDataStructure data = getGlassfishDataStructure(context);
        // TODO populate the data model from the controls in GlassfishPreferences
        data.setJavaHome(javaHome.getText());
        data.setJavaArgs(javaArgs.getText());
        
        data.setGlassfishAdmin(glassfishAdmin.getText());
        data.setGlassfishHome(glassfishHome.getText());
        data.setGlassfishArgs(glassfishArgs.getText());
        
        data.setDomainName(domainName.getText());
        data.setDomainHost(domainHost.getText());
        data.setDomainPortHTTP(domainPortHTTP.getText());
        data.setDomainUsername(domainUsername.getText());
        data.setDomainPassword(domainPassword.getText());
        data.setDomainEnableSSL(domainEnableSSL.isSelected());
         
        data.setDomainPortRMI(domainPortRMI.getText());
        data.setDomainPortAdmin(domainPortADM.getText());
    }

    private static GlassfishDataStructure getGlassfishDataStructure(TraversableContext tc) {
        return GlassfishDataStructure.getInstance(tc.getPropertyStorage());
    }
}
