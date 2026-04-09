package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.gD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1198gD extends UD implements InterfaceFutureC2326a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f14230d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HD f14231e = new HD(YC.class);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f14232f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0582Jp f14233g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f14234a;

    /* renamed from: b, reason: collision with root package name */
    public volatile VC f14235b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1143fD f14236c;

    static {
        boolean z6;
        AbstractC0582Jp c0870aD;
        Throwable th;
        Throwable th2;
        try {
            z6 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z6 = false;
        }
        f14232f = z6;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                c0870aD = new C1088eD();
            } catch (Error | Exception e6) {
                try {
                    c0870aD = new ZC();
                } catch (Error | Exception e7) {
                    th3 = e7;
                    c0870aD = new C0870aD();
                }
                th = th3;
                th2 = e6;
            }
        } else {
            try {
                c0870aD = new ZC();
            } catch (NoClassDefFoundError unused2) {
                c0870aD = new C0870aD();
            }
        }
        th = null;
        th2 = null;
        f14233g = c0870aD;
        if (th != null) {
            HD hd = f14231e;
            Logger loggerA = hd.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            hd.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(C1143fD c1143fD) {
        c1143fD.f14043a = null;
        while (true) {
            C1143fD c1143fD2 = this.f14236c;
            if (c1143fD2 != C1143fD.f14042c) {
                C1143fD c1143fD3 = null;
                while (c1143fD2 != null) {
                    C1143fD c1143fD4 = c1143fD2.f14044b;
                    if (c1143fD2.f14043a != null) {
                        c1143fD3 = c1143fD2;
                    } else if (c1143fD3 != null) {
                        c1143fD3.f14044b = c1143fD4;
                        if (c1143fD3.f14043a == null) {
                            break;
                        }
                    } else if (!f14233g.M(this, c1143fD2, c1143fD4)) {
                        break;
                    }
                    c1143fD2 = c1143fD4;
                }
                return;
            }
            return;
        }
    }
}
