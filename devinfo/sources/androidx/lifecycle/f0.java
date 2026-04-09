package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f1132a;

    public f0(l0 l0Var) {
        this.f1132a = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f1132a.f1161a) {
            obj = this.f1132a.f1166f;
            this.f1132a.f1166f = l0.f1160k;
        }
        this.f1132a.j(obj);
    }
}
