package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class wp3 extends fp3 {
    public static final ou1 o;
    public static final oq3 p = new oq3(wp3.class);
    public volatile Set m;
    public volatile int n;

    static {
        Throwable th;
        ou1 vp3Var;
        try {
            vp3Var = new up3();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            vp3Var = new vp3();
        }
        Throwable th3 = th;
        o = vp3Var;
        if (th3 != null) {
            p.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
