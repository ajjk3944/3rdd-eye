package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a0;
import io.sentry.android.core.d0;
import io.sentry.android.core.e0;
import io.sentry.android.core.f0;
import io.sentry.b5;
import io.sentry.n0;
import io.sentry.o0;
import io.sentry.p0;
import io.sentry.u0;
import io.sentry.x5;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c implements p0, a0 {
    public static volatile ConnectivityManager I;
    public volatile b B;
    public volatile NetworkCapabilities D;
    public volatile Network E;
    public volatile long F;
    public final AtomicBoolean G;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11640a;

    /* renamed from: d, reason: collision with root package name */
    public final x5 f11641d;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f11642g;

    /* renamed from: r, reason: collision with root package name */
    public final d f11643r;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f11644x;

    /* renamed from: y, reason: collision with root package name */
    public final io.sentry.util.a f11645y;
    public static final io.sentry.util.a H = new io.sentry.util.a();
    public static final io.sentry.util.a J = new io.sentry.util.a();
    public static final ArrayList K = new ArrayList();
    public static final int[] L = {1, 0, 3, 2};
    public static final int[] M = new int[2];

    public c(Context context, f0 f0Var, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.f11646a;
        this.f11645y = new io.sentry.util.a();
        this.F = 0L;
        this.G = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.f11640a = applicationContext != null ? applicationContext : context;
        this.f11641d = sentryAndroidOptions;
        this.f11642g = f0Var;
        this.f11643r = dVar;
        this.f11644x = new ArrayList();
        int[] iArr = M;
        iArr[0] = 12;
        iArr[1] = 16;
        L(new a(this, 1));
        d0.f11554x.b(this);
    }

    public static ConnectivityManager G(Context context, u0 u0Var) {
        if (I != null) {
            return I;
        }
        io.sentry.q qVarA = H.a();
        try {
            if (I != null) {
                ConnectivityManager connectivityManager = I;
                qVarA.close();
                return connectivityManager;
            }
            I = (ConnectivityManager) context.getSystemService("connectivity");
            if (I == null) {
                u0Var.m(b5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = I;
            qVarA.close();
            return connectivityManager2;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static boolean h(Context context, u0 u0Var, f0 f0Var, ConnectivityManager.NetworkCallback networkCallback) {
        f0Var.getClass();
        if (!kc.f.D(context)) {
            u0Var.m(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        io.sentry.q qVarA = J.a();
        try {
            K.add(networkCallback);
            qVarA.close();
            return true;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String w(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public final void L(Runnable runnable) {
        x5 x5Var = this.f11641d;
        try {
            x5Var.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            x5Var.getLogger().g(b5.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    @Override // io.sentry.p0
    public final n0 N() {
        this.f11643r.getClass();
        if (SystemClock.uptimeMillis() - this.F >= 120000) {
            V(null);
        }
        return q();
    }

    @Override // io.sentry.p0
    public final boolean Q(o0 o0Var) {
        io.sentry.q qVarA = this.f11645y.a();
        try {
            this.f11644x.add(o0Var);
            qVarA.close();
            i();
            return this.B != null;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void R(boolean z10) {
        io.sentry.q qVarA = this.f11645y.a();
        if (z10) {
            try {
                this.f11644x.clear();
            } catch (Throwable th2) {
                try {
                    qVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        b bVar = this.B;
        this.B = null;
        if (bVar != null) {
            Context context = this.f11640a;
            u0 logger = this.f11641d.getLogger();
            ConnectivityManager connectivityManagerG = G(context, logger);
            if (connectivityManagerG != null) {
                try {
                    connectivityManagerG.unregisterNetworkCallback(bVar);
                } catch (Throwable th4) {
                    logger.g(b5.WARNING, "unregisterNetworkCallback failed", th4);
                }
            }
        }
        this.D = null;
        this.E = null;
        this.F = 0L;
        qVarA.close();
        this.f11641d.getLogger().m(b5.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void V(NetworkCapabilities networkCapabilities) {
        io.sentry.q qVarA = this.f11645y.a();
        try {
            if (networkCapabilities != null) {
                this.D = networkCapabilities;
            } else {
                if (!kc.f.D(this.f11640a)) {
                    this.f11641d.getLogger().m(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.D = null;
                    this.f11643r.getClass();
                    this.F = SystemClock.uptimeMillis();
                    qVarA.close();
                    return;
                }
                this.f11642g.getClass();
                ConnectivityManager connectivityManagerG = G(this.f11640a, this.f11641d.getLogger());
                if (connectivityManagerG != null) {
                    Network activeNetwork = connectivityManagerG.getActiveNetwork();
                    this.D = activeNetwork != null ? connectivityManagerG.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.D = null;
                }
            }
            this.f11643r.getClass();
            this.F = SystemClock.uptimeMillis();
            this.f11641d.getLogger().m(b5.DEBUG, "Cache updated - Status: " + q() + ", Type: " + y(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f11641d.getLogger().g(b5.WARNING, "Failed to update connection status cache", th2);
                this.D = null;
                this.f11643r.getClass();
                this.F = SystemClock.uptimeMillis();
            } catch (Throwable th3) {
                try {
                    qVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        qVarA.close();
    }

    @Override // io.sentry.p0
    public final void a0(o0 o0Var) {
        io.sentry.q qVarA = this.f11645y.a();
        try {
            this.f11644x.remove(o0Var);
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

    @Override // io.sentry.android.core.a0
    public final void b() {
        if (this.B != null) {
            return;
        }
        L(new a(this, 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        L(new a(this, 0));
    }

    @Override // io.sentry.android.core.a0
    public final void f() {
        if (this.B == null) {
            return;
        }
        L(new a(this, 2));
    }

    public final void i() {
        if (e0.i() && this.B == null) {
            io.sentry.q qVarA = this.f11645y.a();
            try {
                if (this.B != null) {
                    qVarA.close();
                    return;
                }
                b bVar = new b(0, this);
                Context context = this.f11640a;
                u0 logger = this.f11641d.getLogger();
                this.f11642g.getClass();
                ConnectivityManager connectivityManagerG = G(context, logger);
                if (connectivityManagerG != null) {
                    if (kc.f.D(context)) {
                        try {
                            connectivityManagerG.registerDefaultNetworkCallback(bVar);
                            this.B = bVar;
                            this.f11641d.getLogger().m(b5.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th2) {
                            logger.g(b5.WARNING, "registerDefaultNetworkCallback failed", th2);
                        }
                        qVarA.close();
                    }
                    logger.m(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.f11641d.getLogger().m(b5.WARNING, "Failed to register network callback", new Object[0]);
                qVarA.close();
            } catch (Throwable th3) {
                try {
                    qVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // io.sentry.p0
    public final String p() {
        this.f11643r.getClass();
        if (SystemClock.uptimeMillis() - this.F >= 120000) {
            V(null);
        }
        return y();
    }

    public final n0 q() {
        if (this.D != null) {
            NetworkCapabilities networkCapabilities = this.D;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.f11642g.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i10 : L) {
                        if (networkCapabilities.hasTransport(i10)) {
                            return n0.CONNECTED;
                        }
                    }
                }
            }
            return n0.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerG = G(this.f11640a, this.f11641d.getLogger());
        if (connectivityManagerG == null) {
            return n0.UNKNOWN;
        }
        Context context = this.f11640a;
        u0 logger = this.f11641d.getLogger();
        if (!kc.f.D(context)) {
            logger.m(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return n0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerG.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? n0.CONNECTED : n0.DISCONNECTED;
            }
            logger.m(b5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return n0.DISCONNECTED;
        } catch (Throwable th2) {
            logger.g(b5.WARNING, "Could not retrieve Connection Status", th2);
            return n0.UNKNOWN;
        }
    }

    public final String y() {
        NetworkCapabilities networkCapabilities = this.D;
        if (networkCapabilities != null) {
            return w(networkCapabilities);
        }
        Context context = this.f11640a;
        u0 logger = this.f11641d.getLogger();
        f0 f0Var = this.f11642g;
        ConnectivityManager connectivityManagerG = G(context, logger);
        if (connectivityManagerG != null) {
            if (!kc.f.D(context)) {
                logger.m(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                f0Var.getClass();
                Network activeNetwork = connectivityManagerG.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.m(b5.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerG.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.m(b5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th2) {
                logger.g(b5.ERROR, "Failed to retrieve network info", th2);
                return null;
            }
        }
        return null;
    }
}
