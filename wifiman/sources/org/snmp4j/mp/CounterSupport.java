package org.snmp4j.mp;

import java.util.Iterator;
import java.util.Vector;
import org.snmp4j.event.CounterEvent;
import org.snmp4j.event.CounterListener;

/* loaded from: classes2.dex */
public class CounterSupport {
    protected static CounterSupport instance;
    private transient Vector<CounterListener> counterListeners;

    protected CounterSupport() {
    }

    public static CounterSupport getInstance() {
        if (instance == null) {
            instance = new CounterSupport();
        }
        return instance;
    }

    public synchronized void addCounterListener(CounterListener counterListener) {
        try {
            if (this.counterListeners == null) {
                this.counterListeners = new Vector<>(2);
            }
            if (!this.counterListeners.contains(counterListener)) {
                this.counterListeners.add(counterListener);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void fireIncrementCounter(CounterEvent counterEvent) {
        Vector<CounterListener> vector = this.counterListeners;
        if (vector != null) {
            Iterator<CounterListener> it = vector.iterator();
            while (it.hasNext()) {
                it.next().incrementCounter(counterEvent);
            }
        }
    }

    public synchronized void removeCounterListener(CounterListener counterListener) {
        Vector<CounterListener> vector = this.counterListeners;
        if (vector != null && vector.contains(counterListener)) {
            this.counterListeners.removeElement(counterListener);
        }
    }
}
