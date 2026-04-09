package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.v81;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class k0 extends u0 implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f20166d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final v81 f20167e = new v81(1, t0.class);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f20168f;
    public static final pk.a g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f20169a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e0 f20170b;

    /* renamed from: c, reason: collision with root package name */
    public volatile j0 f20171c;

    static {
        boolean z3;
        pk.a h0Var;
        Throwable th2;
        Throwable th3;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f20168f = z3;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains("Android")) {
            try {
                h0Var = new i0();
            } catch (Error | Exception e2) {
                try {
                    h0Var = new g0();
                } catch (Error | Exception e10) {
                    th4 = e10;
                    h0Var = new h0();
                }
                th2 = th4;
                th3 = e2;
            }
        } else {
            try {
                h0Var = new g0();
            } catch (NoClassDefFoundError unused2) {
                h0Var = new h0();
            }
        }
        th2 = null;
        th3 = null;
        g = h0Var;
        if (th2 != null) {
            v81 v81Var = f20167e;
            Logger loggerA = v81Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            v81Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void d(j0 j0Var) {
        j0Var.f20157a = null;
        while (true) {
            j0 j0Var2 = this.f20171c;
            if (j0Var2 != j0.f20156c) {
                j0 j0Var3 = null;
                while (j0Var2 != null) {
                    j0 j0Var4 = j0Var2.f20158b;
                    if (j0Var2.f20157a != null) {
                        j0Var3 = j0Var2;
                    } else if (j0Var3 != null) {
                        j0Var3.f20158b = j0Var4;
                        if (j0Var3.f20157a == null) {
                            break;
                        }
                    } else if (!g.N(this, j0Var2, j0Var4)) {
                        break;
                    }
                    j0Var2 = j0Var4;
                }
                return;
            }
            return;
        }
    }
}
