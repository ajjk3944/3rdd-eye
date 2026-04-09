package org.snmp4j.smi;

import org.snmp4j.asn1.BERSerializable;

/* loaded from: classes2.dex */
public interface Variable extends Cloneable, Comparable<Variable>, BERSerializable {
    public static final long serialVersionUID = 1395840752909725320L;

    Object clone();

    @Override // java.lang.Comparable
    int compareTo(Variable variable);

    boolean equals(Object obj);

    void fromSubIndex(OID oid, boolean z10);

    int getSyntax();

    String getSyntaxString();

    int hashCode();

    boolean isDynamic();

    boolean isException();

    int toInt();

    long toLong();

    String toString();

    OID toSubIndex(boolean z10);
}
