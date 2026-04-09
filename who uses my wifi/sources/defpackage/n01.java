package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n01 extends j01 {
    public final Runnable h;

    public n01(Runnable runnable, long j, h80 h80Var) {
        super(j, h80Var);
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.h.run();
        } finally {
            this.g.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.h;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(um.k(runnable));
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
