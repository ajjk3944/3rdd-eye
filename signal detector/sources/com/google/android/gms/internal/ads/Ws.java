package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Ws implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12328a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f12329b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12330c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12331d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12332e;

    /* renamed from: f, reason: collision with root package name */
    public final W9 f12333f;

    public Ws(W9 w9, Context context, ScheduledExecutorService scheduledExecutorService, C0623Mf c0623Mf, int i, boolean z6, boolean z7) {
        this.f12333f = w9;
        this.f12328a = context;
        this.f12329b = scheduledExecutorService;
        this.f12330c = c0623Mf;
        this.f12331d = z6;
        this.f12332e = z7;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() throws PackageManager.NameNotFoundException {
        C0657Of c0657Of = new C0657Of();
        u2.f fVar = q2.r.f23260g.f23261a;
        J2.f fVar2 = J2.f.f2059b;
        Context context = this.f12328a;
        int iC = fVar2.c(context, 12451000);
        if (iC == 0 || iC == 2) {
            AbstractC0640Nf.f10005a.execute(new CD(this.f12333f, context, c0657Of));
        }
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(c0657Of);
        final int i = 1;
        NA na = new NA(this) { // from class: com.google.android.gms.internal.ads.Vs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ws f12095b;

            {
                this.f12095b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // com.google.android.gms.internal.ads.NA
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L87;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.Ws r0 = r8.f12095b
                    n2.a r9 = (n2.C2686a) r9
                    U1.b r1 = new U1.b
                    r2 = 7
                    r1.<init>(r2)
                    boolean r2 = r0.f12331d
                    if (r2 != 0) goto L26
                    com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.f8640N3
                    q2.s r3 = q2.C2841s.f23267e
                    com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L7f
                L26:
                    com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.f8646O3
                    q2.s r3 = q2.C2841s.f23267e
                    com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L7f
                L39:
                    android.content.Context r1 = r0.f12328a     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    com.google.android.gms.internal.ads.Px r2 = com.google.android.gms.internal.ads.Px.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    j$.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.String r3 = r9.f22310a     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    j$.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.T3     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    q2.s r5 = q2.C2841s.f23267e     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    com.google.android.gms.internal.ads.G9 r5 = r5.f23270c     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    boolean r7 = r0.f12332e     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.Class<com.google.android.gms.internal.ads.Px> r1 = com.google.android.gms.internal.ads.Px.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    U1.b r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6a
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                    r1 = r0
                    goto L7f
                L6a:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                L6d:
                    r0 = move-exception
                    goto L70
                L6f:
                    r0 = move-exception
                L70:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    p2.j r2 = p2.j.f22785C
                    com.google.android.gms.internal.ads.Hf r2 = r2.f22795h
                    r2.f(r1, r0)
                    U1.b r1 = new U1.b
                    r0 = 7
                    r1.<init>(r0)
                L7f:
                    com.google.android.gms.internal.ads.Kr r0 = new com.google.android.gms.internal.ads.Kr
                    r2 = 0
                    r3 = 2
                    r0.<init>(r9, r2, r1, r3)
                    return r0
                L87:
                    com.google.android.gms.internal.ads.Ws r0 = r8.f12095b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    q2.r r9 = q2.r.f23260g
                    u2.f r9 = r9.f23261a
                    android.content.Context r9 = r0.f12328a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9d
                    r9 = r0
                    goto La3
                L9d:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La3:
                    com.google.android.gms.internal.ads.Kr r1 = new com.google.android.gms.internal.ads.Kr
                    U1.b r2 = new U1.b
                    r3 = 7
                    r2.<init>(r3)
                    r3 = 2
                    r1.<init>(r0, r9, r2, r3)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vs.apply(java.lang.Object):java.lang.Object");
            }
        };
        Executor executor = this.f12330c;
        final int i3 = 0;
        return AbstractC1984ut.C((AbstractC2221zD) AbstractC1984ut.E(AbstractC1984ut.G(abstractC2221zDR, na, executor), ((Long) C2841s.f23267e.f23270c.a(H9.f8830t1)).longValue(), TimeUnit.MILLISECONDS, this.f12329b), Throwable.class, new NA(this) { // from class: com.google.android.gms.internal.ads.Vs

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Ws f12095b;

            {
                this.f12095b = this;
            }

            @Override // com.google.android.gms.internal.ads.NA
            public final Object apply(Object v6) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L87;
                        default: goto L5;
                    }
                L5:
                    com.google.android.gms.internal.ads.Ws r0 = r8.f12095b
                    n2.a r9 = (n2.C2686a) r9
                    U1.b r1 = new U1.b
                    r2 = 7
                    r1.<init>(r2)
                    boolean r2 = r0.f12331d
                    if (r2 != 0) goto L26
                    com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.f8640N3
                    q2.s r3 = q2.C2841s.f23267e
                    com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L7f
                L26:
                    com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.f8646O3
                    q2.s r3 = q2.C2841s.f23267e
                    com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L39
                    goto L7f
                L39:
                    android.content.Context r1 = r0.f12328a     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    com.google.android.gms.internal.ads.Px r2 = com.google.android.gms.internal.ads.Px.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    j$.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.String r3 = r9.f22310a     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    j$.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.T3     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    q2.s r5 = q2.C2841s.f23267e     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    com.google.android.gms.internal.ads.G9 r5 = r5.f23270c     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    boolean r7 = r0.f12332e     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    java.lang.Class<com.google.android.gms.internal.ads.Px> r1 = com.google.android.gms.internal.ads.Px.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                    U1.b r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6a
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                    r1 = r0
                    goto L7f
                L6a:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6a
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6d java.io.IOException -> L6f
                L6d:
                    r0 = move-exception
                    goto L70
                L6f:
                    r0 = move-exception
                L70:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    p2.j r2 = p2.j.f22785C
                    com.google.android.gms.internal.ads.Hf r2 = r2.f22795h
                    r2.f(r1, r0)
                    U1.b r1 = new U1.b
                    r0 = 7
                    r1.<init>(r0)
                L7f:
                    com.google.android.gms.internal.ads.Kr r0 = new com.google.android.gms.internal.ads.Kr
                    r2 = 0
                    r3 = 2
                    r0.<init>(r9, r2, r1, r3)
                    return r0
                L87:
                    com.google.android.gms.internal.ads.Ws r0 = r8.f12095b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    q2.r r9 = q2.r.f23260g
                    u2.f r9 = r9.f23261a
                    android.content.Context r9 = r0.f12328a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9d
                    r9 = r0
                    goto La3
                L9d:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La3:
                    com.google.android.gms.internal.ads.Kr r1 = new com.google.android.gms.internal.ads.Kr
                    U1.b r2 = new U1.b
                    r3 = 7
                    r2.<init>(r3)
                    r3 = 2
                    r1.<init>(r0, r9, r2, r3)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vs.apply(java.lang.Object):java.lang.Object");
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 40;
    }
}
