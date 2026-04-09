package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class X4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f36290a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36291b;

    X4(C4945r4 c4945r4, com.google.android.gms.internal.measurement.U0 u02) {
        this.f36290a = u02;
        this.f36291b = c4945r4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.r4 r0 = r7.f36291b
            com.google.android.gms.measurement.internal.w6 r0 = r0.r()
            com.google.android.gms.measurement.internal.X2 r1 = r0.e()
            com.google.android.gms.measurement.internal.e4 r1 = r1.J()
            boolean r1 = r1.x()
            r2 = 0
            if (r1 != 0) goto L24
            com.google.android.gms.measurement.internal.L2 r0 = r0.zzj()
            com.google.android.gms.measurement.internal.N2 r0 = r0.I()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L22:
            r0 = r2
            goto L55
        L24:
            com.google.android.gms.measurement.internal.X2 r1 = r0.e()
            com.google.android.gms.common.util.d r3 = r0.zzb()
            long r3 = r3.a()
            boolean r1 = r1.u(r3)
            if (r1 != 0) goto L22
            com.google.android.gms.measurement.internal.X2 r1 = r0.e()
            com.google.android.gms.measurement.internal.Y2 r1 = r1.f36279s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L47
            goto L22
        L47:
            com.google.android.gms.measurement.internal.X2 r0 = r0.e()
            com.google.android.gms.measurement.internal.Y2 r0 = r0.f36279s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L55:
            if (r0 == 0) goto L69
            com.google.android.gms.measurement.internal.r4 r1 = r7.f36291b
            com.google.android.gms.measurement.internal.v3 r1 = r1.f36331a
            com.google.android.gms.measurement.internal.x7 r1 = r1.K()
            com.google.android.gms.internal.measurement.U0 r2 = r7.f36290a
            long r3 = r0.longValue()
            r1.M(r2, r3)
            return
        L69:
            com.google.android.gms.internal.measurement.U0 r0 = r7.f36290a     // Catch: android.os.RemoteException -> L6f
            r0.a(r2)     // Catch: android.os.RemoteException -> L6f
            return
        L6f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r4 r1 = r7.f36291b
            com.google.android.gms.measurement.internal.v3 r1 = r1.f36331a
            com.google.android.gms.measurement.internal.L2 r1 = r1.zzj()
            com.google.android.gms.measurement.internal.N2 r1 = r1.C()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.X4.run():void");
    }
}
