package org.snmp4j.smi;

/* loaded from: classes2.dex */
public abstract class ReadonlyVariableCallback implements VariantVariableCallback {
    @Override // org.snmp4j.smi.VariantVariableCallback
    public abstract void updateVariable(VariantVariable variantVariable);

    @Override // org.snmp4j.smi.VariantVariableCallback
    public final void variableUpdated(VariantVariable variantVariable) {
    }
}
