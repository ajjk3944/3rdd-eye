package L;

import F.T;
import L.c;
import L0.C3174d;
import L0.C3181k;
import L0.C3182l;
import L0.L;
import L0.M;
import L0.U;
import L0.V;
import Q0.AbstractC3434k;
import Y0.s;
import Y0.t;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private C3174d f10913a;

    /* renamed from: b, reason: collision with root package name */
    private U f10914b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3434k.b f10915c;

    /* renamed from: d, reason: collision with root package name */
    private int f10916d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10917e;

    /* renamed from: f, reason: collision with root package name */
    private int f10918f;

    /* renamed from: g, reason: collision with root package name */
    private int f10919g;

    /* renamed from: h, reason: collision with root package name */
    private List f10920h;

    /* renamed from: i, reason: collision with root package name */
    private c f10921i;

    /* renamed from: j, reason: collision with root package name */
    private long f10922j;

    /* renamed from: k, reason: collision with root package name */
    private Y0.d f10923k;

    /* renamed from: l, reason: collision with root package name */
    private C3182l f10924l;

    /* renamed from: m, reason: collision with root package name */
    private t f10925m;

    /* renamed from: n, reason: collision with root package name */
    private M f10926n;

    /* renamed from: o, reason: collision with root package name */
    private int f10927o;

    /* renamed from: p, reason: collision with root package name */
    private int f10928p;

    public /* synthetic */ e(C3174d c3174d, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, bVar, i10, z10, i11, i12, list);
    }

    private final C3181k e(long j10, t tVar) {
        C3182l c3182lL = l(tVar);
        return new C3181k(c3182lL, b.a(j10, this.f10917e, this.f10916d, c3182lL.b()), b.b(this.f10917e, this.f10916d, this.f10918f), W0.t.e(this.f10916d, W0.t.f23567a.b()), null);
    }

    private final void g() {
        this.f10924l = null;
        this.f10926n = null;
        this.f10928p = -1;
        this.f10927o = -1;
    }

    private final boolean j(M m10, long j10, t tVar) {
        if (m10 == null || m10.w().j().c() || tVar != m10.l().d()) {
            return true;
        }
        if (Y0.b.f(j10, m10.l().a())) {
            return false;
        }
        return Y0.b.l(j10) != Y0.b.l(m10.l().a()) || ((float) Y0.b.k(j10)) < m10.w().h() || m10.w().f();
    }

    private final C3182l l(t tVar) {
        C3182l c3182l = this.f10924l;
        if (c3182l == null || tVar != this.f10925m || c3182l.c()) {
            this.f10925m = tVar;
            C3174d c3174d = this.f10913a;
            U uD = V.d(this.f10914b, tVar);
            Y0.d dVar = this.f10923k;
            AbstractC6492s.f(dVar);
            AbstractC3434k.b bVar = this.f10915c;
            List listL = this.f10920h;
            if (listL == null) {
                listL = AbstractC3689v.l();
            }
            c3182l = new C3182l(c3174d, uD, listL, dVar, bVar);
        }
        this.f10924l = c3182l;
        return c3182l;
    }

    private final M m(t tVar, long j10, C3181k c3181k) {
        float fMin = Math.min(c3181k.j().b(), c3181k.A());
        C3174d c3174d = this.f10913a;
        U u10 = this.f10914b;
        List listL = this.f10920h;
        if (listL == null) {
            listL = AbstractC3689v.l();
        }
        List list = listL;
        int i10 = this.f10918f;
        boolean z10 = this.f10917e;
        int i11 = this.f10916d;
        Y0.d dVar = this.f10923k;
        AbstractC6492s.f(dVar);
        return new M(new L(c3174d, u10, list, i10, z10, i11, dVar, tVar, this.f10915c, j10, (DefaultConstructorMarker) null), c3181k, Y0.c.f(j10, s.a(T.a(fMin), T.a(c3181k.h()))), null);
    }

    public final Y0.d a() {
        return this.f10923k;
    }

    public final M b() {
        return this.f10926n;
    }

    public final M c() {
        M m10 = this.f10926n;
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final int d(int i10, t tVar) {
        int i11 = this.f10927o;
        int i12 = this.f10928p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        int iA = T.a(e(Y0.c.a(0, i10, 0, MPv3.MAX_MESSAGE_ID), tVar).h());
        this.f10927o = i10;
        this.f10928p = iA;
        return iA;
    }

    public final boolean f(long j10, t tVar) {
        if (this.f10919g > 1) {
            c.a aVar = c.f10901h;
            c cVar = this.f10921i;
            U u10 = this.f10914b;
            Y0.d dVar = this.f10923k;
            AbstractC6492s.f(dVar);
            c cVarA = aVar.a(cVar, tVar, u10, dVar, this.f10915c);
            this.f10921i = cVarA;
            j10 = cVarA.c(j10, this.f10919g);
        }
        if (j(this.f10926n, j10, tVar)) {
            this.f10926n = m(tVar, j10, e(j10, tVar));
            return true;
        }
        M m10 = this.f10926n;
        AbstractC6492s.f(m10);
        if (Y0.b.f(j10, m10.l().a())) {
            return false;
        }
        M m11 = this.f10926n;
        AbstractC6492s.f(m11);
        this.f10926n = m(tVar, j10, m11.w());
        return true;
    }

    public final int h(t tVar) {
        return T.a(l(tVar).b());
    }

    public final int i(t tVar) {
        return T.a(l(tVar).a());
    }

    public final void k(Y0.d dVar) {
        Y0.d dVar2 = this.f10923k;
        long jD = dVar != null ? a.d(dVar) : a.f10899a.a();
        if (dVar2 == null) {
            this.f10923k = dVar;
            this.f10922j = jD;
        } else if (dVar == null || !a.e(this.f10922j, jD)) {
            this.f10923k = dVar;
            this.f10922j = jD;
            g();
        }
    }

    public final void n(C3174d c3174d, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f10913a = c3174d;
        this.f10914b = u10;
        this.f10915c = bVar;
        this.f10916d = i10;
        this.f10917e = z10;
        this.f10918f = i11;
        this.f10919g = i12;
        this.f10920h = list;
        g();
    }

    private e(C3174d c3174d, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, List list) {
        this.f10913a = c3174d;
        this.f10914b = u10;
        this.f10915c = bVar;
        this.f10916d = i10;
        this.f10917e = z10;
        this.f10918f = i11;
        this.f10919g = i12;
        this.f10920h = list;
        this.f10922j = a.f10899a.a();
        this.f10927o = -1;
        this.f10928p = -1;
    }
}
