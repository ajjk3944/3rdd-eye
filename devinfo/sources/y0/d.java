package y0;

import g1.o;
import java.util.Arrays;
import java.util.ListIterator;
import nk.k;
import u0.j1;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f37291a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f37292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37294d;

    public d(Object[] objArr, Object[] objArr2, int i4, int i10) {
        this.f37291a = objArr;
        this.f37292b = objArr2;
        this.f37293c = i4;
        this.f37294d = i10;
        if (!(size() > 32)) {
            j1.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    public static Object[] k(Object[] objArr, int i4, int i10, Object obj, rf.c cVar) {
        Object[] objArrCopyOf;
        int iO = jm.a.o(i10, i4);
        if (i4 == 0) {
            if (iO == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                k.d(objArrCopyOf, "copyOf(...)");
            }
            m.N(iO + 1, iO, 31, objArr, objArrCopyOf);
            cVar.f32941a = objArr[31];
            objArrCopyOf[iO] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        k.d(objArrCopyOf2, "copyOf(...)");
        int i11 = i4 - 5;
        Object obj2 = objArr[iO];
        k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iO] = k((Object[]) obj2, i11, i10, obj, cVar);
        while (true) {
            iO++;
            if (iO >= 32 || objArrCopyOf2[iO] == null) {
                break;
            }
            Object obj3 = objArr[iO];
            k.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iO] = k((Object[]) obj3, i11, 0, cVar.f32941a, cVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] m(Object[] objArr, int i4, int i10, rf.c cVar) {
        Object[] objArrM;
        int iO = jm.a.o(i10, i4);
        if (i4 == 5) {
            cVar.f32941a = objArr[iO];
            objArrM = null;
        } else {
            Object obj = objArr[iO];
            k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM = m((Object[]) obj, i4 - 5, i10, cVar);
        }
        if (objArrM == null && iO == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        k.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iO] = objArrM;
        return objArrCopyOf;
    }

    public static Object[] t(int i4, int i10, Object obj, Object[] objArr) {
        int iO = jm.a.o(i10, i4);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        k.d(objArrCopyOf, "copyOf(...)");
        if (i4 == 0) {
            objArrCopyOf[iO] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iO];
        k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iO] = t(i4 - 5, i10, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // y0.b
    public final b a(int i4, Object obj) {
        com.bumptech.glide.c.g(i4, size());
        if (i4 == size()) {
            return c(obj);
        }
        int iS = s();
        Object[] objArr = this.f37291a;
        if (i4 >= iS) {
            return l(i4 - iS, obj, objArr);
        }
        rf.c cVar = new rf.c(null);
        return l(0, cVar.f32941a, k(objArr, this.f37294d, i4, obj, cVar));
    }

    @Override // y0.b
    public final b c(Object obj) {
        int size = size() - s();
        Object[] objArr = this.f37291a;
        Object[] objArr2 = this.f37292b;
        if (size >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return o(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        k.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[size] = obj;
        return new d(objArr, objArrCopyOf, size() + 1, this.f37294d);
    }

    @Override // y0.b
    public final e f() {
        return new e(this, this.f37291a, this.f37292b, this.f37294d);
    }

    @Override // y0.b
    public final b g(o oVar) {
        e eVar = new e(this, this.f37291a, this.f37292b, this.f37294d);
        eVar.C(oVar);
        return eVar.d();
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Object[] objArr;
        com.bumptech.glide.c.f(i4, size());
        if (s() <= i4) {
            objArr = this.f37292b;
        } else {
            objArr = this.f37291a;
            for (int i10 = this.f37294d; i10 > 0; i10 -= 5) {
                Object obj = objArr[jm.a.o(i4, i10)];
                k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i4 & 31];
    }

    @Override // zj.a
    public final int getSize() {
        return this.f37293c;
    }

    @Override // y0.b
    public final b i(int i4) {
        com.bumptech.glide.c.f(i4, size());
        int iS = s();
        Object[] objArr = this.f37291a;
        int i10 = this.f37294d;
        return i4 >= iS ? r(objArr, iS, i10, i4 - iS) : r(q(objArr, i10, i4, new rf.c(this.f37292b[0])), iS, i10, 0);
    }

    @Override // y0.b
    public final b j(int i4, Object obj) {
        com.bumptech.glide.c.f(i4, size());
        int iS = s();
        Object[] objArr = this.f37291a;
        Object[] objArr2 = this.f37292b;
        int i10 = this.f37294d;
        if (iS > i4) {
            return new d(t(i10, i4, obj, objArr), objArr2, size(), i10);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        k.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i4 & 31] = obj;
        return new d(objArr, objArrCopyOf, size(), i10);
    }

    public final d l(int i4, Object obj, Object[] objArr) {
        int size = size() - s();
        Object[] objArr2 = this.f37292b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        k.d(objArrCopyOf, "copyOf(...)");
        if (size < 32) {
            m.N(i4 + 1, i4, size, objArr2, objArrCopyOf);
            objArrCopyOf[i4] = obj;
            return new d(objArr, objArrCopyOf, size() + 1, this.f37294d);
        }
        Object obj2 = objArr2[31];
        m.N(i4 + 1, i4, size - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i4] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return o(objArr, objArrCopyOf, objArr3);
    }

    @Override // zj.e, java.util.List
    public final ListIterator listIterator(int i4) {
        com.bumptech.glide.c.g(i4, size());
        return new f(i4, size(), (this.f37294d / 5) + 1, this.f37291a, this.f37292b);
    }

    public final d o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i4 = this.f37294d;
        if (size <= (1 << i4)) {
            return new d(p(i4, objArr, objArr2), objArr3, size() + 1, i4);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i10 = i4 + 5;
        return new d(p(i10, objArr4, objArr2), objArr3, size() + 1, i10);
    }

    public final Object[] p(int i4, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iO = jm.a.o(size() - 1, i4);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            k.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i4 == 5) {
            objArrCopyOf[iO] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iO] = p(i4 - 5, (Object[]) objArrCopyOf[iO], objArr2);
        return objArrCopyOf;
    }

    public final Object[] q(Object[] objArr, int i4, int i10, rf.c cVar) {
        Object[] objArrCopyOf;
        int iO = jm.a.o(i10, i4);
        if (i4 == 0) {
            if (iO == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                k.d(objArrCopyOf, "copyOf(...)");
            }
            m.N(iO, iO + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = cVar.f32941a;
            cVar.f32941a = objArr[iO];
            return objArrCopyOf;
        }
        int iO2 = objArr[31] == null ? jm.a.o(s() - 1, i4) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        k.d(objArrCopyOf2, "copyOf(...)");
        int i11 = i4 - 5;
        int i12 = iO + 1;
        if (i12 <= iO2) {
            while (true) {
                Object obj = objArrCopyOf2[iO2];
                k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iO2] = q((Object[]) obj, i11, 0, cVar);
                if (iO2 == i12) {
                    break;
                }
                iO2--;
            }
        }
        Object obj2 = objArrCopyOf2[iO];
        k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iO] = q((Object[]) obj2, i11, i10, cVar);
        return objArrCopyOf2;
    }

    public final b r(Object[] objArr, int i4, int i10, int i11) {
        int size = size() - i4;
        if (size != 1) {
            Object[] objArr2 = this.f37292b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            k.d(objArrCopyOf, "copyOf(...)");
            int i12 = size - 1;
            if (i11 < i12) {
                m.N(i11, i11 + 1, size, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i12] = null;
            return new d(objArr, objArrCopyOf, (i4 + size) - 1, i10);
        }
        if (i10 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                k.d(objArr, "copyOf(...)");
            }
            return new h(objArr);
        }
        rf.c cVar = new rf.c(null);
        Object[] objArrM = m(objArr, i10, i4 - 1, cVar);
        k.b(objArrM);
        Object obj = cVar.f32941a;
        k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrM[1] != null) {
            return new d(objArrM, objArr3, i4, i10);
        }
        Object obj2 = objArrM[0];
        k.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new d((Object[]) obj2, objArr3, i4, i10 - 5);
    }

    public final int s() {
        return (size() - 1) & (-32);
    }
}
