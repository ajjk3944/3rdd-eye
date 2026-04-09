package s3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import r3.C7564b;

/* loaded from: classes.dex */
final class l0 extends AbstractC7893h {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f61309g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Context f61310h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Handler f61311i;

    /* renamed from: j, reason: collision with root package name */
    private final j0 f61312j;

    /* renamed from: k, reason: collision with root package name */
    private final v3.b f61313k;

    /* renamed from: l, reason: collision with root package name */
    private final long f61314l;

    /* renamed from: m, reason: collision with root package name */
    private final long f61315m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Executor f61316n;

    l0(Context context, Looper looper, Executor executor) {
        j0 j0Var = new j0(this, null);
        this.f61312j = j0Var;
        this.f61310h = context.getApplicationContext();
        this.f61311i = new B3.e(looper, j0Var);
        this.f61313k = v3.b.b();
        this.f61314l = 5000L;
        this.f61315m = 300000L;
        this.f61316n = executor;
    }

    @Override // s3.AbstractC7893h
    protected final C7564b c(h0 h0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        C7564b c7564bD;
        AbstractC7901p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f61309g) {
            try {
                i0 i0Var = (i0) this.f61309g.get(h0Var);
                if (executor == null) {
                    executor = this.f61316n;
                }
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.e(serviceConnection, serviceConnection, str);
                    c7564bD = i0.d(i0Var, str, executor);
                    this.f61309g.put(h0Var, i0Var);
                } else {
                    this.f61311i.removeMessages(0, h0Var);
                    if (i0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + h0Var.toString());
                    }
                    i0Var.e(serviceConnection, serviceConnection, str);
                    int iA = i0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(i0Var.b(), i0Var.c());
                    } else if (iA == 2) {
                        c7564bD = i0.d(i0Var, str, executor);
                    }
                    c7564bD = null;
                }
                if (i0Var.j()) {
                    return C7564b.f60070e;
                }
                if (c7564bD == null) {
                    c7564bD = new C7564b(-1);
                }
                return c7564bD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s3.AbstractC7893h
    protected final void d(h0 h0Var, ServiceConnection serviceConnection, String str) {
        AbstractC7901p.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f61309g) {
            try {
                i0 i0Var = (i0) this.f61309g.get(h0Var);
                if (i0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + h0Var.toString());
                }
                if (!i0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + h0Var.toString());
                }
                i0Var.f(serviceConnection, str);
                if (i0Var.i()) {
                    this.f61311i.sendMessageDelayed(this.f61311i.obtainMessage(0, h0Var), this.f61314l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
