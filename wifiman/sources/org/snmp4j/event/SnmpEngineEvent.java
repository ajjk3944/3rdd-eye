package org.snmp4j.event;

import java.util.EventObject;
import org.snmp4j.mp.MPv3;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class SnmpEngineEvent extends EventObject {
    public static final int ADDED_ENGINE_ID = 1;
    public static final int IGNORED_ENGINE_ID = 3;
    public static final int REMOVED_ENGINE_ID = 2;
    private static final long serialVersionUID = -7287039511083410591L;
    private Address engineAddress;
    private OctetString engineID;
    private int type;

    public SnmpEngineEvent(MPv3 mPv3, int i10, OctetString octetString, Address address) {
        super(mPv3);
        this.engineID = octetString;
        this.type = i10;
        this.engineAddress = address;
    }

    public Address getEngineAddress() {
        return this.engineAddress;
    }

    public OctetString getEngineID() {
        return this.engineID;
    }

    public int getType() {
        return this.type;
    }
}
