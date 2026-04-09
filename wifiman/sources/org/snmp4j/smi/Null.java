package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BER;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class Null extends AbstractVariable {
    private static final long serialVersionUID = 6907924131098190092L;
    private int syntax = 5;
    public static final Null noSuchObject = new Null(128);
    public static final Null noSuchInstance = new Null(129);
    public static final Null endOfMibView = new Null(130);
    public static final Null instance = new Null(5);

    public Null() {
    }

    public static boolean isExceptionSyntax(int i10) {
        switch (i10) {
            case 128:
            case 129:
            case 130:
                return true;
            default:
                return false;
        }
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new Null(this.syntax);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        BER.MutableByte mutableByte = new BER.MutableByte();
        BER.decodeNull(bERInputStream, mutableByte);
        this.syntax = mutableByte.getValue() & 255;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        BER.encodeHeader(outputStream, (byte) getSyntax(), 0);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return (obj instanceof Null) && ((Null) obj).getSyntax() == getSyntax();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        return 2;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return this.syntax;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return getSyntax();
    }

    public void setSyntax(int i10) {
        if (i10 == 5 || isExceptionSyntax(i10)) {
            this.syntax = i10;
            return;
        }
        throw new IllegalArgumentException("Syntax " + i10 + " is incompatible with Null type");
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final int toInt() {
        return getSyntax();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public final long toLong() {
        return getSyntax();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        switch (getSyntax()) {
            case 128:
                return "noSuchObject";
            case 129:
                return "noSuchInstance";
            case 130:
                return "endOfMibView";
            default:
                return "Null";
        }
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        return getSyntax() - variable.getSyntax();
    }

    public Null(int i10) {
        setSyntax(i10);
    }
}
