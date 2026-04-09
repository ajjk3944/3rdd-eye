package j2;

import android.view.Choreographer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xk.h f27207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.c f27208b;

    public k0(xk.h hVar, l0 l0Var, mk.c cVar) {
        this.f27207a = hVar;
        this.f27208b = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objH;
        try {
            objH = this.f27208b.invoke(Long.valueOf(j));
        } catch (Throwable th2) {
            objH = ci.b.h(th2);
        }
        this.f27207a.resumeWith(objH);
    }
}
