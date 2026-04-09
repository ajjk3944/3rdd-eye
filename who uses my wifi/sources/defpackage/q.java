package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q {
    public static final q c;
    public static final q d;
    public final boolean a;
    public final Throwable b;

    static {
        if (y.i) {
            d = null;
            c = null;
        } else {
            d = new q(null, false);
            c = new q(null, true);
        }
    }

    public q(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
