package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class u71 extends i91 implements vd.b {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f17110d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final v81 f17111e = new v81(0, m71.class);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f17112f;
    public static final mq0 g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f17113a;

    /* renamed from: b, reason: collision with root package name */
    public volatile j71 f17114b;

    /* renamed from: c, reason: collision with root package name */
    public volatile t71 f17115c;

    static {
        boolean z3;
        mq0 o71Var;
        Throwable th2;
        Throwable th3;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f17112f = z3;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains("Android")) {
            try {
                o71Var = new s71();
            } catch (Error | Exception e2) {
                try {
                    o71Var = new n71();
                } catch (Error | Exception e10) {
                    th4 = e10;
                    o71Var = new o71();
                }
                th2 = th4;
                th3 = e2;
            }
        } else {
            try {
                o71Var = new n71();
            } catch (NoClassDefFoundError unused2) {
                o71Var = new o71();
            }
        }
        th2 = null;
        th3 = null;
        g = o71Var;
        if (th2 != null) {
            v81 v81Var = f17111e;
            Logger loggerA = v81Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            v81Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void d(t71 t71Var) {
        t71Var.f16729a = null;
        while (true) {
            t71 t71Var2 = this.f17115c;
            if (t71Var2 != t71.f16728c) {
                t71 t71Var3 = null;
                while (t71Var2 != null) {
                    t71 t71Var4 = t71Var2.f16730b;
                    if (t71Var2.f16729a != null) {
                        t71Var3 = t71Var2;
                    } else if (t71Var3 != null) {
                        t71Var3.f16730b = t71Var4;
                        if (t71Var3.f16729a == null) {
                            break;
                        }
                    } else if (!g.L(this, t71Var2, t71Var4)) {
                        break;
                    }
                    t71Var2 = t71Var4;
                }
                return;
            }
            return;
        }
    }
}
