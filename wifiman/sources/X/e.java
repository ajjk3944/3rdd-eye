package X;

import T.B0;
import Zg.AbstractC3682n;
import a0.AbstractC3748a;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class e extends b implements W.e {

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f23978b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f23979c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23980d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23981e;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f23978b = objArr;
        this.f23979c = objArr2;
        this.f23980d = i10;
        this.f23981e = i11;
        if (!(size() > 32)) {
            B0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        AbstractC3748a.a(size() - l.d(size()) <= AbstractC7978m.g(objArr2.length, 32));
    }

    private final Object[] C(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            }
            AbstractC3682n.m(objArr, objArrCopyOf, iA + 1, iA, 31);
            dVar.b(objArr[31]);
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC6492s.h(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iA];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = C((Object[]) obj2, i12, i11, obj, dVar);
        int i13 = iA + 1;
        while (i13 < 32 && objArrCopyOf2[i13] != null) {
            Object obj3 = objArr[i13];
            AbstractC6492s.g(obj3, str);
            Object[] objArr2 = objArrCopyOf2;
            objArr2[i13] = C((Object[]) obj3, i12, 0, dVar.a(), dVar);
            i13++;
            objArrCopyOf2 = objArr2;
            str = str;
        }
        return objArrCopyOf2;
    }

    private final e J(Object[] objArr, int i10, Object obj) {
        int size = size() - N0();
        Object[] objArrCopyOf = Arrays.copyOf(this.f23979c, 32);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            AbstractC3682n.m(this.f23979c, objArrCopyOf, i10 + 1, i10, size);
            objArrCopyOf[i10] = obj;
            return new e(objArr, objArrCopyOf, size() + 1, this.f23981e);
        }
        Object[] objArr2 = this.f23979c;
        Object obj2 = objArr2[31];
        AbstractC3682n.m(objArr2, objArrCopyOf, i10 + 1, i10, size - 1);
        objArrCopyOf[i10] = obj;
        return b0(objArr, objArrCopyOf, l.c(obj2));
    }

    private final Object[] K0(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            }
            AbstractC3682n.m(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = dVar.a();
            dVar.b(objArr[iA]);
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? l.a(N0() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC6492s.h(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = K0((Object[]) obj, i12, 0, dVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = K0((Object[]) obj2, i12, i11, dVar);
        return objArrCopyOf2;
    }

    private final W.e M0(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        AbstractC3748a.a(i12 < size);
        if (size == 1) {
            return T(objArr, i10, i11);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f23979c, 32);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        int i13 = size - 1;
        if (i12 < i13) {
            AbstractC3682n.m(this.f23979c, objArrCopyOf, i12, i12 + 1, size);
        }
        objArrCopyOf[i13] = null;
        return new e(objArr, objArrCopyOf, (i10 + size) - 1, i11);
    }

    private final int N0() {
        return l.d(size());
    }

    private final Object[] S(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrS;
        int iA = l.a(i11, i10);
        if (i10 == 5) {
            dVar.b(objArr[iA]);
            objArrS = null;
        } else {
            Object obj = objArr[iA];
            AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrS = S((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrS == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrS;
        return objArrCopyOf;
    }

    private final W.e T(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC6492s.h(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] objArrS = S(objArr, i11, i10 - 1, dVar);
        AbstractC6492s.f(objArrS);
        Object objA = dVar.a();
        AbstractC6492s.g(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        if (objArrS[1] != null) {
            return new e(objArrS, objArr2, i10, i11);
        }
        Object obj = objArrS[0];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr2, i10, i11 - 5);
    }

    private final Object[] U0(Object[] objArr, int i10, int i11, Object obj) {
        int iA = l.a(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            objArrCopyOf[iA] = obj;
        } else {
            Object obj2 = objArrCopyOf[iA];
            AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iA] = U0((Object[]) obj2, i10 - 5, i11, obj);
        }
        return objArrCopyOf;
    }

    private final e b0(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f23981e;
        if (size <= (1 << i10)) {
            return new e(q0(objArr, i10, objArr2), objArr3, size() + 1, this.f23981e);
        }
        Object[] objArrC = l.c(objArr);
        int i11 = this.f23981e + 5;
        return new e(q0(objArrC, i11, objArr2), objArr3, size() + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] q0(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = X.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.AbstractC6492s.h(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.q0(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.e.q0(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] v(int i10) {
        if (N0() <= i10) {
            return this.f23979c;
        }
        Object[] objArr = this.f23978b;
        for (int i11 = this.f23981e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            AbstractC6492s.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // W.e
    public W.e T0(InterfaceC6835l interfaceC6835l) {
        f fVarC = c();
        fVarC.i1(interfaceC6835l);
        return fVarC.a();
    }

    @Override // java.util.Collection, java.util.List, W.e
    public W.e add(Object obj) {
        int size = size() - N0();
        if (size >= 32) {
            return b0(this.f23978b, this.f23979c, l.c(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f23979c, 32);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = obj;
        return new e(this.f23978b, objArrCopyOf, size() + 1, this.f23981e);
    }

    @Override // W.e
    public W.e f0(int i10) {
        a0.d.a(i10, size());
        int iN0 = N0();
        return i10 >= iN0 ? M0(this.f23978b, iN0, this.f23981e, i10 - iN0) : M0(K0(this.f23978b, this.f23981e, i10, new d(this.f23979c[0])), iN0, this.f23981e, 0);
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public Object get(int i10) {
        a0.d.a(i10, size());
        return v(i10)[i10 & 31];
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f23980d;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public ListIterator listIterator(int i10) {
        a0.d.b(i10, size());
        return new g(this.f23978b, this.f23979c, i10, size(), (this.f23981e / 5) + 1);
    }

    @Override // Zg.AbstractC3672d, java.util.List, W.e
    public W.e set(int i10, Object obj) {
        a0.d.a(i10, size());
        if (N0() > i10) {
            return new e(U0(this.f23978b, this.f23981e, i10, obj), this.f23979c, size(), this.f23981e);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f23979c, 32);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i10 & 31] = obj;
        return new e(this.f23978b, objArrCopyOf, size(), this.f23981e);
    }

    @Override // W.e
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public f c() {
        return new f(this, this.f23978b, this.f23979c, this.f23981e);
    }

    @Override // java.util.List, W.e
    public W.e add(int i10, Object obj) {
        a0.d.b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        int iN0 = N0();
        if (i10 >= iN0) {
            return J(this.f23978b, i10 - iN0, obj);
        }
        d dVar = new d(null);
        return J(C(this.f23978b, this.f23981e, i10, obj, dVar), 0, dVar.a());
    }
}
