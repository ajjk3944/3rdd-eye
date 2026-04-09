package org.snmp4j.util;

import org.snmp4j.PDU;
import org.snmp4j.Target;
import org.snmp4j.mp.MessageProcessingModel;

/* loaded from: classes2.dex */
public interface PDUFactory {
    PDU createPDU(Target target);

    PDU createPDU(MessageProcessingModel messageProcessingModel);
}
