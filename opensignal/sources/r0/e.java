package r0;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import java.util.Arrays;
import java.util.ListIterator;
import n0.g1;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f21117a;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f21118d;

    /* renamed from: g, reason: collision with root package name */
    public final int f21119g;

    /* renamed from: r, reason: collision with root package name */
    public final int f21120r;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f21117a = objArr;
        this.f21118d = objArr2;
        this.f21119g = i10;
        this.f21120r = i11;
        if (!(a() > 32)) {
            g1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] l(Object[] objArr, int i10, int i11, Object obj, a2.a aVar) {
        Object[] objArrCopyOf;
        int iG = e5.G(i11, i10);
        if (i10 == 0) {
            if (iG == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.d(objArrCopyOf, "copyOf(...)");
            }
            mq.l.c0(iG + 1, iG, 31, objArr, objArrCopyOf);
            aVar.f28a = objArr[31];
            objArrCopyOf[iG] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iG];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iG] = l((Object[]) obj2, i12, i11, obj, aVar);
        while (true) {
            iG++;
            if (iG >= 32 || objArrCopyOf2[iG] == null) {
                break;
            }
            Object obj3 = objArr[iG];
            l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iG] = l((Object[]) obj3, i12, 0, aVar.f28a, aVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] n(Object[] objArr, int i10, int i11, a2.a aVar) {
        Object[] objArrN;
        int iG = e5.G(i11, i10);
        if (i10 == 5) {
            aVar.f28a = objArr[iG];
            objArrN = null;
        } else {
            Object obj = objArr[iG];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrN = n((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArrN == null && iG == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iG] = objArrN;
        return objArrCopyOf;
    }

    public static Object[] u(Object[] objArr, int i10, int i11, Object obj) {
        int iG = e5.G(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iG] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iG];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iG] = u((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    @Override // mq.a
    public final int a() {
        return this.f21119g;
    }

    @Override // r0.c
    public final c b(int i10, Object obj) {
        int i11 = this.f21119g;
        io.sentry.config.a.H(i10, i11);
        if (i10 == i11) {
            return c(obj);
        }
        int iT = t();
        Object[] objArr = this.f21117a;
        if (i10 >= iT) {
            return m(i10 - iT, obj, objArr);
        }
        a2.a aVar = new a2.a(null);
        return m(0, aVar.f28a, l(objArr, this.f21120r, i10, obj, aVar));
    }

    @Override // r0.c
    public final c c(Object obj) {
        int iT = t();
        int i10 = this.f21119g;
        int i11 = i10 - iT;
        Object[] objArr = this.f21117a;
        Object[] objArr2 = this.f21118d;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return o(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = obj;
        return new e(objArr, objArrCopyOf, i10 + 1, this.f21120r);
    }

    @Override // r0.c
    public final f e() {
        return new f(this, this.f21117a, this.f21118d, this.f21120r);
    }

    @Override // r0.c
    public final c g(b bVar) {
        f fVar = new f(this, this.f21117a, this.f21118d, this.f21120r);
        fVar.E(bVar);
        return fVar.c();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        io.sentry.config.a.G(i10, a());
        if (t() <= i10) {
            objArr = this.f21118d;
        } else {
            objArr = this.f21117a;
            for (int i11 = this.f21120r; i11 > 0; i11 -= 5) {
                Object obj = objArr[e5.G(i10, i11)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    @Override // r0.c
    public final c j(int i10) {
        io.sentry.config.a.G(i10, this.f21119g);
        int iT = t();
        Object[] objArr = this.f21117a;
        int i11 = this.f21120r;
        return i10 >= iT ? s(objArr, iT, i11, i10 - iT) : s(r(objArr, i11, i10, new a2.a(this.f21118d[0])), iT, i11, 0);
    }

    @Override // r0.c
    public final c k(int i10, Object obj) {
        int i11 = this.f21119g;
        io.sentry.config.a.G(i10, i11);
        int iT = t();
        Object[] objArr = this.f21117a;
        Object[] objArr2 = this.f21118d;
        int i12 = this.f21120r;
        if (iT > i10) {
            return new e(u(objArr, i12, i10, obj), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new e(objArr, objArrCopyOf, i11, i12);
    }

    @Override // mq.d, java.util.List
    public final ListIterator listIterator(int i10) {
        io.sentry.config.a.H(i10, this.f21119g);
        return new g(i10, this.f21119g, (this.f21120r / 5) + 1, this.f21117a, this.f21118d);
    }

    public final e m(int i10, Object obj, Object[] objArr) {
        int iT = t();
        int i11 = this.f21119g;
        int i12 = i11 - iT;
        Object[] objArr2 = this.f21118d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        l.d(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            mq.l.c0(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new e(objArr, objArrCopyOf, i11 + 1, this.f21120r);
        }
        Object obj2 = objArr2[31];
        mq.l.c0(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, objArrCopyOf, objArr3);
    }

    public final e o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f21119g;
        int i11 = i10 >> 5;
        int i12 = this.f21120r;
        if (i11 <= (1 << i12)) {
            return new e(p(i12, objArr, objArr2), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new e(p(i13, objArr4, objArr2), objArr3, i10 + 1, i13);
    }

    public final Object[] p(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iG = e5.G(a() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            l.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iG] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iG] = p(i10 - 5, (Object[]) objArrCopyOf[iG], objArr2);
        return objArrCopyOf;
    }

    public final Object[] r(Object[] objArr, int i10, int i11, a2.a aVar) {
        Object[] objArrCopyOf;
        int iG = e5.G(i11, i10);
        if (i10 == 0) {
            if (iG == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                l.d(objArrCopyOf, "copyOf(...)");
            }
            mq.l.c0(iG, iG + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = aVar.f28a;
            aVar.f28a = objArr[iG];
            return objArrCopyOf;
        }
        int iG2 = objArr[31] == null ? e5.G(t() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        l.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iG + 1;
        if (i13 <= iG2) {
            while (true) {
                Object obj = objArrCopyOf2[iG2];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iG2] = r((Object[]) obj, i12, 0, aVar);
                if (iG2 == i13) {
                    break;
                }
                iG2--;
            }
        }
        Object obj2 = objArrCopyOf2[iG];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iG] = r((Object[]) obj2, i12, i11, aVar);
        return objArrCopyOf2;
    }

    public final c s(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f21119g - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f21118d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            l.d(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                mq.l.c0(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new e(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.d(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        a2.a aVar = new a2.a(null);
        Object[] objArrN = n(objArr, i11, i10 - 1, aVar);
        l.b(objArrN);
        Object obj = aVar.f28a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrN[1] != null) {
            return new e(objArrN, objArr3, i10, i11);
        }
        Object obj2 = objArrN[0];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i10, i11 - 5);
    }

    public final int t() {
        return (this.f21119g - 1) & (-32);
    }
}
