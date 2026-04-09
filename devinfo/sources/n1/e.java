package n1;

import c0.h0;
import com.google.android.gms.internal.ads.xz;
import x.a0;
import x.f0;
import x.m0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final xz f29517a;

    /* renamed from: b, reason: collision with root package name */
    public final j2.r f29518b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f29519c;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f29520d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29521e;

    public e(xz xzVar, j2.r rVar) {
        this.f29517a = xzVar;
        this.f29518b = rVar;
        f0 f0Var = m0.f36916a;
        this.f29519c = new f0();
        this.f29520d = new f0();
    }

    public final void a() {
        if (this.f29521e) {
            return;
        }
        h0 h0Var = new h0(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 2);
        a0 a0Var = this.f29518b.f27295w0;
        if (a0Var.g(h0Var) < 0) {
            a0Var.a(h0Var);
        }
        this.f29521e = true;
    }
}
