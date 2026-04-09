package org.snmp4j;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import org.snmp4j.asn1.BER;
import org.snmp4j.smi.AbstractVariable;
import org.snmp4j.smi.Counter64;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.IpAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.TimeTicks;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class PDUv1 extends PDU {
    public static final int AUTHENTICATIONFAILURE = 4;
    public static final int COLDSTART = 0;
    public static final int ENTERPRISE_SPECIFIC = 6;
    public static final int LINKDOWN = 2;
    public static final int LINKUP = 3;
    private static final String OPERATION_NOT_SUPPORTED = "Operation not supported for SNMPv1 PDUs";
    public static final int WARMSTART = 1;
    private static final long serialVersionUID = -6478805117911347898L;
    private IpAddress agentAddress;
    private OID enterprise;
    private Integer32 genericTrap;
    private Integer32 specificTrap;
    private TimeTicks timestamp;

    public PDUv1() {
        this.enterprise = new OID();
        this.agentAddress = new IpAddress("0.0.0.0");
        this.genericTrap = new Integer32(0);
        this.specificTrap = new Integer32(0);
        this.timestamp = new TimeTicks(0L);
        setType(-92);
    }

    private void checkV1TRAP() {
        if (getType() != -92) {
            throw new UnsupportedOperationException("Operation is only supported for SNMPv1 trap PDUs (V1TRAP)");
        }
    }

    protected void checkNull(Variable variable) {
        if (variable == null) {
            throw new NullPointerException("Members of PDUv1 must not be null");
        }
    }

    @Override // org.snmp4j.PDU
    public Object clone() {
        return new PDUv1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (org.snmp4j.SNMP4JSettings.isAllowSNMPv2InV1() != false) goto L10;
     */
    @Override // org.snmp4j.PDU, org.snmp4j.asn1.BERSerializable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void decodeBER(org.snmp4j.asn1.BERInputStream r9) throws java.io.IOException {
        /*
            r8 = this;
            org.snmp4j.asn1.BER$MutableByte r0 = new org.snmp4j.asn1.BER$MutableByte
            r0.<init>()
            int r1 = org.snmp4j.asn1.BER.decodeHeader(r9, r0)
            long r2 = r9.getPosition()
            int r2 = (int) r2
            byte r3 = r0.getValue()
            switch(r3) {
                case -96: goto L38;
                case -95: goto L38;
                case -94: goto L38;
                case -93: goto L38;
                case -92: goto L38;
                case -91: goto L15;
                case -90: goto L16;
                case -89: goto L16;
                default: goto L15;
            }
        L15:
            goto L1d
        L16:
            boolean r3 = org.snmp4j.SNMP4JSettings.isAllowSNMPv2InV1()
            if (r3 == 0) goto L1d
            goto L38
        L1d:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported PDU type: "
            r1.append(r2)
            byte r0 = r0.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L38:
            byte r0 = r0.getValue()
            r8.setType(r0)
            int r0 = r8.getType()
            r3 = -92
            if (r0 != r3) goto L61
            org.snmp4j.smi.OID r0 = r8.enterprise
            r0.decodeBER(r9)
            org.snmp4j.smi.IpAddress r0 = r8.agentAddress
            r0.decodeBER(r9)
            org.snmp4j.smi.Integer32 r0 = r8.genericTrap
            r0.decodeBER(r9)
            org.snmp4j.smi.Integer32 r0 = r8.specificTrap
            r0.decodeBER(r9)
            org.snmp4j.smi.TimeTicks r0 = r8.timestamp
            r0.decodeBER(r9)
            goto L70
        L61:
            org.snmp4j.smi.Integer32 r0 = r8.requestID
            r0.decodeBER(r9)
            org.snmp4j.smi.Integer32 r0 = r8.errorStatus
            r0.decodeBER(r9)
            org.snmp4j.smi.Integer32 r0 = r8.errorIndex
            r0.decodeBER(r9)
        L70:
            org.snmp4j.asn1.BER$MutableByte r0 = new org.snmp4j.asn1.BER$MutableByte
            r0.<init>()
            int r3 = org.snmp4j.asn1.BER.decodeHeader(r9, r0)
            byte r4 = r0.getValue()
            r5 = 48
            if (r4 != r5) goto Ld1
            long r4 = r9.getPosition()
            int r0 = (int) r4
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r8.variableBindings = r4
        L8d:
            long r4 = r9.getPosition()
            long r6 = (long) r0
            long r4 = r4 - r6
            long r6 = (long) r3
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto Lb8
            org.snmp4j.smi.VariableBinding r4 = new org.snmp4j.smi.VariableBinding
            r4.<init>()
            r4.decodeBER(r9)
            org.snmp4j.smi.Variable r5 = r4.getVariable()
            boolean r5 = r8.isVariableV1(r5)
            if (r5 == 0) goto Lb0
            java.util.Vector<org.snmp4j.smi.VariableBinding> r5 = r8.variableBindings
            r5.add(r4)
            goto L8d
        Lb0:
            org.snmp4j.MessageException r9 = new org.snmp4j.MessageException
            java.lang.String r0 = "Counter64 encountered in SNMPv1 PDU (RFC 2576 §4.1.2.1)"
            r9.<init>(r0)
            throw r9
        Lb8:
            boolean r4 = org.snmp4j.asn1.BER.isCheckSequenceLength()
            if (r4 == 0) goto Ld0
            long r4 = r9.getPosition()
            int r4 = (int) r4
            int r4 = r4 - r0
            org.snmp4j.asn1.BER.checkSequenceLength(r3, r4, r8)
            long r3 = r9.getPosition()
            int r9 = (int) r3
            int r9 = r9 - r2
            org.snmp4j.asn1.BER.checkSequenceLength(r1, r9, r8)
        Ld0:
            return
        Ld1:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Encountered invalid tag, SEQUENCE expected: "
            r1.append(r2)
            byte r0 = r0.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.PDUv1.decodeBER(org.snmp4j.asn1.BERInputStream):void");
    }

    @Override // org.snmp4j.PDU, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeHeader(outputStream, this.type, getBERPayloadLength());
        if (this.type == -92) {
            this.enterprise.encodeBER(outputStream);
            this.agentAddress.encodeBER(outputStream);
            this.genericTrap.encodeBER(outputStream);
            this.specificTrap.encodeBER(outputStream);
            this.timestamp.encodeBER(outputStream);
        } else {
            this.requestID.encodeBER(outputStream);
            this.errorStatus.encodeBER(outputStream);
            this.errorIndex.encodeBER(outputStream);
        }
        Iterator<VariableBinding> it = this.variableBindings.iterator();
        int bERLength = 0;
        while (it.hasNext()) {
            bERLength += it.next().getBERLength();
        }
        BER.encodeHeader(outputStream, 48, bERLength);
        Iterator<VariableBinding> it2 = this.variableBindings.iterator();
        while (it2.hasNext()) {
            VariableBinding next = it2.next();
            if (!isVariableV1(next.getVariable())) {
                throw new IOException("Cannot encode Counter64 into a SNMPv1 PDU");
            }
            next.encodeBER(outputStream);
        }
    }

    @Override // org.snmp4j.PDU
    public boolean equals(Object obj) {
        if (!(obj instanceof PDUv1)) {
            return super.equals(obj);
        }
        PDUv1 pDUv1 = (PDUv1) obj;
        return super.equals(obj) && AbstractVariable.equal(this.enterprise, pDUv1.enterprise) && AbstractVariable.equal(this.agentAddress, pDUv1.agentAddress) && AbstractVariable.equal(this.genericTrap, pDUv1.genericTrap) && AbstractVariable.equal(this.specificTrap, pDUv1.specificTrap) && AbstractVariable.equal(this.timestamp, pDUv1.timestamp);
    }

    public IpAddress getAgentAddress() {
        checkV1TRAP();
        return this.agentAddress;
    }

    @Override // org.snmp4j.PDU
    protected int getBERPayloadLengthPDU() {
        if (getType() != -92) {
            return super.getBERPayloadLengthPDU();
        }
        Iterator<VariableBinding> it = this.variableBindings.iterator();
        int bERLength = 0;
        while (it.hasNext()) {
            bERLength += it.next().getBERLength();
        }
        return bERLength + BER.getBERLengthOfLength(bERLength) + 1 + this.agentAddress.getBERLength() + this.enterprise.getBERLength() + this.genericTrap.getBERLength() + this.specificTrap.getBERLength() + this.timestamp.getBERLength();
    }

    public OID getEnterprise() {
        checkV1TRAP();
        return this.enterprise;
    }

    public int getGenericTrap() {
        checkV1TRAP();
        return this.genericTrap.getValue();
    }

    @Override // org.snmp4j.PDU
    public int getMaxRepetitions() {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    public int getSpecificTrap() {
        checkV1TRAP();
        return this.specificTrap.getValue();
    }

    public long getTimestamp() {
        checkV1TRAP();
        return this.timestamp.getValue();
    }

    protected boolean isVariableV1(Variable variable) {
        return !(variable instanceof Counter64) || SNMP4JSettings.isAllowSNMPv2InV1();
    }

    public void setAgentAddress(IpAddress ipAddress) {
        checkV1TRAP();
        checkNull(ipAddress);
        this.agentAddress = ipAddress;
    }

    public void setEnterprise(OID oid) {
        checkV1TRAP();
        checkNull(oid);
        this.enterprise = (OID) oid.clone();
    }

    public void setGenericTrap(int i10) {
        checkV1TRAP();
        this.genericTrap.setValue(i10);
    }

    @Override // org.snmp4j.PDU
    public void setMaxRepetitions(int i10) {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    public void setMaxSizeScopedPDU(int i10) {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    @Override // org.snmp4j.PDU
    public void setNonRepeaters(int i10) {
        throw new UnsupportedOperationException(OPERATION_NOT_SUPPORTED);
    }

    public void setSpecificTrap(int i10) {
        checkV1TRAP();
        this.specificTrap.setValue(i10);
    }

    public void setTimestamp(long j10) {
        checkV1TRAP();
        this.timestamp.setValue(j10);
    }

    @Override // org.snmp4j.PDU
    public String toString() {
        if (this.type != -92) {
            return super.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(PDU.getTypeString(this.type));
        sb2.append("[reqestID=");
        sb2.append(this.requestID);
        sb2.append(",timestamp=");
        sb2.append(this.timestamp);
        sb2.append(",enterprise=");
        sb2.append(this.enterprise);
        sb2.append(",genericTrap=");
        sb2.append(this.genericTrap);
        sb2.append(",specificTrap=");
        sb2.append(this.specificTrap);
        sb2.append(", VBS[");
        int i10 = 0;
        while (i10 < this.variableBindings.size()) {
            sb2.append(this.variableBindings.get(i10));
            i10++;
            if (i10 < this.variableBindings.size()) {
                sb2.append("; ");
            }
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public PDUv1(PDUv1 pDUv1) {
        super(pDUv1);
        this.enterprise = new OID();
        this.agentAddress = new IpAddress("0.0.0.0");
        this.genericTrap = new Integer32(0);
        this.specificTrap = new Integer32(0);
        this.timestamp = new TimeTicks(0L);
        this.enterprise = (OID) pDUv1.enterprise.clone();
        this.agentAddress = (IpAddress) pDUv1.agentAddress.clone();
        this.genericTrap = (Integer32) pDUv1.genericTrap.clone();
        this.specificTrap = (Integer32) pDUv1.specificTrap.clone();
        this.timestamp = (TimeTicks) pDUv1.timestamp.clone();
    }
}
