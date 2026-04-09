package org.snmp4j.security;

import org.snmp4j.TransportStateReference;

/* loaded from: classes2.dex */
public class TsmSecurityStateReference implements SecurityStateReference {
    private TransportStateReference tmStateReference;

    public TransportStateReference getTmStateReference() {
        return this.tmStateReference;
    }

    public void setTmStateReference(TransportStateReference transportStateReference) {
        this.tmStateReference = transportStateReference;
    }

    public String toString() {
        return "TsmSecurityStateReference[tmStateReference=" + this.tmStateReference + ']';
    }
}
