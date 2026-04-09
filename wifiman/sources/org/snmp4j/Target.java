package org.snmp4j;

import java.io.Serializable;
import java.util.List;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public interface Target extends Serializable, Cloneable {
    Object clone();

    Target duplicate();

    Address getAddress();

    int getMaxSizeRequestPDU();

    List<TransportMapping<? extends Address>> getPreferredTransports();

    int getRetries();

    int getSecurityLevel();

    int getSecurityModel();

    OctetString getSecurityName();

    long getTimeout();

    int getVersion();

    void setAddress(Address address);

    void setMaxSizeRequestPDU(int i10);

    void setRetries(int i10);

    void setSecurityLevel(int i10);

    void setSecurityModel(int i10);

    void setSecurityName(OctetString octetString);

    void setTimeout(long j10);

    void setVersion(int i10);
}
