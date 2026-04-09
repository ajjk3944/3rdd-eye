package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tb3 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ jb3 g;

    public /* synthetic */ tb3(jb3 jb3Var, int i) {
        this.f = i;
        this.g = jb3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L28;
                default: goto L5;
            }
        L5:
            jb3 r0 = r11.g
            sq0 r1 = r0.p
            if (r1 == 0) goto L27
            ym r2 = r0.q
            qb3 r9 = r0.r
            r2.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            ae3 r2 = r0.e
            int r6 = r2.i
            java.lang.String r10 = r0.e()
            java.lang.String r2 = "pae"
            java.lang.String r3 = "paeo_ts"
            r7 = 0
            r8 = 0
            r1.z(r2, r3, r4, r6, r7, r8, r9, r10)
        L27:
            return
        L28:
            jb3 r1 = r11.g
            monitor-enter(r1)
            od2 r0 = r1.g     // Catch: java.lang.Throwable -> L3d
            r2 = 2
            if (r0 == 0) goto L44
            ae3 r3 = r1.e     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L3f
            android.os.Parcel r4 = r0.U()     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L3f
            defpackage.iv1.c(r4, r3)     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L3f
            r0.M0(r4, r2)     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L3f
            goto L44
        L3d:
            r0 = move-exception
            goto L5d
        L3f:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            defpackage.gi2.i0(r0)     // Catch: java.lang.Throwable -> L3d
        L44:
            bf2 r0 = r1.h     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L54
            java.lang.String r3 = r1.k     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L56
            android.os.Parcel r4 = r0.U()     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L56
            r4.writeString(r3)     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L56
            r0.M0(r4, r2)     // Catch: java.lang.Throwable -> L3d android.os.RemoteException -> L56
        L54:
            monitor-exit(r1)
            goto L5c
        L56:
            java.lang.String r0 = "Failed to call onAdsExhausted"
            defpackage.gi2.i0(r0)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
        L5c:
            return
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3d
            throw r0
        L5f:
            jb3 r0 = r11.g
            r0.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb3.run():void");
    }
}
