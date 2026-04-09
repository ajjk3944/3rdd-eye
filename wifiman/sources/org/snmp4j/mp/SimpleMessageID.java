package org.snmp4j.mp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class SimpleMessageID implements MessageID, Serializable {
    private static final long serialVersionUID = 6301818691474165283L;
    private int messageID;

    public SimpleMessageID(int i10) {
        this.messageID = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.messageID == ((SimpleMessageID) obj).messageID;
    }

    @Override // org.snmp4j.mp.MessageID
    public int getID() {
        return this.messageID;
    }

    public int hashCode() {
        return this.messageID;
    }

    public String toString() {
        return Integer.toString(this.messageID);
    }
}
