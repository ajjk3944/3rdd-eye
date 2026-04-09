package L;

import F.T;
import L.c;
import L0.AbstractC3189t;
import L0.AbstractC3190u;
import L0.C3174d;
import L0.C3181k;
import L0.C3182l;
import L0.InterfaceC3186p;
import L0.InterfaceC3188s;
import L0.L;
import L0.M;
import L0.U;
import L0.V;
import Q0.AbstractC3434k;
import Y0.r;
import Y0.s;
import Y0.t;
import Yg.J;
import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private String f10929a;

    /* renamed from: b, reason: collision with root package name */
    private U f10930b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3434k.b f10931c;

    /* renamed from: d, reason: collision with root package name */
    private int f10932d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10933e;

    /* renamed from: f, reason: collision with root package name */
    private int f10934f;

    /* renamed from: g, reason: collision with root package name */
    private int f10935g;

    /* renamed from: h, reason: collision with root package name */
    private long f10936h;

    /* renamed from: i, reason: collision with root package name */
    private Y0.d f10937i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3186p f10938j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10939k;

    /* renamed from: l, reason: collision with root package name */
    private long f10940l;

    /* renamed from: m, reason: collision with root package name */
    private c f10941m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3188s f10942n;

    /* renamed from: o, reason: collision with root package name */
    private t f10943o;

    /* renamed from: p, reason: collision with root package name */
    private long f10944p;

    /* renamed from: q, reason: collision with root package name */
    private int f10945q;

    /* renamed from: r, reason: collision with root package name */
    private int f10946r;

    public /* synthetic */ f(String str, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, u10, bVar, i10, z10, i11, i12);
    }

    private final InterfaceC3186p g(long j10, t tVar) {
        InterfaceC3188s interfaceC3188sN = n(tVar);
        return AbstractC3190u.c(interfaceC3188sN, b.a(j10, this.f10933e, this.f10932d, interfaceC3188sN.b()), b.b(this.f10933e, this.f10932d, this.f10934f), W0.t.e(this.f10932d, W0.t.f23567a.b()));
    }

    private final void i() {
        this.f10938j = null;
        this.f10942n = null;
        this.f10943o = null;
        this.f10945q = -1;
        this.f10946r = -1;
        this.f10944p = Y0.b.f24516b.c(0, 0);
        this.f10940l = s.a(0, 0);
        this.f10939k = false;
    }

    private final boolean l(long j10, t tVar) {
        InterfaceC3188s interfaceC3188s;
        InterfaceC3186p interfaceC3186p = this.f10938j;
        if (interfaceC3186p == null || (interfaceC3188s = this.f10942n) == null || interfaceC3188s.c() || tVar != this.f10943o) {
            return true;
        }
        if (Y0.b.f(j10, this.f10944p)) {
            return false;
        }
        return Y0.b.l(j10) != Y0.b.l(this.f10944p) || ((float) Y0.b.k(j10)) < interfaceC3186p.getHeight() || interfaceC3186p.x();
    }

    private final InterfaceC3188s n(t tVar) {
        InterfaceC3188s interfaceC3188sB = this.f10942n;
        if (interfaceC3188sB == null || tVar != this.f10943o || interfaceC3188sB.c()) {
            this.f10943o = tVar;
            String str = this.f10929a;
            U uD = V.d(this.f10930b, tVar);
            Y0.d dVar = this.f10937i;
            AbstractC6492s.f(dVar);
            interfaceC3188sB = AbstractC3189t.b(str, uD, null, null, dVar, this.f10931c, 12, null);
        }
        this.f10942n = interfaceC3188sB;
        return interfaceC3188sB;
    }

    public final Y0.d a() {
        return this.f10937i;
    }

    public final boolean b() {
        return this.f10939k;
    }

    public final long c() {
        return this.f10940l;
    }

    public final J d() {
        InterfaceC3188s interfaceC3188s = this.f10942n;
        if (interfaceC3188s != null) {
            interfaceC3188s.c();
        }
        return J.f24997a;
    }

    public final InterfaceC3186p e() {
        return this.f10938j;
    }

    public final int f(int i10, t tVar) {
        int i11 = this.f10945q;
        int i12 = this.f10946r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iA = T.a(g(Y0.c.a(0, i10, 0, MPv3.MAX_MESSAGE_ID), tVar).getHeight());
        this.f10945q = i10;
        this.f10946r = iA;
        return iA;
    }

    public final boolean h(long j10, t tVar) {
        boolean z10 = true;
        if (this.f10935g > 1) {
            c.a aVar = c.f10901h;
            c cVar = this.f10941m;
            U u10 = this.f10930b;
            Y0.d dVar = this.f10937i;
            AbstractC6492s.f(dVar);
            c cVarA = aVar.a(cVar, tVar, u10, dVar, this.f10931c);
            this.f10941m = cVarA;
            j10 = cVarA.c(j10, this.f10935g);
        }
        boolean z11 = false;
        if (l(j10, tVar)) {
            InterfaceC3186p interfaceC3186pG = g(j10, tVar);
            this.f10944p = j10;
            this.f10940l = Y0.c.f(j10, s.a(T.a(interfaceC3186pG.getWidth()), T.a(interfaceC3186pG.getHeight())));
            if (!W0.t.e(this.f10932d, W0.t.f23567a.c()) && (r.g(r9) < interfaceC3186pG.getWidth() || r.f(r9) < interfaceC3186pG.getHeight())) {
                z11 = true;
            }
            this.f10939k = z11;
            this.f10938j = interfaceC3186pG;
            return true;
        }
        if (!Y0.b.f(j10, this.f10944p)) {
            InterfaceC3186p interfaceC3186p = this.f10938j;
            AbstractC6492s.f(interfaceC3186p);
            this.f10940l = Y0.c.f(j10, s.a(T.a(Math.min(interfaceC3186p.b(), interfaceC3186p.getWidth())), T.a(interfaceC3186p.getHeight())));
            if (W0.t.e(this.f10932d, W0.t.f23567a.c()) || (r.g(r3) >= interfaceC3186p.getWidth() && r.f(r3) >= interfaceC3186p.getHeight())) {
                z10 = false;
            }
            this.f10939k = z10;
            this.f10944p = j10;
        }
        return false;
    }

    public final int j(t tVar) {
        return T.a(n(tVar).b());
    }

    public final int k(t tVar) {
        return T.a(n(tVar).a());
    }

    public final void m(Y0.d dVar) {
        Y0.d dVar2 = this.f10937i;
        long jD = dVar != null ? a.d(dVar) : a.f10899a.a();
        if (dVar2 == null) {
            this.f10937i = dVar;
            this.f10936h = jD;
        } else if (dVar == null || !a.e(this.f10936h, jD)) {
            this.f10937i = dVar;
            this.f10936h = jD;
            i();
        }
    }

    public final M o(U u10) {
        Y0.d dVar;
        t tVar = this.f10943o;
        if (tVar == null || (dVar = this.f10937i) == null) {
            return null;
        }
        C3174d c3174d = new C3174d(this.f10929a, null, null, 6, null);
        if (this.f10938j == null || this.f10942n == null) {
            return null;
        }
        long jD = Y0.b.d(this.f10944p, 0, 0, 0, 0, 10, null);
        return new M(new L(c3174d, u10, AbstractC3689v.l(), this.f10934f, this.f10933e, this.f10932d, dVar, tVar, this.f10931c, jD, (DefaultConstructorMarker) null), new C3181k(new C3182l(c3174d, u10, AbstractC3689v.l(), dVar, this.f10931c), jD, this.f10934f, W0.t.e(this.f10932d, W0.t.f23567a.b()), null), this.f10940l, null);
    }

    public final void p(String str, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f10929a = str;
        this.f10930b = u10;
        this.f10931c = bVar;
        this.f10932d = i10;
        this.f10933e = z10;
        this.f10934f = i11;
        this.f10935g = i12;
        i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f10938j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.h(this.f10936h));
        sb2.append(')');
        return sb2.toString();
    }

    private f(String str, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f10929a = str;
        this.f10930b = u10;
        this.f10931c = bVar;
        this.f10932d = i10;
        this.f10933e = z10;
        this.f10934f = i11;
        this.f10935g = i12;
        this.f10936h = a.f10899a.a();
        this.f10940l = s.a(0, 0);
        this.f10944p = Y0.b.f24516b.c(0, 0);
        this.f10945q = -1;
        this.f10946r = -1;
    }
}
