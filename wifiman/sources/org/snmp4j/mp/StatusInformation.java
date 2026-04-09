package org.snmp4j.mp;

import java.io.Serializable;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class StatusInformation implements Serializable {
    private static final long serialVersionUID = 9053403603288070071L;
    private byte[] contextEngineID;
    private byte[] contextName;
    private VariableBinding errorIndication;
    private Integer32 securityLevel;

    public StatusInformation() {
    }

    public byte[] getContextEngineID() {
        return this.contextEngineID;
    }

    public byte[] getContextName() {
        return this.contextName;
    }

    public VariableBinding getErrorIndication() {
        return this.errorIndication;
    }

    public Integer32 getSecurityLevel() {
        return this.securityLevel;
    }

    public void setContextEngineID(byte[] bArr) {
        this.contextEngineID = bArr;
    }

    public void setContextName(byte[] bArr) {
        this.contextName = bArr;
    }

    public void setErrorIndication(VariableBinding variableBinding) {
        this.errorIndication = variableBinding;
    }

    public void setSecurityLevel(Integer32 integer32) {
        this.securityLevel = integer32;
    }

    public String toString() {
        VariableBinding variableBinding = this.errorIndication;
        return variableBinding == null ? "noError" : variableBinding.toString();
    }

    public StatusInformation(VariableBinding variableBinding, byte[] bArr, byte[] bArr2, Integer32 integer32) {
        this.errorIndication = variableBinding;
        this.contextName = bArr;
        this.contextEngineID = bArr2;
        this.securityLevel = integer32;
    }
}
