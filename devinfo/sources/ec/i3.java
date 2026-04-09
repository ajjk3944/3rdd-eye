package ec;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i3 implements ServiceConnection, pb.b, pb.c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f22796a;

    /* renamed from: b, reason: collision with root package name */
    public volatile p0 f22797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3 f22798c;

    public i3(j3 j3Var) {
        this.f22798c = j3Var;
    }

    @Override // pb.c
    public final void O(nb.b bVar) {
        j3 j3Var = this.f22798c;
        l1 l1Var = ((o1) j3Var.f218b).g;
        o1.m(l1Var);
        l1Var.G();
        s0 s0Var = ((o1) j3Var.f218b).f22954f;
        if (s0Var == null || !s0Var.f23099c) {
            s0Var = null;
        }
        if (s0Var != null) {
            s0Var.f23060o.e(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f22796a = false;
            this.f22797b = null;
        }
        l1 l1Var2 = ((o1) this.f22798c.f218b).g;
        o1.m(l1Var2);
        l1Var2.K(new vd.a(this, false, bVar, 23));
    }

    @Override // pb.b
    public final void S(int i4) {
        o1 o1Var = (o1) this.f22798c.f218b;
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.G();
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.f23059n.d("Service connection suspended");
        l1 l1Var2 = o1Var.g;
        o1.m(l1Var2);
        l1Var2.K(new b5.o(11, this));
    }

    @Override // pb.b
    public final void T() {
        l1 l1Var = ((o1) this.f22798c.f218b).g;
        o1.m(l1Var);
        l1Var.G();
        synchronized (this) {
            try {
                pb.y.h(this.f22797b);
                g0 g0Var = (g0) this.f22797b.t();
                l1 l1Var2 = ((o1) this.f22798c.f218b).g;
                o1.m(l1Var2);
                l1Var2.K(new g3(this, g0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f22797b = null;
                this.f22796a = false;
            }
        }
    }

    public final void a() throws Throwable {
        j3 j3Var = this.f22798c;
        j3Var.B();
        Context context = ((o1) j3Var.f218b).f22949a;
        synchronized (this) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (this.f22796a) {
                    s0 s0Var = ((o1) this.f22798c.f218b).f22954f;
                    o1.m(s0Var);
                    s0Var.f23060o.d("Connection attempt already in progress");
                } else {
                    if (this.f22797b != null && (this.f22797b.c() || this.f22797b.g())) {
                        s0 s0Var2 = ((o1) this.f22798c.f218b).f22954f;
                        o1.m(s0Var2);
                        s0Var2.f23060o.d("Already awaiting connection attempt");
                        return;
                    }
                    this.f22797b = new p0(context, Looper.getMainLooper(), 93, this, this);
                    s0 s0Var3 = ((o1) this.f22798c.f218b).f22954f;
                    o1.m(s0Var3);
                    s0Var3.f23060o.d("Connecting to remote service");
                    this.f22796a = true;
                    pb.y.h(this.f22797b);
                    this.f22797b.n();
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l1 l1Var = ((o1) this.f22798c.f218b).g;
        o1.m(l1Var);
        l1Var.G();
        synchronized (this) {
            if (iBinder == null) {
                this.f22796a = false;
                s0 s0Var = ((o1) this.f22798c.f218b).f22954f;
                o1.m(s0Var);
                s0Var.g.d("Service connected with null binder");
                return;
            }
            g0 e0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    e0Var = iInterfaceQueryLocalInterface instanceof g0 ? (g0) iInterfaceQueryLocalInterface : new e0(iBinder);
                    s0 s0Var2 = ((o1) this.f22798c.f218b).f22954f;
                    o1.m(s0Var2);
                    s0Var2.f23060o.d("Bound to IMeasurementService interface");
                } else {
                    s0 s0Var3 = ((o1) this.f22798c.f218b).f22954f;
                    o1.m(s0Var3);
                    s0Var3.g.e(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                s0 s0Var4 = ((o1) this.f22798c.f218b).f22954f;
                o1.m(s0Var4);
                s0Var4.g.d("Service connect failed to get IMeasurementService");
            }
            if (e0Var == null) {
                this.f22796a = false;
                try {
                    sb.a aVarA = sb.a.a();
                    j3 j3Var = this.f22798c;
                    aVarA.b(((o1) j3Var.f218b).f22949a, j3Var.f22818d);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                l1 l1Var2 = ((o1) this.f22798c.f218b).g;
                o1.m(l1Var2);
                l1Var2.K(new g3(this, e0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o1 o1Var = (o1) this.f22798c.f218b;
        l1 l1Var = o1Var.g;
        o1.m(l1Var);
        l1Var.G();
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.f23059n.d("Service disconnected");
        l1 l1Var2 = o1Var.g;
        o1.m(l1Var2);
        l1Var2.K(new vd.a(this, false, componentName, 22));
    }
}
