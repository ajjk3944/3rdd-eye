package X;

import T.B0;
import W.e;
import Zg.AbstractC3676h;
import Zg.AbstractC3682n;
import a0.AbstractC3748a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class f extends AbstractC3676h implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private W.e f23982a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f23983b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f23984c;

    /* renamed from: d, reason: collision with root package name */
    private int f23985d;

    /* renamed from: e, reason: collision with root package name */
    private a0.e f23986e = new a0.e();

    /* renamed from: f, reason: collision with root package name */
    private Object[] f23987f;

    /* renamed from: g, reason: collision with root package name */
    private Object[] f23988g;

    /* renamed from: h, reason: collision with root package name */
    private int f23989h;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f23990a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Collection collection) {
            super(1);
            this.f23990a = collection;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f23990a.contains(obj));
        }
    }

    public f(W.e eVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f23982a = eVar;
        this.f23983b = objArr;
        this.f23984c = objArr2;
        this.f23985d = i10;
        this.f23987f = this.f23983b;
        this.f23988g = this.f23984c;
        this.f23989h = this.f23982a.size();
    }

    private final boolean K0(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f23986e;
    }

    private final ListIterator M0(int i10) {
        Object[] objArr = this.f23987f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iM1 = m1() >> 5;
        a0.d.b(i10, iM1);
        int i11 = this.f23985d;
        return i11 == 0 ? new i(objArr, i10) : new k(objArr, i10, iM1, i11 / 5);
    }

    private final Object[] N0(Object[] objArr) {
        return objArr == null ? V0() : K0(objArr) ? objArr : AbstractC3682n.q(objArr, V0(), 0, 0, AbstractC7978m.g(objArr.length, 32), 6, null);
    }

    private final void T(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f23987f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        Object[] objArrO1 = o1(i13, i11, objArr, i12, objArr2);
        int iM1 = i12 - (((m1() >> 5) - 1) - i13);
        if (iM1 < i12) {
            objArr2 = objArr[iM1];
            AbstractC6492s.f(objArr2);
        }
        p1(collection, i10, objArrO1, 32, objArr, iM1, objArr2);
    }

    private final Object[] U0(Object[] objArr, int i10) {
        return K0(objArr) ? AbstractC3682n.m(objArr, objArr, i10, 0, 32 - i10) : AbstractC3682n.m(objArr, V0(), i10, 0, 32 - i10);
    }

    private final Object[] V0() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f23986e;
        return objArr;
    }

    private final Object[] W0(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f23986e;
        return objArr;
    }

    private final Object[] X0(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            B0.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iA = l.a(i10, i11);
        Object obj = objArr[iA];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objX0 = X0((Object[]) obj, i10, i11 - 5);
        if (iA < 31) {
            int i12 = iA + 1;
            if (objArr[i12] != null) {
                if (K0(objArr)) {
                    AbstractC3682n.v(objArr, null, i12, 32);
                }
                objArr = AbstractC3682n.m(objArr, V0(), 0, 0, i12);
            }
        }
        if (objX0 == objArr[iA]) {
            return objArr;
        }
        Object[] objArrN0 = N0(objArr);
        objArrN0[iA] = objX0;
        return objArrN0;
    }

    private final Object[] Y0(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrY0;
        int iA = l.a(i11 - 1, i10);
        if (i10 == 5) {
            dVar.b(objArr[iA]);
            objArrY0 = null;
        } else {
            Object obj = objArr[iA];
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrY0 = Y0((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrY0 == null && iA == 0) {
            return null;
        }
        Object[] objArrN0 = N0(objArr);
        objArrN0[iA] = objArrY0;
        return objArrN0;
    }

    private final void Z0(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f23987f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f23988g = objArr;
            this.f23989h = i10;
            this.f23985d = i11;
            return;
        }
        d dVar = new d(null);
        AbstractC6492s.f(objArr);
        Object[] objArrY0 = Y0(objArr, i11, i10, dVar);
        AbstractC6492s.f(objArrY0);
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f23988g = (Object[]) objA;
        this.f23989h = i10;
        if (objArrY0[1] == null) {
            this.f23987f = (Object[]) objArrY0[0];
            this.f23985d = i11 - 5;
        } else {
            this.f23987f = objArrY0;
            this.f23985d = i11;
        }
    }

    private final Object[] a1(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            B0.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            B0.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrN0 = N0(objArr);
        int iA = l.a(i10, i11);
        int i12 = i11 - 5;
        objArrN0[iA] = a1((Object[]) objArrN0[iA], i10, i12, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrN0[iA] = a1((Object[]) objArrN0[iA], 0, i12, it);
        }
        return objArrN0;
    }

    private final Object[] b0(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object obj2;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            dVar.b(objArr[31]);
            Object[] objArrM = AbstractC3682n.m(objArr, N0(objArr), iA + 1, iA, 31);
            objArrM[iA] = obj;
            return objArrM;
        }
        Object[] objArrN0 = N0(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrN0[iA];
        AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN0[iA] = b0((Object[]) obj3, i12, i11, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrN0[iA]) == null) {
                break;
            }
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN0[iA] = b0((Object[]) obj2, i12, 0, dVar.a(), dVar);
        }
        return objArrN0;
    }

    private final Object[] b1(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator itA = AbstractC6477c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f23985d;
        Object[] objArrA1 = i11 < (1 << i12) ? a1(objArr, i10, i12, itA) : N0(objArr);
        while (itA.hasNext()) {
            this.f23985d += 5;
            objArrA1 = W0(objArrA1);
            int i13 = this.f23985d;
            a1(objArrA1, 1 << i13, i13, itA);
        }
        return objArrA1;
    }

    private final void c1(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f23985d;
        if (size > (1 << i10)) {
            this.f23987f = d1(W0(objArr), objArr2, this.f23985d + 5);
            this.f23988g = objArr3;
            this.f23985d += 5;
            this.f23989h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f23987f = objArr2;
            this.f23988g = objArr3;
            this.f23989h = size() + 1;
        } else {
            this.f23987f = d1(objArr, objArr2, i10);
            this.f23988g = objArr3;
            this.f23989h = size() + 1;
        }
    }

    private final Object[] d1(Object[] objArr, Object[] objArr2, int i10) {
        int iA = l.a(size() - 1, i10);
        Object[] objArrN0 = N0(objArr);
        if (i10 == 5) {
            objArrN0[iA] = objArr2;
        } else {
            objArrN0[iA] = d1((Object[]) objArrN0[iA], objArr2, i10 - 5);
        }
        return objArrN0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int e1(InterfaceC6835l interfaceC6835l, Object[] objArr, int i10, int i11, d dVar, List list, List list2) {
        if (K0(objArr)) {
            list.add(objArr);
        }
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        Object[] objArrV0 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!((Boolean) interfaceC6835l.invoke(obj)).booleanValue()) {
                if (i11 == 32) {
                    objArrV0 = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : V0();
                    i11 = 0;
                }
                objArrV0[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArrV0);
        if (objArr2 != dVar.a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    private final int f1(InterfaceC6835l interfaceC6835l, Object[] objArr, int i10, d dVar) {
        Object[] objArrN0 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) interfaceC6835l.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrN0 = N0(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrN0[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArrN0);
        return i11;
    }

    private final boolean g1(InterfaceC6835l interfaceC6835l) {
        Object[] objArrA1;
        int iQ1 = q1();
        d dVar = new d(null);
        if (this.f23987f == null) {
            return h1(interfaceC6835l, iQ1, dVar) != iQ1;
        }
        ListIterator listIteratorM0 = M0(0);
        int iF1 = 32;
        while (iF1 == 32 && listIteratorM0.hasNext()) {
            iF1 = f1(interfaceC6835l, (Object[]) listIteratorM0.next(), 32, dVar);
        }
        if (iF1 == 32) {
            AbstractC3748a.a(!listIteratorM0.hasNext());
            int iH1 = h1(interfaceC6835l, iQ1, dVar);
            if (iH1 == 0) {
                Z0(this.f23987f, size(), this.f23985d);
            }
            return iH1 != iQ1;
        }
        int iPreviousIndex = listIteratorM0.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iE1 = iF1;
        while (listIteratorM0.hasNext()) {
            iE1 = e1(interfaceC6835l, (Object[]) listIteratorM0.next(), 32, iE1, dVar, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i10 = iPreviousIndex;
        int iE12 = e1(interfaceC6835l, this.f23988g, iQ1, iE1, dVar, arrayList2, arrayList);
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC3682n.v(objArr, null, iE12, 32);
        if (arrayList.isEmpty()) {
            objArrA1 = this.f23987f;
            AbstractC6492s.f(objArrA1);
        } else {
            objArrA1 = a1(this.f23987f, i10, this.f23985d, arrayList.iterator());
        }
        int size = i10 + (arrayList.size() << 5);
        this.f23987f = l1(objArrA1, size);
        this.f23988g = objArr;
        this.f23989h = size + iE12;
        return true;
    }

    private final int h1(InterfaceC6835l interfaceC6835l, int i10, d dVar) {
        int iF1 = f1(interfaceC6835l, this.f23988g, i10, dVar);
        if (iF1 == i10) {
            AbstractC3748a.a(dVar.a() == this.f23988g);
            return i10;
        }
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC3682n.v(objArr, null, iF1, i10);
        this.f23988g = objArr;
        this.f23989h = size() - (i10 - iF1);
        return iF1;
    }

    private final Object[] j1(Object[] objArr, int i10, int i11, d dVar) {
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iA];
            Object[] objArrM = AbstractC3682n.m(objArr, N0(objArr), iA, iA + 1, 32);
            objArrM[31] = dVar.a();
            dVar.b(obj);
            return objArrM;
        }
        int iA2 = objArr[31] == null ? l.a(m1() - 1, i10) : 31;
        Object[] objArrN0 = N0(objArr);
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj2 = objArrN0[iA2];
                AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrN0[iA2] = j1((Object[]) obj2, i12, 0, dVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrN0[iA];
        AbstractC6492s.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrN0[iA] = j1((Object[]) obj3, i12, i11, dVar);
        return objArrN0;
    }

    private final Object k1(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        AbstractC3748a.a(i12 < size);
        if (size == 1) {
            Object obj = this.f23988g[0];
            Z0(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f23988g;
        Object obj2 = objArr2[i12];
        Object[] objArrM = AbstractC3682n.m(objArr2, N0(objArr2), i12, i12 + 1, size);
        objArrM[size - 1] = null;
        this.f23987f = objArr;
        this.f23988g = objArrM;
        this.f23989h = (i10 + size) - 1;
        this.f23985d = i11;
        return obj2;
    }

    private final Object[] l1(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            B0.a("invalid size");
        }
        if (i10 == 0) {
            this.f23985d = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f23985d;
            if ((i11 >> i12) != 0) {
                return X0(objArr, i11, i12);
            }
            this.f23985d = i12 - 5;
            Object[] objArr2 = objArr[0];
            AbstractC6492s.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int m1() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] n1(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        int iA = l.a(i11, i10);
        Object[] objArrN0 = N0(objArr);
        if (i10 != 0) {
            Object obj2 = objArrN0[iA];
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN0[iA] = n1((Object[]) obj2, i10 - 5, i11, obj, dVar);
            return objArrN0;
        }
        if (objArrN0 != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.b(objArrN0[iA]);
        objArrN0[iA] = obj;
        return objArrN0;
    }

    private final Object[] o1(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f23987f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator listIteratorM0 = M0(m1() >> 5);
        while (listIteratorM0.previousIndex() != i10) {
            Object[] objArr3 = (Object[]) listIteratorM0.previous();
            AbstractC3682n.m(objArr3, objArr2, 0, 32 - i11, 32);
            objArr2 = U0(objArr3, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return (Object[]) listIteratorM0.previous();
    }

    private final void p1(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrV0;
        if (!(i12 >= 1)) {
            B0.a("requires at least one nullBuffer");
        }
        Object[] objArrN0 = N0(objArr);
        objArr2[0] = objArrN0;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            AbstractC3682n.m(objArrN0, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrV0 = objArrN0;
            } else {
                objArrV0 = V0();
                i12--;
                objArr2[i12] = objArrV0;
            }
            int i16 = i11 - i15;
            AbstractC3682n.m(objArrN0, objArr3, 0, i16, i11);
            AbstractC3682n.m(objArrN0, objArrV0, size + 1, i13, i16);
            objArr3 = objArrV0;
        }
        Iterator it = collection.iterator();
        v(objArrN0, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = v(V0(), 0, it);
        }
        v(objArr3, 0, it);
    }

    private final void q0(Object[] objArr, int i10, Object obj) {
        int iQ1 = q1();
        Object[] objArrN0 = N0(this.f23988g);
        if (iQ1 < 32) {
            AbstractC3682n.m(this.f23988g, objArrN0, i10 + 1, i10, iQ1);
            objArrN0[i10] = obj;
            this.f23987f = objArr;
            this.f23988g = objArrN0;
            this.f23989h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f23988g;
        Object obj2 = objArr2[31];
        AbstractC3682n.m(objArr2, objArrN0, i10 + 1, i10, 31);
        objArrN0[i10] = obj;
        c1(objArr, objArrN0, W0(obj2));
    }

    private final int q1() {
        return r1(size());
    }

    private final int r1(int i10) {
        return i10 <= 32 ? i10 : i10 - l.d(i10);
    }

    private final Object[] s(int i10) {
        if (m1() <= i10) {
            return this.f23988g;
        }
        Object[] objArr = this.f23987f;
        AbstractC6492s.f(objArr);
        for (int i11 = this.f23985d; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            AbstractC6492s.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] v(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    public final Object[] C() {
        return this.f23987f;
    }

    public final int J() {
        return this.f23985d;
    }

    public final Object[] S() {
        return this.f23988g;
    }

    @Override // W.e.a
    public W.e a() {
        W.e eVar;
        if (this.f23987f == this.f23983b && this.f23988g == this.f23984c) {
            eVar = this.f23982a;
        } else {
            this.f23986e = new a0.e();
            Object[] objArr = this.f23987f;
            this.f23983b = objArr;
            Object[] objArr2 = this.f23988g;
            this.f23984c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f23987f;
                AbstractC6492s.f(objArr3);
                eVar = new e(objArr3, this.f23988g, size(), this.f23985d);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f23988g, size());
                AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.f23982a = eVar;
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iQ1 = q1();
        if (iQ1 < 32) {
            Object[] objArrN0 = N0(this.f23988g);
            objArrN0[iQ1] = obj;
            this.f23988g = objArrN0;
            this.f23989h = size() + 1;
        } else {
            c1(this.f23987f, this.f23988g, W0(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iQ1 = q1();
        Iterator it = collection.iterator();
        if (32 - iQ1 >= collection.size()) {
            this.f23988g = v(N0(this.f23988g), iQ1, it);
            this.f23989h = size() + collection.size();
        } else {
            int size = ((collection.size() + iQ1) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = v(N0(this.f23988g), iQ1, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = v(V0(), 0, it);
            }
            this.f23987f = b1(this.f23987f, m1(), objArr);
            this.f23988g = v(V0(), 0, it);
            this.f23989h = size() + collection.size();
        }
        return true;
    }

    @Override // Zg.AbstractC3676h
    public int g() {
        return this.f23989h;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        a0.d.a(i10, size());
        return s(i10)[i10 & 31];
    }

    public final boolean i1(InterfaceC6835l interfaceC6835l) {
        boolean zG1 = g1(interfaceC6835l);
        if (zG1) {
            ((AbstractList) this).modCount++;
        }
        return zG1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // Zg.AbstractC3676h
    public Object j(int i10) {
        a0.d.a(i10, size());
        ((AbstractList) this).modCount++;
        int iM1 = m1();
        if (i10 >= iM1) {
            return k1(this.f23987f, iM1, this.f23985d, i10 - iM1);
        }
        d dVar = new d(this.f23988g[0]);
        Object[] objArr = this.f23987f;
        AbstractC6492s.f(objArr);
        k1(j1(objArr, this.f23985d, i10, dVar), iM1, this.f23985d, 0);
        return dVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        return i1(new a(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        a0.d.a(i10, size());
        if (m1() > i10) {
            d dVar = new d(null);
            Object[] objArr = this.f23987f;
            AbstractC6492s.f(objArr);
            this.f23987f = n1(objArr, this.f23985d, i10, obj, dVar);
            return dVar.a();
        }
        Object[] objArrN0 = N0(this.f23988g);
        if (objArrN0 != this.f23988g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrN0[i11];
        objArrN0[i11] = obj;
        this.f23988g = objArrN0;
        return obj2;
    }

    public final int y() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        a0.d.b(i10, size());
        return new h(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        a0.d.b(i10, size());
        if (i10 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM1 = m1();
        if (i10 >= iM1) {
            q0(this.f23987f, i10 - iM1, obj);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f23987f;
        AbstractC6492s.f(objArr);
        q0(b0(objArr, this.f23985d, i10, obj, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        Object[] objArrM;
        a0.d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            AbstractC3748a.a(i10 >= m1());
            int i12 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr = this.f23988g;
            Object[] objArrM2 = AbstractC3682n.m(objArr, N0(objArr), size2 + 1, i12, q1());
            v(objArrM2, i12, collection.iterator());
            this.f23988g = objArrM2;
            this.f23989h = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iQ1 = q1();
        int iR1 = r1(size() + collection.size());
        if (i10 >= m1()) {
            objArrM = V0();
            p1(collection, i10, this.f23988g, iQ1, objArr2, size, objArrM);
        } else if (iR1 > iQ1) {
            int i13 = iR1 - iQ1;
            objArrM = U0(this.f23988g, i13);
            T(collection, i10, i13, objArr2, size, objArrM);
        } else {
            int i14 = iQ1 - iR1;
            objArrM = AbstractC3682n.m(this.f23988g, V0(), 0, i14, iQ1);
            int i15 = 32 - i14;
            Object[] objArrU0 = U0(this.f23988g, i15);
            int i16 = size - 1;
            objArr2[i16] = objArrU0;
            T(collection, i10, i15, objArr2, i16, objArrU0);
        }
        this.f23987f = b1(this.f23987f, i11, objArr2);
        this.f23988g = objArrM;
        this.f23989h = size() + collection.size();
        return true;
    }
}
