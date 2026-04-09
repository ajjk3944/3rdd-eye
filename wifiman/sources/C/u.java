package C;

import Ii.N;
import Zg.AbstractC3689v;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import x.InterfaceC8409j;

/* loaded from: classes.dex */
public final class u implements n, C0.D {

    /* renamed from: a, reason: collision with root package name */
    private final List f2091a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2092b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2093c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2094d;

    /* renamed from: e, reason: collision with root package name */
    private final w.q f2095e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2096f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2097g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2098h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2099i;

    /* renamed from: j, reason: collision with root package name */
    private final C2520e f2100j;

    /* renamed from: k, reason: collision with root package name */
    private final C2520e f2101k;

    /* renamed from: l, reason: collision with root package name */
    private float f2102l;

    /* renamed from: m, reason: collision with root package name */
    private int f2103m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f2104n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC8409j f2105o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f2106p;

    /* renamed from: q, reason: collision with root package name */
    private final List f2107q;

    /* renamed from: r, reason: collision with root package name */
    private final List f2108r;

    /* renamed from: s, reason: collision with root package name */
    private final N f2109s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ C0.D f2110t;

    public u(List list, int i10, int i11, int i12, w.q qVar, int i13, int i14, boolean z10, int i15, C2520e c2520e, C2520e c2520e2, float f10, int i16, boolean z11, InterfaceC8409j interfaceC8409j, C0.D d10, boolean z12, List list2, List list3, N n10) {
        this.f2091a = list;
        this.f2092b = i10;
        this.f2093c = i11;
        this.f2094d = i12;
        this.f2095e = qVar;
        this.f2096f = i13;
        this.f2097g = i14;
        this.f2098h = z10;
        this.f2099i = i15;
        this.f2100j = c2520e;
        this.f2101k = c2520e2;
        this.f2102l = f10;
        this.f2103m = i16;
        this.f2104n = z11;
        this.f2105o = interfaceC8409j;
        this.f2106p = z12;
        this.f2107q = list2;
        this.f2108r = list3;
        this.f2109s = n10;
        this.f2110t = d10;
    }

    @Override // C.n
    public boolean a() {
        return this.f2098h;
    }

    @Override // C.n
    public long b() {
        return Y0.s.a(getWidth(), getHeight());
    }

    @Override // C.n
    public int c() {
        return this.f2094d;
    }

    @Override // C.n
    public int d() {
        return this.f2097g;
    }

    @Override // C.n
    public w.q e() {
        return this.f2095e;
    }

    @Override // C.n
    public int f() {
        return -g();
    }

    @Override // C.n
    public int g() {
        return this.f2096f;
    }

    @Override // C0.D
    public int getHeight() {
        return this.f2110t.getHeight();
    }

    @Override // C0.D
    public int getWidth() {
        return this.f2110t.getWidth();
    }

    @Override // C.n
    public List h() {
        return this.f2091a;
    }

    @Override // C.n
    public int i() {
        return this.f2092b;
    }

    @Override // C.n
    public int j() {
        return this.f2093c;
    }

    @Override // C.n
    public int k() {
        return this.f2099i;
    }

    @Override // C.n
    public InterfaceC8409j l() {
        return this.f2105o;
    }

    public final boolean m() {
        C2520e c2520e = this.f2100j;
        return ((c2520e != null ? c2520e.getIndex() : 0) == 0 && this.f2103m == 0) ? false : true;
    }

    public final boolean n() {
        return this.f2104n;
    }

    public final C2520e o() {
        return this.f2101k;
    }

    @Override // C0.D
    public Map p() {
        return this.f2110t.p();
    }

    @Override // C0.D
    public void q() {
        this.f2110t.q();
    }

    @Override // C0.D
    public InterfaceC6835l r() {
        return this.f2110t.r();
    }

    public final float s() {
        return this.f2102l;
    }

    public final C2520e t() {
        return this.f2100j;
    }

    public final int u() {
        return this.f2103m;
    }

    public final boolean v(int i10) {
        int i11;
        int i12 = i() + j();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (!this.f2106p && !h().isEmpty() && this.f2100j != null && (i11 = this.f2103m - i10) >= 0 && i11 < i12) {
            float f10 = i12 != 0 ? i10 / i12 : 0.0f;
            float f11 = this.f2102l - f10;
            if (this.f2101k != null && f11 < 0.5f && f11 > -0.5f) {
                C2520e c2520e = (C2520e) AbstractC3689v.q0(h());
                C2520e c2520e2 = (C2520e) AbstractC3689v.B0(h());
                if (i10 >= 0 ? Math.min(g() - c2520e.b(), d() - c2520e2.b()) > i10 : Math.min((c2520e.b() + i12) - g(), (c2520e2.b() + i12) - d()) > (-i10)) {
                    this.f2102l -= f10;
                    this.f2103m -= i10;
                    List listH = h();
                    int size = listH.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((C2520e) listH.get(i13)).a(i10);
                    }
                    List list = this.f2107q;
                    int size2 = list.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        ((C2520e) list.get(i14)).a(i10);
                    }
                    List list2 = this.f2108r;
                    int size3 = list2.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        ((C2520e) list2.get(i15)).a(i10);
                    }
                    z10 = true;
                    z10 = true;
                    z10 = true;
                    if (!this.f2104n && i10 > 0) {
                        this.f2104n = true;
                    }
                }
            }
        }
        return z10;
    }

    public /* synthetic */ u(List list, int i10, int i11, int i12, w.q qVar, int i13, int i14, boolean z10, int i15, C2520e c2520e, C2520e c2520e2, float f10, int i16, boolean z11, InterfaceC8409j interfaceC8409j, C0.D d10, boolean z12, List list2, List list3, N n10, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i10, i11, i12, qVar, i13, i14, z10, i15, c2520e, c2520e2, f10, i16, z11, interfaceC8409j, d10, z12, (i17 & 131072) != 0 ? AbstractC3689v.l() : list2, (i17 & 262144) != 0 ? AbstractC3689v.l() : list3, n10);
    }
}
