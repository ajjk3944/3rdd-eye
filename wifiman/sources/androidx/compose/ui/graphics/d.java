package androidx.compose.ui.graphics;

import Y0.t;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6537m;
import m0.AbstractC6673I0;
import m0.C6733v0;
import m0.Q0;
import m0.c1;
import m0.d1;
import m0.i1;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private int f28898a;

    /* renamed from: e, reason: collision with root package name */
    private float f28902e;

    /* renamed from: f, reason: collision with root package name */
    private float f28903f;

    /* renamed from: g, reason: collision with root package name */
    private float f28904g;

    /* renamed from: j, reason: collision with root package name */
    private float f28907j;

    /* renamed from: k, reason: collision with root package name */
    private float f28908k;

    /* renamed from: l, reason: collision with root package name */
    private float f28909l;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28913p;

    /* renamed from: u, reason: collision with root package name */
    private Q0 f28918u;

    /* renamed from: b, reason: collision with root package name */
    private float f28899b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private float f28900c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f28901d = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    private long f28905h = AbstractC6673I0.a();

    /* renamed from: i, reason: collision with root package name */
    private long f28906i = AbstractC6673I0.a();

    /* renamed from: m, reason: collision with root package name */
    private float f28910m = 8.0f;

    /* renamed from: n, reason: collision with root package name */
    private long f28911n = f.f28939b.a();

    /* renamed from: o, reason: collision with root package name */
    private i1 f28912o = c1.a();

    /* renamed from: q, reason: collision with root package name */
    private int f28914q = a.f28894a.a();

    /* renamed from: r, reason: collision with root package name */
    private long f28915r = C6537m.f52356b.a();

    /* renamed from: s, reason: collision with root package name */
    private Y0.d f28916s = Y0.f.b(1.0f, 0.0f, 2, null);

    /* renamed from: t, reason: collision with root package name */
    private t f28917t = t.Ltr;

    public final Q0 A() {
        return this.f28918u;
    }

    public d1 B() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.c
    public float C() {
        return this.f28903f;
    }

    @Override // androidx.compose.ui.graphics.c
    public void D(long j10) {
        if (C6733v0.m(this.f28905h, j10)) {
            return;
        }
        this.f28898a |= 64;
        this.f28905h = j10;
    }

    @Override // androidx.compose.ui.graphics.c
    public float E() {
        return this.f28910m;
    }

    @Override // androidx.compose.ui.graphics.c
    public float F() {
        return this.f28902e;
    }

    @Override // androidx.compose.ui.graphics.c
    public void G(boolean z10) {
        if (this.f28913p != z10) {
            this.f28898a |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
            this.f28913p = z10;
        }
    }

    @Override // androidx.compose.ui.graphics.c
    public float H() {
        return this.f28907j;
    }

    @Override // androidx.compose.ui.graphics.c
    public void I(long j10) {
        if (C6733v0.m(this.f28906i, j10)) {
            return;
        }
        this.f28898a |= 128;
        this.f28906i = j10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void I1(i1 i1Var) {
        if (AbstractC6492s.d(this.f28912o, i1Var)) {
            return;
        }
        this.f28898a |= 8192;
        this.f28912o = i1Var;
    }

    public float J() {
        return this.f28904g;
    }

    @Override // androidx.compose.ui.graphics.c
    public float K() {
        return this.f28900c;
    }

    public i1 L() {
        return this.f28912o;
    }

    public long M() {
        return this.f28906i;
    }

    public final void O() {
        i(1.0f);
        g(1.0f);
        a(1.0f);
        j(0.0f);
        f(0.0f);
        o(0.0f);
        D(AbstractC6673I0.a());
        I(AbstractC6673I0.a());
        m(0.0f);
        d(0.0f);
        e(0.0f);
        l(8.0f);
        y1(f.f28939b.a());
        I1(c1.a());
        G(false);
        k(null);
        t(a.f28894a.a());
        S(C6537m.f52356b.a());
        this.f28918u = null;
        this.f28898a = 0;
    }

    public final void Q(Y0.d dVar) {
        this.f28916s = dVar;
    }

    public final void R(t tVar) {
        this.f28917t = tVar;
    }

    public void S(long j10) {
        this.f28915r = j10;
    }

    public final void T() {
        this.f28918u = L().a(c(), this.f28917t, this.f28916s);
    }

    @Override // androidx.compose.ui.graphics.c
    public void a(float f10) {
        if (this.f28901d == f10) {
            return;
        }
        this.f28898a |= 4;
        this.f28901d = f10;
    }

    public float b() {
        return this.f28901d;
    }

    @Override // androidx.compose.ui.graphics.c
    public long c() {
        return this.f28915r;
    }

    @Override // androidx.compose.ui.graphics.c
    public void d(float f10) {
        if (this.f28908k == f10) {
            return;
        }
        this.f28898a |= 512;
        this.f28908k = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void e(float f10) {
        if (this.f28909l == f10) {
            return;
        }
        this.f28898a |= 1024;
        this.f28909l = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void f(float f10) {
        if (this.f28903f == f10) {
            return;
        }
        this.f28898a |= 16;
        this.f28903f = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void g(float f10) {
        if (this.f28900c == f10) {
            return;
        }
        this.f28898a |= 2;
        this.f28900c = f10;
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f28916s.getDensity();
    }

    @Override // androidx.compose.ui.graphics.c
    public void i(float f10) {
        if (this.f28899b == f10) {
            return;
        }
        this.f28898a |= 1;
        this.f28899b = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void j(float f10) {
        if (this.f28902e == f10) {
            return;
        }
        this.f28898a |= 8;
        this.f28902e = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void k(d1 d1Var) {
        if (AbstractC6492s.d(null, d1Var)) {
            return;
        }
        this.f28898a |= 131072;
    }

    @Override // androidx.compose.ui.graphics.c
    public void l(float f10) {
        if (this.f28910m == f10) {
            return;
        }
        this.f28898a |= 2048;
        this.f28910m = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void m(float f10) {
        if (this.f28907j == f10) {
            return;
        }
        this.f28898a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f28907j = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public float n() {
        return this.f28899b;
    }

    @Override // androidx.compose.ui.graphics.c
    public void o(float f10) {
        if (this.f28904g == f10) {
            return;
        }
        this.f28898a |= 32;
        this.f28904g = f10;
    }

    public long p() {
        return this.f28905h;
    }

    public boolean q() {
        return this.f28913p;
    }

    public int r() {
        return this.f28914q;
    }

    public final Y0.d s() {
        return this.f28916s;
    }

    @Override // androidx.compose.ui.graphics.c
    public void t(int i10) {
        if (a.e(this.f28914q, i10)) {
            return;
        }
        this.f28898a |= 32768;
        this.f28914q = i10;
    }

    @Override // androidx.compose.ui.graphics.c
    public long t1() {
        return this.f28911n;
    }

    @Override // androidx.compose.ui.graphics.c
    public float u() {
        return this.f28908k;
    }

    public final t v() {
        return this.f28917t;
    }

    @Override // androidx.compose.ui.graphics.c
    public float w() {
        return this.f28909l;
    }

    @Override // Y0.l
    public float y() {
        return this.f28916s.y();
    }

    @Override // androidx.compose.ui.graphics.c
    public void y1(long j10) {
        if (f.e(this.f28911n, j10)) {
            return;
        }
        this.f28898a |= 4096;
        this.f28911n = j10;
    }

    public final int z() {
        return this.f28898a;
    }
}
