package I9;

import A9.I;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class j extends h {

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f2631d;

    public j(Runnable runnable, long j4, i iVar) {
        super(j4, iVar);
        this.f2631d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2631d.run();
        } finally {
            this.f2629c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f2631d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(I.x(runnable));
        sb.append(", ");
        sb.append(this.f2628b);
        sb.append(", ");
        sb.append(this.f2629c);
        sb.append(']');
        return sb.toString();
    }
}
