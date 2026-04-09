package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tq3 extends fp3 implements Runnable {
    public final Runnable m;

    public tq3(Runnable runnable) {
        runnable.getClass();
        this.m = runnable;
    }

    @Override // defpackage.gp3
    public final String g() {
        String string = this.m.toString();
        return ex0.l(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.m.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
