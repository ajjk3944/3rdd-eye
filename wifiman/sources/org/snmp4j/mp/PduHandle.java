package org.snmp4j.mp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class PduHandle implements Serializable {
    public static final int NONE = Integer.MIN_VALUE;
    private static final long serialVersionUID = -6365764428974409942L;
    private int transactionID = NONE;

    public PduHandle() {
    }

    public void copyFrom(PduHandle pduHandle) {
        setTransactionID(pduHandle.transactionID);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PduHandle) && this.transactionID == ((PduHandle) obj).transactionID;
    }

    public int getTransactionID() {
        return this.transactionID;
    }

    public int hashCode() {
        return this.transactionID;
    }

    public void setTransactionID(int i10) {
        this.transactionID = i10;
    }

    public String toString() {
        return "PduHandle[" + this.transactionID + "]";
    }

    public PduHandle(int i10) {
        setTransactionID(i10);
    }
}
