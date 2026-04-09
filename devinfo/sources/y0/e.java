package y0;

import e4.y0;
import g1.o;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import nk.k;
import u0.j1;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends zj.g implements Collection, ok.b {

    /* renamed from: a, reason: collision with root package name */
    public b f37295a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f37296b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f37297c;

    /* renamed from: d, reason: collision with root package name */
    public int f37298d;

    /* renamed from: e, reason: collision with root package name */
    public b1.b f37299e = new b1.b();

    /* renamed from: f, reason: collision with root package name */
    public Object[] f37300f;
    public Object[] g;

    /* renamed from: h, reason: collision with root package name */
    public int f37301h;

    public e(b bVar, Object[] objArr, Object[] objArr2, int i4) {
        this.f37295a = bVar;
        this.f37296b = objArr;
        this.f37297c = objArr2;
        this.f37298d = i4;
        this.f37300f = objArr;
        this.g = objArr2;
        this.f37301h = bVar.size();
    }

    public static void f(Object[] objArr, int i4, Iterator it) {
        while (i4 < 32 && it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
    }

    public final int A(mk.c cVar, Object[] objArr, int i4, rf.c cVar2) {
        Object[] objArrO = objArr;
        int i10 = i4;
        boolean z3 = false;
        for (int i11 = 0; i11 < i4; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z3) {
                    objArrO = o(objArr);
                    z3 = true;
                    i10 = i11;
                }
            } else if (z3) {
                objArrO[i10] = obj;
                i10++;
            }
        }
        cVar2.f32941a = objArrO;
        return i10;
    }

    public final int B(mk.c cVar, int i4, rf.c cVar2) {
        int iA = A(cVar, this.g, i4, cVar2);
        if (iA == i4) {
            return i4;
        }
        Object obj = cVar2.f32941a;
        k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iA, i4, (Object) null);
        this.g = objArr;
        this.f37301h -= i4 - iA;
        return iA;
    }

    public final boolean C(mk.c cVar) {
        Object[] objArrV;
        int i4;
        mk.c cVar2 = cVar;
        int I = I();
        Object[] objArrS = null;
        rf.c cVar3 = new rf.c(null);
        boolean z3 = false;
        if (this.f37300f != null) {
            a aVarM = m(0);
            int iA = 32;
            while (iA == 32 && aVarM.hasNext()) {
                iA = A(cVar2, (Object[]) aVarM.next(), 32, cVar3);
            }
            if (iA == 32) {
                int iB = B(cVar2, I, cVar3);
                if (iB == 0) {
                    u(this.f37300f, this.f37301h, this.f37298d);
                }
                if (iB != I) {
                }
            } else {
                int i10 = (aVarM.f37287a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iZ = iA;
                while (aVarM.hasNext()) {
                    iZ = z(cVar2, (Object[]) aVarM.next(), 32, iZ, cVar3, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int iZ2 = z(cVar, this.g, I, iZ, cVar3, arrayList2, arrayList);
                Object obj = cVar3.f32941a;
                k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iZ2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrV = this.f37300f;
                    k.b(objArrV);
                } else {
                    objArrV = v(this.f37300f, i10, this.f37298d, arrayList.iterator());
                }
                int size = i10 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    j1.a("invalid size");
                }
                if (size == 0) {
                    this.f37298d = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i4 = this.f37298d;
                        if ((i11 >> i4) != 0) {
                            break;
                        }
                        this.f37298d = i4 - 5;
                        Object[] objArr2 = objArrV[0];
                        k.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrV = objArr2;
                    }
                    objArrS = s(objArrV, i11, i4);
                }
                this.f37300f = objArrS;
                this.g = objArr;
                this.f37301h = size + iZ2;
            }
            z3 = true;
        } else if (B(cVar2, I, cVar3) != I) {
            z3 = true;
        }
        if (z3) {
            ((AbstractList) this).modCount++;
        }
        return z3;
    }

    public final Object[] D(Object[] objArr, int i4, int i10, rf.c cVar) {
        int iO = jm.a.o(i10, i4);
        if (i4 == 0) {
            Object obj = objArr[iO];
            Object[] objArrO = o(objArr);
            m.N(iO, iO + 1, 32, objArr, objArrO);
            objArrO[31] = cVar.f32941a;
            cVar.f32941a = obj;
            return objArrO;
        }
        int iO2 = objArr[31] == null ? jm.a.o(F() - 1, i4) : 31;
        Object[] objArrO2 = o(objArr);
        int i11 = i4 - 5;
        int i12 = iO + 1;
        if (i12 <= iO2) {
            while (true) {
                Object obj2 = objArrO2[iO2];
                k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrO2[iO2] = D((Object[]) obj2, i11, 0, cVar);
                if (iO2 == i12) {
                    break;
                }
                iO2--;
            }
        }
        Object obj3 = objArrO2[iO];
        k.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[iO] = D((Object[]) obj3, i11, i10, cVar);
        return objArrO2;
    }

    public final Object E(Object[] objArr, int i4, int i10, int i11) {
        int i12 = this.f37301h - i4;
        if (i12 == 1) {
            Object obj = this.g[0];
            u(objArr, i4, i10);
            return obj;
        }
        Object[] objArr2 = this.g;
        Object obj2 = objArr2[i11];
        Object[] objArrO = o(objArr2);
        m.N(i11, i11 + 1, i12, objArr2, objArrO);
        objArrO[i12 - 1] = null;
        this.f37300f = objArr;
        this.g = objArrO;
        this.f37301h = (i4 + i12) - 1;
        this.f37298d = i10;
        return obj2;
    }

    public final int F() {
        int i4 = this.f37301h;
        if (i4 <= 32) {
            return 0;
        }
        return (i4 - 1) & (-32);
    }

    public final Object[] G(Object[] objArr, int i4, int i10, Object obj, rf.c cVar) {
        int iO = jm.a.o(i10, i4);
        Object[] objArrO = o(objArr);
        if (i4 != 0) {
            Object obj2 = objArrO[iO];
            k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrO[iO] = G((Object[]) obj2, i4 - 5, i10, obj, cVar);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        cVar.f32941a = objArrO[iO];
        objArrO[iO] = obj;
        return objArrO;
    }

    public final void H(Collection collection, int i4, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] objArrQ;
        if (i11 < 1) {
            j1.a("requires at least one nullBuffer");
        }
        Object[] objArrO = o(objArr);
        objArr2[0] = objArrO;
        int i12 = i4 & 31;
        int size = ((collection.size() + i4) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            m.N(size + 1, i12, i10, objArrO, objArr3);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                objArrQ = objArrO;
            } else {
                objArrQ = q();
                i11--;
                objArr2[i11] = objArrQ;
            }
            int i15 = i10 - i14;
            m.N(0, i15, i10, objArrO, objArr3);
            m.N(size + 1, i12, i15, objArrO, objArrQ);
            objArr3 = objArrQ;
        }
        Iterator it = collection.iterator();
        f(objArrO, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] objArrQ2 = q();
            f(objArrQ2, 0, it);
            objArr2[i16] = objArrQ2;
        }
        f(objArr3, 0, it);
    }

    public final int I() {
        int i4 = this.f37301h;
        return i4 <= 32 ? i4 : i4 - ((i4 - 1) & (-32));
    }

    @Override // zj.g
    public final int a() {
        return this.f37301h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        com.bumptech.glide.c.g(i4, a());
        if (i4 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i4 >= iF) {
            k(i4 - iF, obj, this.f37300f);
            return;
        }
        rf.c cVar = new rf.c(null);
        Object[] objArr = this.f37300f;
        k.b(objArr);
        k(0, cVar.f32941a, j(objArr, this.f37298d, i4, obj, cVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        Collection collection2;
        e eVar;
        Object[] objArrQ;
        com.bumptech.glide.c.g(i4, this.f37301h);
        if (i4 == this.f37301h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i4 >> 5) << 5;
        int size = ((collection.size() + (this.f37301h - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i4 & 31;
            int size2 = ((collection.size() + i4) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrO = o(objArr);
            m.N(size2 + 1, i11, I(), objArr, objArrO);
            f(objArrO, i11, collection.iterator());
            this.g = objArrO;
            this.f37301h = collection.size() + this.f37301h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int I = I();
        int size3 = collection.size() + this.f37301h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i4 >= F()) {
            objArrQ = q();
            collection2 = collection;
            H(collection2, i4, this.g, I, objArr2, size, objArrQ);
            eVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            eVar = this;
            if (size3 > I) {
                int i12 = size3 - I;
                Object[] objArrP = p(eVar.g, i12);
                eVar.i(collection2, i4, i12, objArr2, size, objArrP);
                objArr2 = objArr2;
                objArrQ = objArrP;
            } else {
                Object[] objArr3 = eVar.g;
                objArrQ = q();
                int i13 = I - size3;
                m.N(0, i13, I, objArr3, objArrQ);
                int i14 = 32 - i13;
                Object[] objArrP2 = p(eVar.g, i14);
                int i15 = size - 1;
                objArr2[i15] = objArrP2;
                eVar.i(collection2, i4, i14, objArr2, i15, objArrP2);
                collection2 = collection2;
            }
        }
        eVar.f37300f = w(eVar.f37300f, i10, objArr2);
        eVar.g = objArrQ;
        eVar.f37301h = collection2.size() + eVar.f37301h;
        return true;
    }

    @Override // zj.g
    public final Object c(int i4) {
        com.bumptech.glide.c.f(i4, a());
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i4 >= iF) {
            return E(this.f37300f, iF, this.f37298d, i4 - iF);
        }
        rf.c cVar = new rf.c(this.g[0]);
        Object[] objArr = this.f37300f;
        k.b(objArr);
        E(D(objArr, this.f37298d, i4, cVar), iF, this.f37298d, 0);
        return cVar.f32941a;
    }

    public final b d() {
        b dVar;
        Object[] objArr = this.f37300f;
        if (objArr == this.f37296b && this.g == this.f37297c) {
            dVar = this.f37295a;
        } else {
            this.f37299e = new b1.b();
            this.f37296b = objArr;
            Object[] objArr2 = this.g;
            this.f37297c = objArr2;
            if (objArr != null) {
                dVar = new d(objArr, objArr2, this.f37301h, this.f37298d);
            } else if (objArr2.length == 0) {
                dVar = h.f37308b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f37301h);
                k.d(objArrCopyOf, "copyOf(...)");
                dVar = new h(objArrCopyOf);
            }
        }
        this.f37295a = dVar;
        return dVar;
    }

    public final int g() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        Object[] objArr;
        com.bumptech.glide.c.f(i4, a());
        if (F() <= i4) {
            objArr = this.g;
        } else {
            objArr = this.f37300f;
            k.b(objArr);
            for (int i10 = this.f37298d; i10 > 0; i10 -= 5) {
                Object obj = objArr[jm.a.o(i4, i10)];
                k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i4 & 31];
    }

    public final void i(Collection collection, int i4, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.f37300f == null) {
            throw new IllegalStateException("root is null");
        }
        int i12 = i4 >> 5;
        a aVarM = m(F() >> 5);
        int i13 = i11;
        Object[] objArrP = objArr2;
        while (aVarM.f37287a - 1 != i12) {
            Object[] objArr3 = (Object[]) aVarM.previous();
            m.N(0, 32 - i10, 32, objArr3, objArrP);
            objArrP = p(objArr3, i10);
            i13--;
            objArr[i13] = objArrP;
        }
        Object[] objArr4 = (Object[]) aVarM.previous();
        int iF = i11 - (((F() >> 5) - 1) - i12);
        if (iF < i11) {
            objArr2 = objArr[iF];
            k.b(objArr2);
        }
        H(collection, i4, objArr4, 32, objArr, iF, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i4, int i10, Object obj, rf.c cVar) {
        Object obj2;
        int iO = jm.a.o(i10, i4);
        if (i4 == 0) {
            cVar.f32941a = objArr[31];
            Object[] objArrO = o(objArr);
            m.N(iO + 1, iO, 31, objArr, objArrO);
            objArrO[iO] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i11 = i4 - 5;
        Object obj3 = objArrO2[iO];
        k.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[iO] = j((Object[]) obj3, i11, i10, obj, cVar);
        while (true) {
            iO++;
            if (iO >= 32 || (obj2 = objArrO2[iO]) == null) {
                break;
            }
            objArrO2[iO] = j((Object[]) obj2, i11, 0, cVar.f32941a, cVar);
        }
        return objArrO2;
    }

    public final void k(int i4, Object obj, Object[] objArr) {
        int I = I();
        Object[] objArrO = o(this.g);
        if (I >= 32) {
            Object[] objArr2 = this.g;
            Object obj2 = objArr2[31];
            m.N(i4 + 1, i4, 31, objArr2, objArrO);
            objArrO[i4] = obj;
            x(objArr, objArrO, r(obj2));
            return;
        }
        m.N(i4 + 1, i4, I, this.g, objArrO);
        objArrO[i4] = obj;
        this.f37300f = objArr;
        this.g = objArrO;
        this.f37301h++;
    }

    public final boolean l(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f37299e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        com.bumptech.glide.c.g(i4, this.f37301h);
        return new g(this, i4);
    }

    public final a m(int i4) {
        Object[] objArr = this.f37300f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iF = F() >> 5;
        com.bumptech.glide.c.g(i4, iF);
        int i10 = this.f37298d;
        return i10 == 0 ? new c(i4, objArr) : new i(objArr, i4, iF, i10 / 5);
    }

    public final Object[] o(Object[] objArr) {
        if (objArr == null) {
            return q();
        }
        if (l(objArr)) {
            return objArr;
        }
        Object[] objArrQ = q();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        m.R(0, length, 6, objArr, objArrQ);
        return objArrQ;
    }

    public final Object[] p(Object[] objArr, int i4) {
        if (l(objArr)) {
            m.N(i4, 0, 32 - i4, objArr, objArr);
            return objArr;
        }
        Object[] objArrQ = q();
        m.N(i4, 0, 32 - i4, objArr, objArrQ);
        return objArrQ;
    }

    public final Object[] q() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f37299e;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f37299e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return C(new o(2, collection));
    }

    public final Object[] s(Object[] objArr, int i4, int i10) {
        if (i10 < 0) {
            j1.a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int iO = jm.a.o(i4, i10);
        Object obj = objArr[iO];
        k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objS = s((Object[]) obj, i4, i10 - 5);
        if (iO < 31) {
            int i11 = iO + 1;
            if (objArr[i11] != null) {
                if (l(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] objArrQ = q();
                m.N(0, 0, i11, objArr, objArrQ);
                objArr = objArrQ;
            }
        }
        if (objS == objArr[iO]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iO] = objS;
        return objArrO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        com.bumptech.glide.c.f(i4, a());
        if (F() > i4) {
            rf.c cVar = new rf.c(null);
            Object[] objArr = this.f37300f;
            k.b(objArr);
            this.f37300f = G(objArr, this.f37298d, i4, obj, cVar);
            return cVar.f32941a;
        }
        Object[] objArrO = o(this.g);
        if (objArrO != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i10 = i4 & 31;
        Object obj2 = objArrO[i10];
        objArrO[i10] = obj;
        this.g = objArrO;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i4, int i10, rf.c cVar) {
        Object[] objArrT;
        int iO = jm.a.o(i10 - 1, i4);
        if (i4 == 5) {
            cVar.f32941a = objArr[iO];
            objArrT = null;
        } else {
            Object obj = objArr[iO];
            k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT = t((Object[]) obj, i4 - 5, i10, cVar);
        }
        if (objArrT == null && iO == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iO] = objArrT;
        return objArrO;
    }

    public final void u(Object[] objArr, int i4, int i10) {
        if (i10 == 0) {
            this.f37300f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.f37301h = i4;
            this.f37298d = i10;
            return;
        }
        rf.c cVar = new rf.c(null);
        k.b(objArr);
        Object[] objArrT = t(objArr, i10, i4, cVar);
        k.b(objArrT);
        Object obj = cVar.f32941a;
        k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.g = (Object[]) obj;
        this.f37301h = i4;
        if (objArrT[1] == null) {
            this.f37300f = (Object[]) objArrT[0];
            this.f37298d = i10 - 5;
        } else {
            this.f37300f = objArrT;
            this.f37298d = i10;
        }
    }

    public final Object[] v(Object[] objArr, int i4, int i10, Iterator it) {
        if (!it.hasNext()) {
            j1.a("invalid buffersIterator");
        }
        if (!(i10 >= 0)) {
            j1.a("negative shift");
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int iO = jm.a.o(i4, i10);
        int i11 = i10 - 5;
        objArrO[iO] = v((Object[]) objArrO[iO], i4, i11, it);
        while (true) {
            iO++;
            if (iO >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iO] = v((Object[]) objArrO[iO], 0, i11, it);
        }
        return objArrO;
    }

    public final Object[] w(Object[] objArr, int i4, Object[][] objArr2) {
        y0 y0VarI = k.i(objArr2);
        int i10 = i4 >> 5;
        int i11 = this.f37298d;
        Object[] objArrV = i10 < (1 << i11) ? v(objArr, i4, i11, y0VarI) : o(objArr);
        while (y0VarI.hasNext()) {
            this.f37298d += 5;
            objArrV = r(objArrV);
            int i12 = this.f37298d;
            v(objArrV, 1 << i12, i12, y0VarI);
        }
        return objArrV;
    }

    public final void x(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i4 = this.f37301h;
        int i10 = i4 >> 5;
        int i11 = this.f37298d;
        if (i10 > (1 << i11)) {
            this.f37300f = y(this.f37298d + 5, r(objArr), objArr2);
            this.g = objArr3;
            this.f37298d += 5;
            this.f37301h++;
            return;
        }
        if (objArr == null) {
            this.f37300f = objArr2;
            this.g = objArr3;
            this.f37301h = i4 + 1;
        } else {
            this.f37300f = y(i11, objArr, objArr2);
            this.g = objArr3;
            this.f37301h++;
        }
    }

    public final Object[] y(int i4, Object[] objArr, Object[] objArr2) {
        int iO = jm.a.o(a() - 1, i4);
        Object[] objArrO = o(objArr);
        if (i4 == 5) {
            objArrO[iO] = objArr2;
            return objArrO;
        }
        objArrO[iO] = y(i4 - 5, (Object[]) objArrO[iO], objArr2);
        return objArrO;
    }

    public final int z(mk.c cVar, Object[] objArr, int i4, int i10, rf.c cVar2, ArrayList arrayList, ArrayList arrayList2) {
        if (l(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = cVar2.f32941a;
        k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrQ = objArr2;
        for (int i11 = 0; i11 < i4; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i10 == 32) {
                    objArrQ = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i10 = 0;
                }
                objArrQ[i10] = obj2;
                i10++;
            }
        }
        cVar2.f32941a = objArrQ;
        if (objArr2 != objArrQ) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int I = I();
        if (I < 32) {
            Object[] objArrO = o(this.g);
            objArrO[I] = obj;
            this.g = objArrO;
            this.f37301h = a() + 1;
        } else {
            x(this.f37300f, this.g, r(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        Iterator it = collection.iterator();
        if (32 - I >= collection.size()) {
            Object[] objArrO = o(this.g);
            f(objArrO, I, it);
            this.g = objArrO;
            this.f37301h = collection.size() + this.f37301h;
            return true;
        }
        int size = ((collection.size() + I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.g);
        f(objArrO2, I, it);
        objArr[0] = objArrO2;
        for (int i4 = 1; i4 < size; i4++) {
            Object[] objArrQ = q();
            f(objArrQ, 0, it);
            objArr[i4] = objArrQ;
        }
        this.f37300f = w(this.f37300f, F(), objArr);
        Object[] objArrQ2 = q();
        f(objArrQ2, 0, it);
        this.g = objArrQ2;
        this.f37301h = collection.size() + this.f37301h;
        return true;
    }
}
