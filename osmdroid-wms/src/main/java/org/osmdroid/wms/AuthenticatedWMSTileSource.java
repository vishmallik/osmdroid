package org.osmdroid.wms;

import org.osmdroid.tileprovider.tilesource.AuthInfoProvider;

public class AuthenticatedWMSTileSource extends WMSTileSource implements AuthInfoProvider {
    private final String username;
    private final String password;

    public AuthenticatedWMSTileSource(String aName, String[] aBaseUrl,String layername,
                                      String version,String srs, String style,int size,
                                      String username, String password){
        super(aName,aBaseUrl,layername,version,srs,style,size);
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
