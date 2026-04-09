package org.snmp4j;

import java.util.List;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public abstract class AbstractTarget implements Target {
    private Address address;
    private int maxSizeRequestPDU;
    private List<TransportMapping<? extends Address>> preferredTransports;
    private int retries;
    protected int securityLevel;
    protected int securityModel;
    protected OctetString securityName;
    private long timeout;
    private int version;

    protected AbstractTarget() {
        this.version = 3;
        this.retries = 0;
        this.timeout = 1000L;
        this.maxSizeRequestPDU = 65535;
        this.securityLevel = 1;
        this.securityModel = 3;
        this.securityName = new OctetString();
    }

    @Override // org.snmp4j.Target
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractTarget abstractTarget = (AbstractTarget) obj;
        if (this.version != abstractTarget.version || this.retries != abstractTarget.retries || this.timeout != abstractTarget.timeout || this.maxSizeRequestPDU != abstractTarget.maxSizeRequestPDU || this.securityLevel != abstractTarget.securityLevel || this.securityModel != abstractTarget.securityModel || !this.address.equals(abstractTarget.address)) {
            return false;
        }
        List<TransportMapping<? extends Address>> list = this.preferredTransports;
        if (list == null ? abstractTarget.preferredTransports == null : list.equals(abstractTarget.preferredTransports)) {
            return this.securityName.equals(abstractTarget.securityName);
        }
        return false;
    }

    @Override // org.snmp4j.Target
    public Address getAddress() {
        return this.address;
    }

    @Override // org.snmp4j.Target
    public int getMaxSizeRequestPDU() {
        return this.maxSizeRequestPDU;
    }

    @Override // org.snmp4j.Target
    public List<TransportMapping<? extends Address>> getPreferredTransports() {
        return this.preferredTransports;
    }

    @Override // org.snmp4j.Target
    public int getRetries() {
        return this.retries;
    }

    @Override // org.snmp4j.Target
    public int getSecurityLevel() {
        return this.securityLevel;
    }

    @Override // org.snmp4j.Target
    public int getSecurityModel() {
        return this.securityModel;
    }

    @Override // org.snmp4j.Target
    public final OctetString getSecurityName() {
        return this.securityName;
    }

    @Override // org.snmp4j.Target
    public long getTimeout() {
        return this.timeout;
    }

    @Override // org.snmp4j.Target
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + this.version) * 31) + this.securityName.hashCode();
    }

    @Override // org.snmp4j.Target
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override // org.snmp4j.Target
    public void setMaxSizeRequestPDU(int i10) {
        if (i10 < 484) {
            throw new IllegalArgumentException("The minimum PDU length is: 484");
        }
        this.maxSizeRequestPDU = i10;
    }

    public void setPreferredTransports(List<TransportMapping<? extends Address>> list) {
        this.preferredTransports = list;
    }

    @Override // org.snmp4j.Target
    public void setRetries(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Number of retries < 0");
        }
        this.retries = i10;
    }

    @Override // org.snmp4j.Target
    public void setSecurityLevel(int i10) {
        this.securityLevel = i10;
    }

    @Override // org.snmp4j.Target
    public void setSecurityModel(int i10) {
        this.securityModel = i10;
    }

    @Override // org.snmp4j.Target
    public final void setSecurityName(OctetString octetString) {
        this.securityName = octetString;
    }

    @Override // org.snmp4j.Target
    public void setTimeout(long j10) {
        this.timeout = j10;
    }

    @Override // org.snmp4j.Target
    public void setVersion(int i10) {
        this.version = i10;
    }

    public String toString() {
        return getClass().getName() + "[" + toStringAbstractTarget() + "]";
    }

    protected String toStringAbstractTarget() {
        return "address=" + getAddress() + ",version=" + this.version + ",timeout=" + this.timeout + ",retries=" + this.retries + ",securityLevel=" + this.securityLevel + ",securityModel=" + this.securityModel + ",securityName=" + this.securityName + ",preferredTransports=" + this.preferredTransports;
    }

    protected AbstractTarget(Address address) {
        this.version = 3;
        this.retries = 0;
        this.timeout = 1000L;
        this.maxSizeRequestPDU = 65535;
        this.securityLevel = 1;
        this.securityModel = 3;
        this.securityName = new OctetString();
        this.address = address;
    }

    protected AbstractTarget(Address address, OctetString octetString) {
        this(address);
        this.securityName = octetString;
    }
}
