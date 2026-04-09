package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class op3 extends br3 implements n70 {
    public static final Object i = new Object();
    public static final oq3 j = new oq3(gp3.class);
    public static final boolean k;
    public static final ob1 l;
    public volatile Object f;
    public volatile dp3 g;
    public volatile np3 h;

    static {
        boolean z;
        ob1 ip3Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        k = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                ip3Var = new mp3();
            } catch (Error | Exception e) {
                try {
                    ip3Var = new hp3();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    ip3Var = new ip3();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                ip3Var = new hp3();
            } catch (NoClassDefFoundError unused2) {
                ip3Var = new ip3();
            }
        }
        th = null;
        th2 = null;
        l = ip3Var;
        if (th != null) {
            oq3 oq3Var = j;
            Logger loggerA = oq3Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            oq3Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(np3 np3Var) {
        np3Var.a = null;
        while (true) {
            np3 np3Var2 = this.h;
            if (np3Var2 != np3.c) {
                np3 np3Var3 = null;
                while (np3Var2 != null) {
                    np3 np3Var4 = np3Var2.b;
                    if (np3Var2.a != null) {
                        np3Var3 = np3Var2;
                    } else if (np3Var3 != null) {
                        np3Var3.b = np3Var4;
                        if (np3Var3.a == null) {
                            break;
                        }
                    } else if (!l.E(this, np3Var2, np3Var4)) {
                        break;
                    }
                    np3Var2 = np3Var4;
                }
                return;
            }
            return;
        }
    }
}
