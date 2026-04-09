package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Lv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ev f9783b;

    public /* synthetic */ Lv(Ev ev, int i) {
        this.f9782a = i;
        this.f9783b = ev;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f9782a
            switch(r0) {
                case 0: goto L71;
                case 1: goto L3a;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Lb;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.Ev r0 = r11.f9783b
            r0.w()
            return
        Lb:
            com.google.android.gms.internal.ads.Ev r0 = r11.f9783b
            r0.d()
            return
        L11:
            com.google.android.gms.internal.ads.Ev r0 = r11.f9783b
            r0.d()
            return
        L17:
            com.google.android.gms.internal.ads.Ev r0 = r11.f9783b
            com.google.android.gms.internal.ads.cu r1 = r0.f8039r
            if (r1 == 0) goto L39
            Q2.a r2 = r0.f8040s
            com.google.android.gms.internal.ads.Jv r9 = r0.f8041t
            r2.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            q2.U0 r2 = r0.f8027e
            int r6 = r2.f23142d
            java.lang.String r10 = r0.f()
            java.lang.String r2 = "pae"
            java.lang.String r3 = "paeo_ts"
            r7 = 0
            r8 = 0
            r1.n(r2, r3, r4, r6, r7, r8, r9, r10)
        L39:
            return
        L3a:
            com.google.android.gms.internal.ads.Ev r1 = r11.f9783b
            monitor-enter(r1)
            q2.P r0 = r1.f8030h     // Catch: java.lang.Throwable -> L4f
            r2 = 2
            if (r0 == 0) goto L56
            q2.U0 r3 = r1.f8027e     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            android.os.Parcel r4 = r0.h0()     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            com.google.android.gms.internal.ads.C7.c(r4, r3)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            r0.I0(r4, r2)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            goto L56
        L4f:
            r0 = move-exception
            goto L6f
        L51:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            u2.k.h(r0)     // Catch: java.lang.Throwable -> L4f
        L56:
            q2.Q r0 = r1.i     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L66
            java.lang.String r3 = r1.f8033l     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            android.os.Parcel r4 = r0.h0()     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            r4.writeString(r3)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            r0.I0(r4, r2)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
        L66:
            monitor-exit(r1)
            goto L6e
        L68:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            u2.k.h(r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)
        L6e:
            return
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0
        L71:
            com.google.android.gms.internal.ads.Ev r0 = r11.f9783b
            r0.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Lv.run():void");
    }
}
