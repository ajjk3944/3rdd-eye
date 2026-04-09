package T;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: T.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3513a1 {

    /* renamed from: a, reason: collision with root package name */
    private final C3516b1 f21007a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f21008b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21009c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f21010d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21011e;

    /* renamed from: f, reason: collision with root package name */
    private HashMap f21012f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21013g;

    /* renamed from: h, reason: collision with root package name */
    private int f21014h;

    /* renamed from: i, reason: collision with root package name */
    private int f21015i;

    /* renamed from: j, reason: collision with root package name */
    private int f21016j;

    /* renamed from: k, reason: collision with root package name */
    private final V f21017k;

    /* renamed from: l, reason: collision with root package name */
    private int f21018l;

    /* renamed from: m, reason: collision with root package name */
    private int f21019m;

    /* renamed from: n, reason: collision with root package name */
    private int f21020n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21021o;

    public C3513a1(C3516b1 c3516b1) {
        this.f21007a = c3516b1;
        this.f21008b = c3516b1.u();
        int iV = c3516b1.v();
        this.f21009c = iV;
        this.f21010d = c3516b1.w();
        this.f21011e = c3516b1.x();
        this.f21015i = iV;
        this.f21016j = -1;
        this.f21017k = new V();
    }

    private final Object M(int[] iArr, int i10) {
        return AbstractC3522d1.N(iArr, i10) ? this.f21010d[AbstractC3522d1.R(iArr, i10)] : InterfaceC3540l.f21100a.a();
    }

    private final Object O(int[] iArr, int i10) {
        if (AbstractC3522d1.L(iArr, i10)) {
            return this.f21010d[AbstractC3522d1.S(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        return AbstractC3522d1.J(iArr, i10) ? this.f21010d[AbstractC3522d1.B(iArr, i10)] : InterfaceC3540l.f21100a.a();
    }

    public final Object A(int i10) {
        return B(this.f21014h, i10);
    }

    public final Object B(int i10, int i11) {
        int iV = AbstractC3522d1.V(this.f21008b, i10);
        int i12 = i10 + 1;
        int i13 = iV + i11;
        return i13 < (i12 < this.f21009c ? AbstractC3522d1.F(this.f21008b, i12) : this.f21011e) ? this.f21010d[i13] : InterfaceC3540l.f21100a.a();
    }

    public final int C(int i10) {
        return AbstractC3522d1.O(this.f21008b, i10);
    }

    public final Object D(int i10) {
        return O(this.f21008b, i10);
    }

    public final int E(int i10) {
        return AbstractC3522d1.I(this.f21008b, i10);
    }

    public final boolean F(int i10) {
        return AbstractC3522d1.K(this.f21008b, i10);
    }

    public final boolean G(int i10) {
        return AbstractC3522d1.L(this.f21008b, i10);
    }

    public final boolean H() {
        return t() || this.f21014h == this.f21015i;
    }

    public final boolean I() {
        return AbstractC3522d1.N(this.f21008b, this.f21014h);
    }

    public final boolean J(int i10) {
        return AbstractC3522d1.N(this.f21008b, i10);
    }

    public final Object K() {
        int i10;
        if (this.f21018l > 0 || (i10 = this.f21019m) >= this.f21020n) {
            this.f21021o = false;
            return InterfaceC3540l.f21100a.a();
        }
        this.f21021o = true;
        Object[] objArr = this.f21010d;
        this.f21019m = i10 + 1;
        return objArr[i10];
    }

    public final Object L(int i10) {
        if (AbstractC3522d1.N(this.f21008b, i10)) {
            return M(this.f21008b, i10);
        }
        return null;
    }

    public final int N(int i10) {
        return AbstractC3522d1.Q(this.f21008b, i10);
    }

    public final int P(int i10) {
        return AbstractC3522d1.T(this.f21008b, i10);
    }

    public final void Q(int i10) {
        if (!(this.f21018l == 0)) {
            AbstractC3546o.r("Cannot reposition while in an empty region");
        }
        this.f21014h = i10;
        int iT = i10 < this.f21009c ? AbstractC3522d1.T(this.f21008b, i10) : -1;
        this.f21016j = iT;
        if (iT < 0) {
            this.f21015i = this.f21009c;
        } else {
            this.f21015i = iT + AbstractC3522d1.I(this.f21008b, iT);
        }
        this.f21019m = 0;
        this.f21020n = 0;
    }

    public final void R(int i10) {
        int I10 = AbstractC3522d1.I(this.f21008b, i10) + i10;
        int i11 = this.f21014h;
        if (!(i11 >= i10 && i11 <= I10)) {
            AbstractC3546o.r("Index " + i10 + " is not a parent of " + i11);
        }
        this.f21016j = i10;
        this.f21015i = I10;
        this.f21019m = 0;
        this.f21020n = 0;
    }

    public final int S() {
        if (!(this.f21018l == 0)) {
            AbstractC3546o.r("Cannot skip while in an empty region");
        }
        int iQ = AbstractC3522d1.N(this.f21008b, this.f21014h) ? 1 : AbstractC3522d1.Q(this.f21008b, this.f21014h);
        int i10 = this.f21014h;
        this.f21014h = i10 + AbstractC3522d1.I(this.f21008b, i10);
        return iQ;
    }

    public final void T() {
        if (!(this.f21018l == 0)) {
            AbstractC3546o.r("Cannot skip the enclosing group while in an empty region");
        }
        this.f21014h = this.f21015i;
        this.f21019m = 0;
        this.f21020n = 0;
    }

    public final void U() {
        if (this.f21018l <= 0) {
            int i10 = this.f21016j;
            int i11 = this.f21014h;
            if (!(AbstractC3522d1.T(this.f21008b, i11) == i10)) {
                B0.a("Invalid slot table detected");
            }
            HashMap map = this.f21012f;
            if (map != null) {
            }
            V v10 = this.f21017k;
            int i12 = this.f21019m;
            int i13 = this.f21020n;
            if (i12 == 0 && i13 == 0) {
                v10.j(-1);
            } else {
                v10.j(i12);
            }
            this.f21016j = i11;
            this.f21015i = AbstractC3522d1.I(this.f21008b, i11) + i11;
            int i14 = i11 + 1;
            this.f21014h = i14;
            this.f21019m = AbstractC3522d1.V(this.f21008b, i11);
            this.f21020n = i11 >= this.f21009c - 1 ? this.f21011e : AbstractC3522d1.F(this.f21008b, i14);
        }
    }

    public final void V() {
        if (this.f21018l <= 0) {
            if (!AbstractC3522d1.N(this.f21008b, this.f21014h)) {
                B0.a("Expected a node group");
            }
            U();
        }
    }

    public final C3520d a(int i10) {
        ArrayList arrayListQ = this.f21007a.q();
        int iU = AbstractC3522d1.U(arrayListQ, i10, this.f21009c);
        if (iU >= 0) {
            return (C3520d) arrayListQ.get(iU);
        }
        C3520d c3520d = new C3520d(i10);
        arrayListQ.add(-(iU + 1), c3520d);
        return c3520d;
    }

    public final void c() {
        this.f21018l++;
    }

    public final void d() {
        this.f21013g = true;
        this.f21007a.f(this, this.f21012f);
    }

    public final boolean e(int i10) {
        return AbstractC3522d1.D(this.f21008b, i10);
    }

    public final void f() {
        if (!(this.f21018l > 0)) {
            B0.a("Unbalanced begin/end empty");
        }
        this.f21018l--;
    }

    public final void g() {
        if (this.f21018l == 0) {
            if (!(this.f21014h == this.f21015i)) {
                AbstractC3546o.r("endGroup() not called at the end of a group");
            }
            int iT = AbstractC3522d1.T(this.f21008b, this.f21016j);
            this.f21016j = iT;
            this.f21015i = iT < 0 ? this.f21009c : AbstractC3522d1.I(this.f21008b, iT) + iT;
            int i10 = this.f21017k.i();
            if (i10 < 0) {
                this.f21019m = 0;
                this.f21020n = 0;
            } else {
                this.f21019m = i10;
                this.f21020n = iT >= this.f21009c - 1 ? this.f21011e : AbstractC3522d1.F(this.f21008b, iT + 1);
            }
        }
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        if (this.f21018l > 0) {
            return arrayList;
        }
        int I10 = this.f21014h;
        int i10 = 0;
        while (I10 < this.f21015i) {
            arrayList.add(new C3512a0(AbstractC3522d1.O(this.f21008b, I10), O(this.f21008b, I10), I10, AbstractC3522d1.N(this.f21008b, I10) ? 1 : AbstractC3522d1.Q(this.f21008b, I10), i10));
            I10 += AbstractC3522d1.I(this.f21008b, I10);
            i10++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f21013g;
    }

    public final int j() {
        return this.f21015i;
    }

    public final int k() {
        return this.f21014h;
    }

    public final Object l() {
        int i10 = this.f21014h;
        if (i10 < this.f21015i) {
            return b(this.f21008b, i10);
        }
        return 0;
    }

    public final int m() {
        return this.f21015i;
    }

    public final int n() {
        int i10 = this.f21014h;
        if (i10 < this.f21015i) {
            return AbstractC3522d1.O(this.f21008b, i10);
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.f21014h;
        if (i10 < this.f21015i) {
            return O(this.f21008b, i10);
        }
        return null;
    }

    public final int p() {
        return AbstractC3522d1.I(this.f21008b, this.f21014h);
    }

    public final int q() {
        return this.f21019m - AbstractC3522d1.V(this.f21008b, this.f21016j);
    }

    public final boolean r() {
        return this.f21021o;
    }

    public final boolean s() {
        int i10 = this.f21014h;
        return i10 < this.f21015i && AbstractC3522d1.L(this.f21008b, i10);
    }

    public final boolean t() {
        return this.f21018l > 0;
    }

    public String toString() {
        return "SlotReader(current=" + this.f21014h + ", key=" + n() + ", parent=" + this.f21016j + ", end=" + this.f21015i + ')';
    }

    public final int u() {
        return this.f21016j;
    }

    public final int v() {
        int i10 = this.f21016j;
        if (i10 >= 0) {
            return AbstractC3522d1.Q(this.f21008b, i10);
        }
        return 0;
    }

    public final int w() {
        return this.f21020n - this.f21019m;
    }

    public final int x() {
        return this.f21009c;
    }

    public final C3516b1 y() {
        return this.f21007a;
    }

    public final Object z(int i10) {
        return b(this.f21008b, i10);
    }
}
