package org.snmp4j.util;

import java.text.ParseException;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;

/* loaded from: classes2.dex */
public interface VariableTextFormat {
    String format(OID oid, Variable variable, boolean z10);

    Variable parse(int i10, String str) throws ParseException;

    Variable parse(OID oid, String str) throws ParseException;

    VariableBinding parseVariableBinding(String str) throws ParseException;
}
