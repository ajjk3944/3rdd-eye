package org.snmp4j.security.nonstandard;

import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;

/* loaded from: classes2.dex */
public class PrivAES256With3DESKeyExtension extends PrivAESWith3DESKeyExtension implements NonStandardSecurityProtocol {
    public static OID ID = new OID(SnmpConstants.oosnmpUsmAesCfb256ProtocolWith3DESKeyExtension);

    public PrivAES256With3DESKeyExtension() {
        super(32);
    }

    @Override // org.snmp4j.security.nonstandard.NonStandardSecurityProtocol
    public OID getDefaultID() {
        return (OID) ID.clone();
    }
}
