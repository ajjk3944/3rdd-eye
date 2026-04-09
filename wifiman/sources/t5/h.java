package t5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class h extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f61764i = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Comparator f61765a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61766b;

    /* renamed from: c, reason: collision with root package name */
    e f61767c;

    /* renamed from: d, reason: collision with root package name */
    int f61768d;

    /* renamed from: e, reason: collision with root package name */
    int f61769e;

    /* renamed from: f, reason: collision with root package name */
    final e f61770f;

    /* renamed from: g, reason: collision with root package name */
    private b f61771g;

    /* renamed from: h, reason: collision with root package name */
    private c f61772h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.h((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarH;
            if (!(obj instanceof Map.Entry) || (eVarH = h.this.h((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.n(eVarH, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f61768d;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f61786f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.p(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f61768d;
        }
    }

    private abstract class d implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        e f61777a;

        /* renamed from: b, reason: collision with root package name */
        e f61778b = null;

        /* renamed from: c, reason: collision with root package name */
        int f61779c;

        d() {
            this.f61777a = h.this.f61770f.f61784d;
            this.f61779c = h.this.f61769e;
        }

        final e a() {
            e eVar = this.f61777a;
            h hVar = h.this;
            if (eVar == hVar.f61770f) {
                throw new NoSuchElementException();
            }
            if (hVar.f61769e != this.f61779c) {
                throw new ConcurrentModificationException();
            }
            this.f61777a = eVar.f61784d;
            this.f61778b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f61777a != h.this.f61770f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f61778b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.n(eVar, true);
            this.f61778b = null;
            this.f61779c = h.this.f61769e;
        }
    }

    public h() {
        this(f61764i, true);
    }

    private static boolean d(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void l(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f61782b;
            e eVar3 = eVar.f61783c;
            int i10 = eVar2 != null ? eVar2.f61789i : 0;
            int i11 = eVar3 != null ? eVar3.f61789i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f61782b;
                e eVar5 = eVar3.f61783c;
                int i13 = (eVar4 != null ? eVar4.f61789i : 0) - (eVar5 != null ? eVar5.f61789i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    s(eVar);
                } else {
                    t(eVar3);
                    s(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f61782b;
                e eVar7 = eVar2.f61783c;
                int i14 = (eVar6 != null ? eVar6.f61789i : 0) - (eVar7 != null ? eVar7.f61789i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    t(eVar);
                } else {
                    s(eVar2);
                    t(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f61789i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f61789i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f61781a;
        }
    }

    private void r(e eVar, e eVar2) {
        e eVar3 = eVar.f61781a;
        eVar.f61781a = null;
        if (eVar2 != null) {
            eVar2.f61781a = eVar3;
        }
        if (eVar3 == null) {
            this.f61767c = eVar2;
        } else if (eVar3.f61782b == eVar) {
            eVar3.f61782b = eVar2;
        } else {
            eVar3.f61783c = eVar2;
        }
    }

    private void s(e eVar) {
        e eVar2 = eVar.f61782b;
        e eVar3 = eVar.f61783c;
        e eVar4 = eVar3.f61782b;
        e eVar5 = eVar3.f61783c;
        eVar.f61783c = eVar4;
        if (eVar4 != null) {
            eVar4.f61781a = eVar;
        }
        r(eVar, eVar3);
        eVar3.f61782b = eVar;
        eVar.f61781a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f61789i : 0, eVar4 != null ? eVar4.f61789i : 0) + 1;
        eVar.f61789i = iMax;
        eVar3.f61789i = Math.max(iMax, eVar5 != null ? eVar5.f61789i : 0) + 1;
    }

    private void t(e eVar) {
        e eVar2 = eVar.f61782b;
        e eVar3 = eVar.f61783c;
        e eVar4 = eVar2.f61782b;
        e eVar5 = eVar2.f61783c;
        eVar.f61782b = eVar5;
        if (eVar5 != null) {
            eVar5.f61781a = eVar;
        }
        r(eVar, eVar2);
        eVar2.f61783c = eVar;
        eVar.f61781a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f61789i : 0, eVar5 != null ? eVar5.f61789i : 0) + 1;
        eVar.f61789i = iMax;
        eVar2.f61789i = Math.max(iMax, eVar4 != null ? eVar4.f61789i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f61767c = null;
        this.f61768d = 0;
        this.f61769e++;
        e eVar = this.f61770f;
        eVar.f61785e = eVar;
        eVar.f61784d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return j(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f61771g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f61771g = bVar2;
        return bVar2;
    }

    e g(Object obj, boolean z10) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f61765a;
        e eVar2 = this.f61767c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f61764i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f61786f) : comparator.compare(obj, eVar2.f61786f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f61782b : eVar2.f61783c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e eVar4 = this.f61770f;
        if (eVar2 != null) {
            eVar = new e(this.f61766b, eVar2, obj, eVar4, eVar4.f61785e);
            if (iCompareTo < 0) {
                eVar2.f61782b = eVar;
            } else {
                eVar2.f61783c = eVar;
            }
            l(eVar2, true);
        } else {
            if (comparator == f61764i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f61766b, eVar2, obj, eVar4, eVar4.f61785e);
            this.f61767c = eVar;
        }
        this.f61768d++;
        this.f61769e++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarJ = j(obj);
        if (eVarJ != null) {
            return eVarJ.f61788h;
        }
        return null;
    }

    e h(Map.Entry entry) {
        e eVarJ = j(entry.getKey());
        if (eVarJ == null || !d(eVarJ.f61788h, entry.getValue())) {
            return null;
        }
        return eVarJ;
    }

    e j(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return g(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f61772h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f61772h = cVar2;
        return cVar2;
    }

    void n(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f61785e;
            eVar2.f61784d = eVar.f61784d;
            eVar.f61784d.f61785e = eVar2;
        }
        e eVar3 = eVar.f61782b;
        e eVar4 = eVar.f61783c;
        e eVar5 = eVar.f61781a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                r(eVar, eVar3);
                eVar.f61782b = null;
            } else if (eVar4 != null) {
                r(eVar, eVar4);
                eVar.f61783c = null;
            } else {
                r(eVar, null);
            }
            l(eVar5, false);
            this.f61768d--;
            this.f61769e++;
            return;
        }
        e eVarB = eVar3.f61789i > eVar4.f61789i ? eVar3.b() : eVar4.a();
        n(eVarB, false);
        e eVar6 = eVar.f61782b;
        if (eVar6 != null) {
            i10 = eVar6.f61789i;
            eVarB.f61782b = eVar6;
            eVar6.f61781a = eVarB;
            eVar.f61782b = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f61783c;
        if (eVar7 != null) {
            i11 = eVar7.f61789i;
            eVarB.f61783c = eVar7;
            eVar7.f61781a = eVarB;
            eVar.f61783c = null;
        }
        eVarB.f61789i = Math.max(i10, i11) + 1;
        r(eVar, eVarB);
    }

    e p(Object obj) {
        e eVarJ = j(obj);
        if (eVarJ != null) {
            n(eVarJ, true);
        }
        return eVarJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f61766b) {
            throw new NullPointerException("value == null");
        }
        e eVarG = g(obj, true);
        Object obj3 = eVarG.f61788h;
        eVarG.f61788h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarP = p(obj);
        if (eVarP != null) {
            return eVarP.f61788h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f61768d;
    }

    public h(boolean z10) {
        this(f61764i, z10);
    }

    public h(Comparator comparator, boolean z10) {
        this.f61768d = 0;
        this.f61769e = 0;
        this.f61765a = comparator == null ? f61764i : comparator;
        this.f61766b = z10;
        this.f61770f = new e(z10);
    }

    static final class e implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        e f61781a;

        /* renamed from: b, reason: collision with root package name */
        e f61782b;

        /* renamed from: c, reason: collision with root package name */
        e f61783c;

        /* renamed from: d, reason: collision with root package name */
        e f61784d;

        /* renamed from: e, reason: collision with root package name */
        e f61785e;

        /* renamed from: f, reason: collision with root package name */
        final Object f61786f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f61787g;

        /* renamed from: h, reason: collision with root package name */
        Object f61788h;

        /* renamed from: i, reason: collision with root package name */
        int f61789i;

        e(boolean z10) {
            this.f61786f = null;
            this.f61787g = z10;
            this.f61785e = this;
            this.f61784d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f61782b; eVar2 != null; eVar2 = eVar2.f61782b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f61783c; eVar2 != null; eVar2 = eVar2.f61783c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f61786f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f61788h;
            if (obj3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!obj3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f61786f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f61788h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f61786f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f61788h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f61787g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f61788h;
            this.f61788h = obj;
            return obj2;
        }

        public String toString() {
            return this.f61786f + "=" + this.f61788h;
        }

        e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f61781a = eVar;
            this.f61786f = obj;
            this.f61787g = z10;
            this.f61789i = 1;
            this.f61784d = eVar2;
            this.f61785e = eVar3;
            eVar3.f61784d = this;
            eVar2.f61785e = this;
        }
    }
}
