package org.snmp4j;

import java.io.IOException;
import org.snmp4j.mp.StatusInformation;

/* loaded from: classes2.dex */
public class MessageException extends IOException {
    private static final long serialVersionUID = 7129156393920783825L;
    private int snmp4jErrorStatus;
    private StatusInformation statusInformation;

    public MessageException() {
    }

    public int getSnmp4jErrorStatus() {
        return this.snmp4jErrorStatus;
    }

    public StatusInformation getStatusInformation() {
        return this.statusInformation;
    }

    public void setStatusInformation(StatusInformation statusInformation) {
        this.statusInformation = statusInformation;
    }

    public MessageException(StatusInformation statusInformation) {
        super("" + statusInformation.getErrorIndication());
        setStatusInformation(statusInformation);
    }

    public MessageException(String str) {
        super(str);
    }

    public MessageException(String str, int i10) {
        super(str);
        this.snmp4jErrorStatus = i10;
    }

    public MessageException(String str, int i10, Throwable th2) {
        super(str, th2);
        this.snmp4jErrorStatus = i10;
    }
}
