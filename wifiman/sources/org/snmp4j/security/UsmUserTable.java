package org.snmp4j.security;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

/* loaded from: classes2.dex */
public class UsmUserTable implements Serializable {
    private static final LogAdapter logger = LogFactory.getLogger(UsmUserTable.class);
    private static final long serialVersionUID = 6936547777550957622L;
    private Map<UsmUserKey, UsmUserEntry> table = new TreeMap();

    public synchronized UsmUserEntry addUser(UsmUserEntry usmUserEntry) {
        try {
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Adding user " + usmUserEntry.getUserName() + " = " + usmUserEntry.getUsmUser());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.table.put(new UsmUserKey(usmUserEntry), usmUserEntry);
    }

    public synchronized void clear() {
        this.table.clear();
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Cleared UsmUserTable");
        }
    }

    public synchronized UsmUserEntry getUser(OctetString octetString, OctetString octetString2) {
        return this.table.get(new UsmUserKey(octetString, octetString2));
    }

    public synchronized List<UsmUserEntry> getUserEntries(OctetString octetString) {
        LinkedList linkedList;
        try {
            linkedList = new LinkedList();
            for (UsmUserEntry usmUserEntry : this.table.values()) {
                if (octetString.equals(usmUserEntry.getUserName())) {
                    linkedList.add(usmUserEntry);
                }
            }
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Returning user entries for " + octetString + " = " + linkedList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedList;
    }

    public synchronized List<UsmUserEntry> removeAllUsers(OctetString octetString, OctetString octetString2) {
        if (octetString2 != null) {
            UsmUserEntry usmUserEntryRemove = this.table.remove(new UsmUserKey(octetString2, octetString));
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Removed user with secName=" + octetString + " and engineID=" + octetString2);
            }
            return usmUserEntryRemove != null ? Collections.singletonList(usmUserEntryRemove) : Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UsmUserEntry> it = this.table.values().iterator();
        while (it.hasNext()) {
            UsmUserEntry next = it.next();
            if (octetString.equals(next.getUsmUser().getSecurityName())) {
                arrayList.add(next);
                it.remove();
                LogAdapter logAdapter2 = logger;
                if (logAdapter2.isDebugEnabled()) {
                    logAdapter2.debug("Removed user " + next);
                }
            }
        }
        return arrayList;
    }

    public synchronized UsmUserEntry removeUser(OctetString octetString, OctetString octetString2) {
        UsmUserEntry usmUserEntryRemove;
        usmUserEntryRemove = this.table.remove(new UsmUserKey(octetString, octetString2));
        LogAdapter logAdapter = logger;
        if (logAdapter.isDebugEnabled()) {
            logAdapter.debug("Removed user with secName=" + octetString2 + " and engineID=" + octetString);
        }
        return usmUserEntryRemove;
    }

    public synchronized void setUsers(Collection<UsmUserEntry> collection) {
        try {
            LogAdapter logAdapter = logger;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Setting users to " + collection);
            }
            this.table.clear();
            for (UsmUserEntry usmUserEntry : collection) {
                this.table.put(new UsmUserKey(usmUserEntry), usmUserEntry);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized UsmUserEntry getUser(OctetString octetString) {
        return this.table.get(new UsmUserKey(new OctetString(), octetString));
    }

    public static class UsmUserKey implements Comparable {
        OctetString engineID;
        OctetString securityName;

        public UsmUserKey(UsmUserEntry usmUserEntry) {
            setEngineID(usmUserEntry.getEngineID());
            this.securityName = usmUserEntry.getUsmUser().getSecurityName();
        }

        private void setEngineID(OctetString octetString) {
            if (octetString == null) {
                this.engineID = new OctetString();
            } else {
                this.engineID = octetString;
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            OctetString octetString;
            if (obj instanceof UsmUserEntry) {
                return compareTo(new UsmUserKey((UsmUserEntry) obj));
            }
            UsmUserKey usmUserKey = (UsmUserKey) obj;
            OctetString octetString2 = this.engineID;
            int iCompareTo = (octetString2 == null || (octetString = usmUserKey.engineID) == null) ? octetString2 != null ? 1 : usmUserKey.engineID != null ? -1 : 0 : octetString2.compareTo((Variable) octetString);
            return iCompareTo == 0 ? this.securityName.compareTo((Variable) usmUserKey.securityName) : iCompareTo;
        }

        public boolean equals(Object obj) {
            return ((obj instanceof UsmUserEntry) || (obj instanceof UsmUserKey)) && compareTo(obj) == 0;
        }

        public int hashCode() {
            return this.engineID.hashCode() ^ (this.securityName.hashCode() + 2);
        }

        public UsmUserKey(OctetString octetString, OctetString octetString2) {
            setEngineID(octetString);
            this.securityName = octetString2;
        }
    }

    public synchronized List<UsmUserEntry> getUserEntries() {
        LinkedList linkedList;
        linkedList = new LinkedList();
        Iterator<UsmUserEntry> it = this.table.values().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next());
        }
        return linkedList;
    }
}
