package com.google.android.gms.ads;

import android.os.RemoteException;
import q2.I0;
import q2.InterfaceC2823i0;
import u2.k;

/* loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        I0 i0D = I0.d();
        synchronized (i0D.f23125h) {
            InterfaceC2823i0 interfaceC2823i0 = i0D.i;
            if (!(interfaceC2823i0 != null)) {
                throw new IllegalStateException("MobileAds.initialize() must be called prior to setting the plugin.");
            }
            if (interfaceC2823i0 == null) {
                return;
            }
            try {
                interfaceC2823i0.X(str);
            } catch (RemoteException e6) {
                k.f("Unable to set plugin.", e6);
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
            q2.I0 r0 = q2.I0.d()
            java.lang.Object r1 = r0.f23121d
            monitor-enter(r1)
            r2 = 0
            r0.f23124g = r2     // Catch: java.lang.Throwable -> L47
            r0.f23123f = r2     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r2 = r0.f23122e     // Catch: java.lang.Throwable -> L47
            r2.clear()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r0.f23125h
            monitor-enter(r2)
            q2.i0 r1 = r0.i     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            if (r1 == 0) goto L25
            r1.Y()     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            goto L25
        L1d:
            r0 = move-exception
            goto L45
        L1f:
            r1 = move-exception
            java.lang.String r3 = "Unable to stop the SDK."
            u2.k.f(r3, r1)     // Catch: java.lang.Throwable -> L1d
        L25:
            r1 = 0
            r0.i = r1     // Catch: java.lang.Throwable -> L1d
            q2.G0 r3 = r0.f23118a     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L31
            r3.d()     // Catch: java.lang.Throwable -> L1d
            r0.f23118a = r1     // Catch: java.lang.Throwable -> L1d
        L31:
            q2.G0 r3 = r0.f23119b     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L3a
            r3.d()     // Catch: java.lang.Throwable -> L1d
            r0.f23119b = r1     // Catch: java.lang.Throwable -> L1d
        L3a:
            q2.G0 r3 = r0.f23120c     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L43
            r3.d()     // Catch: java.lang.Throwable -> L1d
            r0.f23120c = r1     // Catch: java.lang.Throwable -> L1d
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
