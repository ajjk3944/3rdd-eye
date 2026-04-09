package io.sentry;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g4 {
    public String B;
    public String D;
    public io.sentry.protocol.e0 E;
    public transient Throwable F;
    public String G;
    public String H;
    public List I;
    public io.sentry.protocol.d J;
    public AbstractMap K;

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.t f12268a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.c f12269d;

    /* renamed from: g, reason: collision with root package name */
    public io.sentry.protocol.r f12270g;

    /* renamed from: r, reason: collision with root package name */
    public io.sentry.protocol.n f12271r;

    /* renamed from: x, reason: collision with root package name */
    public AbstractMap f12272x;

    /* renamed from: y, reason: collision with root package name */
    public String f12273y;

    public g4(io.sentry.protocol.t tVar) {
        this.f12269d = new io.sentry.protocol.c();
        this.f12268a = tVar;
    }

    public final Throwable a() {
        Throwable th2 = this.F;
        return th2 instanceof io.sentry.exception.a ? ((io.sentry.exception.a) th2).f12242d : th2;
    }

    public final void b(String str, String str2) {
        if (this.f12272x == null) {
            this.f12272x = new HashMap();
        }
        if (str == null) {
            return;
        }
        if (str2 != null) {
            this.f12272x.put(str, str2);
            return;
        }
        AbstractMap abstractMap = this.f12272x;
        if (abstractMap != null) {
            abstractMap.remove(str);
        }
    }

    public g4() {
        this(new io.sentry.protocol.t());
    }
}
