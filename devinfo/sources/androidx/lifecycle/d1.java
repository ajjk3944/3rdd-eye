package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f1121a;

    /* renamed from: b, reason: collision with root package name */
    public final r f1122b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1123c;

    public d1(c0 c0Var, r rVar) {
        nk.k.e(c0Var, "registry");
        nk.k.e(rVar, "event");
        this.f1121a = c0Var;
        this.f1122b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1123c) {
            return;
        }
        this.f1121a.e(this.f1122b);
        this.f1123c = true;
    }
}
