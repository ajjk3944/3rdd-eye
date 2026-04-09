package com.google.protobuf;

import com.google.protobuf.FieldSet;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class t0 extends AbstractMap {
    private List<com.google.protobuf.t0.e> entryList;
    private boolean isImmutable;
    private volatile com.google.protobuf.t0.c lazyDescendingEntrySet;
    private volatile com.google.protobuf.t0.g lazyEntrySet;
    private final int maxArraySize;
    private Map<Comparable<Object>, Object> overflowEntries;
    private Map<Comparable<Object>, Object> overflowEntriesDescending;

    public class a extends t0 {
        public a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.t0
        public void makeImmutable() {
            if (!isImmutable()) {
                for (int i10 = 0; i10 < getNumArrayEntries(); i10++) {
                    Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i10);
                    if (((FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                        arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                    }
                }
                for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                    if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.makeImmutable();
        }

        @Override // com.google.protobuf.t0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable<Object>) obj, obj2);
        }
    }

    public class b implements Iterator {
        private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
        private int pos;

        private b() {
            this.pos = t0.this.entryList.size();
        }

        private Iterator<Map.Entry<Comparable<Object>, Object>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = t0.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.pos;
            return (i10 > 0 && i10 <= t0.this.entryList.size()) || getOverflowIterator().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Map.Entry<Comparable<Object>, Object> next() {
            if (getOverflowIterator().hasNext()) {
                return getOverflowIterator().next();
            }
            List list = t0.this.entryList;
            int i10 = this.pos - 1;
            this.pos = i10;
            return (Map.Entry) list.get(i10);
        }

        public /* synthetic */ b(t0 t0Var, a aVar) {
            this();
        }
    }

    public class c extends g {
        private c() {
            super(t0.this, null);
        }

        @Override // com.google.protobuf.t0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
            return new b(t0.this, null);
        }

        public /* synthetic */ c(t0 t0Var, a aVar) {
            this();
        }
    }

    public static class d {
        private static final Iterator<Object> ITERATOR = new a();
        private static final Iterable<Object> ITERABLE = new b();

        public class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.ITERATOR;
            }
        }

        private d() {
        }

        public static <T> Iterable<T> iterable() {
            return (Iterable<T>) ITERABLE;
        }
    }

    public class e implements Map.Entry, Comparable {
        private final Comparable<Object> key;
        private Object value;

        public e(t0 t0Var, Map.Entry<Comparable<Object>, Object> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return equals(this.key, entry.getKey()) && equals(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable<Object> comparable = this.key;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.value;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            t0.this.checkMutable();
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }

        public e(Comparable<Object> comparable, Object obj) {
            this.key = comparable;
            this.value = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.protobuf.t0.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public Comparable<Object> getKey() {
            return this.key;
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    public class f implements Iterator {
        private Iterator<Map.Entry<Comparable<Object>, Object>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private f() {
            this.pos = -1;
        }

        private Iterator<Map.Entry<Comparable<Object>, Object>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = t0.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.pos + 1 < t0.this.entryList.size() || (!t0.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.nextCalledBeforeRemove) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.nextCalledBeforeRemove = false;
            t0.this.checkMutable();
            if (this.pos >= t0.this.entryList.size()) {
                getOverflowIterator().remove();
                return;
            }
            t0 t0Var = t0.this;
            int i10 = this.pos;
            this.pos = i10 - 1;
            t0Var.removeArrayEntryAt(i10);
        }

        @Override // java.util.Iterator
        public Map.Entry<Comparable<Object>, Object> next() {
            this.nextCalledBeforeRemove = true;
            int i10 = this.pos + 1;
            this.pos = i10;
            return i10 < t0.this.entryList.size() ? (Map.Entry) t0.this.entryList.get(this.pos) : getOverflowIterator().next();
        }

        public /* synthetic */ f(t0 t0Var, a aVar) {
            this();
        }
    }

    public class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = t0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
            return new f(t0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            t0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t0.this.size();
        }

        public /* synthetic */ g(t0 t0Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<Comparable<Object>, Object> entry) {
            if (contains(entry)) {
                return false;
            }
            t0.this.put(entry.getKey(), entry.getValue());
            return true;
        }
    }

    public /* synthetic */ t0(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int binarySearchInArray(java.lang.Comparable<java.lang.Object> r5) {
        /*
            r4 = this;
            java.util.List<com.google.protobuf.t0.e> r0 = r4.entryList
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<com.google.protobuf.t0.e> r2 = r4.entryList
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.t0$e r2 = (com.google.protobuf.t0.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.protobuf.t0.e> r3 = r4.entryList
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.t0$e r3 = (com.google.protobuf.t0.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.binarySearchInArray(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (this.isImmutable) {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (!this.entryList.isEmpty() || (this.entryList instanceof ArrayList)) {
            return;
        }
        this.entryList = new ArrayList(this.maxArraySize);
    }

    private SortedMap<Comparable<Object>, Object> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    public static <FieldDescriptorType extends FieldSet.FieldDescriptorLite<FieldDescriptorType>> t0 newFieldMap(int i10) {
        return new a(i10);
    }

    public static <K extends Comparable<K>, V> t0 newInstanceForTest(int i10) {
        return new t0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeArrayEntryAt(int i10) {
        checkMutable();
        Object value = this.entryList.remove(i10).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<Comparable<Object>, Object>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (this.overflowEntries.isEmpty()) {
            return;
        }
        this.overflowEntries.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable<Object> comparable = (Comparable) obj;
        return binarySearchInArray(comparable) >= 0 || this.overflowEntries.containsKey(comparable);
    }

    public Set<Map.Entry<Comparable<Object>, Object>> descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new c(this, null);
        }
        return this.lazyDescendingEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Comparable<Object>, Object>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new g(this, null);
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return super.equals(obj);
        }
        t0 t0Var = (t0) obj;
        int size = size();
        if (size != t0Var.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != t0Var.getNumArrayEntries()) {
            return entrySet().equals(t0Var.entrySet());
        }
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            if (!getArrayEntryAt(i10).equals(t0Var.getArrayEntryAt(i10))) {
                return false;
            }
        }
        if (numArrayEntries != size) {
            return this.overflowEntries.equals(t0Var.overflowEntries);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable<Object> comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        return iBinarySearchInArray >= 0 ? this.entryList.get(iBinarySearchInArray).getValue() : this.overflowEntries.get(comparable);
    }

    public Map.Entry<Comparable<Object>, Object> getArrayEntryAt(int i10) {
        return this.entryList.get(i10);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntries() {
        return this.overflowEntries.isEmpty() ? d.iterable() : this.overflowEntries.entrySet();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntriesDescending() {
        return this.overflowEntriesDescending.isEmpty() ? d.iterable() : this.overflowEntriesDescending.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int iHashCode = 0;
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            iHashCode += this.entryList.get(i10).hashCode();
        }
        return getNumOverflowEntries() > 0 ? iHashCode + this.overflowEntries.hashCode() : iHashCode;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        this.overflowEntries = this.overflowEntries.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntries);
        this.overflowEntriesDescending = this.overflowEntriesDescending.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.overflowEntriesDescending);
        this.isImmutable = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        checkMutable();
        Comparable<Object> comparable = (Comparable) obj;
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return removeArrayEntryAt(iBinarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.entryList.size() + this.overflowEntries.size();
    }

    private t0(int i10) {
        this.maxArraySize = i10;
        this.entryList = Collections.EMPTY_LIST;
        Map<Comparable<Object>, Object> map = Collections.EMPTY_MAP;
        this.overflowEntries = map;
        this.overflowEntriesDescending = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Comparable<Object> comparable, Object obj) {
        checkMutable();
        int iBinarySearchInArray = binarySearchInArray(comparable);
        if (iBinarySearchInArray >= 0) {
            return this.entryList.get(iBinarySearchInArray).setValue(obj);
        }
        ensureEntryArrayMutable();
        int i10 = -(iBinarySearchInArray + 1);
        if (i10 >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(comparable, obj);
        }
        int size = this.entryList.size();
        int i11 = this.maxArraySize;
        if (size == i11) {
            e eVarRemove = this.entryList.remove(i11 - 1);
            getOverflowEntriesMutable().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.entryList.add(i10, new e(comparable, obj));
        return null;
    }
}
