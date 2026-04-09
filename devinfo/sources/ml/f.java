package ml;

import com.google.android.gms.internal.ads.be1;
import d0.z0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements il.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f29409a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final n f29410b = new n("kotlin.Int", kl.b.f28374e);

    @Override // il.a
    public final Object a(be1 be1Var) {
        nk.k.e(be1Var, "decoder");
        return Integer.valueOf(be1Var.g());
    }

    @Override // il.a
    public final void b(z0 z0Var, Object obj) {
        z0Var.f(((Number) obj).intValue());
    }

    @Override // il.a
    public final kl.d d() {
        return f29410b;
    }
}
