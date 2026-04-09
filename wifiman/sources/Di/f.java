package Di;

import Ci.f;
import Zg.AbstractC3676h;
import Zg.AbstractC3682n;
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

/* loaded from: classes4.dex */
public final class f extends AbstractC3676h implements f.a {

    /* renamed from: a, reason: collision with root package name */
    private int f3574a;

    /* renamed from: b, reason: collision with root package name */
    private Ci.f f3575b;

    /* renamed from: c, reason: collision with root package name */
    private Hi.f f3576c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f3577d;

    /* renamed from: e, reason: collision with root package name */
    private Object[] f3578e;

    /* renamed from: f, reason: collision with root package name */
    private int f3579f;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f3580a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Collection collection) {
            super(1);
            this.f3580a = collection;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f3580a.contains(obj));
        }
    }

    public f(Ci.f vector, Object[] objArr, Object[] vectorTail, int i10) {
        AbstractC6492s.i(vector, "vector");
        AbstractC6492s.i(vectorTail, "vectorTail");
        this.f3574a = i10;
        this.f3575b = vector;
        this.f3576c = new Hi.f();
        this.f3577d = objArr;
        this.f3578e = vectorTail;
        this.f3579f = vector.size();
    }

    private final boolean K0(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f3576c;
    }

    private final ListIterator M0(int i10) {
        if (this.f3577d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iM1 = m1() >> 5;
        Hi.d.b(i10, iM1);
        int i11 = this.f3574a;
        if (i11 == 0) {
            Object[] objArr = this.f3577d;
            AbstractC6492s.f(objArr);
            return new i(objArr, i10);
        }
        Object[] objArr2 = this.f3577d;
        AbstractC6492s.f(objArr2);
        return new k(objArr2, i10, iM1, i11 / 5);
    }

    private final Object[] N0(Object[] objArr) {
        return objArr == null ? V0() : K0(objArr) ? objArr : AbstractC3682n.q(objArr, V0(), 0, 0, AbstractC7978m.g(objArr.length, 32), 6, null);
    }

    private final void T(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f3577d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i13 = i10 >> 5;
        Object[] objArrQ1 = q1(i13, i11, objArr, i12, objArr2);
        int iM1 = i12 - (((m1() >> 5) - 1) - i13);
        if (iM1 < i12) {
            objArr2 = objArr[iM1];
            AbstractC6492s.f(objArr2);
        }
        r1(collection, i10, objArrQ1, 32, objArr, iM1, objArr2);
    }

    private final Object[] U0(Object[] objArr, int i10) {
        return K0(objArr) ? AbstractC3682n.m(objArr, objArr, i10, 0, 32 - i10) : AbstractC3682n.m(objArr, V0(), i10, 0, 32 - i10);
    }

    private final Object[] V0() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f3576c;
        return objArr;
    }

    private final Object[] W0(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f3576c;
        return objArr;
    }

    private final Object[] X0(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalStateException("Check failed.");
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
            o1(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            p1(objArr);
            this.f3579f = i10;
            this.f3574a = i11;
            return;
        }
        d dVar = new d(null);
        AbstractC6492s.f(objArr);
        Object[] objArrY0 = Y0(objArr, i11, i10, dVar);
        AbstractC6492s.f(objArrY0);
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        p1((Object[]) objA);
        this.f3579f = i10;
        if (objArrY0[1] == null) {
            o1((Object[]) objArrY0[0]);
            this.f3574a = i11 - 5;
        } else {
            o1(objArrY0);
            this.f3574a = i11;
        }
    }

    private final Object[] a1(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 < 0) {
            throw new IllegalStateException("Check failed.");
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
        int i12 = this.f3574a;
        Object[] objArrA1 = i11 < (1 << i12) ? a1(objArr, i10, i12, itA) : N0(objArr);
        while (itA.hasNext()) {
            this.f3574a += 5;
            objArrA1 = W0(objArrA1);
            int i13 = this.f3574a;
            a1(objArrA1, 1 << i13, i13, itA);
        }
        return objArrA1;
    }

    private final void c1(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f3574a;
        if (size > (1 << i10)) {
            o1(d1(W0(objArr), objArr2, this.f3574a + 5));
            p1(objArr3);
            this.f3574a += 5;
            this.f3579f = size() + 1;
            return;
        }
        if (objArr == null) {
            o1(objArr2);
            p1(objArr3);
            this.f3579f = size() + 1;
        } else {
            o1(d1(objArr, objArr2, i10));
            p1(objArr3);
            this.f3579f = size() + 1;
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
        int iS1 = s1();
        d dVar = new d(null);
        if (this.f3577d == null) {
            return h1(interfaceC6835l, iS1, dVar) != iS1;
        }
        ListIterator listIteratorM0 = M0(0);
        int iF1 = 32;
        while (iF1 == 32 && listIteratorM0.hasNext()) {
            iF1 = f1(interfaceC6835l, (Object[]) listIteratorM0.next(), 32, dVar);
        }
        if (iF1 == 32) {
            Hi.a.a(!listIteratorM0.hasNext());
            int iH1 = h1(interfaceC6835l, iS1, dVar);
            if (iH1 == 0) {
                Z0(this.f3577d, size(), this.f3574a);
            }
            return iH1 != iS1;
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
        int iE12 = e1(interfaceC6835l, this.f3578e, iS1, iE1, dVar, arrayList2, arrayList);
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC3682n.v(objArr, null, iE12, 32);
        if (arrayList.isEmpty()) {
            objArrA1 = this.f3577d;
            AbstractC6492s.f(objArrA1);
        } else {
            objArrA1 = a1(this.f3577d, i10, this.f3574a, arrayList.iterator());
        }
        int size = i10 + (arrayList.size() << 5);
        o1(l1(objArrA1, size));
        p1(objArr);
        this.f3579f = size + iE12;
        return true;
    }

    private final int h1(InterfaceC6835l interfaceC6835l, int i10, d dVar) {
        int iF1 = f1(interfaceC6835l, this.f3578e, i10, dVar);
        if (iF1 == i10) {
            Hi.a.a(dVar.a() == this.f3578e);
            return i10;
        }
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        AbstractC3682n.v(objArr, null, iF1, i10);
        p1(objArr);
        this.f3579f = size() - (i10 - iF1);
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
        Hi.a.a(i12 < size);
        if (size == 1) {
            Object obj = this.f3578e[0];
            Z0(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f3578e;
        Object obj2 = objArr2[i12];
        Object[] objArrM = AbstractC3682n.m(objArr2, N0(objArr2), i12, i12 + 1, size);
        objArrM[size - 1] = null;
        o1(objArr);
        p1(objArrM);
        this.f3579f = (i10 + size) - 1;
        this.f3574a = i11;
        return obj2;
    }

    private final Object[] l1(Object[] objArr, int i10) {
        if ((i10 & 31) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i10 == 0) {
            this.f3574a = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f3574a;
            if ((i11 >> i12) != 0) {
                return X0(objArr, i11, i12);
            }
            this.f3574a = i12 - 5;
            Object[] objArr2 = objArr[0];
            AbstractC6492s.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int m1() {
        if (size() <= 32) {
            return 0;
        }
        return l.c(size());
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

    private final void o1(Object[] objArr) {
        if (objArr != this.f3577d) {
            this.f3575b = null;
            this.f3577d = objArr;
        }
    }

    private final void p1(Object[] objArr) {
        if (objArr != this.f3578e) {
            this.f3575b = null;
            this.f3578e = objArr;
        }
    }

    private final void q0(Object[] objArr, int i10, Object obj) {
        int iS1 = s1();
        Object[] objArrN0 = N0(this.f3578e);
        if (iS1 < 32) {
            AbstractC3682n.m(this.f3578e, objArrN0, i10 + 1, i10, iS1);
            objArrN0[i10] = obj;
            o1(objArr);
            p1(objArrN0);
            this.f3579f = size() + 1;
            return;
        }
        Object[] objArr2 = this.f3578e;
        Object obj2 = objArr2[31];
        AbstractC3682n.m(objArr2, objArrN0, i10 + 1, i10, 31);
        objArrN0[i10] = obj;
        c1(objArr, objArrN0, W0(obj2));
    }

    private final Object[] q1(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f3577d == null) {
            throw new IllegalStateException("Required value was null.");
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

    private final void r1(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrV0;
        if (i12 < 1) {
            throw new IllegalStateException("Check failed.");
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

    private final Object[] s(int i10) {
        if (m1() <= i10) {
            return this.f3578e;
        }
        Object[] objArr = this.f3577d;
        AbstractC6492s.f(objArr);
        for (int i11 = this.f3574a; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            AbstractC6492s.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final int s1() {
        return t1(size());
    }

    private final int t1(int i10) {
        return i10 <= 32 ? i10 : i10 - l.c(i10);
    }

    private final Object[] v(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    public final Object[] C() {
        return this.f3577d;
    }

    public final int J() {
        return this.f3574a;
    }

    public final Object[] S() {
        return this.f3578e;
    }

    @Override // Ci.f.a
    public Ci.f a() {
        Ci.f eVar = this.f3575b;
        if (eVar == null) {
            Object[] objArr = this.f3577d;
            Object[] objArr2 = this.f3578e;
            this.f3576c = new Hi.f();
            if (objArr != null) {
                eVar = new e(objArr, objArr2, size(), this.f3574a);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, size());
                AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
                eVar = new j(objArrCopyOf);
            }
            this.f3575b = eVar;
        }
        return eVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iS1 = s1();
        if (iS1 < 32) {
            Object[] objArrN0 = N0(this.f3578e);
            objArrN0[iS1] = obj;
            p1(objArrN0);
            this.f3579f = size() + 1;
        } else {
            c1(this.f3577d, this.f3578e, W0(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iS1 = s1();
        Iterator it = elements.iterator();
        if (32 - iS1 >= elements.size()) {
            p1(v(N0(this.f3578e), iS1, it));
            this.f3579f = size() + elements.size();
        } else {
            int size = ((elements.size() + iS1) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = v(N0(this.f3578e), iS1, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = v(V0(), 0, it);
            }
            o1(b1(this.f3577d, m1(), objArr));
            p1(v(V0(), 0, it));
            this.f3579f = size() + elements.size();
        }
        return true;
    }

    @Override // Zg.AbstractC3676h
    public int g() {
        return this.f3579f;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        Hi.d.a(i10, size());
        return s(i10)[i10 & 31];
    }

    public final boolean i1(InterfaceC6835l predicate) {
        AbstractC6492s.i(predicate, "predicate");
        boolean zG1 = g1(predicate);
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
        Hi.d.a(i10, size());
        ((AbstractList) this).modCount++;
        int iM1 = m1();
        if (i10 >= iM1) {
            return k1(this.f3577d, iM1, this.f3574a, i10 - iM1);
        }
        d dVar = new d(this.f3578e[0]);
        Object[] objArr = this.f3577d;
        AbstractC6492s.f(objArr);
        k1(j1(objArr, this.f3574a, i10, dVar), iM1, this.f3574a, 0);
        return dVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC6492s.i(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        return i1(new a(elements));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        Hi.d.a(i10, size());
        if (m1() > i10) {
            d dVar = new d(null);
            Object[] objArr = this.f3577d;
            AbstractC6492s.f(objArr);
            o1(n1(objArr, this.f3574a, i10, obj, dVar));
            return dVar.a();
        }
        Object[] objArrN0 = N0(this.f3578e);
        if (objArrN0 != this.f3578e) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrN0[i11];
        objArrN0[i11] = obj;
        p1(objArrN0);
        return obj2;
    }

    public final int y() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        Hi.d.b(i10, size());
        return new h(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        Hi.d.b(i10, size());
        if (i10 == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM1 = m1();
        if (i10 >= iM1) {
            q0(this.f3577d, i10 - iM1, obj);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f3577d;
        AbstractC6492s.f(objArr);
        q0(b0(objArr, this.f3574a, i10, obj, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        Object[] objArrM;
        AbstractC6492s.i(elements, "elements");
        Hi.d.b(i10, size());
        if (i10 == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + elements.size()) - 1) / 32;
        if (size == 0) {
            Hi.a.a(i10 >= m1());
            int i12 = i10 & 31;
            int size2 = ((i10 + elements.size()) - 1) & 31;
            Object[] objArr = this.f3578e;
            Object[] objArrM2 = AbstractC3682n.m(objArr, N0(objArr), size2 + 1, i12, s1());
            v(objArrM2, i12, elements.iterator());
            p1(objArrM2);
            this.f3579f = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iS1 = s1();
        int iT1 = t1(size() + elements.size());
        if (i10 >= m1()) {
            objArrM = V0();
            r1(elements, i10, this.f3578e, iS1, objArr2, size, objArrM);
        } else if (iT1 > iS1) {
            int i13 = iT1 - iS1;
            objArrM = U0(this.f3578e, i13);
            T(elements, i10, i13, objArr2, size, objArrM);
        } else {
            int i14 = iS1 - iT1;
            objArrM = AbstractC3682n.m(this.f3578e, V0(), 0, i14, iS1);
            int i15 = 32 - i14;
            Object[] objArrU0 = U0(this.f3578e, i15);
            int i16 = size - 1;
            objArr2[i16] = objArrU0;
            T(elements, i10, i15, objArr2, i16, objArrU0);
        }
        o1(b1(this.f3577d, i11, objArr2));
        p1(objArrM);
        this.f3579f = size() + elements.size();
        return true;
    }
}
