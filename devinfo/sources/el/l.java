package el;

import xk.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends r {

    /* renamed from: c, reason: collision with root package name */
    public static final l f23575c = new l();

    @Override // xk.r
    public final void T(ck.h hVar, Runnable runnable) {
        e.f23563d.f23565c.e(runnable, true, false);
    }

    @Override // xk.r
    public final void U(ck.h hVar, Runnable runnable) {
        e.f23563d.f23565c.e(runnable, true, true);
    }

    @Override // xk.r
    public final r W(int i4) {
        cl.b.a(i4);
        return i4 >= k.f23572d ? this : super.W(i4);
    }

    @Override // xk.r
    public final String toString() {
        return "Dispatchers.IO";
    }
}
