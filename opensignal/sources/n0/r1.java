package n0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final s1 f17297a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f17298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17299c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f17300d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17301e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17302f;

    /* renamed from: g, reason: collision with root package name */
    public int f17303g;

    /* renamed from: h, reason: collision with root package name */
    public int f17304h;

    /* renamed from: i, reason: collision with root package name */
    public int f17305i;
    public final l0 j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f17306l;

    /* renamed from: m, reason: collision with root package name */
    public int f17307m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17308n;

    public r1(s1 s1Var) {
        this.f17297a = s1Var;
        this.f17298b = s1Var.f17310a;
        int i10 = s1Var.f17311d;
        this.f17299c = i10;
        this.f17300d = s1Var.f17312g;
        this.f17301e = s1Var.f17313r;
        this.f17304h = i10;
        this.f17305i = -1;
        this.j = new l0();
    }

    public final a a(int i10) {
        ArrayList arrayList = this.f17297a.E;
        int iE = u1.e(arrayList, i10, this.f17299c);
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        a aVar = new a(i10);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f17300d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return j.f17190a;
    }

    public final void c() {
        this.f17302f = true;
        s1 s1Var = this.f17297a;
        s1Var.getClass();
        if (this.f17297a != s1Var || s1Var.f17314x <= 0) {
            q.c("Unexpected reader close()");
        }
        s1Var.f17314x--;
        this.f17300d = new Object[0];
    }

    public final boolean d(int i10) {
        return (this.f17298b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.k == 0) {
            if (!(this.f17303g == this.f17304h)) {
                q.c("endGroup() not called at the end of a group");
            }
            int i10 = (this.f17305i * 5) + 2;
            int[] iArr = this.f17298b;
            int i11 = iArr[i10];
            this.f17305i = i11;
            int i12 = this.f17299c;
            this.f17304h = i11 < 0 ? i12 : u1.a(iArr, i11) + i11;
            int iB = this.j.b();
            if (iB < 0) {
                this.f17306l = 0;
                this.f17307m = 0;
            } else {
                this.f17306l = iB;
                this.f17307m = i11 >= i12 - 1 ? this.f17301e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i10 = this.f17303g;
        if (i10 < this.f17304h) {
            return b(this.f17298b, i10);
        }
        return 0;
    }

    public final int g() {
        int i10 = this.f17303g;
        if (i10 >= this.f17304h) {
            return 0;
        }
        return this.f17298b[i10 * 5];
    }

    public final Object h(int i10, int i11) {
        int[] iArr = this.f17298b;
        int iC = u1.c(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iC + i11;
        return i13 < (i12 < this.f17299c ? iArr[(i12 * 5) + 4] : this.f17301e) ? this.f17300d[i13] : j.f17190a;
    }

    public final int i(int i10) {
        return this.f17298b[i10 * 5];
    }

    public final boolean j(int i10) {
        return (this.f17298b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i10) {
        return (this.f17298b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i10) {
        return (this.f17298b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i10;
        if (this.k > 0 || (i10 = this.f17306l) >= this.f17307m) {
            this.f17308n = false;
            return j.f17190a;
        }
        this.f17308n = true;
        Object[] objArr = this.f17300d;
        this.f17306l = i10 + 1;
        return objArr[i10];
    }

    public final Object n(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f17298b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 != 0) {
            return i12 != 0 ? this.f17300d[iArr[i11 + 4]] : j.f17190a;
        }
        return null;
    }

    public final int o(int i10) {
        return this.f17298b[(i10 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f17300d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int q(int i10) {
        return this.f17298b[(i10 * 5) + 2];
    }

    public final void r(int i10) {
        if (!(this.k == 0)) {
            q.c("Cannot reposition while in an empty region");
        }
        this.f17303g = i10;
        int[] iArr = this.f17298b;
        int i11 = this.f17299c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        if (i12 != this.f17305i) {
            this.f17305i = i12;
            if (i12 < 0) {
                this.f17304h = i11;
            } else {
                this.f17304h = u1.a(iArr, i12) + i12;
            }
            this.f17306l = 0;
            this.f17307m = 0;
        }
    }

    public final int s() {
        if (!(this.k == 0)) {
            q.c("Cannot skip while in an empty region");
        }
        int i10 = this.f17303g;
        int[] iArr = this.f17298b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f17303g = u1.a(iArr, i10) + i10;
        return i11;
    }

    public final void t() {
        if (!(this.k == 0)) {
            q.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f17303g = this.f17304h;
        this.f17306l = 0;
        this.f17307m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f17303g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f17305i);
        sb2.append(", end=");
        return c7.a.q(sb2, this.f17304h, ')');
    }

    public final void u() {
        if (this.k <= 0) {
            int i10 = this.f17305i;
            int i11 = this.f17303g;
            int[] iArr = this.f17298b;
            if (!(iArr[(i11 * 5) + 2] == i10)) {
                g1.a("Invalid slot table detected");
            }
            int i12 = this.f17306l;
            int i13 = this.f17307m;
            l0 l0Var = this.j;
            if (i12 == 0 && i13 == 0) {
                l0Var.c(-1);
            } else {
                l0Var.c(i12);
            }
            this.f17305i = i11;
            this.f17304h = u1.a(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.f17303g = i14;
            this.f17306l = u1.c(iArr, i11);
            this.f17307m = i11 >= this.f17299c - 1 ? this.f17301e : iArr[(i14 * 5) + 4];
        }
    }
}
