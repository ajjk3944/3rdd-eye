package org.snmp4j.security.nonstandard;

import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class PrivAES192With3DESKeyExtension extends PrivAESWith3DESKeyExtension implements NonStandardSecurityProtocol {
    public static OID ID = new OID(SnmpConstants.oosnmpUsmAesCfb192ProtocolWith3DESKeyExtension);

    public PrivAES192With3DESKeyExtension() {
        super(24);
    }

    @Override // org.snmp4j.security.nonstandard.NonStandardSecurityProtocol
    public OID getDefaultID() {
        return (OID) ID.clone();
    }
}
