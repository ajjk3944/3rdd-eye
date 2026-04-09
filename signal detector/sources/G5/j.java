package G5;

import z5.AbstractC3046w;

/* loaded from: classes3.dex */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1712c;

    public j(Runnable runnable, long j6, V0.m mVar) {
        super(j6, mVar);
        this.f1712c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1712c.run();
        } finally {
            this.f1711b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1712c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC3046w.h(runnable));
        sb.append(", ");
        sb.append(this.f1710a);
        sb.append(", ");
        sb.append(this.f1711b);
        sb.append(']');
        return sb.toString();
    }
}
