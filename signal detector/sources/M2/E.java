package M2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class E implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2715a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f2716b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2717c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f2718d;

    /* renamed from: e, reason: collision with root package name */
    public final D f2719e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f2720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G f2721g;

    public E(G g2, D d6) {
        this.f2721g = g2;
        this.f2719e = d6;
    }

    public final J2.b a(String str, Executor executor) throws Throwable {
        G g2;
        P2.a aVar;
        Context context;
        D d6;
        try {
            Intent intentA = w.a(this.f2721g.f2726b, this.f2719e);
            this.f2716b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(Q2.d.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                g2 = this.f2721g;
                aVar = g2.f2728d;
                context = g2.f2726b;
                d6 = this.f2719e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                boolean zC = aVar.c(context, str, intentA, this, 4225, executor);
                this.f2717c = zC;
                if (zC) {
                    g2.f2727c.sendMessageDelayed(g2.f2727c.obtainMessage(1, d6), g2.f2730f);
                    J2.b bVar = J2.b.f2043f;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                this.f2716b = 2;
                try {
                    g2.f2728d.b(g2.f2726b, this);
                } catch (IllegalArgumentException unused) {
                }
                J2.b bVar2 = new J2.b(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th3;
            }
        } catch (v e6) {
            return e6.f2820a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        G g2 = this.f2721g;
        synchronized (g2.f2725a) {
            try {
                g2.f2727c.removeMessages(1, this.f2719e);
                this.f2718d = iBinder;
                this.f2720f = componentName;
                Iterator it = this.f2715a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2716b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        G g2 = this.f2721g;
        synchronized (g2.f2725a) {
            try {
                g2.f2727c.removeMessages(1, this.f2719e);
                this.f2718d = null;
                this.f2720f = componentName;
                Iterator it = this.f2715a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2716b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
