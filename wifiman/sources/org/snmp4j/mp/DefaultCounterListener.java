package org.snmp4j.mp;

import java.util.Hashtable;
import java.util.Map;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.event.CounterListener;
import org.snmp4j.smi.Counter32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;

/* loaded from: classes2.dex */
public class DefaultCounterListener implements CounterListener {
    private boolean countRegisteredOnly;
    private Map<OID, Counter32> counters = new Hashtable();

    public synchronized Counter32 add(OID oid, Counter32 counter32) {
        try {
            Counter32 counter322 = this.counters.get(oid);
            if (counter322 != null) {
                counter32.setValue(counter32.getValue() + counter322.getValue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.counters.put(oid, counter32);
    }

    @Override // org.snmp4j.event.CounterListener
    public synchronized void incrementCounter(CounterEvent counterEvent) {
        try {
            OID oid = counterEvent.getOid();
            Counter32 counter32 = this.counters.get(oid);
            if (counter32 != null) {
                counter32.increment(counterEvent.getIncrement());
            } else {
                if (this.countRegisteredOnly) {
                    return;
                }
                counter32 = new Counter32(counterEvent.getIncrement());
                this.counters.put(oid, counter32);
            }
            counterEvent.setCurrentValue((Variable) counter32.clone());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean isCountRegisteredOnly() {
        return this.countRegisteredOnly;
    }

    public synchronized Counter32 remove(OID oid) {
        return this.counters.remove(oid);
    }

    public void setCountRegisteredOnly(boolean z10) {
        this.countRegisteredOnly = z10;
    }
}
