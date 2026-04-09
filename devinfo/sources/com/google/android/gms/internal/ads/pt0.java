package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pt0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ it0 f15105b;

    public /* synthetic */ pt0(it0 it0Var, int i4) {
        this.f15104a = i4;
        this.f15105b = it0Var;
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
            int r0 = r11.f15104a
            switch(r0) {
                case 0: goto L71;
                case 1: goto L3a;
                case 2: goto L17;
                case 3: goto L11;
                case 4: goto Lb;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.it0 r0 = r11.f15105b
            r0.w()
            return
        Lb:
            com.google.android.gms.internal.ads.it0 r0 = r11.f15105b
            r0.d()
            return
        L11:
            com.google.android.gms.internal.ads.it0 r0 = r11.f15105b
            r0.d()
            return
        L17:
            com.google.android.gms.internal.ads.it0 r0 = r11.f15105b
            com.google.android.gms.internal.ads.kh0 r1 = r0.f12442r
            if (r1 == 0) goto L39
            tb.a r2 = r0.f12443s
            com.google.android.gms.internal.ads.nt0 r9 = r0.f12444t
            r2.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            va.t2 r2 = r0.f12431e
            int r6 = r2.f36173d
            java.lang.String r10 = r0.f()
            java.lang.String r2 = "pae"
            java.lang.String r3 = "paeo_ts"
            r7 = 0
            r8 = 0
            r1.D(r2, r3, r4, r6, r7, r8, r9, r10)
        L39:
            return
        L3a:
            com.google.android.gms.internal.ads.it0 r1 = r11.f15105b
            monitor-enter(r1)
            va.p0 r0 = r1.f12433h     // Catch: java.lang.Throwable -> L4f
            r2 = 2
            if (r0 == 0) goto L56
            va.t2 r3 = r1.f12431e     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            android.os.Parcel r4 = r0.T()     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            com.google.android.gms.internal.ads.ng.c(r4, r3)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            r0.g1(r4, r2)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L51
            goto L56
        L4f:
            r0 = move-exception
            goto L6f
        L51:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            za.i.h(r0)     // Catch: java.lang.Throwable -> L4f
        L56:
            va.q0 r0 = r1.f12434i     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L66
            java.lang.String r3 = r1.f12436l     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            android.os.Parcel r4 = r0.T()     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            r4.writeString(r3)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
            r0.g1(r4, r2)     // Catch: java.lang.Throwable -> L4f android.os.RemoteException -> L68
        L66:
            monitor-exit(r1)
            goto L6e
        L68:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            za.i.h(r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)
        L6e:
            return
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r0
        L71:
            com.google.android.gms.internal.ads.it0 r0 = r11.f15105b
            r0.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt0.run():void");
    }
}
