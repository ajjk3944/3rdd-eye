package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zg0 extends oi {
    public static final String i = h80.f("NetworkStateTracker");
    public final ConnectivityManager g;
    public final ra0 h;

    public zg0(Context context, l01 l01Var) {
        super(context, l01Var);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        this.h = new ra0(1, this);
    }

    @Override // defpackage.oi
    public final Object a() {
        return f();
    }

    @Override // defpackage.oi
    public final void d() {
        try {
            h80.d().a(new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            h80.d().b(i, "Received exception while registering network callback", e);
        }
    }

    @Override // defpackage.oi
    public final void e() {
        try {
            h80.d().a(new Throwable[0]);
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            h80.d().b(i, "Received exception while unregistering network callback", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yg0 f() {
        /*
            r9 = this;
            android.net.ConnectivityManager r0 = r9.g
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L12
            r4 = r3
            goto L13
        L12:
            r4 = r2
        L13:
            android.net.Network r5 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L27
            android.net.NetworkCapabilities r5 = r0.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r6 = 16
            boolean r5 = r5.hasCapability(r6)     // Catch: java.lang.SecurityException -> L27
            if (r5 == 0) goto L29
            r5 = r3
            goto L3b
        L27:
            r5 = move-exception
            goto L2b
        L29:
            r5 = r2
            goto L3b
        L2b:
            h80 r6 = defpackage.h80.d()
            java.lang.Throwable[] r7 = new java.lang.Throwable[r3]
            r7[r2] = r5
            java.lang.String r5 = defpackage.zg0.i
            java.lang.String r8 = "Unable to validate active network"
            r6.b(r5, r8, r7)
            goto L29
        L3b:
            boolean r0 = r0.isActiveNetworkMetered()
            if (r1 == 0) goto L48
            boolean r1 = r1.isRoaming()
            if (r1 != 0) goto L48
            r2 = r3
        L48:
            yg0 r1 = new yg0
            r1.<init>()
            r1.a = r4
            r1.b = r5
            r1.c = r0
            r1.d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg0.f():yg0");
    }
}
