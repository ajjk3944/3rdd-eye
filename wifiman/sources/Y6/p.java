package Y6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
final class p extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final Comparator f24694i = new a();

    /* renamed from: a, reason: collision with root package name */
    final Comparator f24695a;

    /* renamed from: b, reason: collision with root package name */
    g[] f24696b;

    /* renamed from: c, reason: collision with root package name */
    final g f24697c;

    /* renamed from: d, reason: collision with root package name */
    int f24698d;

    /* renamed from: e, reason: collision with root package name */
    int f24699e;

    /* renamed from: f, reason: collision with root package name */
    int f24700f;

    /* renamed from: g, reason: collision with root package name */
    private d f24701g;

    /* renamed from: h, reason: collision with root package name */
    private e f24702h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private g f24703a;

        /* renamed from: b, reason: collision with root package name */
        private int f24704b;

        /* renamed from: c, reason: collision with root package name */
        private int f24705c;

        /* renamed from: d, reason: collision with root package name */
        private int f24706d;

        b() {
        }

        void a(g gVar) {
            gVar.f24718c = null;
            gVar.f24716a = null;
            gVar.f24717b = null;
            gVar.f24724i = 1;
            int i10 = this.f24704b;
            if (i10 > 0) {
                int i11 = this.f24706d;
                if ((i11 & 1) == 0) {
                    this.f24706d = i11 + 1;
                    this.f24704b = i10 - 1;
                    this.f24705c++;
                }
            }
            gVar.f24716a = this.f24703a;
            this.f24703a = gVar;
            int i12 = this.f24706d;
            int i13 = i12 + 1;
            this.f24706d = i13;
            int i14 = this.f24704b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f24706d = i12 + 2;
                this.f24704b = i14 - 1;
                this.f24705c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f24706d & i16) != i16) {
                    return;
                }
                int i17 = this.f24705c;
                if (i17 == 0) {
                    g gVar2 = this.f24703a;
                    g gVar3 = gVar2.f24716a;
                    g gVar4 = gVar3.f24716a;
                    gVar3.f24716a = gVar4.f24716a;
                    this.f24703a = gVar3;
                    gVar3.f24717b = gVar4;
                    gVar3.f24718c = gVar2;
                    gVar3.f24724i = gVar2.f24724i + 1;
                    gVar4.f24716a = gVar3;
                    gVar2.f24716a = gVar3;
                } else if (i17 == 1) {
                    g gVar5 = this.f24703a;
                    g gVar6 = gVar5.f24716a;
                    this.f24703a = gVar6;
                    gVar6.f24718c = gVar5;
                    gVar6.f24724i = gVar5.f24724i + 1;
                    gVar5.f24716a = gVar6;
                    this.f24705c = 0;
                } else if (i17 == 2) {
                    this.f24705c = 0;
                }
                i15 *= 2;
            }
        }

        void b(int i10) {
            this.f24704b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f24706d = 0;
            this.f24705c = 0;
            this.f24703a = null;
        }

        g c() {
            g gVar = this.f24703a;
            if (gVar.f24716a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        private g f24707a;

        c() {
        }

        public g a() {
            g gVar = this.f24707a;
            if (gVar == null) {
                return null;
            }
            g gVar2 = gVar.f24716a;
            gVar.f24716a = null;
            g gVar3 = gVar.f24718c;
            while (true) {
                g gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f24707a = gVar4;
                    return gVar;
                }
                gVar2.f24716a = gVar4;
                gVar3 = gVar2.f24717b;
            }
        }

        void b(g gVar) {
            g gVar2 = null;
            while (gVar != null) {
                gVar.f24716a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f24717b;
            }
            this.f24707a = gVar2;
        }
    }

    final class d extends AbstractSet {

        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && p.this.l((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g gVarL;
            if (!(obj instanceof Map.Entry) || (gVarL = p.this.l((Map.Entry) obj)) == null) {
                return false;
            }
            p.this.r(gVarL, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.f24698d;
        }
    }

    final class e extends AbstractSet {

        class a extends f {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f24721f;
            }
        }

        e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return p.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return p.this.s(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p.this.f24698d;
        }
    }

    abstract class f implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        g f24712a;

        /* renamed from: b, reason: collision with root package name */
        g f24713b = null;

        /* renamed from: c, reason: collision with root package name */
        int f24714c;

        f() {
            this.f24712a = p.this.f24697c.f24719d;
            this.f24714c = p.this.f24699e;
        }

        final g a() {
            g gVar = this.f24712a;
            p pVar = p.this;
            if (gVar == pVar.f24697c) {
                throw new NoSuchElementException();
            }
            if (pVar.f24699e != this.f24714c) {
                throw new ConcurrentModificationException();
            }
            this.f24712a = gVar.f24719d;
            this.f24713b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f24712a != p.this.f24697c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g gVar = this.f24713b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            p.this.r(gVar, true);
            this.f24713b = null;
            this.f24714c = p.this.f24699e;
        }
    }

    p() {
        this(null);
    }

    private static int B(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    private void d() {
        g[] gVarArrG = g(this.f24696b);
        this.f24696b = gVarArrG;
        this.f24700f = (gVarArrG.length / 2) + (gVarArrG.length / 4);
    }

    static g[] g(g[] gVarArr) {
        int length = gVarArr.length;
        g[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f24722g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f24722g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void p(g gVar, boolean z10) {
        while (gVar != null) {
            g gVar2 = gVar.f24717b;
            g gVar3 = gVar.f24718c;
            int i10 = gVar2 != null ? gVar2.f24724i : 0;
            int i11 = gVar3 != null ? gVar3.f24724i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g gVar4 = gVar3.f24717b;
                g gVar5 = gVar3.f24718c;
                int i13 = (gVar4 != null ? gVar4.f24724i : 0) - (gVar5 != null ? gVar5.f24724i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    y(gVar3);
                }
                v(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g gVar6 = gVar2.f24717b;
                g gVar7 = gVar2.f24718c;
                int i14 = (gVar6 != null ? gVar6.f24724i : 0) - (gVar7 != null ? gVar7.f24724i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    v(gVar2);
                }
                y(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f24724i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f24724i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f24716a;
        }
    }

    private void t(g gVar, g gVar2) {
        g gVar3 = gVar.f24716a;
        gVar.f24716a = null;
        if (gVar2 != null) {
            gVar2.f24716a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f24722g;
            this.f24696b[i10 & (r0.length - 1)] = gVar2;
        } else if (gVar3.f24717b == gVar) {
            gVar3.f24717b = gVar2;
        } else {
            gVar3.f24718c = gVar2;
        }
    }

    private void v(g gVar) {
        g gVar2 = gVar.f24717b;
        g gVar3 = gVar.f24718c;
        g gVar4 = gVar3.f24717b;
        g gVar5 = gVar3.f24718c;
        gVar.f24718c = gVar4;
        if (gVar4 != null) {
            gVar4.f24716a = gVar;
        }
        t(gVar, gVar3);
        gVar3.f24717b = gVar;
        gVar.f24716a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f24724i : 0, gVar4 != null ? gVar4.f24724i : 0) + 1;
        gVar.f24724i = iMax;
        gVar3.f24724i = Math.max(iMax, gVar5 != null ? gVar5.f24724i : 0) + 1;
    }

    private void y(g gVar) {
        g gVar2 = gVar.f24717b;
        g gVar3 = gVar.f24718c;
        g gVar4 = gVar2.f24717b;
        g gVar5 = gVar2.f24718c;
        gVar.f24717b = gVar5;
        if (gVar5 != null) {
            gVar5.f24716a = gVar;
        }
        t(gVar, gVar2);
        gVar2.f24718c = gVar;
        gVar.f24716a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f24724i : 0, gVar5 != null ? gVar5.f24724i : 0) + 1;
        gVar.f24724i = iMax;
        gVar2.f24724i = Math.max(iMax, gVar4 != null ? gVar4.f24724i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f24696b, (Object) null);
        this.f24698d = 0;
        this.f24699e++;
        g gVar = this.f24697c;
        g gVar2 = gVar.f24719d;
        while (gVar2 != gVar) {
            g gVar3 = gVar2.f24719d;
            gVar2.f24720e = null;
            gVar2.f24719d = null;
            gVar2 = gVar3;
        }
        gVar.f24720e = gVar;
        gVar.f24719d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return n(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        d dVar = this.f24701g;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        this.f24701g = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        g gVarN = n(obj);
        if (gVarN != null) {
            return gVarN.f24723h;
        }
        return null;
    }

    g j(Object obj, boolean z10) {
        int iCompareTo;
        g gVar;
        Comparator comparator = this.f24695a;
        g[] gVarArr = this.f24696b;
        int iB = B(obj.hashCode());
        int length = (gVarArr.length - 1) & iB;
        g gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f24694i ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f24721f) : comparator.compare(obj, gVar2.f24721f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g gVar3 = iCompareTo < 0 ? gVar2.f24717b : gVar2.f24718c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        g gVar4 = gVar2;
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        g gVar5 = this.f24697c;
        if (gVar4 != null) {
            gVar = new g(gVar4, obj, iB, gVar5, gVar5.f24720e);
            if (i10 < 0) {
                gVar4.f24717b = gVar;
            } else {
                gVar4.f24718c = gVar;
            }
            p(gVar4, true);
        } else {
            if (comparator == f24694i && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            gVar = new g(gVar4, obj, iB, gVar5, gVar5.f24720e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f24698d;
        this.f24698d = i11 + 1;
        if (i11 > this.f24700f) {
            d();
        }
        this.f24699e++;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        e eVar = this.f24702h;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f24702h = eVar2;
        return eVar2;
    }

    g l(Map.Entry entry) {
        g gVarN = n(entry.getKey());
        if (gVarN == null || !h(gVarN.f24723h, entry.getValue())) {
            return null;
        }
        return gVarN;
    }

    g n(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return j(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        g gVarJ = j(obj, true);
        Object obj3 = gVarJ.f24723h;
        gVarJ.f24723h = obj2;
        return obj3;
    }

    void r(g gVar, boolean z10) {
        int i10;
        if (z10) {
            g gVar2 = gVar.f24720e;
            gVar2.f24719d = gVar.f24719d;
            gVar.f24719d.f24720e = gVar2;
            gVar.f24720e = null;
            gVar.f24719d = null;
        }
        g gVar3 = gVar.f24717b;
        g gVar4 = gVar.f24718c;
        g gVar5 = gVar.f24716a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                t(gVar, gVar3);
                gVar.f24717b = null;
            } else if (gVar4 != null) {
                t(gVar, gVar4);
                gVar.f24718c = null;
            } else {
                t(gVar, null);
            }
            p(gVar5, false);
            this.f24698d--;
            this.f24699e++;
            return;
        }
        g gVarB = gVar3.f24724i > gVar4.f24724i ? gVar3.b() : gVar4.a();
        r(gVarB, false);
        g gVar6 = gVar.f24717b;
        if (gVar6 != null) {
            i10 = gVar6.f24724i;
            gVarB.f24717b = gVar6;
            gVar6.f24716a = gVarB;
            gVar.f24717b = null;
        } else {
            i10 = 0;
        }
        g gVar7 = gVar.f24718c;
        if (gVar7 != null) {
            i11 = gVar7.f24724i;
            gVarB.f24718c = gVar7;
            gVar7.f24716a = gVarB;
            gVar.f24718c = null;
        }
        gVarB.f24724i = Math.max(i10, i11) + 1;
        t(gVar, gVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g gVarS = s(obj);
        if (gVarS != null) {
            return gVarS.f24723h;
        }
        return null;
    }

    g s(Object obj) {
        g gVarN = n(obj);
        if (gVarN != null) {
            r(gVarN, true);
        }
        return gVarN;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f24698d;
    }

    p(Comparator comparator) {
        this.f24698d = 0;
        this.f24699e = 0;
        this.f24695a = comparator == null ? f24694i : comparator;
        this.f24697c = new g();
        g[] gVarArr = new g[16];
        this.f24696b = gVarArr;
        this.f24700f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    static final class g implements Map.Entry {

        /* renamed from: a, reason: collision with root package name */
        g f24716a;

        /* renamed from: b, reason: collision with root package name */
        g f24717b;

        /* renamed from: c, reason: collision with root package name */
        g f24718c;

        /* renamed from: d, reason: collision with root package name */
        g f24719d;

        /* renamed from: e, reason: collision with root package name */
        g f24720e;

        /* renamed from: f, reason: collision with root package name */
        final Object f24721f;

        /* renamed from: g, reason: collision with root package name */
        final int f24722g;

        /* renamed from: h, reason: collision with root package name */
        Object f24723h;

        /* renamed from: i, reason: collision with root package name */
        int f24724i;

        g() {
            this.f24721f = null;
            this.f24722g = -1;
            this.f24720e = this;
            this.f24719d = this;
        }

        public g a() {
            g gVar = this;
            for (g gVar2 = this.f24717b; gVar2 != null; gVar2 = gVar2.f24717b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g b() {
            g gVar = this;
            for (g gVar2 = this.f24718c; gVar2 != null; gVar2 = gVar2.f24718c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f24721f;
            if (obj2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!obj2.equals(entry.getKey())) {
                return false;
            }
            Object obj3 = this.f24723h;
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
            return this.f24721f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f24723h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f24721f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f24723h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.f24723h;
            this.f24723h = obj;
            return obj2;
        }

        public String toString() {
            return this.f24721f + "=" + this.f24723h;
        }

        g(g gVar, Object obj, int i10, g gVar2, g gVar3) {
            this.f24716a = gVar;
            this.f24721f = obj;
            this.f24722g = i10;
            this.f24724i = 1;
            this.f24719d = gVar2;
            this.f24720e = gVar3;
            gVar3.f24719d = this;
            gVar2.f24720e = this;
        }
    }
}
