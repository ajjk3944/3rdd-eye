package org.snmp4j.event;

import java.util.EventObject;
import org.snmp4j.smi.Counter32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;

/* loaded from: classes2.dex */
public class CounterEvent extends EventObject {
    private static final long serialVersionUID = 7916507798848195425L;
    private Variable currentValue;
    private long increment;
    private Object index;
    private OID oid;

    public CounterEvent(Object obj, OID oid) {
        super(obj);
        this.currentValue = new Counter32();
        this.increment = 1L;
        this.oid = oid;
    }

    public Variable getCurrentValue() {
        return this.currentValue;
    }

    public long getIncrement() {
        return this.increment;
    }

    public Object getIndex() {
        return this.index;
    }

    public OID getOid() {
        return this.oid;
    }

    public void setCurrentValue(Variable variable) {
        this.currentValue = variable;
    }

    public void setIncrement(long j10) {
        this.increment = j10;
    }

    @Override // java.util.EventObject
    public String toString() {
        return "CounterEvent{oid=" + this.oid + ", currentValue=" + this.currentValue + ", increment=" + this.increment + ", index=" + this.index + "} " + super.toString();
    }

    public CounterEvent(Object obj, OID oid, long j10) {
        this(obj, oid);
        this.increment = j10;
    }

    public CounterEvent(Object obj, OID oid, Object obj2, long j10) {
        this(obj, oid, j10);
        this.index = obj2;
    }
}
