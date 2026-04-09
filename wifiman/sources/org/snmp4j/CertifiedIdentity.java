package org.snmp4j;

import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public interface CertifiedIdentity {
    OctetString getClientFingerprint();

    OctetString getIdentity();

    OctetString getServerFingerprint();
}
