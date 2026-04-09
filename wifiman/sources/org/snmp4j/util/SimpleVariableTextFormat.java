package org.snmp4j.util;

import java.text.ParseException;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.smi.AbstractVariable;
import org.snmp4j.smi.AssignableFromString;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public class SimpleVariableTextFormat implements VariableTextFormat {
    @Override // org.snmp4j.util.VariableTextFormat
    public String format(OID oid, Variable variable, boolean z10) {
        if (!z10) {
            return variable.toString();
        }
        return SNMP4JSettings.getOIDTextFormat().format(oid.getValue()) + " = " + variable;
    }

    @Override // org.snmp4j.util.VariableTextFormat
    public Variable parse(int i10, String str) throws ParseException {
        Variable variableCreateFromSyntax = AbstractVariable.createFromSyntax(i10);
        if (variableCreateFromSyntax instanceof AssignableFromString) {
            ((AssignableFromString) variableCreateFromSyntax).setValue(str);
        }
        return variableCreateFromSyntax;
    }

    @Override // org.snmp4j.util.VariableTextFormat
    public VariableBinding parseVariableBinding(String str) throws ParseException {
        int iIndexOf = str.indexOf(" = ");
        if (iIndexOf > 0) {
            OID oid = new OID(SNMP4JSettings.getOIDTextFormat().parse(str.substring(0, iIndexOf)));
            return new VariableBinding(oid, parse(oid, str.substring(iIndexOf + 3)));
        }
        throw new ParseException("Could not locate assignment ' = ' string in '" + str, 0);
    }

    @Override // org.snmp4j.util.VariableTextFormat
    public Variable parse(OID oid, String str) throws ParseException {
        throw new UnsupportedOperationException();
    }
}
