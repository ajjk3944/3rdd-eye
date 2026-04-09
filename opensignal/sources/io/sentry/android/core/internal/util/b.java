package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.SystemClock;
import io.sentry.b5;
import io.sentry.n0;
import io.sentry.o0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11639b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f11638a = i10;
        this.f11639b = obj;
    }

    public void a() {
        ((c) this.f11639b).G.set(false);
        io.sentry.q qVarA = ((c) this.f11639b).f11645y.a();
        try {
            ((c) this.f11639b).D = null;
            ((c) this.f11639b).E = null;
            c cVar = (c) this.f11639b;
            cVar.f11643r.getClass();
            cVar.F = SystemClock.uptimeMillis();
            ((c) this.f11639b).f11641d.getLogger().m(b5.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = ((c) this.f11639b).f11644x.iterator();
            while (it.hasNext()) {
                ((o0) it.next()).f(n0.DISCONNECTED);
            }
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f11638a) {
            case 0:
                ((c) this.f11639b).E = network;
                if (((c) this.f11639b).G.getAndSet(true)) {
                    return;
                }
                io.sentry.q qVarA = c.J.a();
                try {
                    Iterator it = c.K.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                    }
                    qVarA.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        qVarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                io.sentry.k.m((io.sentry.k) this.f11639b, network, true);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083 A[Catch: all -> 0x008d, LOOP:3: B:35:0x007d->B:37:0x0083, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:34:0x0073, B:35:0x007d, B:37:0x0083), top: B:69:0x0073 }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCapabilitiesChanged(android.net.Network r8, android.net.NetworkCapabilities r9) {
        /*
            r7 = this;
            int r0 = r7.f11638a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onCapabilitiesChanged(r8, r9)
            return
        L9:
            java.lang.Object r0 = r7.f11639b
            io.sentry.android.core.internal.util.c r0 = (io.sentry.android.core.internal.util.c) r0
            android.net.Network r0 = r0.E
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L17
            goto Lc0
        L17:
            java.lang.Object r0 = r7.f11639b
            io.sentry.android.core.internal.util.c r0 = (io.sentry.android.core.internal.util.c) r0
            android.net.NetworkCapabilities r0 = r0.D
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L23
            r3 = r2
            goto L24
        L23:
            r3 = r1
        L24:
            if (r9 != 0) goto L27
            goto L28
        L27:
            r2 = r1
        L28:
            if (r3 == r2) goto L2b
            goto L5a
        L2b:
            if (r0 != 0) goto L31
            if (r9 != 0) goto L31
            goto L9f
        L31:
            int[] r2 = io.sentry.android.core.internal.util.c.M
            int r3 = r2.length
            r4 = r1
        L35:
            if (r4 >= r3) goto L49
            r5 = r2[r4]
            if (r5 == 0) goto L46
            boolean r6 = r0.hasCapability(r5)
            boolean r5 = r9.hasCapability(r5)
            if (r6 == r5) goto L46
            goto L5a
        L46:
            int r4 = r4 + 1
            goto L35
        L49:
            int[] r2 = io.sentry.android.core.internal.util.c.L
            int r3 = r2.length
        L4c:
            if (r1 >= r3) goto L9f
            r4 = r2[r1]
            boolean r5 = r0.hasTransport(r4)
            boolean r4 = r9.hasTransport(r4)
            if (r5 == r4) goto L9c
        L5a:
            java.lang.Object r0 = r7.f11639b
            io.sentry.android.core.internal.util.c r0 = (io.sentry.android.core.internal.util.c) r0
            r0.V(r9)
            java.lang.Object r0 = r7.f11639b
            io.sentry.android.core.internal.util.c r0 = (io.sentry.android.core.internal.util.c) r0
            io.sentry.n0 r0 = r0.q()
            java.lang.Object r1 = r7.f11639b
            io.sentry.android.core.internal.util.c r1 = (io.sentry.android.core.internal.util.c) r1
            io.sentry.util.a r1 = r1.f11645y
            io.sentry.q r1 = r1.a()
            java.lang.Object r2 = r7.f11639b     // Catch: java.lang.Throwable -> L8d
            io.sentry.android.core.internal.util.c r2 = (io.sentry.android.core.internal.util.c) r2     // Catch: java.lang.Throwable -> L8d
            java.util.ArrayList r2 = r2.f11644x     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8d
        L7d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8d
            io.sentry.o0 r3 = (io.sentry.o0) r3     // Catch: java.lang.Throwable -> L8d
            r3.f(r0)     // Catch: java.lang.Throwable -> L8d
            goto L7d
        L8d:
            r8 = move-exception
            goto L93
        L8f:
            r1.close()
            goto L9f
        L93:
            r1.close()     // Catch: java.lang.Throwable -> L97
            goto L9b
        L97:
            r9 = move-exception
            r8.addSuppressed(r9)
        L9b:
            throw r8
        L9c:
            int r1 = r1 + 1
            goto L4c
        L9f:
            io.sentry.util.a r0 = io.sentry.android.core.internal.util.c.J
            io.sentry.q r0 = r0.a()
            java.util.ArrayList r1 = io.sentry.android.core.internal.util.c.K     // Catch: java.lang.Throwable -> Lbb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lbb
        Lab:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lbb
            android.net.ConnectivityManager$NetworkCallback r2 = (android.net.ConnectivityManager.NetworkCallback) r2     // Catch: java.lang.Throwable -> Lbb
            r2.onCapabilitiesChanged(r8, r9)     // Catch: java.lang.Throwable -> Lbb
            goto Lab
        Lbb:
            r8 = move-exception
            goto Lc1
        Lbd:
            r0.close()
        Lc0:
            return
        Lc1:
            r0.close()     // Catch: java.lang.Throwable -> Lc5
            goto Lc9
        Lc5:
            r9 = move-exception
            r8.addSuppressed(r9)
        Lc9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.b.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f11638a) {
            case 0:
                if (network.equals(((c) this.f11639b).E)) {
                    a();
                    io.sentry.q qVarA = c.J.a();
                    try {
                        Iterator it = c.K.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                        }
                        qVarA.close();
                        return;
                    } catch (Throwable th2) {
                        try {
                            qVarA.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                return;
            default:
                io.sentry.k.m((io.sentry.k) this.f11639b, network, false);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.f11638a) {
            case 0:
                a();
                io.sentry.q qVarA = c.J.a();
                try {
                    Iterator it = c.K.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                    }
                    qVarA.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        qVarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                super.onUnavailable();
                return;
        }
    }
}
