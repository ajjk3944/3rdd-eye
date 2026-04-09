package defpackage;

import android.app.Notification;
import android.os.Bundle;
import androidx.work.impl.foreground.SystemForegroundService;
import java.net.InetAddress;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ml implements Runnable {
    public final /* synthetic */ int f = 2;
    public final int g;
    public final int h;
    public final Object i;
    public final /* synthetic */ Object j;

    public ml(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.j = systemForegroundService;
        this.g = i;
        this.i = notification;
        this.h = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.i
            android.app.Notification r0 = (android.app.Notification) r0
            int r1 = r6.g
            java.lang.Object r2 = r6.j
            androidx.work.impl.foreground.SystemForegroundService r2 = (androidx.work.impl.foreground.SystemForegroundService) r2
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L1b
            int r3 = r6.h
            defpackage.r0.r(r2, r1, r0, r3)
            goto L1e
        L1b:
            r2.startForeground(r1, r0)
        L1e:
            return
        L1f:
            int r0 = r6.h
            java.lang.Object r1 = r6.i
            java.net.InetAddress r1 = (java.net.InetAddress) r1
            int r2 = r6.g
            java.lang.Object r3 = r6.j
            ql0 r3 = (defpackage.ql0) r3
            boolean r4 = r3.d
            if (r4 == 0) goto L30
            goto L7b
        L30:
            r4 = 0
            java.net.Socket r5 = new java.net.Socket     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            r5.<init>()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L59
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r5.connect(r4, r0)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            r0 = 1
            r5.close()     // Catch: java.io.IOException -> L43
            goto L64
        L43:
            r1 = move-exception
            r1.printStackTrace()
            goto L64
        L48:
            r0 = move-exception
            r4 = r5
            goto L4e
        L4b:
            r4 = r5
            goto L59
        L4d:
            r0 = move-exception
        L4e:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.io.IOException -> L54
            goto L58
        L54:
            r1 = move-exception
            r1.printStackTrace()
        L58:
            throw r0
        L59:
            if (r4 == 0) goto L63
            r4.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r0 = 0
        L64:
            monitor-enter(r3)
            if (r0 == 0) goto L73
            java.util.ArrayList r1 = r3.f     // Catch: java.lang.Throwable -> L71
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L71
            r1.add(r4)     // Catch: java.lang.Throwable -> L71
            goto L73
        L71:
            r0 = move-exception
            goto L7c
        L73:
            pl0 r1 = r3.g     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L7a
            r1.k(r2, r0)     // Catch: java.lang.Throwable -> L71
        L7a:
            monitor-exit(r3)
        L7b:
            return
        L7c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L71
            throw r0
        L7e:
            java.lang.Object r0 = r6.j
            nl r0 = (defpackage.nl) r0
            il r0 = r0.g
            int r1 = r6.g
            int r2 = r6.h
            java.lang.Object r3 = r6.i
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.c(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml.run():void");
    }

    public ml(ql0 ql0Var, InetAddress inetAddress, int i, int i2) {
        this.j = ql0Var;
        this.i = inetAddress;
        this.g = i;
        this.h = i2;
    }

    public ml(nl nlVar, int i, int i2, Bundle bundle) {
        this.j = nlVar;
        this.g = i;
        this.h = i2;
        this.i = bundle;
    }
}
