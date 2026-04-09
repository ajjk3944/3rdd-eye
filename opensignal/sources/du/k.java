package du;

import wt.w;

/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f7577g;

    public k(Runnable runnable, long j, boolean z10) {
        super(j, z10);
        this.f7577g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7577g.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f7577g;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(w.l(runnable));
        sb2.append(", ");
        sb2.append(this.f7575a);
        sb2.append(", ");
        return h0.b.r(sb2, this.f7576d ? "Blocking" : "Non-blocking", ']');
    }
}
