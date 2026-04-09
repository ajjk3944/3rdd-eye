package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a63 implements q53 {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final boolean d;
    public final boolean e;
    public final us0 f;

    public a63(us0 us0Var, Context context, ScheduledExecutorService scheduledExecutorService, ld2 ld2Var, int i, boolean z, boolean z2) {
        this.f = us0Var;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = ld2Var;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.q53
    public final n70 a() throws PackageManager.NameNotFoundException {
        pd2 pd2Var = new pd2();
        j63 j63Var = sv1.f.a;
        gz gzVar = gz.b;
        Context context = this.a;
        int iC = gzVar.c(context, 12451000);
        if (iC == 0 || iC == 2) {
            md2.a.execute(new n62(this.f, context, pd2Var));
        }
        gq3 gq3VarR = gq3.r(pd2Var);
        final int i = 1;
        zk3 zk3Var = new zk3(this) { // from class: z53
            public final /* synthetic */ a63 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.zk3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r9) {
                /*
                    r8 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L89;
                        default: goto L5;
                    }
                L5:
                    a63 r0 = r8.b
                    j3 r9 = (defpackage.j3) r9
                    ue r1 = new ue
                    r2 = 8
                    r1.<init>(r2)
                    boolean r2 = r0.d
                    if (r2 != 0) goto L27
                    iz1 r2 = defpackage.mz1.w3
                    tw1 r3 = defpackage.tw1.e
                    kz1 r3 = r3.c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L27:
                    iz1 r2 = defpackage.mz1.x3
                    tw1 r3 = defpackage.tw1.e
                    kz1 r3 = r3.c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L3a:
                    android.content.Context r1 = r0.a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    mf3 r2 = defpackage.mf3.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r3 = r9.a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    iz1 r1 = defpackage.mz1.C3     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    tw1 r5 = defpackage.tw1.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    kz1 r5 = r5.c     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    boolean r7 = r0.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Class<mf3> r1 = defpackage.mf3.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    ue r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    r1 = r0
                    goto L81
                L6b:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                L6e:
                    r0 = move-exception
                    goto L71
                L70:
                    r0 = move-exception
                L71:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    hg4 r2 = defpackage.hg4.C
                    gd2 r2 = r2.h
                    r2.d(r1, r0)
                    ue r1 = new ue
                    r0 = 8
                    r1.<init>(r0)
                L81:
                    f33 r0 = new f33
                    r2 = 0
                    r3 = 1
                    r0.<init>(r9, r2, r1, r3)
                    return r0
                L89:
                    a63 r0 = r8.b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    sv1 r9 = defpackage.sv1.f
                    j63 r9 = r9.a
                    android.content.Context r9 = r0.a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9f
                    r9 = r0
                    goto La5
                L9f:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La5:
                    f33 r1 = new f33
                    ue r2 = new ue
                    r3 = 8
                    r2.<init>(r3)
                    r3 = 1
                    r1.<init>(r0, r9, r2, r3)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.z53.apply(java.lang.Object):java.lang.Object");
            }
        };
        Executor executor = this.c;
        final int i2 = 0;
        return pu1.J((gq3) pu1.N(pu1.P(gq3VarR, zk3Var, executor), ((Long) tw1.e.c.a(mz1.e1)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new zk3(this) { // from class: z53
            public final /* synthetic */ a63 b;

            {
                this.b = this;
            }

            @Override // defpackage.zk3
            public final Object apply(Object v) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L89;
                        default: goto L5;
                    }
                L5:
                    a63 r0 = r8.b
                    j3 r9 = (defpackage.j3) r9
                    ue r1 = new ue
                    r2 = 8
                    r1.<init>(r2)
                    boolean r2 = r0.d
                    if (r2 != 0) goto L27
                    iz1 r2 = defpackage.mz1.w3
                    tw1 r3 = defpackage.tw1.e
                    kz1 r3 = r3.c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L27:
                    iz1 r2 = defpackage.mz1.x3
                    tw1 r3 = defpackage.tw1.e
                    kz1 r3 = r3.c
                    java.lang.Object r2 = r3.a(r2)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L3a
                    goto L81
                L3a:
                    android.content.Context r1 = r0.a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    mf3 r2 = defpackage.mf3.f(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r3 = r9.a     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.util.Objects.requireNonNull(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    iz1 r1 = defpackage.mz1.C3     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    tw1 r5 = defpackage.tw1.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    kz1 r5 = r5.c     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Object r1 = r5.a(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    long r5 = r1.longValue()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    boolean r7 = r0.e     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    r2.getClass()     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    java.lang.Class<mf3> r1 = defpackage.mf3.class
                    monitor-enter(r1)     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                    ue r0 = r2.a(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L6b
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    r1 = r0
                    goto L81
                L6b:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
                    throw r0     // Catch: java.lang.IllegalArgumentException -> L6e java.io.IOException -> L70
                L6e:
                    r0 = move-exception
                    goto L71
                L70:
                    r0 = move-exception
                L71:
                    java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
                    hg4 r2 = defpackage.hg4.C
                    gd2 r2 = r2.h
                    r2.d(r1, r0)
                    ue r1 = new ue
                    r0 = 8
                    r1.<init>(r0)
                L81:
                    f33 r0 = new f33
                    r2 = 0
                    r3 = 1
                    r0.<init>(r9, r2, r1, r3)
                    return r0
                L89:
                    a63 r0 = r8.b
                    java.lang.Throwable r9 = (java.lang.Throwable) r9
                    r0.getClass()
                    sv1 r9 = defpackage.sv1.f
                    j63 r9 = r9.a
                    android.content.Context r9 = r0.a
                    android.content.ContentResolver r9 = r9.getContentResolver()
                    r0 = 0
                    if (r9 != 0) goto L9f
                    r9 = r0
                    goto La5
                L9f:
                    java.lang.String r1 = "android_id"
                    java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r1)
                La5:
                    f33 r1 = new f33
                    ue r2 = new ue
                    r3 = 8
                    r2.<init>(r3)
                    r3 = 1
                    r1.<init>(r0, r9, r2, r3)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.z53.apply(java.lang.Object):java.lang.Object");
            }
        }, executor);
    }

    @Override // defpackage.q53
    public final int d() {
        return 40;
    }
}
