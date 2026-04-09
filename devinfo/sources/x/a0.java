package x;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f36846a;

    /* renamed from: b, reason: collision with root package name */
    public int f36847b;

    public a0(int i4) {
        this.f36846a = i4 == 0 ? j0.f36909a : new Object[i4];
    }

    public final void a(Object obj) {
        int i4 = this.f36847b + 1;
        Object[] objArr = this.f36846a;
        if (objArr.length < i4) {
            m(objArr, i4);
        }
        Object[] objArr2 = this.f36846a;
        int i10 = this.f36847b;
        objArr2[i10] = obj;
        this.f36847b = i10 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i4 = this.f36847b;
        int size = list.size() + i4;
        Object[] objArr = this.f36846a;
        if (objArr.length < size) {
            m(objArr, size);
        }
        Object[] objArr2 = this.f36846a;
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr2[i10 + i4] = list.get(i10);
        }
        this.f36847b = list.size() + this.f36847b;
    }

    public final void c(a0 a0Var) {
        nk.k.e(a0Var, "elements");
        if (a0Var.h()) {
            return;
        }
        int i4 = this.f36847b + a0Var.f36847b;
        Object[] objArr = this.f36846a;
        if (objArr.length < i4) {
            m(objArr, i4);
        }
        zj.m.N(this.f36847b, 0, a0Var.f36847b, a0Var.f36846a, this.f36846a);
        this.f36847b += a0Var.f36847b;
    }

    public final void d() {
        zj.m.U(0, this.f36847b, null, this.f36846a);
        this.f36847b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.f36846a[0];
        }
        y.a.e("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            int i4 = a0Var.f36847b;
            int i10 = this.f36847b;
            if (i4 == i10) {
                Object[] objArr = this.f36846a;
                Object[] objArr2 = a0Var.f36846a;
                sk.d dVarE = ci.b.E(0, i10);
                int i11 = dVarE.f33817a;
                int i12 = dVarE.f33818b;
                if (i11 > i12) {
                    return true;
                }
                while (nk.k.a(objArr[i11], objArr2[i11])) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i4) {
        if (i4 >= 0 && i4 < this.f36847b) {
            return this.f36846a[i4];
        }
        n(i4);
        throw null;
    }

    public final int g(Object obj) {
        int i4 = 0;
        if (obj == null) {
            Object[] objArr = this.f36846a;
            int i10 = this.f36847b;
            while (i4 < i10) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        Object[] objArr2 = this.f36846a;
        int i11 = this.f36847b;
        while (i4 < i11) {
            if (obj.equals(objArr2[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f36847b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f36846a;
        int i4 = this.f36847b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.f36847b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i4) {
        int i10;
        if (i4 < 0 || i4 >= (i10 = this.f36847b)) {
            n(i4);
            throw null;
        }
        Object[] objArr = this.f36846a;
        Object obj = objArr[i4];
        if (i4 != i10 - 1) {
            zj.m.N(i4, i4 + 1, i10, objArr, objArr);
        }
        int i11 = this.f36847b - 1;
        this.f36847b = i11;
        objArr[i11] = null;
        return obj;
    }

    public final void l(int i4, int i10) {
        int i11;
        if (i4 < 0 || i4 > (i11 = this.f36847b) || i10 < 0 || i10 > i11) {
            StringBuilder sbN = r5.c.n(i4, "Start (", ") and end (", i10, ") must be in 0..");
            sbN.append(this.f36847b);
            y.a.d(sbN.toString());
            throw null;
        }
        if (i10 < i4) {
            y.a.c("Start (" + i4 + ") is more than end (" + i10 + ')');
            throw null;
        }
        if (i10 != i4) {
            if (i10 < i11) {
                Object[] objArr = this.f36846a;
                zj.m.N(i4, i10, i11, objArr, objArr);
            }
            int i12 = this.f36847b;
            int i13 = i12 - (i10 - i4);
            zj.m.U(i13, i12, null, this.f36846a);
            this.f36847b = i13;
        }
    }

    public final void m(Object[] objArr, int i4) {
        nk.k.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i4, (length * 3) / 2)];
        zj.m.N(0, 0, length, objArr, objArr2);
        this.f36846a = objArr2;
    }

    public final void n(int i4) {
        StringBuilder sbW = je.u.w(i4, "Index ", " must be in 0..");
        sbW.append(this.f36847b - 1);
        y.a.d(sbW.toString());
        throw null;
    }

    public final String toString() {
        c2.l0 l0Var = new c2.l0(27, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f36846a;
        int i4 = this.f36847b;
        int i10 = 0;
        while (true) {
            if (i10 >= i4) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) l0Var.invoke(obj));
            i10++;
        }
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ a0() {
        this(16);
    }
}
