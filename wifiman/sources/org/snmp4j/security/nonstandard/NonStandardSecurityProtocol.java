package org.snmp4j.security.nonstandard;

import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public interface NonStandardSecurityProtocol {
    OID getDefaultID();

    void setID(OID oid);
}
