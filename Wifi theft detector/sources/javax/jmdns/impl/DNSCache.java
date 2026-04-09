package javax.jmdns.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;

/* loaded from: classes4.dex */
public class DNSCache extends ConcurrentHashMap<String, List<DNSEntry>> {
    private static final long serialVersionUID = 3024739453186759259L;

    public DNSCache() {
        this(1024);
    }

    private Collection<? extends DNSEntry> _getDNSEntryList(String str) {
        return get(str != null ? str.toLowerCase() : null);
    }

    public boolean addDNSEntry(DNSEntry dNSEntry) {
        if (dNSEntry == null) {
            return false;
        }
        List<DNSEntry> list = get(dNSEntry.getKey());
        if (list == null) {
            putIfAbsent(dNSEntry.getKey(), new ArrayList());
            list = get(dNSEntry.getKey());
        }
        synchronized (list) {
            list.add(dNSEntry);
        }
        return true;
    }

    public Collection<DNSEntry> allValues() {
        ArrayList arrayList = new ArrayList();
        for (List<DNSEntry> list : values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    @Override // java.util.AbstractMap
    public Object clone() throws CloneNotSupportedException {
        return new DNSCache(this);
    }

    public DNSEntry getDNSEntry(DNSEntry dNSEntry) {
        Collection<? extends DNSEntry> collection_getDNSEntryList;
        DNSEntry dNSEntry2 = null;
        if (dNSEntry == null || (collection_getDNSEntryList = _getDNSEntryList(dNSEntry.getKey())) == null) {
            return null;
        }
        synchronized (collection_getDNSEntryList) {
            try {
                Iterator<? extends DNSEntry> it = collection_getDNSEntryList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DNSEntry next = it.next();
                    if (next.isSameEntry(dNSEntry)) {
                        dNSEntry2 = next;
                        break;
                    }
                }
            } finally {
            }
        }
        return dNSEntry2;
    }

    public Collection<? extends DNSEntry> getDNSEntryList(String str) {
        ArrayList arrayList;
        Collection<? extends DNSEntry> collection_getDNSEntryList = _getDNSEntryList(str);
        if (collection_getDNSEntryList == null) {
            return Collections.EMPTY_LIST;
        }
        synchronized (collection_getDNSEntryList) {
            arrayList = new ArrayList(collection_getDNSEntryList);
        }
        return arrayList;
    }

    public boolean removeDNSEntry(DNSEntry dNSEntry) {
        List<DNSEntry> list;
        if (dNSEntry == null || (list = get(dNSEntry.getKey())) == null) {
            return false;
        }
        synchronized (list) {
            list.remove(dNSEntry);
        }
        return false;
    }

    public boolean replaceDNSEntry(DNSEntry dNSEntry, DNSEntry dNSEntry2) {
        if (dNSEntry == null || dNSEntry2 == null || !dNSEntry.getKey().equals(dNSEntry2.getKey())) {
            return false;
        }
        List<DNSEntry> list = get(dNSEntry.getKey());
        if (list == null) {
            putIfAbsent(dNSEntry.getKey(), new ArrayList());
            list = get(dNSEntry.getKey());
        }
        synchronized (list) {
            list.remove(dNSEntry2);
            list.add(dNSEntry);
        }
        return true;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public synchronized String toString() {
        StringBuffer stringBuffer;
        try {
            stringBuffer = new StringBuffer(2000);
            stringBuffer.append("\t---- cache ----");
            Enumeration enumerationKeys = keys();
            while (enumerationKeys.hasMoreElements()) {
                String str = (String) enumerationKeys.nextElement();
                stringBuffer.append("\n\t\t");
                stringBuffer.append("\n\t\tname '");
                stringBuffer.append(str);
                stringBuffer.append("' ");
                List<DNSEntry> list = (List) get(str);
                if (list == null || list.isEmpty()) {
                    stringBuffer.append(" no entries");
                } else {
                    synchronized (list) {
                        try {
                            for (DNSEntry dNSEntry : list) {
                                stringBuffer.append("\n\t\t\t");
                                stringBuffer.append(dNSEntry.toString());
                            }
                        } finally {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return stringBuffer.toString();
    }

    public DNSCache(DNSCache dNSCache) {
        this(dNSCache != null ? dNSCache.size() : 1024);
        if (dNSCache != null) {
            putAll(dNSCache);
        }
    }

    public DNSCache(int i10) {
        super(i10);
    }

    public DNSEntry getDNSEntry(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass) {
        Collection<? extends DNSEntry> collection_getDNSEntryList = _getDNSEntryList(str);
        DNSEntry dNSEntry = null;
        if (collection_getDNSEntryList == null) {
            return null;
        }
        synchronized (collection_getDNSEntryList) {
            try {
                Iterator<? extends DNSEntry> it = collection_getDNSEntryList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DNSEntry next = it.next();
                    if (next.matchRecordType(dNSRecordType) && next.matchRecordClass(dNSRecordClass)) {
                        dNSEntry = next;
                        break;
                    }
                }
            } finally {
            }
        }
        return dNSEntry;
    }

    public Collection<? extends DNSEntry> getDNSEntryList(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass) {
        ArrayList arrayList;
        Collection<? extends DNSEntry> collection_getDNSEntryList = _getDNSEntryList(str);
        if (collection_getDNSEntryList != null) {
            synchronized (collection_getDNSEntryList) {
                try {
                    arrayList = new ArrayList(collection_getDNSEntryList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        DNSEntry dNSEntry = (DNSEntry) it.next();
                        if (!dNSEntry.matchRecordType(dNSRecordType) || !dNSEntry.matchRecordClass(dNSRecordClass)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }
}
