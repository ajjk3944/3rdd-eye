package org.snmp4j.smi;

import java.io.IOException;
import java.io.OutputStream;
import org.snmp4j.asn1.BERInputStream;

/* loaded from: classes2.dex */
public class VariantVariable extends AbstractVariable implements AssignableFromInteger, AssignableFromLong, AssignableFromString, AssignableFromByteArray {
    private static final long serialVersionUID = -3678564678835871188L;
    private VariantVariableCallback callback;
    private Variable variable;

    public VariantVariable(Variable variable) {
        variable.getClass();
        this.variable = variable;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        updateVariable();
        return new VariantVariable((Variable) this.variable.clone());
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public synchronized void decodeBER(BERInputStream bERInputStream) throws IOException {
        this.variable.decodeBER(bERInputStream);
        variableUpdated();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public synchronized void encodeBER(OutputStream outputStream) throws IOException {
        updateVariable();
        this.variable.encodeBER(outputStream);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public synchronized boolean equals(Object obj) {
        updateVariable();
        return this.variable.equals(obj);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public synchronized void fromSubIndex(OID oid, boolean z10) {
        this.variable.fromSubIndex(oid, z10);
        variableUpdated();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public synchronized int getBERLength() {
        updateVariable();
        return this.variable.getBERLength();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return this.variable.getSyntax();
    }

    public Variable getVariable() {
        return this.variable;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public synchronized int hashCode() {
        updateVariable();
        return this.variable.hashCode();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean isDynamic() {
        return true;
    }

    @Override // org.snmp4j.smi.AssignableFromInteger
    public synchronized void setValue(int i10) {
        Variable variable = this.variable;
        if (!(variable instanceof AssignableFromInteger)) {
            throw new ClassCastException("An integer value cannot be assigned to " + this.variable);
        }
        ((AssignableFromInteger) variable).setValue(i10);
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public synchronized byte[] toByteArray() {
        Variable variable;
        updateVariable();
        variable = this.variable;
        if (!(variable instanceof AssignableFromByteArray)) {
            throw new UnsupportedOperationException();
        }
        return ((AssignableFromByteArray) variable).toByteArray();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public synchronized int toInt() {
        updateVariable();
        return this.variable.toInt();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public synchronized long toLong() {
        updateVariable();
        return this.variable.toLong();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public synchronized String toString() {
        updateVariable();
        return this.variable.toString();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public synchronized OID toSubIndex(boolean z10) {
        updateVariable();
        return this.variable.toSubIndex(z10);
    }

    protected void updateVariable() {
        VariantVariableCallback variantVariableCallback = this.callback;
        if (variantVariableCallback != null) {
            variantVariableCallback.updateVariable(this);
        }
    }

    protected void variableUpdated() {
        VariantVariableCallback variantVariableCallback = this.callback;
        if (variantVariableCallback != null) {
            variantVariableCallback.variableUpdated(this);
        }
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public synchronized int compareTo(Variable variable) {
        updateVariable();
        return this.variable.compareTo(variable);
    }

    public VariantVariable(Variable variable, VariantVariableCallback variantVariableCallback) {
        this(variable);
        this.callback = variantVariableCallback;
    }

    @Override // org.snmp4j.smi.AssignableFromLong
    public synchronized void setValue(long j10) {
        Variable variable = this.variable;
        if (variable instanceof AssignableFromLong) {
            ((AssignableFromLong) variable).setValue(j10);
        } else {
            throw new ClassCastException("A long value cannot be assigned to " + this.variable);
        }
    }

    public synchronized void setValue(OctetString octetString) {
        Variable variable = this.variable;
        if (variable instanceof AssignableFromByteArray) {
            ((AssignableFromByteArray) variable).setValue(octetString.getValue());
        } else {
            throw new ClassCastException("An OctetString value cannot be assigned to " + this.variable);
        }
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public synchronized void setValue(byte[] bArr) {
        Variable variable = this.variable;
        if (variable instanceof AssignableFromByteArray) {
            ((AssignableFromByteArray) variable).setValue(bArr);
        } else {
            throw new ClassCastException("A byte array value cannot be assigned to " + this.variable);
        }
    }

    @Override // org.snmp4j.smi.AssignableFromString
    public synchronized void setValue(String str) {
        Variable variable = this.variable;
        if (variable instanceof AssignableFromString) {
            ((AssignableFromString) variable).setValue(str);
        } else {
            throw new ClassCastException("A string value cannot be assigned to " + this.variable);
        }
    }
}
