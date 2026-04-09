package cc;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3637g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static e0 f3638h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f3639i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3640a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f3641b;

    /* renamed from: c, reason: collision with root package name */
    public volatile yh.a f3642c;

    /* renamed from: d, reason: collision with root package name */
    public final fc.a f3643d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3644e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3645f;

    public e0(Context context, Looper looper) {
        d0 d0Var = new d0(this);
        this.f3641b = context.getApplicationContext();
        yh.a aVar = new yh.a(looper, d0Var, 6);
        Looper.getMainLooper();
        this.f3642c = aVar;
        this.f3643d = fc.a.b();
        this.f3644e = 5000L;
        this.f3645f = 300000L;
    }

    public static e0 a(Context context) {
        synchronized (f3637g) {
            try {
                if (f3638h == null) {
                    f3638h = new e0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3638h;
    }

    public final ConnectionResult b(b0 b0Var, x xVar, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.f3640a;
        synchronized (map) {
            try {
                c0 c0Var = (c0) map.get(b0Var);
                if (executor == null) {
                    executor = null;
                }
                if (c0Var == null) {
                    c0Var = new c0(this, b0Var);
                    c0Var.f3606a.put(xVar, xVar);
                    connectionResultA = c0Var.a(str, executor);
                    map.put(b0Var, c0Var);
                } else {
                    this.f3642c.removeMessages(0, b0Var);
                    if (c0Var.f3606a.containsKey(xVar)) {
                        String string = b0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    c0Var.f3606a.put(xVar, xVar);
                    int i10 = c0Var.f3607b;
                    if (i10 == 1) {
                        xVar.onServiceConnected(c0Var.f3611f, c0Var.f3609d);
                    } else if (i10 == 2) {
                        connectionResultA = c0Var.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (c0Var.f3608c) {
                    return ConnectionResult.f4805y;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, null, null);
                }
                return connectionResultA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z10) {
        b0 b0Var = new b0(str, z10);
        s.i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f3640a;
        synchronized (map) {
            try {
                c0 c0Var = (c0) map.get(b0Var);
                if (c0Var == null) {
                    String string = b0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!c0Var.f3606a.containsKey(serviceConnection)) {
                    String string2 = b0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                c0Var.f3606a.remove(serviceConnection);
                if (c0Var.f3606a.isEmpty()) {
                    this.f3642c.sendMessageDelayed(this.f3642c.obtainMessage(0, b0Var), this.f3644e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
