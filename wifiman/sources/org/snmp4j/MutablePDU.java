package org.snmp4j;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class MutablePDU implements Serializable {
    private static final long serialVersionUID = 2511133364341663087L;
    private PDU pdu;

    public PDU getPdu() {
        return this.pdu;
    }

    public void setPdu(PDU pdu) {
        this.pdu = pdu;
    }
}
