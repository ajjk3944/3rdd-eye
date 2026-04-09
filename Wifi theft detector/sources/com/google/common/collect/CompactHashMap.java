package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f11681j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f11682a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f11683b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f11684c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f11685d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f11686e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f11687f;

    /* renamed from: g, reason: collision with root package name */
    public transient Set f11688g;

    /* renamed from: h, reason: collision with root package name */
    public transient Set f11689h;

    /* renamed from: i, reason: collision with root package name */
    public transient Collection f11690i;

    public class a extends e {
        public a() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        public Object b(int i10) {
            return CompactHashMap.this.J(i10);
        }
    }

    public class b extends e {
        public b() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return new g(i10);
        }
    }

    public class c extends e {
        public c() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.e
        public Object b(int i10) {
            return CompactHashMap.this.Z(i10);
        }
    }

    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapZ = CompactHashMap.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iG = CompactHashMap.this.G(entry.getKey());
                if (iG != -1 && com.google.common.base.f.a(CompactHashMap.this.Z(iG), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return CompactHashMap.this.B();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iE;
            int iF;
            Map mapZ = CompactHashMap.this.z();
            if (mapZ != null) {
                return mapZ.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.M() || (iF = l.f(entry.getKey(), entry.getValue(), (iE = CompactHashMap.this.E()), CompactHashMap.this.Q(), CompactHashMap.this.O(), CompactHashMap.this.P(), CompactHashMap.this.R())) == -1) {
                return false;
            }
            CompactHashMap.this.L(iF, iE);
            CompactHashMap.f(CompactHashMap.this);
            CompactHashMap.this.F();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return CompactHashMap.this.K();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapZ = CompactHashMap.this.z();
            return mapZ != null ? mapZ.keySet().remove(obj) : CompactHashMap.this.N(obj) != CompactHashMap.f11681j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class g extends com.google.common.collect.b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11700a;

        /* renamed from: b, reason: collision with root package name */
        public int f11701b;

        public g(int i10) {
            this.f11700a = CompactHashMap.this.J(i10);
            this.f11701b = i10;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getKey() {
            return this.f11700a;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object getValue() {
            Map mapZ = CompactHashMap.this.z();
            if (mapZ != null) {
                return f0.a(mapZ.get(this.f11700a));
            }
            j();
            int i10 = this.f11701b;
            return i10 == -1 ? f0.b() : CompactHashMap.this.Z(i10);
        }

        public final void j() {
            int i10 = this.f11701b;
            if (i10 == -1 || i10 >= CompactHashMap.this.size() || !com.google.common.base.f.a(this.f11700a, CompactHashMap.this.J(this.f11701b))) {
                this.f11701b = CompactHashMap.this.G(this.f11700a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.b, java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapZ = CompactHashMap.this.z();
            if (mapZ != 0) {
                return f0.a(mapZ.put(this.f11700a, obj));
            }
            j();
            int i10 = this.f11701b;
            if (i10 == -1) {
                CompactHashMap.this.put(this.f11700a, obj);
                return f0.b();
            }
            Object objZ = CompactHashMap.this.Z(i10);
            CompactHashMap.this.Y(this.f11701b, obj);
            return objZ;
        }
    }

    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return CompactHashMap.this.a0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        H(3);
    }

    public static /* synthetic */ int f(CompactHashMap compactHashMap) {
        int i10 = compactHashMap.f11687f;
        compactHashMap.f11687f = i10 - 1;
        return i10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i10);
            throw new InvalidObjectException(sb.toString());
        }
        H(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static CompactHashMap t() {
        return new CompactHashMap();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itB = B();
        while (itB.hasNext()) {
            Map.Entry entry = (Map.Entry) itB.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static CompactHashMap y(int i10) {
        return new CompactHashMap(i10);
    }

    public final int A(int i10) {
        return O()[i10];
    }

    public Iterator B() {
        Map mapZ = z();
        return mapZ != null ? mapZ.entrySet().iterator() : new b();
    }

    public int C() {
        return isEmpty() ? -1 : 0;
    }

    public int D(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f11687f) {
            return i11;
        }
        return -1;
    }

    public final int E() {
        return (1 << (this.f11686e & 31)) - 1;
    }

    public void F() {
        this.f11686e += 32;
    }

    public final int G(Object obj) {
        if (M()) {
            return -1;
        }
        int iD = z.d(obj);
        int iE = E();
        int iH = l.h(Q(), iD & iE);
        if (iH == 0) {
            return -1;
        }
        int iB = l.b(iD, iE);
        do {
            int i10 = iH - 1;
            int iA = A(i10);
            if (l.b(iA, iE) == iB && com.google.common.base.f.a(obj, J(i10))) {
                return i10;
            }
            iH = l.c(iA, iE);
        } while (iH != 0);
        return -1;
    }

    public void H(int i10) {
        com.google.common.base.g.e(i10 >= 0, "Expected size must be >= 0");
        this.f11686e = com.google.common.primitives.c.b(i10, 1, 1073741823);
    }

    public void I(int i10, Object obj, Object obj2, int i11, int i12) {
        V(i10, l.d(i11, 0, i12));
        X(i10, obj);
        Y(i10, obj2);
    }

    public final Object J(int i10) {
        return P()[i10];
    }

    public Iterator K() {
        Map mapZ = z();
        return mapZ != null ? mapZ.keySet().iterator() : new a();
    }

    public void L(int i10, int i11) {
        Object objQ = Q();
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrP[i10] = null;
            objArrR[i10] = null;
            iArrO[i10] = 0;
            return;
        }
        Object obj = objArrP[i12];
        objArrP[i10] = obj;
        objArrR[i10] = objArrR[i12];
        objArrP[i12] = null;
        objArrR[i12] = null;
        iArrO[i10] = iArrO[i12];
        iArrO[i12] = 0;
        int iD = z.d(obj) & i11;
        int iH = l.h(objQ, iD);
        if (iH == size) {
            l.i(objQ, iD, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrO[i13];
            int iC = l.c(i14, i11);
            if (iC == size) {
                iArrO[i13] = l.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC;
        }
    }

    public boolean M() {
        return this.f11682a == null;
    }

    public final Object N(Object obj) {
        if (M()) {
            return f11681j;
        }
        int iE = E();
        int iF = l.f(obj, null, iE, Q(), O(), P(), null);
        if (iF == -1) {
            return f11681j;
        }
        Object objZ = Z(iF);
        L(iF, iE);
        this.f11687f--;
        F();
        return objZ;
    }

    public final int[] O() {
        int[] iArr = this.f11683b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] P() {
        Object[] objArr = this.f11684c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object Q() {
        Object obj = this.f11682a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] R() {
        Object[] objArr = this.f11685d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void S(int i10) {
        this.f11683b = Arrays.copyOf(O(), i10);
        this.f11684c = Arrays.copyOf(P(), i10);
        this.f11685d = Arrays.copyOf(R(), i10);
    }

    public final void T(int i10) {
        int iMin;
        int length = O().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        S(iMin);
    }

    public final int U(int i10, int i11, int i12, int i13) {
        Object objA = l.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            l.i(objA, i12 & i14, i13 + 1);
        }
        Object objQ = Q();
        int[] iArrO = O();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = l.h(objQ, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrO[i16];
                int iB = l.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = l.h(objA, i18);
                l.i(objA, i18, iH);
                iArrO[i16] = l.d(iB, iH2, i14);
                iH = l.c(i17, i10);
            }
        }
        this.f11682a = objA;
        W(i14);
        return i14;
    }

    public final void V(int i10, int i11) {
        O()[i10] = i11;
    }

    public final void W(int i10) {
        this.f11686e = l.d(this.f11686e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public final void X(int i10, Object obj) {
        P()[i10] = obj;
    }

    public final void Y(int i10, Object obj) {
        R()[i10] = obj;
    }

    public final Object Z(int i10) {
        return R()[i10];
    }

    public Iterator a0() {
        Map mapZ = z();
        return mapZ != null ? mapZ.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (M()) {
            return;
        }
        F();
        Map mapZ = z();
        if (mapZ != null) {
            this.f11686e = com.google.common.primitives.c.b(size(), 3, 1073741823);
            mapZ.clear();
            this.f11682a = null;
            this.f11687f = 0;
            return;
        }
        Arrays.fill(P(), 0, this.f11687f, (Object) null);
        Arrays.fill(R(), 0, this.f11687f, (Object) null);
        l.g(Q());
        Arrays.fill(O(), 0, this.f11687f, 0);
        this.f11687f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapZ = z();
        return mapZ != null ? mapZ.containsKey(obj) : G(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f11687f; i10++) {
            if (com.google.common.base.f.a(obj, Z(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f11689h;
        if (set != null) {
            return set;
        }
        Set setU = u();
        this.f11689h = setU;
        return setU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.get(obj);
        }
        int iG = G(obj);
        if (iG == -1) {
            return null;
        }
        p(iG);
        return Z(iG);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f11688g;
        if (set != null) {
            return set;
        }
        Set setW = w();
        this.f11688g = setW;
        return setW;
    }

    public void p(int i10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (M()) {
            r();
        }
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.put(obj, obj2);
        }
        int[] iArrO = O();
        Object[] objArrP = P();
        Object[] objArrR = R();
        int i10 = this.f11687f;
        int i11 = i10 + 1;
        int iD = z.d(obj);
        int iE = E();
        int i12 = iD & iE;
        int iH = l.h(Q(), i12);
        if (iH != 0) {
            int iB = l.b(iD, iE);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrO[i14];
                if (l.b(i15, iE) == iB && com.google.common.base.f.a(obj, objArrP[i14])) {
                    Object obj3 = objArrR[i14];
                    objArrR[i14] = obj2;
                    p(i14);
                    return obj3;
                }
                int iC = l.c(i15, iE);
                i13++;
                if (iC != 0) {
                    obj = obj;
                    obj2 = obj2;
                    iH = iC;
                } else {
                    if (i13 >= 9) {
                        return s().put(obj, obj2);
                    }
                    if (i11 > iE) {
                        iE = U(iE, l.e(iE), iD, i10);
                    } else {
                        iArrO[i14] = l.d(i15, i11, iE);
                    }
                }
            }
        } else if (i11 > iE) {
            iE = U(iE, l.e(iE), iD, i10);
        } else {
            l.i(Q(), i12, i11);
        }
        int i16 = iE;
        T(i11);
        I(i10, obj, obj2, iD, i16);
        this.f11687f = i11;
        F();
        return null;
    }

    public int q(int i10, int i11) {
        return i10 - 1;
    }

    public int r() {
        com.google.common.base.g.s(M(), "Arrays already allocated");
        int i10 = this.f11686e;
        int iJ = l.j(i10);
        this.f11682a = l.a(iJ);
        W(iJ - 1);
        this.f11683b = new int[i10];
        this.f11684c = new Object[i10];
        this.f11685d = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapZ = z();
        if (mapZ != null) {
            return mapZ.remove(obj);
        }
        Object objN = N(obj);
        if (objN == f11681j) {
            return null;
        }
        return objN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map s() {
        Map mapV = v(E() + 1);
        int iC = C();
        while (iC >= 0) {
            mapV.put(J(iC), Z(iC));
            iC = D(iC);
        }
        this.f11682a = mapV;
        this.f11683b = null;
        this.f11684c = null;
        this.f11685d = null;
        F();
        return mapV;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapZ = z();
        return mapZ != null ? mapZ.size() : this.f11687f;
    }

    public Set u() {
        return new d();
    }

    public Map v(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f11690i;
        if (collection != null) {
            return collection;
        }
        Collection collectionX = x();
        this.f11690i = collectionX;
        return collectionX;
    }

    public Set w() {
        return new f();
    }

    public Collection x() {
        return new h();
    }

    public Map z() {
        Object obj = this.f11682a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public CompactHashMap(int i10) {
        H(i10);
    }

    public abstract class e implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f11695a;

        /* renamed from: b, reason: collision with root package name */
        public int f11696b;

        /* renamed from: c, reason: collision with root package name */
        public int f11697c;

        public e() {
            this.f11695a = CompactHashMap.this.f11686e;
            this.f11696b = CompactHashMap.this.C();
            this.f11697c = -1;
        }

        public final void a() {
            if (CompactHashMap.this.f11686e != this.f11695a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object b(int i10);

        public void c() {
            this.f11695a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11696b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f11696b;
            this.f11697c = i10;
            Object objB = b(i10);
            this.f11696b = CompactHashMap.this.D(this.f11696b);
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            j.d(this.f11697c >= 0);
            c();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.J(this.f11697c));
            this.f11696b = CompactHashMap.this.q(this.f11696b, this.f11697c);
            this.f11697c = -1;
        }

        public /* synthetic */ e(CompactHashMap compactHashMap, a aVar) {
            this();
        }
    }
}
