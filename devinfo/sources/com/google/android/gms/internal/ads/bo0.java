package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bo0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9733a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f9734b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9735c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9736d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9737e;

    /* renamed from: f, reason: collision with root package name */
    public final tw f9738f;

    public bo0(tw twVar, Context context, ScheduledExecutorService scheduledExecutorService, ex exVar, int i4, boolean z3, boolean z10) {
        this.f9738f = twVar;
        this.f9733a = context;
        this.f9734b = scheduledExecutorService;
        this.f9735c = exVar;
        this.f9736d = z3;
        this.f9737e = z10;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() throws PackageManager.NameNotFoundException {
        gx gxVar = new gx();
        za.d dVar = va.r.g.f36157a;
        nb.f fVar = nb.f.f29899b;
        Context context = this.f9733a;
        int iC = fVar.c(12451000, context);
        if (iC == 0 || iC == 2) {
            fx.f11274a.execute(new sw(this.f9738f, context, gxVar));
        }
        n81 n81VarS = n81.s(gxVar);
        final int i4 = 1;
        z21 z21Var = new z21(this) { // from class: com.google.android.gms.internal.ads.ao0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bo0 f9376b;

            {
                this.f9376b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.z21
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L88;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.bo0 r0 = r8.f9376b
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
                    r2 = 6
                    r1.<init>(r2)
                    boolean r2 = r0.f9736d
                    if (r2 != 0) goto L26
                    com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.N3
                    va.s r3 = va.s.f36163e
                    com.google.android.gms.internal.ads.rk r3 = r3.f36166c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L26:
                    com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.O3
                    va.s r3 = va.s.f36163e
                    com.google.android.gms.internal.ads.rk r3 = r3.f36166c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L39:
                    android.content.Context r1 = r0.f9733a     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    com.google.android.gms.internal.ads.kx0 r2 = com.google.android.gms.internal.ads.kx0.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    j$.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.String r3 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    j$.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.T3     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    va.s r5 = va.s.f36163e     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    com.google.android.gms.internal.ads.rk r5 = r5.f36166c     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    boolean r7 = r0.f9737e     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.Class<com.google.android.gms.internal.ads.kx0> r1 = com.google.android.gms.internal.ads.kx0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    androidx.recyclerview.widget.d r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6c
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
                    r1 = r0
                    goto L81
                L6c:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                L6f:
                    r0 = move-exception
                    goto L72
                L71:
                    r0 = move-exception
                L72:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    ua.j r2 = ua.j.C
                    com.google.android.gms.internal.ads.zw r2 = r2.f35265h
                    r2.f(r1, r0)
                    androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
                    r0 = 6
                    r1.<init>(r0)
                L81:
                    com.google.android.gms.internal.ads.co0 r0 = new com.google.android.gms.internal.ads.co0
                    r2 = 0
                    r0.<init>(r9, r2, r1)
                    return r0
                L88:
                    com.google.android.gms.internal.ads.bo0 r0 = r8.f9376b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    va.r r9 = va.r.g
                    za.d r9 = r9.f36157a
                    android.content.Context r9 = r0.f9733a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9e
                    r9 = r0
                    goto La4
                L9e:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La4:
                    com.google.android.gms.internal.ads.co0 r1 = new com.google.android.gms.internal.ads.co0
                    androidx.recyclerview.widget.d r2 = new androidx.recyclerview.widget.d
                    r3 = 6
                    r2.<init>(r3)
                    r1.<init>(r0, r9, r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ao0.apply(java.lang.Object):java.lang.Object");
            }
        };
        Executor executor = this.f9735c;
        final int i10 = 0;
        return yo0.C((n81) yo0.E(yo0.G(n81VarS, z21Var, executor), ((Long) va.s.f36163e.f36166c.a(sk.f16332t1)).longValue(), TimeUnit.MILLISECONDS, this.f9734b), Throwable.class, new z21(this) { // from class: com.google.android.gms.internal.ads.ao0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bo0 f9376b;

            {
                this.f9376b = this;
            }

            @Override // com.google.android.gms.internal.ads.z21
            public final Object apply(Object v10) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L88;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.bo0 r0 = r8.f9376b
                    com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r9 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r9
                    androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
                    r2 = 6
                    r1.<init>(r2)
                    boolean r2 = r0.f9736d
                    if (r2 != 0) goto L26
                    com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.N3
                    va.s r3 = va.s.f36163e
                    com.google.android.gms.internal.ads.rk r3 = r3.f36166c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L26:
                    com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.O3
                    va.s r3 = va.s.f36163e
                    com.google.android.gms.internal.ads.rk r3 = r3.f36166c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L81
                L39:
                    android.content.Context r1 = r0.f9733a     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    com.google.android.gms.internal.ads.kx0 r2 = com.google.android.gms.internal.ads.kx0.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    j$.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.String r3 = r9.getId()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    j$.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.T3     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    va.s r5 = va.s.f36163e     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    com.google.android.gms.internal.ads.rk r5 = r5.f36166c     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    boolean r7 = r0.f9737e     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    java.lang.Class<com.google.android.gms.internal.ads.kx0> r1 = com.google.android.gms.internal.ads.kx0.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                    androidx.recyclerview.widget.d r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6c
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
                    r1 = r0
                    goto L81
                L6c:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6f java.io.IOException -> L71
                L6f:
                    r0 = move-exception
                    goto L72
                L71:
                    r0 = move-exception
                L72:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    ua.j r2 = ua.j.C
                    com.google.android.gms.internal.ads.zw r2 = r2.f35265h
                    r2.f(r1, r0)
                    androidx.recyclerview.widget.d r1 = new androidx.recyclerview.widget.d
                    r0 = 6
                    r1.<init>(r0)
                L81:
                    com.google.android.gms.internal.ads.co0 r0 = new com.google.android.gms.internal.ads.co0
                    r2 = 0
                    r0.<init>(r9, r2, r1)
                    return r0
                L88:
                    com.google.android.gms.internal.ads.bo0 r0 = r8.f9376b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    va.r r9 = va.r.g
                    za.d r9 = r9.f36157a
                    android.content.Context r9 = r0.f9733a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9e
                    r9 = r0
                    goto La4
                L9e:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La4:
                    com.google.android.gms.internal.ads.co0 r1 = new com.google.android.gms.internal.ads.co0
                    androidx.recyclerview.widget.d r2 = new androidx.recyclerview.widget.d
                    r3 = 6
                    r2.<init>(r3)
                    r1.<init>(r0, r9, r2)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ao0.apply(java.lang.Object):java.lang.Object");
            }
        }, executor);
    }
}
