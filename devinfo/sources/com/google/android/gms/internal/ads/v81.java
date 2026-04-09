package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17560b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f17561c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17562d;

    public v81(int i4, Class cls) {
        this.f17559a = i4;
        switch (i4) {
            case 1:
                this.f17562d = new com.google.android.gms.internal.play_billing.m();
                this.f17560b = cls.getName();
                break;
            default:
                this.f17562d = new q31();
                this.f17560b = cls.getName();
                break;
        }
    }

    private final Logger b() {
        Logger logger = (Logger) this.f17561c;
        if (logger != null) {
            return logger;
        }
        synchronized (((q31) this.f17562d)) {
            try {
                Logger logger2 = (Logger) this.f17561c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f17560b);
                this.f17561c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Logger a() {
        Logger logger;
        switch (this.f17559a) {
            case 0:
                return b();
            default:
                Logger logger2 = (Logger) this.f17561c;
                if (logger2 != null) {
                    return logger2;
                }
                synchronized (((com.google.android.gms.internal.play_billing.m) this.f17562d)) {
                    try {
                        logger = (Logger) this.f17561c;
                        if (logger == null) {
                            logger = Logger.getLogger(this.f17560b);
                            this.f17561c = logger;
                        }
                    } finally {
                    }
                }
                return logger;
        }
    }

    public v81(String str, m1.g gVar, mk.c cVar, xk.v vVar) {
        this.f17559a = 2;
        nk.k.e(str, "name");
        this.f17560b = str;
        this.f17562d = new Object();
    }
}
