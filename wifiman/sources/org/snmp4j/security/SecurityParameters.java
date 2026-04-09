package org.snmp4j.security;

import org.snmp4j.asn1.BERSerializable;

/* loaded from: classes2.dex */
public interface SecurityParameters extends BERSerializable {
    int getBERMaxLength(int i10);

    int getSecurityParametersPosition();

    void setSecurityParametersPosition(int i10);
}
