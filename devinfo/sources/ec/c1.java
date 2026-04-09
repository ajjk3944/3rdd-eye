package ec;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f22606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f22607b;

    public c1(d1 d1Var, String str) {
        Objects.requireNonNull(d1Var);
        this.f22607b = d1Var;
        this.f22606a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d1 d1Var = this.f22607b;
        if (iBinder == null) {
            s0 s0Var = d1Var.f22679b.f22954f;
            o1.m(s0Var);
            s0Var.j.d("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i4 = com.google.android.gms.internal.measurement.a0.f19604a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.b0 zVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.b0 ? (com.google.android.gms.internal.measurement.b0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.z(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            o1 o1Var = d1Var.f22679b;
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.f23060o.d("Install Referrer Service connected");
            l1 l1Var = o1Var.g;
            o1.m(l1Var);
            l1Var.K(new vd.a(this, zVar, this));
        } catch (RuntimeException e2) {
            s0 s0Var3 = d1Var.f22679b.f22954f;
            o1.m(s0Var3);
            s0Var3.j.e(e2, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s0 s0Var = this.f22607b.f22679b.f22954f;
        o1.m(s0Var);
        s0Var.f23060o.d("Install Referrer Service disconnected");
    }
}
