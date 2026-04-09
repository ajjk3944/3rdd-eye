package M2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2723g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static G f2724h;
    public static HandlerThread i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2725a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f2726b;

    /* renamed from: c, reason: collision with root package name */
    public volatile W2.e f2727c;

    /* renamed from: d, reason: collision with root package name */
    public final P2.a f2728d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2729e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2730f;

    public G(Context context, Looper looper) {
        F f2 = new F(this);
        this.f2726b = context.getApplicationContext();
        W2.e eVar = new W2.e(looper, f2, 1);
        Looper.getMainLooper();
        this.f2727c = eVar;
        this.f2728d = P2.a.a();
        this.f2729e = 5000L;
        this.f2730f = 300000L;
    }

    public static G a(Context context) {
        synchronized (f2723g) {
            try {
                if (f2724h == null) {
                    f2724h = new G(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2724h;
    }

    public static HandlerThread b() {
        synchronized (f2723g) {
            try {
                HandlerThread handlerThread = i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                i = handlerThread2;
                handlerThread2.start();
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final J2.b c(D d6, z zVar, String str, Executor executor) {
        J2.b bVarA;
        HashMap map = this.f2725a;
        synchronized (map) {
            try {
                E e6 = (E) map.get(d6);
                if (executor == null) {
                    executor = null;
                }
                if (e6 == null) {
                    e6 = new E(this, d6);
                    e6.f2715a.put(zVar, zVar);
                    bVarA = e6.a(str, executor);
                    map.put(d6, e6);
                } else {
                    this.f2727c.removeMessages(0, d6);
                    if (e6.f2715a.containsKey(zVar)) {
                        String string = d6.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    e6.f2715a.put(zVar, zVar);
                    int i3 = e6.f2716b;
                    if (i3 == 1) {
                        zVar.onServiceConnected(e6.f2720f, e6.f2718d);
                    } else if (i3 == 2) {
                        bVarA = e6.a(str, executor);
                    }
                    bVarA = null;
                }
                if (e6.f2717c) {
                    return J2.b.f2043f;
                }
                if (bVarA == null) {
                    bVarA = new J2.b(-1, null, null);
                }
                return bVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, ServiceConnection serviceConnection, boolean z6) {
        D d6 = new D(str, z6);
        u.f(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f2725a;
        synchronized (map) {
            try {
                E e6 = (E) map.get(d6);
                if (e6 == null) {
                    String string = d6.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!e6.f2715a.containsKey(serviceConnection)) {
                    String string2 = d6.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                e6.f2715a.remove(serviceConnection);
                if (e6.f2715a.isEmpty()) {
                    this.f2727c.sendMessageDelayed(this.f2727c.obtainMessage(0, d6), this.f2729e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
