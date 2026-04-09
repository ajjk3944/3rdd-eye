package ml;

import com.google.android.gms.internal.ads.be1;
import d0.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements il.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i f29415a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final n f29416b = new n("kotlin.Long", kl.b.f28375f);

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        return Long.valueOf(be1Var.i());
    }

    @Override // il.a
    public final void b(z0 z0Var, Object obj) {
        z0Var.g(((Number) obj).longValue());
    }

    @Override // il.a
    public final kl.d d() {
        return f29416b;
    }
}
