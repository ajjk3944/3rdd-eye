package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.text.ParseException;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.asn1.BERSerializable;

/* loaded from: classes2.dex */
public class VariableBinding implements Serializable, BERSerializable, Cloneable {
    private static final long serialVersionUID = 1032709950031514113L;
    private OID oid;
    private Variable variable;

    public VariableBinding() {
        this.oid = new OID();
        this.variable = Null.instance;
    }

    public static VariableBinding[] createFromOIDs(OID[] oidArr) {
        VariableBinding[] variableBindingArr = new VariableBinding[oidArr.length];
        for (int i10 = 0; i10 < oidArr.length; i10++) {
            variableBindingArr[i10] = new VariableBinding(oidArr[i10]);
        }
        return variableBindingArr;
    }

    public Object clone() {
        return new VariableBinding(this.oid, this.variable);
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public final void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        int iDecodeHeader = BER.decodeHeader(bERInputStream, mutableByte);
        long position = bERInputStream.getPosition();
        if (mutableByte.getValue() != 48) {
            throw new IOException("Invalid sequence encoding: " + ((int) mutableByte.getValue()));
        }
        this.oid.decodeBER(bERInputStream);
        this.variable = AbstractVariable.createFromBER(bERInputStream);
        if (BER.isCheckSequenceLength()) {
            BER.checkSequenceLength(iDecodeHeader, (int) (bERInputStream.getPosition() - position), this);
        }
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public final void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeHeader(outputStream, 48, getBERPayloadLength());
        this.oid.encodeBER(outputStream);
        this.variable.encodeBER(outputStream);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VariableBinding)) {
            return false;
        }
        VariableBinding variableBinding = (VariableBinding) obj;
        return this.oid.equals(variableBinding.getOid()) && this.variable.equals(variableBinding.getVariable());
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public final int getBERLength() {
        int bERPayloadLength = getBERPayloadLength();
        return bERPayloadLength + BER.getBERLengthOfLength(bERPayloadLength) + 1;
    }

    @Override // org.snmp4j.asn1.BERSerializable
    public final int getBERPayloadLength() {
        return this.oid.getBERLength() + this.variable.getBERLength();
    }

    public OID getOid() {
        return this.oid;
    }

    public final int getSyntax() {
        return this.variable.getSyntax();
    }

    public Variable getVariable() {
        return this.variable;
    }

    public int hashCode() {
        return this.oid.hashCode();
    }

    public boolean isException() {
        return this.variable.isException();
    }

    public void setOid(OID oid) {
        if (oid == null) {
            throw new IllegalArgumentException("OID of a VariableBinding must not be null");
        }
        this.oid = (OID) oid.clone();
    }

    public void setVariable(Variable variable) {
        if (variable == null) {
            throw new IllegalArgumentException("Variable of a VariableBinding must not be null");
        }
        this.variable = (Variable) variable.clone();
    }

    public String toString() {
        return SNMP4JSettings.getVariableTextFormat().format(this.oid, this.variable, true);
    }

    public String toValueString() {
        return SNMP4JSettings.getVariableTextFormat().format(this.oid, this.variable, false);
    }

    public VariableBinding(OID oid) {
        setOid(oid);
        this.variable = Null.instance;
    }

    public VariableBinding(OID oid, Variable variable) {
        setOid(oid);
        setVariable(variable);
    }

    public VariableBinding(OID oid, String str) throws ParseException {
        this(oid, SNMP4JSettings.getVariableTextFormat().parse(oid, str));
    }
}
