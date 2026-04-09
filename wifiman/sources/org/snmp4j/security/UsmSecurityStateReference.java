package org.snmp4j.security;

/* loaded from: classes2.dex */
public class UsmSecurityStateReference implements SecurityStateReference {
    private byte[] authenticationKey;
    private AuthenticationProtocol authenticationProtocol;
    private byte[] privacyKey;
    private PrivacyProtocol privacyProtocol;
    private byte[] securityEngineID;
    private int securityLevel;
    private byte[] securityName;
    private byte[] userName;

    public byte[] getAuthenticationKey() {
        return this.authenticationKey;
    }

    public AuthenticationProtocol getAuthenticationProtocol() {
        return this.authenticationProtocol;
    }

    public byte[] getPrivacyKey() {
        return this.privacyKey;
    }

    public PrivacyProtocol getPrivacyProtocol() {
        return this.privacyProtocol;
    }

    public byte[] getSecurityEngineID() {
        return this.securityEngineID;
    }

    public int getSecurityLevel() {
        return this.securityLevel;
    }

    public byte[] getSecurityName() {
        return this.securityName;
    }

    public byte[] getUserName() {
        return this.userName;
    }

    public void setAuthenticationKey(byte[] bArr) {
        this.authenticationKey = bArr;
    }

    public void setAuthenticationProtocol(AuthenticationProtocol authenticationProtocol) {
        this.authenticationProtocol = authenticationProtocol;
    }

    public void setPrivacyKey(byte[] bArr) {
        this.privacyKey = bArr;
    }

    public void setPrivacyProtocol(PrivacyProtocol privacyProtocol) {
        this.privacyProtocol = privacyProtocol;
    }

    public void setSecurityEngineID(byte[] bArr) {
        this.securityEngineID = bArr;
    }

    public void setSecurityLevel(int i10) {
        this.securityLevel = i10;
    }

    public void setSecurityName(byte[] bArr) {
        this.securityName = bArr;
    }

    public void setUserName(byte[] bArr) {
        this.userName = bArr;
    }
}
