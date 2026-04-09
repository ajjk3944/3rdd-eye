package zc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class w2 implements ServiceConnection, cc.b, cc.c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f27258a;

    /* renamed from: b, reason: collision with root package name */
    public volatile g0 f27259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f27260c;

    public w2(x2 x2Var) {
        this.f27260c = x2Var;
    }

    @Override // cc.b
    public final void d(int i10) {
        c1 c1Var = (c1) this.f27260c.f1504d;
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.x1();
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.J.b("Service connection suspended");
        a1 a1Var2 = c1Var.B;
        c1.g(a1Var2);
        a1Var2.B1(new pb.l0(13, this));
    }

    @Override // cc.b
    public final void e() {
        a1 a1Var = ((c1) this.f27260c.f1504d).B;
        c1.g(a1Var);
        a1Var.x1();
        synchronized (this) {
            try {
                cc.s.h(this.f27259b);
                x xVar = (x) this.f27259b.m();
                a1 a1Var2 = ((c1) this.f27260c.f1504d).B;
                c1.g(a1Var2);
                a1Var2.B1(new u2(this, xVar, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f27259b = null;
                this.f27258a = false;
            }
        }
    }

    @Override // cc.c
    public final void f(ConnectionResult connectionResult) {
        x2 x2Var = this.f27260c;
        a1 a1Var = ((c1) x2Var.f1504d).B;
        c1.g(a1Var);
        a1Var.x1();
        j0 j0Var = ((c1) x2Var.f1504d).f26889y;
        if (j0Var == null || !j0Var.f26980g) {
            j0Var = null;
        }
        if (j0Var != null) {
            j0Var.K.c(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f27258a = false;
            this.f27259b = null;
        }
        a1 a1Var2 = ((c1) this.f27260c.f1504d).B;
        c1.g(a1Var2);
        a1Var2.B1(new z1(this, 8, connectionResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a1 a1Var = ((c1) this.f27260c.f1504d).B;
        c1.g(a1Var);
        a1Var.x1();
        synchronized (this) {
            if (iBinder == null) {
                this.f27258a = false;
                j0 j0Var = ((c1) this.f27260c.f1504d).f26889y;
                c1.g(j0Var);
                j0Var.B.b("Service connected with null binder");
                return;
            }
            x vVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    vVar = iInterfaceQueryLocalInterface instanceof x ? (x) iInterfaceQueryLocalInterface : new v(iBinder);
                    j0 j0Var2 = ((c1) this.f27260c.f1504d).f26889y;
                    c1.g(j0Var2);
                    j0Var2.K.b("Bound to IMeasurementService interface");
                } else {
                    j0 j0Var3 = ((c1) this.f27260c.f1504d).f26889y;
                    c1.g(j0Var3);
                    j0Var3.B.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                j0 j0Var4 = ((c1) this.f27260c.f1504d).f26889y;
                c1.g(j0Var4);
                j0Var4.B.b("Service connect failed to get IMeasurementService");
            }
            if (vVar == null) {
                this.f27258a = false;
                try {
                    fc.a aVarB = fc.a.b();
                    x2 x2Var = this.f27260c;
                    aVarB.c(((c1) x2Var.f1504d).f26884a, x2Var.f27266r);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                a1 a1Var2 = ((c1) this.f27260c.f1504d).B;
                c1.g(a1Var2);
                a1Var2.B1(new u2(this, vVar, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c1 c1Var = (c1) this.f27260c.f1504d;
        a1 a1Var = c1Var.B;
        c1.g(a1Var);
        a1Var.x1();
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.J.b("Service disconnected");
        a1 a1Var2 = c1Var.B;
        c1.g(a1Var2);
        a1Var2.B1(new z1(this, 7, componentName));
    }
}
