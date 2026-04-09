package com.google.android.gms.ads;

import android.os.RemoteException;
import pb.y;
import va.h1;
import va.h2;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MobileAds {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0049, TryCatch #2 {all -> 0x0049, RemoteException -> 0x004c, blocks: (B:21:0x002e, B:23:0x0035, B:28:0x004e, B:31:0x005e, B:33:0x006f, B:35:0x0081, B:42:0x00c6, B:43:0x00e1, B:36:0x0092, B:38:0x00a0, B:40:0x00b2, B:41:0x00be, B:30:0x0059), top: B:52:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[Catch: all -> 0x0049, TryCatch #2 {all -> 0x0049, RemoteException -> 0x004c, blocks: (B:21:0x002e, B:23:0x0035, B:28:0x004e, B:31:0x005e, B:33:0x006f, B:35:0x0081, B:42:0x00c6, B:43:0x00e1, B:36:0x0092, B:38:0x00a0, B:40:0x00b2, B:41:0x00be, B:30:0x0059), top: B:52:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r4, pi.d r5) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MobileAds.a(android.content.Context, pi.d):void");
    }

    private static void setPlugin(String str) {
        h2 h2VarD = h2.d();
        synchronized (h2VarD.f36113h) {
            y.j("MobileAds.initialize() must be called prior to setting the plugin.", h2VarD.f36114i != null);
            h1 h1Var = h2VarD.f36114i;
            if (h1Var == null) {
                return;
            }
            try {
                h1Var.H(str);
            } catch (RemoteException e2) {
                i.f("Unable to set plugin.", e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035 A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void stop() {
        /*
            va.h2 r0 = va.h2.d()
            java.lang.Object r1 = r0.f36110d
            monitor-enter(r1)
            r2 = 0
            r0.g = r2     // Catch: java.lang.Throwable -> L47
            r0.f36112f = r2     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r2 = r0.f36111e     // Catch: java.lang.Throwable -> L47
            r2.clear()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r0.f36113h
            monitor-enter(r2)
            va.h1 r1 = r0.f36114i     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            if (r1 == 0) goto L25
            r1.I()     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            goto L25
        L1d:
            r0 = move-exception
            goto L45
        L1f:
            r1 = move-exception
            java.lang.String r3 = "Unable to stop the SDK."
            za.i.f(r3, r1)     // Catch: java.lang.Throwable -> L1d
        L25:
            r1 = 0
            r0.f36114i = r1     // Catch: java.lang.Throwable -> L1d
            va.f2 r3 = r0.f36107a     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L31
            r3.c()     // Catch: java.lang.Throwable -> L1d
            r0.f36107a = r1     // Catch: java.lang.Throwable -> L1d
        L31:
            va.f2 r3 = r0.f36108b     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L3a
            r3.c()     // Catch: java.lang.Throwable -> L1d
            r0.f36108b = r1     // Catch: java.lang.Throwable -> L1d
        L3a:
            va.f2 r3 = r0.f36109c     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L43
            r3.c()     // Catch: java.lang.Throwable -> L1d
            r0.f36109c = r1     // Catch: java.lang.Throwable -> L1d
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L47:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MobileAds.stop():void");
    }
}
