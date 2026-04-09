package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nf4 {
    public static final Object g = new Object();
    public static nf4 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile wc1 c;
    public final sq0 d;
    public final long e;
    public final long f;

    public nf4(Context context, Looper looper) {
        zw0 zw0Var = new zw0(2, this);
        this.b = context.getApplicationContext();
        wc1 wc1Var = new wc1(looper, zw0Var, 3);
        Looper.getMainLooper();
        this.c = wc1Var;
        this.d = sq0.n();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static nf4 a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new nf4(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z) {
        kd4 kd4Var = new kd4(str, z);
        ou1.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                ud4 ud4Var = (ud4) this.a.get(kd4Var);
                if (ud4Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(kd4Var.toString()));
                }
                if (!ud4Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(kd4Var.toString()));
                }
                ud4Var.a.remove(serviceConnection);
                if (ud4Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, kd4Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(kd4 kd4Var, qx2 qx2Var, String str, Executor executor) {
        boolean z;
        synchronized (this.a) {
            try {
                ud4 ud4Var = (ud4) this.a.get(kd4Var);
                if (executor == null) {
                    executor = null;
                }
                if (ud4Var == null) {
                    ud4Var = new ud4(this, kd4Var);
                    ud4Var.a.put(qx2Var, qx2Var);
                    ud4Var.a(str, executor);
                    this.a.put(kd4Var, ud4Var);
                } else {
                    this.c.removeMessages(0, kd4Var);
                    if (ud4Var.a.containsKey(qx2Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(kd4Var.toString()));
                    }
                    ud4Var.a.put(qx2Var, qx2Var);
                    int i2 = ud4Var.b;
                    if (i2 == 1) {
                        qx2Var.onServiceConnected(ud4Var.f, ud4Var.d);
                    } else if (i2 == 2) {
                        ud4Var.a(str, executor);
                    }
                }
                z = ud4Var.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
