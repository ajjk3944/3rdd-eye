package org.snmp4j.security;

import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public interface PrivacyProtocol extends SecurityProtocol {
    byte[] decrypt(byte[] bArr, int i10, int i11, byte[] bArr2, long j10, long j11, DecryptParams decryptParams);

    byte[] encrypt(byte[] bArr, int i10, int i11, byte[] bArr2, long j10, long j11, DecryptParams decryptParams);

    byte[] extendShortKey(byte[] bArr, OctetString octetString, byte[] bArr2, AuthenticationProtocol authenticationProtocol);

    int getDecryptParamsLength();

    int getEncryptedLength(int i10);

    @Override // org.snmp4j.security.SecurityProtocol
    OID getID();

    @Override // org.snmp4j.security.SecurityProtocol
    int getMaxKeyLength();

    int getMinKeyLength();
}
