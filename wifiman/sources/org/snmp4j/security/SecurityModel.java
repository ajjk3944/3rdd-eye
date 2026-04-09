package org.snmp4j.security;

import java.io.IOException;
import org.snmp4j.TransportStateReference;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BEROutputStream;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public interface SecurityModel {
    public static final int SECURITY_MODEL_ANY = 0;
    public static final int SECURITY_MODEL_SNMPv1 = 1;
    public static final int SECURITY_MODEL_SNMPv2c = 2;
    public static final int SECURITY_MODEL_TSM = 4;
    public static final int SECURITY_MODEL_USM = 3;

    int generateRequestMessage(int i10, byte[] bArr, int i11, int i12, byte[] bArr2, byte[] bArr3, int i13, BERInputStream bERInputStream, SecurityParameters securityParameters, BEROutputStream bEROutputStream, TransportStateReference transportStateReference) throws IOException;

    int generateResponseMessage(int i10, byte[] bArr, int i11, int i12, byte[] bArr2, byte[] bArr3, int i13, BERInputStream bERInputStream, SecurityStateReference securityStateReference, SecurityParameters securityParameters, BEROutputStream bEROutputStream) throws IOException;

    int getID();

    boolean hasAuthoritativeEngineID();

    SecurityParameters newSecurityParametersInstance();

    SecurityStateReference newSecurityStateReference();

    int processIncomingMsg(int i10, int i11, SecurityParameters securityParameters, SecurityModel securityModel, int i12, BERInputStream bERInputStream, TransportStateReference transportStateReference, OctetString octetString, OctetString octetString2, BEROutputStream bEROutputStream, Integer32 integer32, SecurityStateReference securityStateReference, StatusInformation statusInformation) throws IOException;

    boolean supportsEngineIdDiscovery();
}
