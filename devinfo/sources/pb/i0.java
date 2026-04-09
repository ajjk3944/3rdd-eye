package pb;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31617a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f31618b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31619c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f31620d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f31621e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f31622f;
    public final /* synthetic */ k0 g;

    public i0(k0 k0Var, h0 h0Var) {
        this.g = k0Var;
        this.f31621e = h0Var;
    }

    public final nb.b a(String str, Executor executor) throws Throwable {
        k0 k0Var;
        sb.a aVar;
        Context context;
        h0 h0Var;
        try {
            Intent intentA = a0.a(this.g.f31638b, this.f31621e);
            this.f31618b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(tb.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0Var = this.g;
                aVar = k0Var.f31640d;
                context = k0Var.f31638b;
                h0Var = this.f31621e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean zC = aVar.c(context, str, intentA, this, 4225, executor);
                this.f31619c = zC;
                if (zC) {
                    k0Var.f31639c.sendMessageDelayed(k0Var.f31639c.obtainMessage(1, h0Var), k0Var.f31642f);
                    nb.b bVar = nb.b.f29883f;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                this.f31618b = 2;
                try {
                    k0Var.f31640d.b(k0Var.f31638b, this);
                } catch (IllegalArgumentException unused) {
                }
                nb.b bVar2 = new nb.b(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th4;
            }
        } catch (z e2) {
            return e2.f31679a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        k0 k0Var = this.g;
        synchronized (k0Var.f31637a) {
            try {
                k0Var.f31639c.removeMessages(1, this.f31621e);
                this.f31620d = iBinder;
                this.f31622f = componentName;
                Iterator it = this.f31617a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f31618b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k0 k0Var = this.g;
        synchronized (k0Var.f31637a) {
            try {
                k0Var.f31639c.removeMessages(1, this.f31621e);
                this.f31620d = null;
                this.f31622f = componentName;
                Iterator it = this.f31617a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f31618b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
