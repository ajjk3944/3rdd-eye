package org.snmp4j.security;

import java.io.Serializable;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class UsmTimeEntry implements Serializable {
    private static final long serialVersionUID = -8064483016765127449L;
    private int engineBoots;
    private OctetString engineID;
    private int latestReceivedTime;
    private int timeDiff;

    public UsmTimeEntry(OctetString octetString, int i10, int i11) {
        this.engineID = octetString;
        this.engineBoots = i10;
        setEngineTime(i11);
    }

    public int getEngineBoots() {
        return this.engineBoots;
    }

    public OctetString getEngineID() {
        return this.engineID;
    }

    public int getLatestReceivedTime() {
        return this.latestReceivedTime;
    }

    public int getTimeDiff() {
        return this.timeDiff;
    }

    public void setEngineBoots(int i10) {
        this.engineBoots = i10;
    }

    public void setEngineTime(int i10) {
        this.latestReceivedTime = i10;
        this.timeDiff = i10 - ((int) (System.nanoTime() / 1000000000));
    }

    public void setLatestReceivedTime(int i10) {
        this.latestReceivedTime = i10;
    }

    public void setTimeDiff(int i10) {
        this.timeDiff = i10;
    }
}
