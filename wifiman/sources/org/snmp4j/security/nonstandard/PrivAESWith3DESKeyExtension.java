package org.snmp4j.security.nonstandard;

import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.AuthenticationProtocol;
import org.snmp4j.security.PrivAES;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public abstract class PrivAESWith3DESKeyExtension extends PrivAES implements NonStandardSecurityProtocol {
    private static final LogAdapter logger = LogFactory.getLogger(PrivAESWith3DESKeyExtension.class);
    protected OID oid;

    public PrivAESWith3DESKeyExtension(int i10) {
        super(i10);
    }

    @Override // org.snmp4j.security.PrivAES, org.snmp4j.security.PrivacyProtocol
    public byte[] extendShortKey(byte[] bArr, OctetString octetString, byte[] bArr2, AuthenticationProtocol authenticationProtocol) {
        int length = bArr.length;
        byte[] bArr3 = new byte[getMinKeyLength()];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        byte[] bArrPasswordToKey = new byte[getMinKeyLength()];
        System.arraycopy(bArr, 0, bArrPasswordToKey, 0, bArr.length);
        while (length < getMinKeyLength()) {
            bArrPasswordToKey = authenticationProtocol.passwordToKey(new OctetString(bArrPasswordToKey, 0, length), bArr2);
            int iMin = Math.min(getMinKeyLength() - length, authenticationProtocol.getDigestLength());
            System.arraycopy(bArrPasswordToKey, 0, bArr3, length, iMin);
            length += iMin;
        }
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("AES nonstandard key extend produced key " + new OctetString(bArr3).toHexString());
        }
        return bArr3;
    }

    @Override // org.snmp4j.security.PrivacyProtocol, org.snmp4j.security.SecurityProtocol
    public OID getID() {
        OID oid = this.oid;
        return oid == null ? getDefaultID() : oid;
    }

    @Override // org.snmp4j.security.nonstandard.NonStandardSecurityProtocol
    public void setID(OID oid) {
        this.oid = oid;
    }
}
