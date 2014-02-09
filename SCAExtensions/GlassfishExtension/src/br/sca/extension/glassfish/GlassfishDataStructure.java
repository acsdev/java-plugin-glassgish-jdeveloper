package br.sca.extension.glassfish;

import oracle.javatools.data.HashStructure;
import oracle.javatools.data.HashStructureAdapter;
import oracle.javatools.data.PropertyStorage;

/**
 * <tt>GlassfishDataStructure</tt> data object.
 */
public final class GlassfishDataStructure extends HashStructureAdapter {
    
    public static final String DATA_KEY = "br.sca.extension.glassfish.GlassfishDataStructure";

    private GlassfishDataStructure(HashStructure hash) {
        super(hash);
    }

    private static String JAVA_HOME             = "JAVA_HOME";
    
    private static String JAVA_ARGS             = "JAVA_ARGS";
    
    private static String GLASSFISH_ADMIN       = "GLASSFISH_ADMIN";
    
    private static String GLASSFISH_HOME        = "GLASSFISH_HOME";

    private static String GLASSFISH_ARGS        = "GLASSFISH_ARGS";

    private static String DOMAIN_NAME           = "DOMAIN_NAME";
    
    private static String DOMAIN_HOST           = "DOMAIN_HOST";
    
    private static String DOMAIN_USERNAME       = "DOMAIN_USERNAME";
    
    private static String DOMAIN_PASSWORD       = "DOMAIN_PASSWORD";
    
    private static String DOMAIN_PORT_HTTP      = "DOMAIN_PORT_HTTP";
    
    private static String DOMAIN_PORT_RMI       = "DOMAIN_PORT_RMI";
    
    private static String DOMAIN_PORT_ADMIN     = "DOMAIN_PORT_ADMIN";

    private static String DOMAIN_ENABLE_SSL     = "DOMAIN_ENABLE_SSL";


    public void setJavaHome(String newValue) {
        _hash.putString(JAVA_HOME, newValue);
    }
    
    public String getJavaHome() {
        return _hash.getString(JAVA_HOME);
    }
    
    public void setJavaArgs(String newValue) {
        _hash.putString(JAVA_HOME, newValue);
    }
    
    public String getJavaArgs() {
        return _hash.getString(JAVA_HOME);
    }
    
    public void setGlassfishAdmin(String glassfishAdmin) {
        _hash.putString(GLASSFISH_ADMIN, glassfishAdmin);
    }
    
    public String getGlassfishAdmin() {
        return _hash.getString(GLASSFISH_ADMIN);
    }
    
    public void setGlassfishHome(String glassfishHome) {
        _hash.putString(GLASSFISH_HOME, glassfishHome);
    }
    
    public String getGlassfishHome() {
        return _hash.getString(GLASSFISH_HOME);
    } 
    
    public void setGlassfishArgs(String newValue) {
        _hash.putString(GLASSFISH_ARGS, newValue);
    }
    
    public String getGlassfishArgs() {
        return _hash.getString(GLASSFISH_ARGS);
    }
    
    public void setDomainName(String newValue) {
        _hash.putString(DOMAIN_NAME, newValue);
    }
    
    public String getDomainName() {
        return _hash.getString(DOMAIN_NAME);
    }
    
    
    public void setDomainHost(String newValue) {
        _hash.putString(DOMAIN_HOST, newValue);
    }
    
    public String getDomainHost() {
        return _hash.getString(DOMAIN_HOST);
    }
    
    public void setDomainUsername(String newValue) {
        _hash.putString(DOMAIN_USERNAME, newValue);
    }
    
    public String getDomainUsername() {
        return _hash.getString(DOMAIN_USERNAME);
    }
    
    public void setDomainPassword(String newValue) {
        _hash.putString(DOMAIN_PASSWORD, newValue);
    }
    
    public String getDomainPassword() {
        return _hash.getString(DOMAIN_PASSWORD);
    }
    
    public void setDomainPortHTTP(String newValue) {
        _hash.putString(DOMAIN_PORT_HTTP, newValue);
    }
    
    public String getDomainPortHTTP() {
        return _hash.getString(DOMAIN_PORT_HTTP);
    }
    
    public void setDomainPortRMI(String newValue) {
        _hash.putString(DOMAIN_PORT_RMI, newValue);
    }
    
    public String getDomainPortRMI() {
        return _hash.getString(DOMAIN_PORT_RMI);
    }
    
    public void setDomainPortAdmin(String newValue) {
        _hash.putString(DOMAIN_PORT_ADMIN, newValue);
    }
    
    public String getDomainPortAdmin() {
        return _hash.getString(DOMAIN_PORT_ADMIN);
    }
    
    public void setDomainEnableSSL(Boolean newValue) {
        _hash.putBoolean(DOMAIN_ENABLE_SSL, newValue);
    }
    
    public Boolean getDomainEnableSSL() {
        return _hash.getBoolean(DOMAIN_ENABLE_SSL);
    }
    
    /**
     * Returns an instance of <tt>GlassfishDataStructure</tt>.
     *
     * @param storage a storage object.
     * @return GlassfishDataStructure
     * @throws NullPointerException if <tt>storage</tt> is <tt>null</tt>.
     */
    public static GlassfishDataStructure getInstance(PropertyStorage storage) {
        return new GlassfishDataStructure(findOrCreate(storage, DATA_KEY));
    }
}
