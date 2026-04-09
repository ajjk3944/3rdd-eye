package F;

import L0.C3174d;
import L0.C3181k;
import L0.C3182l;
import Q0.AbstractC3434k;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: l, reason: collision with root package name */
    public static final a f4925l = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C3174d f4926a;

    /* renamed from: b, reason: collision with root package name */
    private final L0.U f4927b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4928c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4929d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4930e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4931f;

    /* renamed from: g, reason: collision with root package name */
    private final Y0.d f4932g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3434k.b f4933h;

    /* renamed from: i, reason: collision with root package name */
    private final List f4934i;

    /* renamed from: j, reason: collision with root package name */
    private C3182l f4935j;

    /* renamed from: k, reason: collision with root package name */
    private Y0.t f4936k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ S(C3174d c3174d, L0.U u10, int i10, int i11, boolean z10, int i12, Y0.d dVar, AbstractC3434k.b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, i10, i11, z10, i12, dVar, bVar, list);
    }

    private final C3182l f() {
        C3182l c3182l = this.f4935j;
        if (c3182l != null) {
            return c3182l;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    private final C3181k n(long j10, Y0.t tVar) {
        m(tVar);
        int iN = Y0.b.n(j10);
        int iL = ((this.f4930e || W0.t.e(this.f4931f, W0.t.f23567a.b())) && Y0.b.h(j10)) ? Y0.b.l(j10) : MPv3.MAX_MESSAGE_ID;
        int i10 = (this.f4930e || !W0.t.e(this.f4931f, W0.t.f23567a.b())) ? this.f4928c : 1;
        if (iN != iL) {
            iL = AbstractC7978m.k(c(), iN, iL);
        }
        return new C3181k(f(), Y0.b.f24516b.b(0, iL, 0, Y0.b.k(j10)), i10, W0.t.e(this.f4931f, W0.t.f23567a.b()), null);
    }

    public final Y0.d a() {
        return this.f4932g;
    }

    public final AbstractC3434k.b b() {
        return this.f4933h;
    }

    public final int c() {
        return T.a(f().b());
    }

    public final int d() {
        return this.f4928c;
    }

    public final int e() {
        return this.f4929d;
    }

    public final int g() {
        return this.f4931f;
    }

    public final List h() {
        return this.f4934i;
    }

    public final boolean i() {
        return this.f4930e;
    }

    public final L0.U j() {
        return this.f4927b;
    }

    public final C3174d k() {
        return this.f4926a;
    }

    public final L0.M l(long j10, Y0.t tVar, L0.M m10) {
        if (m10 != null && i0.a(m10, this.f4926a, this.f4927b, this.f4934i, this.f4928c, this.f4930e, this.f4931f, this.f4932g, tVar, this.f4933h, j10)) {
            return m10.a(new L0.L(m10.l().j(), this.f4927b, m10.l().g(), m10.l().e(), m10.l().h(), m10.l().f(), m10.l().b(), m10.l().d(), m10.l().c(), j10, (DefaultConstructorMarker) null), Y0.c.f(j10, Y0.s.a(T.a(m10.w().A()), T.a(m10.w().h()))));
        }
        C3181k c3181kN = n(j10, tVar);
        return new L0.M(new L0.L(this.f4926a, this.f4927b, this.f4934i, this.f4928c, this.f4930e, this.f4931f, this.f4932g, tVar, this.f4933h, j10, (DefaultConstructorMarker) null), c3181kN, Y0.c.f(j10, Y0.s.a(T.a(c3181kN.A()), T.a(c3181kN.h()))), null);
    }

    public final void m(Y0.t tVar) {
        C3182l c3182l = this.f4935j;
        if (c3182l == null || tVar != this.f4936k || c3182l.c()) {
            this.f4936k = tVar;
            c3182l = new C3182l(this.f4926a, L0.V.d(this.f4927b, tVar), this.f4934i, this.f4932g, this.f4933h);
        }
        this.f4935j = c3182l;
    }

    private S(C3174d c3174d, L0.U u10, int i10, int i11, boolean z10, int i12, Y0.d dVar, AbstractC3434k.b bVar, List list) {
        this.f4926a = c3174d;
        this.f4927b = u10;
        this.f4928c = i10;
        this.f4929d = i11;
        this.f4930e = z10;
        this.f4931f = i12;
        this.f4932g = dVar;
        this.f4933h = bVar;
        this.f4934i = list;
        if (i10 <= 0) {
            throw new IllegalArgumentException("no maxLines");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("no minLines");
        }
        if (i11 > i10) {
            throw new IllegalArgumentException("minLines greater than maxLines");
        }
    }

    public /* synthetic */ S(C3174d c3174d, L0.U u10, int i10, int i11, boolean z10, int i12, Y0.d dVar, AbstractC3434k.b bVar, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, (i13 & 4) != 0 ? Integer.MAX_VALUE : i10, (i13 & 8) != 0 ? 1 : i11, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? W0.t.f23567a.a() : i12, dVar, bVar, (i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC3689v.l() : list, null);
    }
}
