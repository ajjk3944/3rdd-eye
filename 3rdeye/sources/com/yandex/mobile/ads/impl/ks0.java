package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class ks0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f29763f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile ks0 f29764g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f29765h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ns0 f29766a;

    /* renamed from: b, reason: collision with root package name */
    private final ms0 f29767b;

    /* renamed from: c, reason: collision with root package name */
    private final ew1 f29768c;

    /* renamed from: d, reason: collision with root package name */
    private final zw1 f29769d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f29770e;

    public static final class a {
        public static ks0 a(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            if (ks0.f29764g == null) {
                synchronized (ks0.f29763f) {
                    try {
                        if (ks0.f29764g == null) {
                            ks0.f29764g = new ks0(context);
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            ks0 ks0Var = ks0.f29764g;
            if (ks0Var != null) {
                return ks0Var;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public /* synthetic */ ks0(Context context) {
        this(context, new ns0(), new ms0(), ew1.a.a(), new zw1());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location c() {
        /*
            r4 = this;
            java.lang.Object r0 = com.yandex.mobile.ads.impl.ks0.f29763f
            monitor-enter(r0)
            com.yandex.mobile.ads.impl.ew1 r1 = r4.f29768c     // Catch: java.lang.Throwable -> L46
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L53
            com.yandex.mobile.ads.impl.zw1 r1 = r4.f29769d     // Catch: java.lang.Throwable -> L46
            android.content.Context r2 = r4.f29770e     // Catch: java.lang.Throwable -> L46
            r1.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "context"
            kotlin.jvm.internal.l.f(r2, r1)     // Catch: java.lang.Throwable -> L46
            boolean r1 = com.yandex.mobile.ads.impl.zw1.a(r2)     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L53
            com.yandex.mobile.ads.impl.ms0 r1 = r4.f29767b     // Catch: java.lang.Throwable -> L46
            android.content.Context r2 = r4.f29770e     // Catch: java.lang.Throwable -> L46
            r1.getClass()     // Catch: java.lang.Throwable -> L46
            java.util.ArrayList r1 = com.yandex.mobile.ads.impl.ms0.a(r2)     // Catch: java.lang.Throwable -> L46
            d9.b r2 = E.u.u()     // Catch: java.lang.Throwable -> L46
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
        L30:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L48
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            com.yandex.mobile.ads.impl.ls0 r3 = (com.yandex.mobile.ads.impl.ls0) r3     // Catch: java.lang.Throwable -> L46
            android.location.Location r3 = r3.a()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            r2.add(r3)     // Catch: java.lang.Throwable -> L46
            goto L30
        L46:
            r1 = move-exception
            goto L56
        L48:
            d9.b r1 = E.u.m(r2)     // Catch: java.lang.Throwable -> L46
            com.yandex.mobile.ads.impl.ns0 r2 = r4.f29766a     // Catch: java.lang.Throwable -> L46
            android.location.Location r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L46
            goto L54
        L53:
            r1 = 0
        L54:
            monitor-exit(r0)
            return r1
        L56:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ks0.c():android.location.Location");
    }

    private ks0(Context context, ns0 ns0Var, ms0 ms0Var, ew1 ew1Var, zw1 zw1Var) {
        this.f29766a = ns0Var;
        this.f29767b = ms0Var;
        this.f29768c = ew1Var;
        this.f29769d = zw1Var;
        this.f29770e = es.a(context);
    }
}
