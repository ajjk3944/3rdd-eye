package org.snmp4j.security;

import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public interface AuthenticationProtocol extends SecurityProtocol {
    boolean authenticate(byte[] bArr, byte[] bArr2, int i10, int i11, ByteArrayWindow byteArrayWindow);

    byte[] changeDelta(byte[] bArr, byte[] bArr2, byte[] bArr3);

    int getAuthenticationCodeLength();

    int getDigestLength();

    @Override // org.snmp4j.security.SecurityProtocol
    OID getID();

    byte[] hash(byte[] bArr);

    byte[] hash(byte[] bArr, int i10, int i11);

    boolean isAuthentic(byte[] bArr, byte[] bArr2, int i10, int i11, ByteArrayWindow byteArrayWindow);

    byte[] passwordToKey(OctetString octetString, byte[] bArr);
}
