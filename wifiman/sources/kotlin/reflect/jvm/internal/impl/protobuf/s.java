package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* loaded from: classes4.dex */
abstract class s extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f52019a;

    /* renamed from: b, reason: collision with root package name */
    private List f52020b;

    /* renamed from: c, reason: collision with root package name */
    private Map f52021c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f52022d;

    /* renamed from: e, reason: collision with root package name */
    private volatile e f52023e;

    static class a extends s {
        a(int i10) {
            super(i10, null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((g.b) obj, obj2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.s
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry entryJ = j(i10);
                    if (((g.b) entryJ.getKey()).m()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry entry : l()) {
                    if (((g.b) entry.getKey()).m()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator f52024a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable f52025b = new C1923b();

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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b$b, reason: collision with other inner class name */
        static class C1923b implements Iterable {
            C1923b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f52024a;
            }
        }

        static Iterable b() {
            return f52025b;
        }
    }

    private class c implements Comparable, Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        private final Comparable f52026a;

        /* renamed from: b, reason: collision with root package name */
        private Object f52027b;

        c(s sVar, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f52026a;
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
            return b(this.f52026a, entry.getKey()) && b(this.f52027b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f52027b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f52026a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f52027b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            s.this.h();
            Object obj2 = this.f52027b;
            this.f52027b = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f52026a);
            String strValueOf2 = String.valueOf(this.f52027b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        c(Comparable comparable, Object obj) {
            this.f52026a = comparable;
            this.f52027b = obj;
        }
    }

    private class e extends AbstractSet {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            s.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            s.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(s.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            s.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return s.this.size();
        }

        /* synthetic */ e(s sVar, a aVar) {
            this();
        }
    }

    /* synthetic */ s(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int g(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f52020b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f52020b
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r2 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r2
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
            java.util.List r3 = r4.f52020b
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r3 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r3
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.s.g(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f52022d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        h();
        if (!this.f52020b.isEmpty() || (this.f52020b instanceof ArrayList)) {
            return;
        }
        this.f52020b = new ArrayList(this.f52019a);
    }

    private SortedMap n() {
        h();
        if (this.f52021c.isEmpty() && !(this.f52021c instanceof TreeMap)) {
            this.f52021c = new TreeMap();
        }
        return (SortedMap) this.f52021c;
    }

    static s r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object t(int i10) {
        h();
        Object value = ((c) this.f52020b.remove(i10)).getValue();
        if (!this.f52021c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f52020b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f52020b.isEmpty()) {
            this.f52020b.clear();
        }
        if (this.f52021c.isEmpty()) {
            return;
        }
        this.f52021c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f52021c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f52023e == null) {
            this.f52023e = new e(this, null);
        }
        return this.f52023e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((c) this.f52020b.get(iG)).getValue() : this.f52021c.get(comparable);
    }

    public Map.Entry j(int i10) {
        return (Map.Entry) this.f52020b.get(i10);
    }

    public int k() {
        return this.f52020b.size();
    }

    public Iterable l() {
        return this.f52021c.isEmpty() ? b.b() : this.f52021c.entrySet();
    }

    public boolean p() {
        return this.f52022d;
    }

    public void q() {
        if (this.f52022d) {
            return;
        }
        this.f52021c = this.f52021c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f52021c);
        this.f52022d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return t(iG);
        }
        if (this.f52021c.isEmpty()) {
            return null;
        }
        return this.f52021c.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((c) this.f52020b.get(iG)).setValue(obj);
        }
        i();
        int i10 = -(iG + 1);
        if (i10 >= this.f52019a) {
            return n().put(comparable, obj);
        }
        int size = this.f52020b.size();
        int i11 = this.f52019a;
        if (size == i11) {
            c cVar = (c) this.f52020b.remove(i11 - 1);
            n().put(cVar.getKey(), cVar.getValue());
        }
        this.f52020b.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f52020b.size() + this.f52021c.size();
    }

    private class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        private int f52029a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f52030b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator f52031c;

        private d() {
            this.f52029a = -1;
        }

        private Iterator a() {
            if (this.f52031c == null) {
                this.f52031c = s.this.f52021c.entrySet().iterator();
            }
            return this.f52031c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f52030b = true;
            int i10 = this.f52029a + 1;
            this.f52029a = i10;
            return i10 < s.this.f52020b.size() ? (Map.Entry) s.this.f52020b.get(this.f52029a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52029a + 1 < s.this.f52020b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f52030b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f52030b = false;
            s.this.h();
            if (this.f52029a >= s.this.f52020b.size()) {
                a().remove();
                return;
            }
            s sVar = s.this;
            int i10 = this.f52029a;
            this.f52029a = i10 - 1;
            sVar.t(i10);
        }

        /* synthetic */ d(s sVar, a aVar) {
            this();
        }
    }

    private s(int i10) {
        this.f52019a = i10;
        this.f52020b = Collections.emptyList();
        this.f52021c = Collections.emptyMap();
    }
}
