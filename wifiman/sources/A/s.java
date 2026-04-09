package A;

import C0.D;
import Ii.N;
import Zg.AbstractC3689v;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class s implements q, D {

    /* renamed from: a, reason: collision with root package name */
    private final t f156a;

    /* renamed from: b, reason: collision with root package name */
    private int f157b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f158c;

    /* renamed from: d, reason: collision with root package name */
    private float f159d;

    /* renamed from: e, reason: collision with root package name */
    private final float f160e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f161f;

    /* renamed from: g, reason: collision with root package name */
    private final N f162g;

    /* renamed from: h, reason: collision with root package name */
    private final Y0.d f163h;

    /* renamed from: i, reason: collision with root package name */
    private final long f164i;

    /* renamed from: j, reason: collision with root package name */
    private final List f165j;

    /* renamed from: k, reason: collision with root package name */
    private final int f166k;

    /* renamed from: l, reason: collision with root package name */
    private final int f167l;

    /* renamed from: m, reason: collision with root package name */
    private final int f168m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f169n;

    /* renamed from: o, reason: collision with root package name */
    private final w.q f170o;

    /* renamed from: p, reason: collision with root package name */
    private final int f171p;

    /* renamed from: q, reason: collision with root package name */
    private final int f172q;

    /* renamed from: r, reason: collision with root package name */
    private final /* synthetic */ D f173r;

    public /* synthetic */ s(t tVar, int i10, boolean z10, float f10, D d10, float f11, boolean z11, N n10, Y0.d dVar, long j10, List list, int i11, int i12, int i13, boolean z12, w.q qVar, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar, i10, z10, f10, d10, f11, z11, n10, dVar, j10, list, i11, i12, i13, z12, qVar, i14, i15);
    }

    @Override // A.q
    public boolean a() {
        return this.f169n;
    }

    @Override // A.q
    public long b() {
        return Y0.s.a(getWidth(), getHeight());
    }

    @Override // A.q
    public int c() {
        return this.f171p;
    }

    @Override // A.q
    public int d() {
        return this.f167l;
    }

    @Override // A.q
    public w.q e() {
        return this.f170o;
    }

    @Override // A.q
    public int f() {
        return -g();
    }

    @Override // A.q
    public int g() {
        return this.f166k;
    }

    @Override // C0.D
    public int getHeight() {
        return this.f173r.getHeight();
    }

    @Override // C0.D
    public int getWidth() {
        return this.f173r.getWidth();
    }

    @Override // A.q
    public int h() {
        return this.f168m;
    }

    @Override // A.q
    public int i() {
        return this.f172q;
    }

    @Override // A.q
    public List j() {
        return this.f165j;
    }

    public final boolean k() {
        t tVar = this.f156a;
        return ((tVar != null ? tVar.getIndex() : 0) == 0 && this.f157b == 0) ? false : true;
    }

    public final boolean l() {
        return this.f158c;
    }

    public final long m() {
        return this.f164i;
    }

    public final float n() {
        return this.f159d;
    }

    public final N o() {
        return this.f162g;
    }

    @Override // C0.D
    public Map p() {
        return this.f173r.p();
    }

    @Override // C0.D
    public void q() {
        this.f173r.q();
    }

    @Override // C0.D
    public InterfaceC6835l r() {
        return this.f173r.r();
    }

    public final Y0.d s() {
        return this.f163h;
    }

    public final t t() {
        return this.f156a;
    }

    public final int u() {
        return this.f157b;
    }

    public final float v() {
        return this.f160e;
    }

    public final boolean w(int i10, boolean z10) {
        t tVar;
        boolean z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        z11 = false;
        if (!this.f161f && !j().isEmpty() && (tVar = this.f156a) != null) {
            int iF = tVar.f();
            int i11 = this.f157b - i10;
            if (i11 >= 0 && i11 < iF) {
                t tVar2 = (t) AbstractC3689v.q0(j());
                t tVar3 = (t) AbstractC3689v.B0(j());
                if (!tVar2.q() && !tVar3.q() && (i10 >= 0 ? Math.min(g() - tVar2.b(), d() - tVar3.b()) > i10 : Math.min((tVar2.b() + tVar2.f()) - g(), (tVar3.b() + tVar3.f()) - d()) > (-i10))) {
                    this.f157b -= i10;
                    List listJ = j();
                    int size = listJ.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((t) listJ.get(i12)).m(i10, z10);
                    }
                    this.f159d = i10;
                    z11 = true;
                    z11 = true;
                    z11 = true;
                    if (!this.f158c && i10 > 0) {
                        this.f158c = true;
                    }
                }
            }
        }
        return z11;
    }

    private s(t tVar, int i10, boolean z10, float f10, D d10, float f11, boolean z11, N n10, Y0.d dVar, long j10, List list, int i11, int i12, int i13, boolean z12, w.q qVar, int i14, int i15) {
        this.f156a = tVar;
        this.f157b = i10;
        this.f158c = z10;
        this.f159d = f10;
        this.f160e = f11;
        this.f161f = z11;
        this.f162g = n10;
        this.f163h = dVar;
        this.f164i = j10;
        this.f165j = list;
        this.f166k = i11;
        this.f167l = i12;
        this.f168m = i13;
        this.f169n = z12;
        this.f170o = qVar;
        this.f171p = i14;
        this.f172q = i15;
        this.f173r = d10;
    }
}
