package androidx.datastore.preferences.protobuf;

import f.AbstractC5487d;
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

/* loaded from: classes.dex */
abstract class f0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f30837a;

    /* renamed from: b, reason: collision with root package name */
    private List f30838b;

    /* renamed from: c, reason: collision with root package name */
    private Map f30839c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30840d;

    /* renamed from: e, reason: collision with root package name */
    private volatile g f30841e;

    /* renamed from: f, reason: collision with root package name */
    private Map f30842f;

    /* renamed from: g, reason: collision with root package name */
    private volatile c f30843g;

    static class a extends f0 {
        a(int i10) {
            super(i10, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            AbstractC5487d.a(obj);
            return super.v(null, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.f0
        public void t() {
            if (!s()) {
                if (n() > 0) {
                    AbstractC5487d.a(l(0).getKey());
                    throw null;
                }
                Iterator it = q().iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.t();
        }
    }

    private class c extends g {
        private c() {
            super(f0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.f0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(f0.this, null);
        }

        /* synthetic */ c(f0 f0Var, a aVar) {
            this();
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator f30848a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable f30849b = new b();

        static class a implements Iterator {
            a() {
            }

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

        static class b implements Iterable {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f30848a;
            }
        }

        static Iterable b() {
            return f30849b;
        }
    }

    private class e implements Map.Entry, Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final Comparable f30850a;

        /* renamed from: b, reason: collision with root package name */
        private Object f30851b;

        e(f0 f0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f30850a;
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
            return b(this.f30850a, entry.getKey()) && b(this.f30851b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f30851b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f30850a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f30851b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            f0.this.i();
            Object obj2 = this.f30851b;
            this.f30851b = obj;
            return obj2;
        }

        public String toString() {
            return this.f30850a + "=" + this.f30851b;
        }

        e(Comparable comparable, Object obj) {
            this.f30850a = comparable;
            this.f30851b = obj;
        }
    }

    private class g extends AbstractSet {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            f0.this.v((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = f0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(f0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            f0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f0.this.size();
        }

        /* synthetic */ g(f0 f0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ f0(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int h(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f30838b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f30838b
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.f0$e r2 = (androidx.datastore.preferences.protobuf.f0.e) r2
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
            java.util.List r3 = r4.f30838b
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.f0$e r3 = (androidx.datastore.preferences.protobuf.f0.e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.f0.h(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f30840d) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        i();
        if (!this.f30838b.isEmpty() || (this.f30838b instanceof ArrayList)) {
            return;
        }
        this.f30838b = new ArrayList(this.f30837a);
    }

    private SortedMap r() {
        i();
        if (this.f30839c.isEmpty() && !(this.f30839c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f30839c = treeMap;
            this.f30842f = treeMap.descendingMap();
        }
        return (SortedMap) this.f30839c;
    }

    static f0 u(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object w(int i10) {
        i();
        Object value = ((e) this.f30838b.remove(i10)).getValue();
        if (!this.f30839c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            this.f30838b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f30838b.isEmpty()) {
            this.f30838b.clear();
        }
        if (this.f30839c.isEmpty()) {
            return;
        }
        this.f30839c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f30839c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f30841e == null) {
            this.f30841e = new g(this, null);
        }
        return this.f30841e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return super.equals(obj);
        }
        f0 f0Var = (f0) obj;
        int size = size();
        if (size != f0Var.size()) {
            return false;
        }
        int iN = n();
        if (iN != f0Var.n()) {
            return entrySet().equals(f0Var.entrySet());
        }
        for (int i10 = 0; i10 < iN; i10++) {
            if (!l(i10).equals(f0Var.l(i10))) {
                return false;
            }
        }
        if (iN != size) {
            return this.f30839c.equals(f0Var.f30839c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? ((e) this.f30838b.get(iH)).getValue() : this.f30839c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iN = n();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            iHashCode += ((e) this.f30838b.get(i10)).hashCode();
        }
        return p() > 0 ? iHashCode + this.f30839c.hashCode() : iHashCode;
    }

    Set j() {
        if (this.f30843g == null) {
            this.f30843g = new c(this, null);
        }
        return this.f30843g;
    }

    public Map.Entry l(int i10) {
        return (Map.Entry) this.f30838b.get(i10);
    }

    public int n() {
        return this.f30838b.size();
    }

    public int p() {
        return this.f30839c.size();
    }

    public Iterable q() {
        return this.f30839c.isEmpty() ? d.b() : this.f30839c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return w(iH);
        }
        if (this.f30839c.isEmpty()) {
            return null;
        }
        return this.f30839c.remove(comparable);
    }

    public boolean s() {
        return this.f30840d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f30838b.size() + this.f30839c.size();
    }

    public void t() {
        if (this.f30840d) {
            return;
        }
        this.f30839c = this.f30839c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f30839c);
        this.f30842f = this.f30842f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f30842f);
        this.f30840d = true;
    }

    public Object v(Comparable comparable, Object obj) {
        i();
        int iH = h(comparable);
        if (iH >= 0) {
            return ((e) this.f30838b.get(iH)).setValue(obj);
        }
        k();
        int i10 = -(iH + 1);
        if (i10 >= this.f30837a) {
            return r().put(comparable, obj);
        }
        int size = this.f30838b.size();
        int i11 = this.f30837a;
        if (size == i11) {
            e eVar = (e) this.f30838b.remove(i11 - 1);
            r().put(eVar.getKey(), eVar.getValue());
        }
        this.f30838b.add(i10, new e(comparable, obj));
        return null;
    }

    private class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f30844a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f30845b;

        private b() {
            this.f30844a = f0.this.f30838b.size();
        }

        private Iterator a() {
            if (this.f30845b == null) {
                this.f30845b = f0.this.f30842f.entrySet().iterator();
            }
            return this.f30845b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = f0.this.f30838b;
            int i10 = this.f30844a - 1;
            this.f30844a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f30844a;
            return (i10 > 0 && i10 <= f0.this.f30838b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(f0 f0Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f30853a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30854b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator f30855c;

        private f() {
            this.f30853a = -1;
        }

        private Iterator a() {
            if (this.f30855c == null) {
                this.f30855c = f0.this.f30839c.entrySet().iterator();
            }
            return this.f30855c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f30854b = true;
            int i10 = this.f30853a + 1;
            this.f30853a = i10;
            return i10 < f0.this.f30838b.size() ? (Map.Entry) f0.this.f30838b.get(this.f30853a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f30853a + 1 >= f0.this.f30838b.size()) {
                return !f0.this.f30839c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f30854b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f30854b = false;
            f0.this.i();
            if (this.f30853a >= f0.this.f30838b.size()) {
                a().remove();
                return;
            }
            f0 f0Var = f0.this;
            int i10 = this.f30853a;
            this.f30853a = i10 - 1;
            f0Var.w(i10);
        }

        /* synthetic */ f(f0 f0Var, a aVar) {
            this();
        }
    }

    private f0(int i10) {
        this.f30837a = i10;
        this.f30838b = Collections.emptyList();
        this.f30839c = Collections.emptyMap();
        this.f30842f = Collections.emptyMap();
    }
}
