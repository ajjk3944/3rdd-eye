package org.snmp4j;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.smi.AbstractVariable;
import org.snmp4j.smi.OctetString;

/* loaded from: classes2.dex */
public class ScopedPDU extends PDU {
    private static final long serialVersionUID = 4343157159110407279L;
    private OctetString contextEngineID;
    private OctetString contextName;

    public ScopedPDU() {
        this.contextEngineID = new OctetString();
        this.contextName = new OctetString();
    }

    @Override // org.snmp4j.PDU
    public Object clone() {
        return new ScopedPDU(this);
    }

    @Override // org.snmp4j.PDU, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        int iDecodeHeader = BER.decodeHeader(bERInputStream, new BER.MutableByte());
        long position = bERInputStream.getPosition();
        this.contextEngineID.decodeBER(bERInputStream);
        this.contextName.decodeBER(bERInputStream);
        super.decodeBER(bERInputStream);
        if (BER.isCheckSequenceLength()) {
            BER.checkSequenceLength(iDecodeHeader, (int) (bERInputStream.getPosition() - position), this);
        }
    }

    @Override // org.snmp4j.PDU, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeHeader(outputStream, 48, getBERPayloadLength());
        this.contextEngineID.encodeBER(outputStream);
        this.contextName.encodeBER(outputStream);
        super.encodeBER(outputStream);
    }

    @Override // org.snmp4j.PDU
    public boolean equals(Object obj) {
        if (!(obj instanceof ScopedPDU)) {
            return super.equals(obj);
        }
        ScopedPDU scopedPDU = (ScopedPDU) obj;
        return super.equals(obj) && AbstractVariable.equal(this.contextEngineID, scopedPDU.contextEngineID) && AbstractVariable.equal(this.contextName, scopedPDU.contextName);
    }

    @Override // org.snmp4j.PDU, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        int bERPayloadLength = getBERPayloadLength();
        return bERPayloadLength + BER.getBERLengthOfLength(bERPayloadLength) + 1;
    }

    @Override // org.snmp4j.PDU, org.snmp4j.asn1.BERSerializable
    public int getBERPayloadLength() {
        int bERLength = super.getBERLength();
        OctetString octetString = this.contextEngineID;
        int length = octetString == null ? 0 : octetString.length();
        OctetString octetString2 = this.contextName;
        int length2 = octetString2 != null ? octetString2.length() : 0;
        return bERLength + BER.getBERLengthOfLength(length) + 1 + length + BER.getBERLengthOfLength(length2) + 1 + length2;
    }

    public OctetString getContextEngineID() {
        return this.contextEngineID;
    }

    public OctetString getContextName() {
        return this.contextName;
    }

    public void setContextEngineID(OctetString octetString) {
        if (octetString == null) {
            throw new NullPointerException("Context engine ID must not be null");
        }
        this.contextEngineID = octetString;
    }

    public void setContextName(OctetString octetString) {
        if (octetString == null) {
            throw new NullPointerException("Context name must not be null");
        }
        this.contextName = octetString;
    }

    @Override // org.snmp4j.PDU
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(PDU.getTypeString(this.type));
        sb2.append("[{contextEngineID=");
        sb2.append(this.contextEngineID);
        sb2.append(", contextName=");
        sb2.append(this.contextName);
        sb2.append("}, requestID=");
        sb2.append(this.requestID);
        sb2.append(", errorStatus=");
        sb2.append(this.errorStatus);
        sb2.append(", errorIndex=");
        sb2.append(this.errorIndex);
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

    public ScopedPDU(ScopedPDU scopedPDU) {
        super(scopedPDU);
        this.contextEngineID = new OctetString();
        this.contextName = new OctetString();
        this.contextEngineID = (OctetString) scopedPDU.contextEngineID.clone();
        this.contextName = (OctetString) scopedPDU.contextName.clone();
    }
}
