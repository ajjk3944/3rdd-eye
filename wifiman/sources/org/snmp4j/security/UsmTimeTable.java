package org.snmp4j.security;

import java.io.Serializable;
import java.util.Hashtable;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

/* loaded from: classes2.dex */
public class UsmTimeTable implements Serializable {
    static final long TIME_PRECISION = 1000000000;
    private static final LogAdapter logger = LogFactory.getLogger(UsmTimeTable.class);
    private static final long serialVersionUID = -1538321547688349797L;
    private UsmTimeEntry localTime;
    private Hashtable<Variable, UsmTimeEntry> table = new Hashtable<>(10);
    private long lastLocalTimeChange = System.nanoTime();

    public UsmTimeTable(OctetString octetString, int i10) {
        setLocalTime(new UsmTimeEntry(octetString, i10, 0));
    }

    public void addEntry(UsmTimeEntry usmTimeEntry) {
        this.table.put(usmTimeEntry.getEngineID(), usmTimeEntry);
    }

    public synchronized int checkEngineID(OctetString octetString, boolean z10, int i10, int i11) {
        if (this.table.get(octetString) != null) {
            return 0;
        }
        if (!z10) {
            return SnmpConstants.SNMPv3_USM_UNKNOWN_ENGINEID;
        }
        addEntry(new UsmTimeEntry(octetString, i10, i11));
        return 0;
    }

    public synchronized int checkTime(UsmTimeEntry usmTimeEntry) {
        String str;
        int iNanoTime = (int) (System.nanoTime() / TIME_PRECISION);
        if (!this.localTime.getEngineID().equals(usmTimeEntry.getEngineID())) {
            UsmTimeEntry usmTimeEntry2 = this.table.get(usmTimeEntry.getEngineID());
            if (usmTimeEntry2 == null) {
                return SnmpConstants.SNMPv3_USM_UNKNOWN_ENGINEID;
            }
            if (usmTimeEntry.getEngineBoots() > usmTimeEntry2.getEngineBoots() || (usmTimeEntry.getEngineBoots() == usmTimeEntry2.getEngineBoots() && usmTimeEntry.getLatestReceivedTime() > usmTimeEntry2.getLatestReceivedTime())) {
                usmTimeEntry2.setEngineBoots(usmTimeEntry.getEngineBoots());
                usmTimeEntry2.setLatestReceivedTime(usmTimeEntry.getLatestReceivedTime());
                usmTimeEntry2.setTimeDiff(usmTimeEntry.getLatestReceivedTime() - iNanoTime);
            }
            if (usmTimeEntry.getEngineBoots() >= usmTimeEntry2.getEngineBoots() && ((usmTimeEntry.getEngineBoots() != usmTimeEntry2.getEngineBoots() || usmTimeEntry2.getLatestReceivedTime() <= usmTimeEntry.getLatestReceivedTime() + 150) && usmTimeEntry2.getEngineBoots() != Integer.MAX_VALUE)) {
                LogAdapter logAdapter = logger;
                if (logAdapter.isDebugEnabled()) {
                    logAdapter.debug("CheckTime: time ok (non authoritative)");
                }
                return 0;
            }
            LogAdapter logAdapter2 = logger;
            if (logAdapter2.isDebugEnabled()) {
                logAdapter2.debug("CheckTime: received message outside time window (non authoritative)");
            }
            return SnmpConstants.SNMPv3_USM_NOT_IN_TIME_WINDOW;
        }
        if (this.localTime.getEngineBoots() != Integer.MAX_VALUE && this.localTime.getEngineBoots() == usmTimeEntry.getEngineBoots() && Math.abs((this.localTime.getTimeDiff() + iNanoTime) - usmTimeEntry.getLatestReceivedTime()) <= 150) {
            LogAdapter logAdapter3 = logger;
            if (logAdapter3.isDebugEnabled()) {
                logAdapter3.debug("CheckTime: time ok (authoritative)");
            }
            return 0;
        }
        LogAdapter logAdapter4 = logger;
        if (logAdapter4.isDebugEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CheckTime: received message outside time window (authoritative):");
            if (this.localTime.getEngineBoots() != usmTimeEntry.getEngineBoots()) {
                str = "engineBoots differ " + this.localTime.getEngineBoots() + "!=" + usmTimeEntry.getEngineBoots();
            } else {
                str = "" + Math.abs((iNanoTime + this.localTime.getTimeDiff()) - usmTimeEntry.getLatestReceivedTime()) + " > 150";
            }
            sb2.append(str);
            logAdapter4.debug(sb2.toString());
        }
        return SnmpConstants.SNMPv3_USM_NOT_IN_TIME_WINDOW;
    }

    public int getEngineBoots() {
        return this.localTime.getEngineBoots();
    }

    public int getEngineTime() {
        return (int) ((((System.nanoTime() - this.lastLocalTimeChange) / TIME_PRECISION) + this.localTime.getLatestReceivedTime()) % 2147483648L);
    }

    public UsmTimeEntry getEntry(OctetString octetString) {
        return this.table.get(octetString);
    }

    public UsmTimeEntry getLocalTime() {
        UsmTimeEntry usmTimeEntry = new UsmTimeEntry(this.localTime.getEngineID(), this.localTime.getEngineBoots(), getEngineTime());
        usmTimeEntry.setTimeDiff((usmTimeEntry.getTimeDiff() * (-1)) + this.localTime.getTimeDiff());
        return usmTimeEntry;
    }

    public synchronized UsmTimeEntry getTime(OctetString octetString) {
        if (this.localTime.getEngineID().equals(octetString)) {
            return getLocalTime();
        }
        UsmTimeEntry usmTimeEntry = this.table.get(octetString);
        if (usmTimeEntry == null) {
            return null;
        }
        return new UsmTimeEntry(octetString, usmTimeEntry.getEngineBoots(), usmTimeEntry.getTimeDiff() + ((int) (System.nanoTime() / TIME_PRECISION)));
    }

    public void removeEntry(OctetString octetString) {
        this.table.remove(octetString);
    }

    public void reset() {
    }

    public void setEngineBoots(int i10) {
        this.localTime.setEngineBoots(i10);
    }

    public void setLocalTime(UsmTimeEntry usmTimeEntry) {
        this.localTime = usmTimeEntry;
        this.lastLocalTimeChange = System.nanoTime();
    }
}
