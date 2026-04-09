package pb;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 {
    public static final Object g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static k0 f31635h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f31636i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31637a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f31638b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ac.k f31639c;

    /* renamed from: d, reason: collision with root package name */
    public final sb.a f31640d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31641e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31642f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.f31638b = context.getApplicationContext();
        ac.k kVar = new ac.k(looper, j0Var, 0);
        Looper.getMainLooper();
        this.f31639c = kVar;
        this.f31640d = sb.a.a();
        this.f31641e = 5000L;
        this.f31642f = 300000L;
    }

    public static k0 a(Context context) {
        synchronized (g) {
            try {
                if (f31635h == null) {
                    f31635h = new k0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f31635h;
    }

    public static HandlerThread b() {
        synchronized (g) {
            try {
                HandlerThread handlerThread = f31636i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f31636i = handlerThread2;
                handlerThread2.start();
                return f31636i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final nb.b c(h0 h0Var, d0 d0Var, String str, Executor executor) {
        nb.b bVarA;
        HashMap map = this.f31637a;
        synchronized (map) {
            try {
                i0 i0Var = (i0) map.get(h0Var);
                if (executor == null) {
                    executor = null;
                }
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f31617a.put(d0Var, d0Var);
                    bVarA = i0Var.a(str, executor);
                    map.put(h0Var, i0Var);
                } else {
                    this.f31639c.removeMessages(0, h0Var);
                    if (i0Var.f31617a.containsKey(d0Var)) {
                        String string = h0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    i0Var.f31617a.put(d0Var, d0Var);
                    int i4 = i0Var.f31618b;
                    if (i4 == 1) {
                        d0Var.onServiceConnected(i0Var.f31622f, i0Var.f31620d);
                    } else if (i4 == 2) {
                        bVarA = i0Var.a(str, executor);
                    }
                    bVarA = null;
                }
                if (i0Var.f31619c) {
                    return nb.b.f29883f;
                }
                if (bVarA == null) {
                    bVarA = new nb.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(String str, ServiceConnection serviceConnection, boolean z3) {
        h0 h0Var = new h0(str, z3);
        y.i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f31637a;
        synchronized (map) {
            try {
                i0 i0Var = (i0) map.get(h0Var);
                if (i0Var == null) {
                    String string = h0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!i0Var.f31617a.containsKey(serviceConnection)) {
                    String string2 = h0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                i0Var.f31617a.remove(serviceConnection);
                if (i0Var.f31617a.isEmpty()) {
                    this.f31639c.sendMessageDelayed(this.f31639c.obtainMessage(0, h0Var), this.f31641e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
