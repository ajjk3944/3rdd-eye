package s3;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import r3.C7564b;

/* loaded from: classes.dex */
final class i0 implements ServiceConnection, m0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f61301a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f61302b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f61303c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f61304d;

    /* renamed from: e, reason: collision with root package name */
    private final h0 f61305e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f61306f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ l0 f61307g;

    public i0(l0 l0Var, h0 h0Var) {
        this.f61307g = l0Var;
        this.f61305e = h0Var;
    }

    static /* bridge */ /* synthetic */ C7564b d(i0 i0Var, String str, Executor executor) throws RemoteException {
        C7564b c7564b;
        try {
            Intent intentB = i0Var.f61305e.b(i0Var.f61307g.f61310h);
            i0Var.f61302b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.u.a();
            try {
                l0 l0Var = i0Var.f61307g;
                boolean zD = l0Var.f61313k.d(l0Var.f61310h, str, intentB, i0Var, 4225, executor);
                i0Var.f61303c = zD;
                if (zD) {
                    i0Var.f61307g.f61311i.sendMessageDelayed(i0Var.f61307g.f61311i.obtainMessage(1, i0Var.f61305e), i0Var.f61307g.f61315m);
                    c7564b = C7564b.f60070e;
                } else {
                    i0Var.f61302b = 2;
                    try {
                        l0 l0Var2 = i0Var.f61307g;
                        l0Var2.f61313k.c(l0Var2.f61310h, i0Var);
                    } catch (IllegalArgumentException unused) {
                    }
                    c7564b = new C7564b(16);
                }
                return c7564b;
            } finally {
                StrictMode.setVmPolicy(vmPolicyA);
            }
        } catch (zzaj e10) {
            return e10.f34873a;
        }
    }

    public final int a() {
        return this.f61302b;
    }

    public final ComponentName b() {
        return this.f61306f;
    }

    public final IBinder c() {
        return this.f61304d;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f61301a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f61301a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f61307g.f61311i.removeMessages(1, this.f61305e);
        l0 l0Var = this.f61307g;
        l0Var.f61313k.c(l0Var.f61310h, this);
        this.f61303c = false;
        this.f61302b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f61301a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f61301a.isEmpty();
    }

    public final boolean j() {
        return this.f61303c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f61307g.f61309g) {
            try {
                this.f61307g.f61311i.removeMessages(1, this.f61305e);
                this.f61304d = iBinder;
                this.f61306f = componentName;
                Iterator it = this.f61301a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f61302b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f61307g.f61309g) {
            try {
                this.f61307g.f61311i.removeMessages(1, this.f61305e);
                this.f61304d = null;
                this.f61306f = componentName;
                Iterator it = this.f61301a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f61302b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
