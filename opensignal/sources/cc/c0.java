package cc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3606a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f3607b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3608c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f3609d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f3610e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f3611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f3612g;

    public c0(e0 e0Var, b0 b0Var) {
        this.f3612g = e0Var;
        this.f3610e = b0Var;
    }

    public final ConnectionResult a(String str, Executor executor) throws Throwable {
        e0 e0Var;
        fc.a aVar;
        Context context;
        b0 b0Var;
        try {
            Intent intentA = u.a(this.f3612g.f3641b, this.f3610e);
            this.f3607b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(gc.e.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                e0Var = this.f3612g;
                aVar = e0Var.f3643d;
                context = e0Var.f3641b;
                b0Var = this.f3610e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                this.f3608c = zD;
                if (zD) {
                    e0Var.f3642c.sendMessageDelayed(e0Var.f3642c.obtainMessage(1, b0Var), e0Var.f3645f);
                    ConnectionResult connectionResult = ConnectionResult.f4805y;
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                }
                this.f3607b = 2;
                try {
                    e0Var.f3643d.c(e0Var.f3641b, this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return connectionResult2;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                StrictMode.setVmPolicy(vmPolicy);
                throw th4;
            }
        } catch (t e4) {
            return e4.f3673a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e0 e0Var = this.f3612g;
        synchronized (e0Var.f3640a) {
            try {
                e0Var.f3642c.removeMessages(1, this.f3610e);
                this.f3609d = iBinder;
                this.f3611f = componentName;
                Iterator it = this.f3606a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f3607b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e0 e0Var = this.f3612g;
        synchronized (e0Var.f3640a) {
            try {
                e0Var.f3642c.removeMessages(1, this.f3610e);
                this.f3609d = null;
                this.f3611f = componentName;
                Iterator it = this.f3606a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f3607b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
