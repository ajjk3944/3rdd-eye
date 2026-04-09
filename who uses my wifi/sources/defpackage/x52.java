package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x52 extends e6 {
    public final Object c = new Object();
    public final b62 d;
    public boolean e;

    public x52(b62 b62Var) {
        this.d = b62Var;
    }

    public final void w() {
        gi2.G("release: Trying to acquire lock");
        synchronized (this.c) {
            try {
                gi2.G("release: Lock acquired");
                if (this.e) {
                    gi2.G("release: Lock already released");
                    return;
                }
                this.e = true;
                t(new us0(), new sd2(0));
                t(new zs1(this), new f23(this));
                gi2.G("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
