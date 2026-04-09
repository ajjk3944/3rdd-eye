package org.xbill.DNS;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class Cache {
    private static final int defaultMaxEntries = 50000;
    private CacheMap data;
    private int dclass;
    private int maxcache;
    private int maxncache;

    public static class CacheMap extends LinkedHashMap {
        private int maxsize;

        public CacheMap(int i10) {
            super(16, 0.75f, true);
            this.maxsize = i10;
        }

        public int getMaxSize() {
            return this.maxsize;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return this.maxsize >= 0 && size() > this.maxsize;
        }

        public void setMaxSize(int i10) {
            this.maxsize = i10;
        }
    }

    public interface Element {
        int compareCredibility(int i10);

        boolean expired();

        int getType();
    }

    public static class NegativeElement implements Element {
        int credibility;
        int expire;
        Name name;
        int type;

        public NegativeElement(Name name, int i10, SOARecord sOARecord, int i11, long j10) {
            this.name = name;
            this.type = i10;
            long minimum = sOARecord != null ? sOARecord.getMinimum() : 0L;
            this.credibility = i11;
            this.expire = Cache.limitExpire(minimum, j10);
        }

        @Override // org.xbill.DNS.Cache.Element
        public final int compareCredibility(int i10) {
            return this.credibility - i10;
        }

        @Override // org.xbill.DNS.Cache.Element
        public final boolean expired() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.expire;
        }

        @Override // org.xbill.DNS.Cache.Element
        public int getType() {
            return this.type;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.type == 0) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("NXDOMAIN ");
                stringBuffer2.append(this.name);
                stringBuffer.append(stringBuffer2.toString());
            } else {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("NXRRSET ");
                stringBuffer3.append(this.name);
                stringBuffer3.append(" ");
                stringBuffer3.append(Type.string(this.type));
                stringBuffer.append(stringBuffer3.toString());
            }
            stringBuffer.append(" cl = ");
            stringBuffer.append(this.credibility);
            return stringBuffer.toString();
        }
    }

    public Cache(int i10) {
        this.maxncache = -1;
        this.maxcache = -1;
        this.dclass = i10;
        this.data = new CacheMap(50000);
    }

    private synchronized void addElement(Name name, Element element) {
        V v10 = this.data.get(name);
        if (v10 == 0) {
            this.data.put(name, element);
            return;
        }
        int type = element.getType();
        if (v10 instanceof List) {
            List list = (List) v10;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (((Element) list.get(i10)).getType() == type) {
                    list.set(i10, element);
                    return;
                }
            }
            list.add(element);
        } else {
            Element element2 = (Element) v10;
            if (element2.getType() == type) {
                this.data.put(name, element);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(element2);
                linkedList.add(element);
                this.data.put(name, linkedList);
            }
        }
    }

    private synchronized Element[] allElements(Object obj) {
        if (!(obj instanceof List)) {
            return new Element[]{(Element) obj};
        }
        List list = (List) obj;
        return (Element[]) list.toArray(new Element[list.size()]);
    }

    private synchronized Object exactName(Name name) {
        return this.data.get(name);
    }

    private synchronized Element findElement(Name name, int i10, int i11) {
        Object objExactName = exactName(name);
        if (objExactName == null) {
            return null;
        }
        return oneElement(name, objExactName, i10, i11);
    }

    private RRset[] findRecords(Name name, int i10, int i11) {
        SetResponse setResponseLookupRecords = lookupRecords(name, i10, i11);
        if (setResponseLookupRecords.isSuccessful()) {
            return setResponseLookupRecords.answers();
        }
        return null;
    }

    private final int getCred(int i10, boolean z10) {
        if (i10 == 1) {
            return z10 ? 4 : 3;
        }
        if (i10 == 2) {
            return z10 ? 4 : 3;
        }
        if (i10 == 3) {
            return 1;
        }
        throw new IllegalArgumentException("getCred: invalid section");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int limitExpire(long j10, long j11) {
        if (j11 >= 0 && j11 < j10) {
            j10 = j11;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + j10;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > TTL.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) jCurrentTimeMillis;
    }

    private static void markAdditional(RRset rRset, Set set) {
        if (rRset.first().getAdditionalName() == null) {
            return;
        }
        Iterator itRrs = rRset.rrs();
        while (itRrs.hasNext()) {
            Name additionalName = ((Record) itRrs.next()).getAdditionalName();
            if (additionalName != null) {
                set.add(additionalName);
            }
        }
    }

    private synchronized Element oneElement(Name name, Object obj, int i10, int i11) {
        Element element;
        try {
            if (i10 == 255) {
                throw new IllegalArgumentException("oneElement(ANY)");
            }
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    element = (Element) list.get(i12);
                    if (element.getType() != i10) {
                    }
                }
                element = null;
            } else {
                element = (Element) obj;
                if (element.getType() != i10) {
                    element = null;
                }
            }
            if (element == null) {
                return null;
            }
            if (element.expired()) {
                removeElement(name, i10);
                return null;
            }
            if (element.compareCredibility(i11) < 0) {
                return null;
            }
            return element;
        } finally {
        }
    }

    private synchronized void removeElement(Name name, int i10) {
        V v10 = this.data.get(name);
        if (v10 == 0) {
            return;
        }
        if (v10 instanceof List) {
            List list = (List) v10;
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (((Element) list.get(i11)).getType() == i10) {
                    list.remove(i11);
                    if (list.size() == 0) {
                        this.data.remove(name);
                    }
                    return;
                }
            }
        } else if (((Element) v10).getType() == i10) {
            this.data.remove(name);
        }
    }

    private synchronized void removeName(Name name) {
        this.data.remove(name);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public org.xbill.DNS.SetResponse addMessage(org.xbill.DNS.Message r20) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xbill.DNS.Cache.addMessage(org.xbill.DNS.Message):org.xbill.DNS.SetResponse");
    }

    public synchronized void addNegative(Name name, int i10, SOARecord sOARecord, int i11) {
        long ttl;
        if (sOARecord != null) {
            try {
                ttl = sOARecord.getTTL();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            ttl = 0;
        }
        Element elementFindElement = findElement(name, i10, 0);
        if (ttl != 0) {
            if (elementFindElement != null && elementFindElement.compareCredibility(i11) <= 0) {
                elementFindElement = null;
            }
            if (elementFindElement == null) {
                addElement(name, new NegativeElement(name, i10, sOARecord, i11, this.maxncache));
            }
        } else if (elementFindElement != null && elementFindElement.compareCredibility(i11) <= 0) {
            removeElement(name, i10);
        }
    }

    public synchronized void addRRset(RRset rRset, int i10) {
        try {
            long ttl = rRset.getTTL();
            Name name = rRset.getName();
            int type = rRset.getType();
            Element elementFindElement = findElement(name, type, 0);
            if (ttl != 0) {
                if (elementFindElement != null && elementFindElement.compareCredibility(i10) <= 0) {
                    elementFindElement = null;
                }
                if (elementFindElement == null) {
                    addElement(name, rRset instanceof CacheRRset ? (CacheRRset) rRset : new CacheRRset(rRset, i10, this.maxcache));
                }
            } else if (elementFindElement != null && elementFindElement.compareCredibility(i10) <= 0) {
                removeElement(name, type);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void addRecord(Record record, int i10, Object obj) {
        try {
            Name name = record.getName();
            int rRsetType = record.getRRsetType();
            if (Type.isRR(rRsetType)) {
                Element elementFindElement = findElement(name, rRsetType, i10);
                if (elementFindElement == null) {
                    addRRset(new CacheRRset(record, i10, this.maxcache), i10);
                } else if (elementFindElement.compareCredibility(i10) == 0 && (elementFindElement instanceof CacheRRset)) {
                    ((CacheRRset) elementFindElement).addRR(record);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clearCache() {
        this.data.clear();
    }

    public RRset[] findAnyRecords(Name name, int i10) {
        return findRecords(name, i10, 2);
    }

    public void flushName(Name name) {
        removeName(name);
    }

    public void flushSet(Name name, int i10) {
        removeElement(name, i10);
    }

    public int getDClass() {
        return this.dclass;
    }

    public int getMaxCache() {
        return this.maxcache;
    }

    public int getMaxEntries() {
        return this.data.getMaxSize();
    }

    public int getMaxNCache() {
        return this.maxncache;
    }

    public int getSize() {
        return this.data.size();
    }

    public synchronized SetResponse lookup(Name name, int i10, int i11) {
        int i12;
        try {
            int iLabels = name.labels();
            int i13 = iLabels;
            while (i13 >= 1) {
                boolean z10 = i13 == 1;
                boolean z11 = i13 == iLabels;
                Name name2 = z10 ? Name.root : z11 ? name : new Name(name, iLabels - i13);
                Object obj = this.data.get(name2);
                if (obj != null) {
                    if (z11 && i10 == 255) {
                        SetResponse setResponse = new SetResponse(6);
                        i12 = 1;
                        int i14 = 0;
                        for (Element element : allElements(obj)) {
                            if (element.expired()) {
                                removeElement(name2, element.getType());
                            } else if ((element instanceof CacheRRset) && element.compareCredibility(i11) >= 0) {
                                setResponse.addRRset((CacheRRset) element);
                                i14++;
                            }
                        }
                        if (i14 > 0) {
                            return setResponse;
                        }
                    } else {
                        i12 = 1;
                        if (z11) {
                            Element elementOneElement = oneElement(name2, obj, i10, i11);
                            if (elementOneElement != null && (elementOneElement instanceof CacheRRset)) {
                                SetResponse setResponse2 = new SetResponse(6);
                                setResponse2.addRRset((CacheRRset) elementOneElement);
                                return setResponse2;
                            }
                            if (elementOneElement != null) {
                                return new SetResponse(2);
                            }
                            Element elementOneElement2 = oneElement(name2, obj, 5, i11);
                            if (elementOneElement2 != null && (elementOneElement2 instanceof CacheRRset)) {
                                return new SetResponse(4, (CacheRRset) elementOneElement2);
                            }
                        } else {
                            Element elementOneElement3 = oneElement(name2, obj, 39, i11);
                            if (elementOneElement3 != null && (elementOneElement3 instanceof CacheRRset)) {
                                return new SetResponse(5, (CacheRRset) elementOneElement3);
                            }
                        }
                    }
                    Element elementOneElement4 = oneElement(name2, obj, 2, i11);
                    if (elementOneElement4 != null && (elementOneElement4 instanceof CacheRRset)) {
                        return new SetResponse(3, (CacheRRset) elementOneElement4);
                    }
                    if (z11 && oneElement(name2, obj, 0, i11) != null) {
                        return SetResponse.ofType(i12);
                    }
                }
                i13--;
            }
            return SetResponse.ofType(0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public SetResponse lookupRecords(Name name, int i10, int i11) {
        return lookup(name, i10, i11);
    }

    public void setMaxCache(int i10) {
        this.maxcache = i10;
    }

    public void setMaxEntries(int i10) {
        this.data.setMaxSize(i10);
    }

    public void setMaxNCache(int i10) {
        this.maxncache = i10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        synchronized (this) {
            try {
                Iterator it = this.data.values().iterator();
                while (it.hasNext()) {
                    for (Element element : allElements(it.next())) {
                        stringBuffer.append(element);
                        stringBuffer.append("\n");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return stringBuffer.toString();
    }

    public static class CacheRRset extends RRset implements Element {
        private static final long serialVersionUID = 5971755205903597024L;
        int credibility;
        int expire;

        public CacheRRset(Record record, int i10, long j10) {
            this.credibility = i10;
            this.expire = Cache.limitExpire(record.getTTL(), j10);
            addRR(record);
        }

        @Override // org.xbill.DNS.Cache.Element
        public final int compareCredibility(int i10) {
            return this.credibility - i10;
        }

        @Override // org.xbill.DNS.Cache.Element
        public final boolean expired() {
            return ((int) (System.currentTimeMillis() / 1000)) >= this.expire;
        }

        @Override // org.xbill.DNS.RRset
        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.toString());
            stringBuffer.append(" cl = ");
            stringBuffer.append(this.credibility);
            return stringBuffer.toString();
        }

        public CacheRRset(RRset rRset, int i10, long j10) {
            super(rRset);
            this.credibility = i10;
            this.expire = Cache.limitExpire(rRset.getTTL(), j10);
        }
    }

    public RRset[] findRecords(Name name, int i10) {
        return findRecords(name, i10, 3);
    }

    public Cache() {
        this(1);
    }

    public Cache(String str) throws IOException {
        this.maxncache = -1;
        this.maxcache = -1;
        this.data = new CacheMap(50000);
        Master master = new Master(str);
        while (true) {
            Record recordNextRecord = master.nextRecord();
            if (recordNextRecord == null) {
                return;
            } else {
                addRecord(recordNextRecord, 0, master);
            }
        }
    }
}
