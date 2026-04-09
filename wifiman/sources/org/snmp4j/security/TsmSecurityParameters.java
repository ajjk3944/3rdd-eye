package org.snmp4j.security;

import java.io.IOException;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class TsmSecurityParameters extends OctetString implements SecurityParameters {
    private int decodedLength = -1;
    private int securityParametersPosition;

    @Override // org.snmp4j.smi.OctetString, org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        long position = bERInputStream.getPosition();
        super.decodeBER(bERInputStream);
        this.decodedLength = (int) (bERInputStream.getPosition() - position);
    }

    @Override // org.snmp4j.security.SecurityParameters
    public int getBERMaxLength(int i10) {
        return getBERLength();
    }

    public int getScopedPduPosition() {
        int bERLength;
        int securityParametersPosition = this.decodedLength;
        if (securityParametersPosition >= 0) {
            bERLength = getSecurityParametersPosition();
        } else {
            securityParametersPosition = getSecurityParametersPosition();
            bERLength = getBERLength();
        }
        return securityParametersPosition + bERLength;
    }

    @Override // org.snmp4j.security.SecurityParameters
    public int getSecurityParametersPosition() {
        return this.securityParametersPosition;
    }

    @Override // org.snmp4j.security.SecurityParameters
    public void setSecurityParametersPosition(int i10) {
        this.securityParametersPosition = i10;
    }
}
