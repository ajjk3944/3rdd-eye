package y1;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class o0 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt.g f25757a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ar.k f25758d;

    public o0(wt.g gVar, n0.b1 b1Var, ar.k kVar) {
        this.f25757a = gVar;
        this.f25758d = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objK;
        try {
            objK = this.f25758d.a(Long.valueOf(j));
        } catch (Throwable th2) {
            objK = lf.t1.k(th2);
        }
        this.f25757a.g(objK);
    }
}
