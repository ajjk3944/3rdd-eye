package el;

import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f23568c;

    public j(Runnable runnable, long j, boolean z3) {
        super(j, z3);
        this.f23568c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23568c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f23568c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(x.n(runnable));
        sb2.append(", ");
        sb2.append(this.f23566a);
        sb2.append(", ");
        return r5.c.l(sb2, this.f23567b ? "Blocking" : "Non-blocking", ']');
    }
}
