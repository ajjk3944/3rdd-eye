package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import m4.AbstractC6767f;
import m4.AbstractC6769h;
import n4.AbstractC6869a;

/* renamed from: com.google.common.collect.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5063i extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    private static final Object f38360j = new Object();

    /* renamed from: a, reason: collision with root package name */
    private transient Object f38361a;

    /* renamed from: b, reason: collision with root package name */
    transient int[] f38362b;

    /* renamed from: c, reason: collision with root package name */
    transient Object[] f38363c;

    /* renamed from: d, reason: collision with root package name */
    transient Object[] f38364d;

    /* renamed from: e, reason: collision with root package name */
    private transient int f38365e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f38366f;

    /* renamed from: g, reason: collision with root package name */
    private transient Set f38367g;

    /* renamed from: h, reason: collision with root package name */
    private transient Set f38368h;

    /* renamed from: i, reason: collision with root package name */
    private transient Collection f38369i;

    /* renamed from: com.google.common.collect.i$a */
    class a extends e {
        a() {
            super(C5063i.this, null);
        }

        @Override // com.google.common.collect.C5063i.e
        Object c(int i10) {
            return C5063i.this.U0(i10);
        }
    }

    /* renamed from: com.google.common.collect.i$b */
    class b extends e {
        b() {
            super(C5063i.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.C5063i.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry c(int i10) {
            return C5063i.this.new g(i10);
        }
    }

    /* renamed from: com.google.common.collect.i$c */
    class c extends e {
        c() {
            super(C5063i.this, null);
        }

        @Override // com.google.common.collect.C5063i.e
        Object c(int i10) {
            return C5063i.this.k1(i10);
        }
    }

    /* renamed from: com.google.common.collect.i$d */
    class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5063i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapF0 = C5063i.this.f0();
            if (mapF0 != null) {
                return mapF0.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iN0 = C5063i.this.N0(entry.getKey());
            return iN0 != -1 && AbstractC6767f.a(C5063i.this.k1(iN0), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C5063i.this.C0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapF0 = C5063i.this.f0();
            if (mapF0 != null) {
                return mapF0.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C5063i.this.X0()) {
                return false;
            }
            int iK0 = C5063i.this.K0();
            int iF = AbstractC5064j.f(entry.getKey(), entry.getValue(), iK0, C5063i.this.b1(), C5063i.this.Z0(), C5063i.this.a1(), C5063i.this.c1());
            if (iF == -1) {
                return false;
            }
            C5063i.this.W0(iF, iK0);
            C5063i.l(C5063i.this);
            C5063i.this.M0();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5063i.this.size();
        }
    }

    /* renamed from: com.google.common.collect.i$f */
    class f extends AbstractSet {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5063i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C5063i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C5063i.this.V0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapF0 = C5063i.this.f0();
            return mapF0 != null ? mapF0.keySet().remove(obj) : C5063i.this.Y0(obj) != C5063i.f38360j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5063i.this.size();
        }
    }

    /* renamed from: com.google.common.collect.i$g */
    final class g extends AbstractC5057c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f38379a;

        /* renamed from: b, reason: collision with root package name */
        private int f38380b;

        g(int i10) {
            this.f38379a = C5063i.this.U0(i10);
            this.f38380b = i10;
        }

        private void a() {
            int i10 = this.f38380b;
            if (i10 == -1 || i10 >= C5063i.this.size() || !AbstractC6767f.a(this.f38379a, C5063i.this.U0(this.f38380b))) {
                this.f38380b = C5063i.this.N0(this.f38379a);
            }
        }

        @Override // com.google.common.collect.AbstractC5057c, java.util.Map.Entry
        public Object getKey() {
            return this.f38379a;
        }

        @Override // com.google.common.collect.AbstractC5057c, java.util.Map.Entry
        public Object getValue() {
            Map mapF0 = C5063i.this.f0();
            if (mapF0 != null) {
                return E.a(mapF0.get(this.f38379a));
            }
            a();
            int i10 = this.f38380b;
            return i10 == -1 ? E.b() : C5063i.this.k1(i10);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapF0 = C5063i.this.f0();
            if (mapF0 != null) {
                return E.a(mapF0.put(this.f38379a, obj));
            }
            a();
            int i10 = this.f38380b;
            if (i10 == -1) {
                C5063i.this.put(this.f38379a, obj);
                return E.b();
            }
            Object objK1 = C5063i.this.k1(i10);
            C5063i.this.j1(this.f38380b, obj);
            return objK1;
        }
    }

    /* renamed from: com.google.common.collect.i$h */
    class h extends AbstractCollection {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C5063i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C5063i.this.l1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C5063i.this.size();
        }
    }

    C5063i() {
        P0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K0() {
        return (1 << (this.f38365e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N0(Object obj) {
        if (X0()) {
            return -1;
        }
        int iC = AbstractC5067m.c(obj);
        int iK0 = K0();
        int iH = AbstractC5064j.h(b1(), iC & iK0);
        if (iH == 0) {
            return -1;
        }
        int iB = AbstractC5064j.b(iC, iK0);
        do {
            int i10 = iH - 1;
            int iQ0 = q0(i10);
            if (AbstractC5064j.b(iQ0, iK0) == iB && AbstractC6767f.a(obj, U0(i10))) {
                return i10;
            }
            iH = AbstractC5064j.c(iQ0, iK0);
        } while (iH != 0);
        return -1;
    }

    public static C5063i P() {
        return new C5063i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object U0(int i10) {
        return a1()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object Y0(Object obj) {
        if (X0()) {
            return f38360j;
        }
        int iK0 = K0();
        int iF = AbstractC5064j.f(obj, null, iK0, b1(), Z0(), a1(), null);
        if (iF == -1) {
            return f38360j;
        }
        Object objK1 = k1(iF);
        W0(iF, iK0);
        this.f38366f--;
        M0();
        return objK1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] Z0() {
        int[] iArr = this.f38362b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] a1() {
        Object[] objArr = this.f38363c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object b1() {
        Object obj = this.f38361a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] c1() {
        Object[] objArr = this.f38364d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void e1(int i10) {
        int iMin;
        int length = Z0().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        d1(iMin);
    }

    private int f1(int i10, int i11, int i12, int i13) {
        Object objA = AbstractC5064j.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC5064j.i(objA, i12 & i14, i13 + 1);
        }
        Object objB1 = b1();
        int[] iArrZ0 = Z0();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = AbstractC5064j.h(objB1, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrZ0[i16];
                int iB = AbstractC5064j.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = AbstractC5064j.h(objA, i18);
                AbstractC5064j.i(objA, i18, iH);
                iArrZ0[i16] = AbstractC5064j.d(iB, iH2, i14);
                iH = AbstractC5064j.c(i17, i10);
            }
        }
        this.f38361a = objA;
        h1(i14);
        return i14;
    }

    private void g1(int i10, int i11) {
        Z0()[i10] = i11;
    }

    private void h1(int i10) {
        this.f38365e = AbstractC5064j.d(this.f38365e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void i1(int i10, Object obj) {
        a1()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(int i10, Object obj) {
        c1()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object k1(int i10) {
        return c1()[i10];
    }

    static /* synthetic */ int l(C5063i c5063i) {
        int i10 = c5063i.f38366f;
        c5063i.f38366f = i10 - 1;
        return i10;
    }

    private int q0(int i10) {
        return Z0()[i10];
    }

    void C(int i10) {
    }

    Iterator C0() {
        Map mapF0 = f0();
        return mapF0 != null ? mapF0.entrySet().iterator() : new b();
    }

    int E(int i10, int i11) {
        return i10 - 1;
    }

    int E0() {
        return isEmpty() ? -1 : 0;
    }

    int G0(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f38366f) {
            return i11;
        }
        return -1;
    }

    int J() {
        AbstractC6769h.o(X0(), "Arrays already allocated");
        int i10 = this.f38365e;
        int iJ = AbstractC5064j.j(i10);
        this.f38361a = AbstractC5064j.a(iJ);
        h1(iJ - 1);
        this.f38362b = new int[i10];
        this.f38363c = new Object[i10];
        this.f38364d = new Object[i10];
        return i10;
    }

    Map K() {
        Map mapT = T(K0() + 1);
        int iE0 = E0();
        while (iE0 >= 0) {
            mapT.put(U0(iE0), k1(iE0));
            iE0 = G0(iE0);
        }
        this.f38361a = mapT;
        this.f38362b = null;
        this.f38363c = null;
        this.f38364d = null;
        M0();
        return mapT;
    }

    void M0() {
        this.f38365e += 32;
    }

    void P0(int i10) {
        AbstractC6769h.e(i10 >= 0, "Expected size must be >= 0");
        this.f38365e = AbstractC6869a.a(i10, 1, 1073741823);
    }

    Set S() {
        return new d();
    }

    Map T(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    void T0(int i10, Object obj, Object obj2, int i11, int i12) {
        g1(i10, AbstractC5064j.d(i11, 0, i12));
        i1(i10, obj);
        j1(i10, obj2);
    }

    Iterator V0() {
        Map mapF0 = f0();
        return mapF0 != null ? mapF0.keySet().iterator() : new a();
    }

    void W0(int i10, int i11) {
        Object objB1 = b1();
        int[] iArrZ0 = Z0();
        Object[] objArrA1 = a1();
        Object[] objArrC1 = c1();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrA1[i10] = null;
            objArrC1[i10] = null;
            iArrZ0[i10] = 0;
            return;
        }
        Object obj = objArrA1[i12];
        objArrA1[i10] = obj;
        objArrC1[i10] = objArrC1[i12];
        objArrA1[i12] = null;
        objArrC1[i12] = null;
        iArrZ0[i10] = iArrZ0[i12];
        iArrZ0[i12] = 0;
        int iC = AbstractC5067m.c(obj) & i11;
        int iH = AbstractC5064j.h(objB1, iC);
        if (iH == size) {
            AbstractC5064j.i(objB1, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrZ0[i13];
            int iC2 = AbstractC5064j.c(i14, i11);
            if (iC2 == size) {
                iArrZ0[i13] = AbstractC5064j.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    boolean X0() {
        return this.f38361a == null;
    }

    Set b0() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (X0()) {
            return;
        }
        M0();
        Map mapF0 = f0();
        if (mapF0 != null) {
            this.f38365e = AbstractC6869a.a(size(), 3, 1073741823);
            mapF0.clear();
            this.f38361a = null;
            this.f38366f = 0;
            return;
        }
        Arrays.fill(a1(), 0, this.f38366f, (Object) null);
        Arrays.fill(c1(), 0, this.f38366f, (Object) null);
        AbstractC5064j.g(b1());
        Arrays.fill(Z0(), 0, this.f38366f, 0);
        this.f38366f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapF0 = f0();
        return mapF0 != null ? mapF0.containsKey(obj) : N0(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapF0 = f0();
        if (mapF0 != null) {
            return mapF0.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f38366f; i10++) {
            if (AbstractC6767f.a(obj, k1(i10))) {
                return true;
            }
        }
        return false;
    }

    Collection d0() {
        return new h();
    }

    void d1(int i10) {
        this.f38362b = Arrays.copyOf(Z0(), i10);
        this.f38363c = Arrays.copyOf(a1(), i10);
        this.f38364d = Arrays.copyOf(c1(), i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f38368h;
        if (set != null) {
            return set;
        }
        Set setS = S();
        this.f38368h = setS;
        return setS;
    }

    Map f0() {
        Object obj = this.f38361a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapF0 = f0();
        if (mapF0 != null) {
            return mapF0.get(obj);
        }
        int iN0 = N0(obj);
        if (iN0 == -1) {
            return null;
        }
        C(iN0);
        return k1(iN0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f38367g;
        if (set != null) {
            return set;
        }
        Set setB0 = b0();
        this.f38367g = setB0;
        return setB0;
    }

    Iterator l1() {
        Map mapF0 = f0();
        return mapF0 != null ? mapF0.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int iF1;
        int i10;
        if (X0()) {
            J();
        }
        Map mapF0 = f0();
        if (mapF0 != null) {
            return mapF0.put(obj, obj2);
        }
        int[] iArrZ0 = Z0();
        Object[] objArrA1 = a1();
        Object[] objArrC1 = c1();
        int i11 = this.f38366f;
        int i12 = i11 + 1;
        int iC = AbstractC5067m.c(obj);
        int iK0 = K0();
        int i13 = iC & iK0;
        int iH = AbstractC5064j.h(b1(), i13);
        if (iH != 0) {
            int iB = AbstractC5064j.b(iC, iK0);
            int i14 = 0;
            while (true) {
                int i15 = iH - 1;
                int i16 = iArrZ0[i15];
                if (AbstractC5064j.b(i16, iK0) == iB && AbstractC6767f.a(obj, objArrA1[i15])) {
                    Object obj3 = objArrC1[i15];
                    objArrC1[i15] = obj2;
                    C(i15);
                    return obj3;
                }
                int iC2 = AbstractC5064j.c(i16, iK0);
                i14++;
                if (iC2 != 0) {
                    iH = iC2;
                } else {
                    if (i14 >= 9) {
                        return K().put(obj, obj2);
                    }
                    if (i12 > iK0) {
                        iF1 = f1(iK0, AbstractC5064j.e(iK0), iC, i11);
                    } else {
                        iArrZ0[i15] = AbstractC5064j.d(i16, i12, iK0);
                    }
                }
            }
            i10 = iK0;
        } else if (i12 > iK0) {
            iF1 = f1(iK0, AbstractC5064j.e(iK0), iC, i11);
            i10 = iF1;
        } else {
            AbstractC5064j.i(b1(), i13, i12);
            i10 = iK0;
        }
        e1(i12);
        T0(i11, obj, obj2, iC, i10);
        this.f38366f = i12;
        M0();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapF0 = f0();
        if (mapF0 != null) {
            return mapF0.remove(obj);
        }
        Object objY0 = Y0(obj);
        if (objY0 == f38360j) {
            return null;
        }
        return objY0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapF0 = f0();
        return mapF0 != null ? mapF0.size() : this.f38366f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f38369i;
        if (collection != null) {
            return collection;
        }
        Collection collectionD0 = d0();
        this.f38369i = collectionD0;
        return collectionD0;
    }

    /* renamed from: com.google.common.collect.i$e */
    private abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        int f38374a;

        /* renamed from: b, reason: collision with root package name */
        int f38375b;

        /* renamed from: c, reason: collision with root package name */
        int f38376c;

        private e() {
            this.f38374a = C5063i.this.f38365e;
            this.f38375b = C5063i.this.E0();
            this.f38376c = -1;
        }

        private void a() {
            if (C5063i.this.f38365e != this.f38374a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object c(int i10);

        void d() {
            this.f38374a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f38375b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f38375b;
            this.f38376c = i10;
            Object objC = c(i10);
            this.f38375b = C5063i.this.G0(this.f38375b);
            return objC;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            AbstractC5061g.c(this.f38376c >= 0);
            d();
            C5063i c5063i = C5063i.this;
            c5063i.remove(c5063i.U0(this.f38376c));
            this.f38375b = C5063i.this.E(this.f38375b, this.f38376c);
            this.f38376c = -1;
        }

        /* synthetic */ e(C5063i c5063i, a aVar) {
            this();
        }
    }
}
