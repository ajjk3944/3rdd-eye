package r0;

import ar.k;
import br.b0;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import n0.g1;

/* loaded from: classes.dex */
public final class f extends mq.f implements Collection, cr.b {
    public Object[] B;
    public int D;

    /* renamed from: a, reason: collision with root package name */
    public c f21121a;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f21122d;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f21123g;

    /* renamed from: r, reason: collision with root package name */
    public int f21124r;

    /* renamed from: x, reason: collision with root package name */
    public u0.b f21125x = new u0.b();

    /* renamed from: y, reason: collision with root package name */
    public Object[] f21126y;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f21121a = cVar;
        this.f21122d = objArr;
        this.f21123g = objArr2;
        this.f21124r = i10;
        this.f21126y = objArr;
        this.B = objArr2;
        this.D = cVar.a();
    }

    public static void d(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final Object[] A(int i10, Object[] objArr, Object[] objArr2) {
        int iG = e5.G(a() - 1, i10);
        Object[] objArrN = n(objArr);
        if (i10 == 5) {
            objArrN[iG] = objArr2;
            return objArrN;
        }
        objArrN[iG] = A(i10 - 5, (Object[]) objArrN[iG], objArr2);
        return objArrN;
    }

    public final int B(k kVar, Object[] objArr, int i10, int i11, a2.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (l(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f28a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrP = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) kVar.a(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrP = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : p();
                    i11 = 0;
                }
                objArrP[i11] = obj2;
                i11++;
            }
        }
        aVar.f28a = objArrP;
        if (objArr2 != objArrP) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int C(k kVar, Object[] objArr, int i10, a2.a aVar) {
        Object[] objArrN = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) kVar.a(obj)).booleanValue()) {
                if (!z10) {
                    objArrN = n(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrN[i11] = obj;
                i11++;
            }
        }
        aVar.f28a = objArrN;
        return i11;
    }

    public final int D(k kVar, int i10, a2.a aVar) {
        int iC = C(kVar, this.B, i10, aVar);
        if (iC == i10) {
            return i10;
        }
        Object obj = aVar.f28a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iC, i10, (Object) null);
        this.B = objArr;
        this.D -= i10 - iC;
        return iC;
    }

    public final boolean E(k kVar) {
        Object[] objArrV;
        int i10;
        k kVar2 = kVar;
        int iM = M();
        Object[] objArrS = null;
        a2.a aVar = new a2.a(null);
        boolean z10 = false;
        if (this.f21126y != null) {
            a aVarM = m(0);
            int iC = 32;
            while (iC == 32 && aVarM.hasNext()) {
                iC = C(kVar2, (Object[]) aVarM.next(), 32, aVar);
            }
            if (iC == 32) {
                int iD = D(kVar2, iM, aVar);
                if (iD == 0) {
                    u(this.f21126y, this.D, this.f21124r);
                }
                if (iD != iM) {
                }
            } else {
                int i11 = (aVarM.f21111a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iB = iC;
                while (aVarM.hasNext()) {
                    iB = B(kVar2, (Object[]) aVarM.next(), 32, iB, aVar, arrayList2, arrayList);
                    kVar2 = kVar;
                }
                int iB2 = B(kVar, this.B, iM, iB, aVar, arrayList2, arrayList);
                Object obj = aVar.f28a;
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iB2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrV = this.f21126y;
                    l.b(objArrV);
                } else {
                    objArrV = v(this.f21126y, i11, this.f21124r, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    g1.a("invalid size");
                }
                if (size == 0) {
                    this.f21124r = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.f21124r;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.f21124r = i10 - 5;
                        Object[] objArr2 = objArrV[0];
                        l.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrV = objArr2;
                    }
                    objArrS = s(objArrV, i12, i10);
                }
                this.f21126y = objArrS;
                this.B = objArr;
                this.D = size + iB2;
            }
            z10 = true;
        } else if (D(kVar2, iM, aVar) != iM) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] F(Object[] objArr, int i10, int i11, a2.a aVar) {
        int iG = e5.G(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iG];
            Object[] objArrN = n(objArr);
            mq.l.c0(iG, iG + 1, 32, objArr, objArrN);
            objArrN[31] = aVar.f28a;
            aVar.f28a = obj;
            return objArrN;
        }
        int iG2 = objArr[31] == null ? e5.G(I() - 1, i10) : 31;
        Object[] objArrN2 = n(objArr);
        int i12 = i10 - 5;
        int i13 = iG + 1;
        if (i13 <= iG2) {
            while (true) {
                Object obj2 = objArrN2[iG2];
                l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrN2[iG2] = F((Object[]) obj2, i12, 0, aVar);
                if (iG2 == i13) {
                    break;
                }
                iG2--;
            }
        }
        Object obj3 = objArrN2[iG];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN2[iG] = F((Object[]) obj3, i12, i11, aVar);
        return objArrN2;
    }

    public final Object H(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.D - i10;
        if (i13 == 1) {
            Object obj = this.B[0];
            u(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.B;
        Object obj2 = objArr2[i12];
        Object[] objArrN = n(objArr2);
        mq.l.c0(i12, i12 + 1, i13, objArr2, objArrN);
        objArrN[i13 - 1] = null;
        this.f21126y = objArr;
        this.B = objArrN;
        this.D = (i10 + i13) - 1;
        this.f21124r = i11;
        return obj2;
    }

    public final int I() {
        int i10 = this.D;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] J(Object[] objArr, int i10, int i11, Object obj, a2.a aVar) {
        int iG = e5.G(i11, i10);
        Object[] objArrN = n(objArr);
        if (i10 != 0) {
            Object obj2 = objArrN[iG];
            l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN[iG] = J((Object[]) obj2, i10 - 5, i11, obj, aVar);
            return objArrN;
        }
        if (objArrN != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f28a = objArrN[iG];
        objArrN[iG] = obj;
        return objArrN;
    }

    public final void K(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrP;
        if (i12 < 1) {
            g1.a("requires at least one nullBuffer");
        }
        Object[] objArrN = n(objArr);
        objArr2[0] = objArrN;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            mq.l.c0(size + 1, i13, i11, objArrN, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrP = objArrN;
            } else {
                objArrP = p();
                i12--;
                objArr2[i12] = objArrP;
            }
            int i16 = i11 - i15;
            mq.l.c0(0, i16, i11, objArrN, objArr3);
            mq.l.c0(size + 1, i13, i16, objArrN, objArrP);
            objArr3 = objArrP;
        }
        Iterator it = collection.iterator();
        d(objArrN, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrP2 = p();
            d(objArrP2, 0, it);
            objArr2[i17] = objArrP2;
        }
        d(objArr3, 0, it);
    }

    public final int M() {
        int i10 = this.D;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    @Override // mq.f
    public final int a() {
        return this.D;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        io.sentry.config.a.H(i10, a());
        if (i10 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        if (i10 >= I) {
            k(i10 - I, obj, this.f21126y);
            return;
        }
        a2.a aVar = new a2.a(null);
        Object[] objArr = this.f21126y;
        l.b(objArr);
        k(0, aVar.f28a, j(objArr, this.f21124r, i10, obj, aVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrP;
        io.sentry.config.a.H(i10, this.D);
        if (i10 == this.D) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.D - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.B;
            Object[] objArrN = n(objArr);
            mq.l.c0(size2 + 1, i12, M(), objArr, objArrN);
            d(objArrN, i12, collection.iterator());
            this.B = objArrN;
            this.D = collection.size() + this.D;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM = M();
        int size3 = collection.size() + this.D;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= I()) {
            objArrP = p();
            collection2 = collection;
            K(collection2, i10, this.B, iM, objArr2, size, objArrP);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iM) {
                int i13 = size3 - iM;
                Object[] objArrO = o(i13, fVar.B);
                fVar.g(collection2, i10, i13, objArr2, size, objArrO);
                objArr2 = objArr2;
                objArrP = objArrO;
            } else {
                Object[] objArr3 = fVar.B;
                objArrP = p();
                int i14 = iM - size3;
                mq.l.c0(0, i14, iM, objArr3, objArrP);
                int i15 = 32 - i14;
                Object[] objArrO2 = o(i15, fVar.B);
                int i16 = size - 1;
                objArr2[i16] = objArrO2;
                fVar.g(collection2, i10, i15, objArr2, i16, objArrO2);
                collection2 = collection2;
            }
        }
        fVar.f21126y = x(fVar.f21126y, i11, objArr2);
        fVar.B = objArrP;
        fVar.D = collection2.size() + fVar.D;
        return true;
    }

    @Override // mq.f
    public final Object b(int i10) {
        io.sentry.config.a.G(i10, a());
        ((AbstractList) this).modCount++;
        int I = I();
        if (i10 >= I) {
            return H(this.f21126y, I, this.f21124r, i10 - I);
        }
        a2.a aVar = new a2.a(this.B[0]);
        Object[] objArr = this.f21126y;
        l.b(objArr);
        H(F(objArr, this.f21124r, i10, aVar), I, this.f21124r, 0);
        return aVar.f28a;
    }

    public final c c() {
        c eVar;
        Object[] objArr = this.f21126y;
        if (objArr == this.f21122d && this.B == this.f21123g) {
            eVar = this.f21121a;
        } else {
            this.f21125x = new u0.b();
            this.f21122d = objArr;
            Object[] objArr2 = this.B;
            this.f21123g = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.D, this.f21124r);
            } else if (objArr2.length == 0) {
                eVar = i.f21133d;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.D);
                l.d(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f21121a = eVar;
        return eVar;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void g(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f21126y == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarM = m(I() >> 5);
        int i14 = i12;
        Object[] objArrO = objArr2;
        while (aVarM.f21111a - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarM.previous();
            mq.l.c0(0, 32 - i11, 32, objArr3, objArrO);
            objArrO = o(i11, objArr3);
            i14--;
            objArr[i14] = objArrO;
        }
        Object[] objArr4 = (Object[]) aVarM.previous();
        int I = i12 - (((I() >> 5) - 1) - i13);
        if (I < i12) {
            objArr2 = objArr[I];
            l.b(objArr2);
        }
        K(collection, i10, objArr4, 32, objArr, I, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        io.sentry.config.a.G(i10, a());
        if (I() <= i10) {
            objArr = this.B;
        } else {
            objArr = this.f21126y;
            l.b(objArr);
            for (int i11 = this.f21124r; i11 > 0; i11 -= 5) {
                Object obj = objArr[e5.G(i10, i11)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i10, int i11, Object obj, a2.a aVar) {
        Object obj2;
        int iG = e5.G(i11, i10);
        if (i10 == 0) {
            aVar.f28a = objArr[31];
            Object[] objArrN = n(objArr);
            mq.l.c0(iG + 1, iG, 31, objArr, objArrN);
            objArrN[iG] = obj;
            return objArrN;
        }
        Object[] objArrN2 = n(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrN2[iG];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN2[iG] = j((Object[]) obj3, i12, i11, obj, aVar);
        while (true) {
            iG++;
            if (iG >= 32 || (obj2 = objArrN2[iG]) == null) {
                break;
            }
            objArrN2[iG] = j((Object[]) obj2, i12, 0, aVar.f28a, aVar);
        }
        return objArrN2;
    }

    public final void k(int i10, Object obj, Object[] objArr) {
        int iM = M();
        Object[] objArrN = n(this.B);
        if (iM >= 32) {
            Object[] objArr2 = this.B;
            Object obj2 = objArr2[31];
            mq.l.c0(i10 + 1, i10, 31, objArr2, objArrN);
            objArrN[i10] = obj;
            z(objArr, objArrN, r(obj2));
            return;
        }
        mq.l.c0(i10 + 1, i10, iM, this.B, objArrN);
        objArrN[i10] = obj;
        this.f21126y = objArr;
        this.B = objArrN;
        this.D++;
    }

    public final boolean l(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f21125x;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        io.sentry.config.a.H(i10, this.D);
        return new h(this, i10);
    }

    public final a m(int i10) {
        Object[] objArr = this.f21126y;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int I = I() >> 5;
        io.sentry.config.a.H(i10, I);
        int i11 = this.f21124r;
        return i11 == 0 ? new d(i10, objArr) : new j(objArr, i10, I, i11 / 5);
    }

    public final Object[] n(Object[] objArr) {
        if (objArr == null) {
            return p();
        }
        if (l(objArr)) {
            return objArr;
        }
        Object[] objArrP = p();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        mq.l.f0(0, length, 6, objArr, objArrP);
        return objArrP;
    }

    public final Object[] o(int i10, Object[] objArr) {
        if (l(objArr)) {
            mq.l.c0(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrP = p();
        mq.l.c0(i10, 0, 32 - i10, objArr, objArrP);
        return objArrP;
    }

    public final Object[] p() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f21125x;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f21125x;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return E(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            g1.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iG = e5.G(i10, i11);
        Object obj = objArr[iG];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objS = s((Object[]) obj, i10, i11 - 5);
        if (iG < 31) {
            int i12 = iG + 1;
            if (objArr[i12] != null) {
                if (l(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrP = p();
                mq.l.c0(0, 0, i12, objArr, objArrP);
                objArr = objArrP;
            }
        }
        if (objS == objArr[iG]) {
            return objArr;
        }
        Object[] objArrN = n(objArr);
        objArrN[iG] = objS;
        return objArrN;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        io.sentry.config.a.G(i10, a());
        if (I() > i10) {
            a2.a aVar = new a2.a(null);
            Object[] objArr = this.f21126y;
            l.b(objArr);
            this.f21126y = J(objArr, this.f21124r, i10, obj, aVar);
            return aVar.f28a;
        }
        Object[] objArrN = n(this.B);
        if (objArrN != this.B) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrN[i11];
        objArrN[i11] = obj;
        this.B = objArrN;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i10, int i11, a2.a aVar) {
        Object[] objArrT;
        int iG = e5.G(i11 - 1, i10);
        if (i10 == 5) {
            aVar.f28a = objArr[iG];
            objArrT = null;
        } else {
            Object obj = objArr[iG];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT = t((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArrT == null && iG == 0) {
            return null;
        }
        Object[] objArrN = n(objArr);
        objArrN[iG] = objArrT;
        return objArrN;
    }

    public final void u(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f21126y = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.B = objArr;
            this.D = i10;
            this.f21124r = i11;
            return;
        }
        a2.a aVar = new a2.a(null);
        l.b(objArr);
        Object[] objArrT = t(objArr, i11, i10, aVar);
        l.b(objArrT);
        Object obj = aVar.f28a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.B = (Object[]) obj;
        this.D = i10;
        if (objArrT[1] == null) {
            this.f21126y = (Object[]) objArrT[0];
            this.f21124r = i11 - 5;
        } else {
            this.f21126y = objArrT;
            this.f21124r = i11;
        }
    }

    public final Object[] v(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            g1.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            g1.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrN = n(objArr);
        int iG = e5.G(i10, i11);
        int i12 = i11 - 5;
        objArrN[iG] = v((Object[]) objArrN[iG], i10, i12, it);
        while (true) {
            iG++;
            if (iG >= 32 || !it.hasNext()) {
                break;
            }
            objArrN[iG] = v((Object[]) objArrN[iG], 0, i12, it);
        }
        return objArrN;
    }

    public final Object[] x(Object[] objArr, int i10, Object[][] objArr2) {
        br.b bVarE = b0.e(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f21124r;
        Object[] objArrV = i11 < (1 << i12) ? v(objArr, i10, i12, bVarE) : n(objArr);
        while (bVarE.hasNext()) {
            this.f21124r += 5;
            objArrV = r(objArrV);
            int i13 = this.f21124r;
            v(objArrV, 1 << i13, i13, bVarE);
        }
        return objArrV;
    }

    public final void z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.D;
        int i11 = i10 >> 5;
        int i12 = this.f21124r;
        if (i11 > (1 << i12)) {
            this.f21126y = A(this.f21124r + 5, r(objArr), objArr2);
            this.B = objArr3;
            this.f21124r += 5;
            this.D++;
            return;
        }
        if (objArr == null) {
            this.f21126y = objArr2;
            this.B = objArr3;
            this.D = i10 + 1;
        } else {
            this.f21126y = A(i12, objArr, objArr2);
            this.B = objArr3;
            this.D++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM = M();
        if (iM < 32) {
            Object[] objArrN = n(this.B);
            objArrN[iM] = obj;
            this.B = objArrN;
            this.D = a() + 1;
        } else {
            z(this.f21126y, this.B, r(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        Iterator it = collection.iterator();
        if (32 - iM >= collection.size()) {
            Object[] objArrN = n(this.B);
            d(objArrN, iM, it);
            this.B = objArrN;
            this.D = collection.size() + this.D;
            return true;
        }
        int size = ((collection.size() + iM) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrN2 = n(this.B);
        d(objArrN2, iM, it);
        objArr[0] = objArrN2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrP = p();
            d(objArrP, 0, it);
            objArr[i10] = objArrP;
        }
        this.f21126y = x(this.f21126y, I(), objArr);
        Object[] objArrP2 = p();
        d(objArrP2, 0, it);
        this.B = objArrP2;
        this.D = collection.size() + this.D;
        return true;
    }
}
