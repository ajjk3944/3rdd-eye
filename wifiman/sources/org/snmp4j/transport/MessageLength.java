package org.snmp4j.transport;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class MessageLength implements Serializable {
    private static final long serialVersionUID = -2722178759367760246L;
    private int headerLength;
    private int payloadLength;

    public MessageLength(int i10, int i11) {
        this.payloadLength = i11;
        this.headerLength = i10;
    }

    public int getHeaderLength() {
        return this.headerLength;
    }

    public int getMessageLength() {
        return this.headerLength + this.payloadLength;
    }

    public int getPayloadLength() {
        return this.payloadLength;
    }

    public String toString() {
        return MessageLength.class.getName() + "[headerLength=" + this.headerLength + ",payloadLength=" + this.payloadLength + "]";
    }
}
