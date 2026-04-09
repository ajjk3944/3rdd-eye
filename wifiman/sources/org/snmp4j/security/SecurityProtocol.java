package org.snmp4j.security;

import java.io.Serializable;
import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public interface SecurityProtocol extends Serializable {
    OID getID();

    int getMaxKeyLength();

    boolean isSupported();
}
