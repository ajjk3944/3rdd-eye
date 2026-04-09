package u0;

import com.google.android.gms.internal.ads.lb;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final b2 f34728a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f34729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34730c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f34731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34733f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f34734h;

    /* renamed from: i, reason: collision with root package name */
    public int f34735i;
    public final lb j;

    /* renamed from: k, reason: collision with root package name */
    public int f34736k;

    /* renamed from: l, reason: collision with root package name */
    public int f34737l;

    /* renamed from: m, reason: collision with root package name */
    public int f34738m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34739n;

    public a2(b2 b2Var) {
        this.f34728a = b2Var;
        this.f34729b = b2Var.f34743a;
        int i4 = b2Var.f34744b;
        this.f34730c = i4;
        this.f34731d = b2Var.f34745c;
        this.f34732e = b2Var.f34746d;
        this.f34734h = i4;
        this.f34735i = -1;
        this.j = new lb();
    }

    public final a a(int i4) {
        ArrayList arrayList = this.f34728a.f34750i;
        int iE = d2.e(arrayList, i4, this.f34730c);
        if (iE >= 0) {
            return (a) arrayList.get(iE);
        }
        a aVar = new a(i4);
        arrayList.add(-(iE + 1), aVar);
        return aVar;
    }

    public final Object b(int i4, int[] iArr) {
        int i10 = i4 * 5;
        int i11 = iArr[i10 + 1];
        if ((268435456 & i11) != 0) {
            return this.f34731d[i10 >= iArr.length ? iArr.length : iArr[i10 + 4] + Integer.bitCount(i11 >> 29)];
        }
        return l.f34851a;
    }

    public final void c() {
        this.f34733f = true;
        b2 b2Var = this.f34728a;
        b2Var.getClass();
        if (this.f34728a != b2Var || b2Var.f34747e <= 0) {
            r.a("Unexpected reader close()");
        }
        b2Var.f34747e--;
        this.f34731d = new Object[0];
    }

    public final boolean d(int i4) {
        return (this.f34729b[(i4 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f34736k == 0) {
            if (!(this.g == this.f34734h)) {
                r.a("endGroup() not called at the end of a group");
            }
            int i4 = (this.f34735i * 5) + 2;
            int[] iArr = this.f34729b;
            int i10 = iArr[i4];
            this.f34735i = i10;
            int i11 = this.f34730c;
            this.f34734h = i10 < 0 ? i11 : d2.a(i10, iArr) + i10;
            int iB = this.j.b();
            if (iB < 0) {
                this.f34737l = 0;
                this.f34738m = 0;
            } else {
                this.f34737l = iB;
                this.f34738m = i10 >= i11 - 1 ? this.f34732e : iArr[((i10 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i4 = this.g;
        if (i4 < this.f34734h) {
            return b(i4, this.f34729b);
        }
        return 0;
    }

    public final int g() {
        int i4 = this.g;
        if (i4 >= this.f34734h) {
            return 0;
        }
        return this.f34729b[i4 * 5];
    }

    public final Object h(int i4, int i10) {
        int[] iArr = this.f34729b;
        int iC = d2.c(i4, iArr);
        int i11 = i4 + 1;
        int i12 = iC + i10;
        return i12 < (i11 < this.f34730c ? iArr[(i11 * 5) + 4] : this.f34732e) ? this.f34731d[i12] : l.f34851a;
    }

    public final int i(int i4) {
        return this.f34729b[i4 * 5];
    }

    public final boolean j(int i4) {
        return (this.f34729b[(i4 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i4) {
        return (this.f34729b[(i4 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i4) {
        return (this.f34729b[(i4 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i4;
        if (this.f34736k > 0 || (i4 = this.f34737l) >= this.f34738m) {
            this.f34739n = false;
            return l.f34851a;
        }
        this.f34739n = true;
        Object[] objArr = this.f34731d;
        this.f34737l = i4 + 1;
        return objArr[i4];
    }

    public final Object n(int i4) {
        int i10 = i4 * 5;
        int[] iArr = this.f34729b;
        int i11 = iArr[i10 + 1] & 1073741824;
        if (i11 != 0) {
            return i11 != 0 ? this.f34731d[iArr[i10 + 4]] : l.f34851a;
        }
        return null;
    }

    public final int o(int i4) {
        return this.f34729b[(i4 * 5) + 1] & 67108863;
    }

    public final Object p(int i4, int[] iArr) {
        int i10 = i4 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f34731d[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final int q(int i4) {
        return this.f34729b[(i4 * 5) + 2];
    }

    public final void r(int i4) {
        if (!(this.f34736k == 0)) {
            r.a("Cannot reposition while in an empty region");
        }
        this.g = i4;
        int[] iArr = this.f34729b;
        int i10 = this.f34730c;
        int i11 = i4 < i10 ? iArr[(i4 * 5) + 2] : -1;
        if (i11 != this.f34735i) {
            this.f34735i = i11;
            if (i11 < 0) {
                this.f34734h = i10;
            } else {
                this.f34734h = d2.a(i11, iArr) + i11;
            }
            this.f34737l = 0;
            this.f34738m = 0;
        }
    }

    public final int s() {
        if (!(this.f34736k == 0)) {
            r.a("Cannot skip while in an empty region");
        }
        int i4 = this.g;
        int[] iArr = this.f34729b;
        int i10 = (iArr[(i4 * 5) + 1] & 1073741824) == 0 ? iArr[(i4 * 5) + 1] & 67108863 : 1;
        this.g = d2.a(i4, iArr) + i4;
        return i10;
    }

    public final void t() {
        if (!(this.f34736k == 0)) {
            r.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.f34734h;
        this.f34737l = 0;
        this.f34738m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f34735i);
        sb2.append(", end=");
        return d.h.u(sb2, this.f34734h, ')');
    }

    public final void u() {
        if (this.f34736k <= 0) {
            int i4 = this.f34735i;
            int i10 = this.g;
            int[] iArr = this.f34729b;
            if (!(iArr[(i10 * 5) + 2] == i4)) {
                j1.a("Invalid slot table detected");
            }
            int i11 = this.f34737l;
            int i12 = this.f34738m;
            lb lbVar = this.j;
            if (i11 == 0 && i12 == 0) {
                lbVar.c(-1);
            } else {
                lbVar.c(i11);
            }
            this.f34735i = i10;
            this.f34734h = d2.a(i10, iArr) + i10;
            int i13 = i10 + 1;
            this.g = i13;
            this.f34737l = d2.c(i10, iArr);
            this.f34738m = i10 >= this.f34730c - 1 ? this.f34732e : iArr[(i13 * 5) + 4];
        }
    }
}
