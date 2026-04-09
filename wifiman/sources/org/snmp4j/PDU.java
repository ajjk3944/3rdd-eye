package org.snmp4j;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BERSerializable;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.AbstractVariable;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class PDU implements BERSerializable, Serializable {
    public static final int GET = -96;
    public static final int GETBULK = -91;
    public static final int GETNEXT = -95;
    public static final int INFORM = -90;
    public static final int NOTIFICATION = -89;
    public static final int REPORT = -88;
    public static final int RESPONSE = -94;
    public static final int SET = -93;
    public static final int TRAP = -89;
    public static final int V1TRAP = -92;
    public static final int authorizationError = 16;
    public static final int badValue = 3;
    public static final int commitFailed = 14;
    public static final int genErr = 5;
    public static final int inconsistentName = 18;
    public static final int inconsistentValue = 12;
    public static final int noAccess = 6;
    public static final int noCreation = 11;
    public static final int noError = 0;
    public static final int noSuchName = 2;
    public static final int notWritable = 17;
    public static final int readOnly = 4;
    public static final int resourceUnavailable = 13;
    private static final long serialVersionUID = 7607672475629607472L;
    public static final int tooBig = 1;
    public static final int undoFailed = 15;
    public static final int wrongEncoding = 9;
    public static final int wrongLength = 8;
    public static final int wrongType = 7;
    public static final int wrongValue = 10;
    protected Integer32 errorIndex;
    protected Integer32 errorStatus;
    protected Integer32 requestID;
    protected int type;
    protected Vector<VariableBinding> variableBindings;

    public PDU() {
        this.variableBindings = new Vector<>();
        this.errorStatus = new Integer32();
        this.errorIndex = new Integer32();
        this.requestID = new Integer32();
        this.type = -96;
    }

    public static int getTypeFromString(String str) {
        if (str.equals("GET")) {
            return -96;
        }
        if (str.equals("SET")) {
            return -93;
        }
        if (str.equals("GETNEXT")) {
            return -95;
        }
        if (str.equals("GETBULK")) {
            return -91;
        }
        if (str.equals("INFORM")) {
            return -90;
        }
        if (str.equals("RESPONSE")) {
            return -94;
        }
        if (str.equals("TRAP")) {
            return -89;
        }
        if (str.equals("V1TRAP")) {
            return -92;
        }
        if (str.equals("REPORT")) {
            return -88;
        }
        return PduHandle.NONE;
    }

    public static String getTypeString(int i10) {
        switch (i10) {
            case GET /* -96 */:
                return "GET";
            case GETNEXT /* -95 */:
                return "GETNEXT";
            case RESPONSE /* -94 */:
                return "RESPONSE";
            case SET /* -93 */:
                return "SET";
            case V1TRAP /* -92 */:
                return "V1TRAP";
            case GETBULK /* -91 */:
                return "GETBULK";
            case INFORM /* -90 */:
                return "INFORM";
            case -89:
                return "TRAP";
            case REPORT /* -88 */:
                return "REPORT";
            default:
                return "unknown";
        }
    }

    public static String toErrorStatusText(int i10) {
        try {
            return i10 < 0 ? SnmpConstants.SNMP_TP_ERROR_MESSAGES[Math.abs(i10) - 1] : SnmpConstants.SNMP_ERROR_MESSAGES[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return "Unknown error: " + i10;
        }
    }

    public void add(VariableBinding variableBinding) {
        this.variableBindings.add(variableBinding);
    }

    public void addAll(VariableBinding[] variableBindingArr) {
        Vector<VariableBinding> vector = this.variableBindings;
        vector.ensureCapacity(vector.size() + variableBindingArr.length);
        for (VariableBinding variableBinding : variableBindingArr) {
            add(variableBinding);
        }
    }

    public void addAllOIDs(VariableBinding[] variableBindingArr) {
        Vector<VariableBinding> vector = this.variableBindings;
        vector.ensureCapacity(vector.size() + variableBindingArr.length);
        for (VariableBinding variableBinding : variableBindingArr) {
            addOID(variableBinding);
        }
    }

    public void addOID(VariableBinding variableBinding) {
        this.variableBindings.add(new VariableBinding(variableBinding.getOid()));
    }

    public void clear() {
        this.variableBindings.clear();
        setRequestID(new Integer32(0));
    }

    public Object clone() {
        return new PDU(this);
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        int iDecodeHeader = BER.decodeHeader(bERInputStream, mutableByte);
        int position = (int) bERInputStream.getPosition();
        switch (mutableByte.getValue()) {
            case GET /* -96 */:
            case GETNEXT /* -95 */:
            case RESPONSE /* -94 */:
            case SET /* -93 */:
            case GETBULK /* -91 */:
            case INFORM /* -90 */:
            case -89:
            case REPORT /* -88 */:
                this.type = mutableByte.getValue();
                this.requestID.decodeBER(bERInputStream);
                this.errorStatus.decodeBER(bERInputStream);
                this.errorIndex.decodeBER(bERInputStream);
                BER.MutableByte mutableByte2 = new BER.MutableByte();
                int iDecodeHeader2 = BER.decodeHeader(bERInputStream, mutableByte2);
                if (mutableByte2.getValue() != 48) {
                    throw new IOException("Encountered invalid tag, SEQUENCE expected: " + ((int) mutableByte2.getValue()));
                }
                int position2 = (int) bERInputStream.getPosition();
                this.variableBindings = new Vector<>();
                while (true) {
                    long j10 = position2;
                    long j11 = iDecodeHeader2;
                    if (bERInputStream.getPosition() - j10 >= j11) {
                        if (bERInputStream.getPosition() - j10 == j11) {
                            if (BER.isCheckSequenceLength()) {
                                BER.checkSequenceLength(iDecodeHeader, ((int) bERInputStream.getPosition()) - position, this);
                                return;
                            }
                            return;
                        } else {
                            throw new IOException("Length of VB sequence (" + iDecodeHeader2 + ") does not match real length: " + (((int) bERInputStream.getPosition()) - position2));
                        }
                    }
                    VariableBinding variableBinding = new VariableBinding();
                    variableBinding.decodeBER(bERInputStream);
                    this.variableBindings.add(variableBinding);
                }
            case V1TRAP /* -92 */:
            default:
                throw new IOException("Unsupported PDU type: " + ((int) mutableByte.getValue()));
        }
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeHeader(outputStream, this.type, getBERPayloadLengthPDU());
        this.requestID.encodeBER(outputStream);
        this.errorStatus.encodeBER(outputStream);
        this.errorIndex.encodeBER(outputStream);
        Iterator<VariableBinding> it = this.variableBindings.iterator();
        int bERLength = 0;
        while (it.hasNext()) {
            bERLength += it.next().getBERLength();
        }
        BER.encodeHeader(outputStream, 48, bERLength);
        Iterator<VariableBinding> it2 = this.variableBindings.iterator();
        while (it2.hasNext()) {
            it2.next().encodeBER(outputStream);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PDU)) {
            return false;
        }
        PDU pdu = (PDU) obj;
        return this.type == pdu.type && AbstractVariable.equal(this.requestID, pdu.requestID) && AbstractVariable.equal(this.errorStatus, pdu.errorStatus) && AbstractVariable.equal(this.errorIndex, pdu.errorIndex) && this.variableBindings.equals(pdu.variableBindings);
    }

    public VariableBinding get(int i10) {
        return this.variableBindings.get(i10);
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        int bERPayloadLengthPDU = getBERPayloadLengthPDU();
        return bERPayloadLengthPDU + BER.getBERLengthOfLength(bERPayloadLengthPDU) + 1;
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public int getBERPayloadLength() {
        return getBERPayloadLengthPDU();
    }

    protected int getBERPayloadLengthPDU() {
        int bERLength = getBERLength(this.variableBindings);
        return bERLength + BER.getBERLengthOfLength(bERLength) + 1 + new Integer32(this.requestID.getValue()).getBERLength() + this.errorStatus.getBERLength() + this.errorIndex.getBERLength();
    }

    public List<VariableBinding> getBindingList(OID oid) {
        ArrayList arrayList = new ArrayList(this.variableBindings.size());
        Iterator<VariableBinding> it = this.variableBindings.iterator();
        while (it.hasNext()) {
            VariableBinding next = it.next();
            if (next.getOid().startsWith(oid)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int getErrorIndex() {
        return this.errorIndex.getValue();
    }

    public int getErrorStatus() {
        return this.errorStatus.getValue();
    }

    public String getErrorStatusText() {
        return toErrorStatusText(this.errorStatus.getValue());
    }

    public int getMaxRepetitions() {
        return this.errorIndex.getValue();
    }

    public int getNonRepeaters() {
        return this.errorStatus.getValue();
    }

    public Integer32 getRequestID() {
        return this.requestID;
    }

    public int getType() {
        return this.type;
    }

    public Variable getVariable(OID oid) {
        Iterator<VariableBinding> it = this.variableBindings.iterator();
        while (it.hasNext()) {
            VariableBinding next = it.next();
            if (next.getOid().startsWith(oid)) {
                return next.getVariable();
            }
        }
        return null;
    }

    public Vector<? extends VariableBinding> getVariableBindings() {
        return this.variableBindings;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isConfirmedPdu() {
        int i10 = this.type;
        return (i10 == -88 || i10 == -94 || i10 == -89 || i10 == -92) ? false : true;
    }

    public boolean isResponsePdu() {
        int i10 = this.type;
        return i10 == -94 || i10 == -88;
    }

    public void remove(int i10) {
        this.variableBindings.remove(i10);
    }

    public VariableBinding set(int i10, VariableBinding variableBinding) {
        if (variableBinding != null) {
            return this.variableBindings.set(i10, variableBinding);
        }
        throw new NullPointerException("Variable binding must not be null");
    }

    public void setErrorIndex(int i10) {
        this.errorIndex.setValue(i10);
    }

    public void setErrorStatus(int i10) {
        this.errorStatus.setValue(i10);
    }

    public void setMaxRepetitions(int i10) {
        this.errorIndex.setValue(i10);
    }

    public void setNonRepeaters(int i10) {
        this.errorStatus.setValue(i10);
    }

    public void setRequestID(Integer32 integer32) {
        this.requestID = integer32;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public void setVariableBindings(List<? extends VariableBinding> list) {
        list.getClass();
        this.variableBindings = new Vector<>(list);
    }

    public int size() {
        return this.variableBindings.size();
    }

    public VariableBinding[] toArray() {
        VariableBinding[] variableBindingArr = new VariableBinding[this.variableBindings.size()];
        this.variableBindings.toArray(variableBindingArr);
        return variableBindingArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getTypeString(this.type));
        sb2.append("[requestID=");
        sb2.append(this.requestID);
        sb2.append(", errorStatus=");
        sb2.append(getErrorStatusText());
        sb2.append("(");
        sb2.append(this.errorStatus);
        sb2.append(")");
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

    public void trim() {
        if (this.variableBindings.size() > 0) {
            this.variableBindings.remove(r0.size() - 1);
        }
    }

    public static int getBERLength(List<? extends VariableBinding> list) {
        Iterator<? extends VariableBinding> it = list.iterator();
        int bERLength = 0;
        while (it.hasNext()) {
            bERLength += it.next().getBERLength();
        }
        return bERLength;
    }

    public void addAll(List<? extends VariableBinding> list) {
        this.variableBindings.addAll(list);
    }

    public PDU(PDU pdu) {
        this.variableBindings = new Vector<>();
        this.errorStatus = new Integer32();
        this.errorIndex = new Integer32();
        this.requestID = new Integer32();
        this.type = -96;
        this.variableBindings = new Vector<>(pdu.size());
        Iterator<VariableBinding> it = pdu.variableBindings.iterator();
        while (it.hasNext()) {
            this.variableBindings.add((VariableBinding) it.next().clone());
        }
        this.errorIndex = (Integer32) pdu.errorIndex.clone();
        this.errorStatus = (Integer32) pdu.errorStatus.clone();
        this.type = pdu.type;
        Integer32 integer32 = pdu.requestID;
        if (integer32 != null) {
            this.requestID = (Integer32) integer32.clone();
        }
    }

    public PDU(int i10, List<? extends VariableBinding> list) {
        this.variableBindings = new Vector<>();
        this.errorStatus = new Integer32();
        this.errorIndex = new Integer32();
        this.requestID = new Integer32();
        this.type = i10;
        this.variableBindings = new Vector<>(list.size());
        Iterator<? extends VariableBinding> it = list.iterator();
        while (it.hasNext()) {
            this.variableBindings.add((VariableBinding) it.next().clone());
        }
    }
}
