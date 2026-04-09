package zc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f27138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f27139b;

    public s0(t0 t0Var, String str) {
        Objects.requireNonNull(t0Var);
        this.f27139b = t0Var;
        this.f27138a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t0 t0Var = this.f27139b;
        if (iBinder == null) {
            j0 j0Var = t0Var.f27154a.f26889y;
            c1.g(j0Var);
            j0Var.F.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = com.google.android.gms.internal.measurement.b0.f4915d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.c0 a0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.c0 ? (com.google.android.gms.internal.measurement.c0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.a0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            c1 c1Var = t0Var.f27154a;
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.K.b("Install Referrer Service connected");
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            a1Var.B1(new re.a(this, a0Var, this));
        } catch (RuntimeException e4) {
            j0 j0Var3 = t0Var.f27154a.f26889y;
            c1.g(j0Var3);
            j0Var3.F.c(e4, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j0 j0Var = this.f27139b.f27154a.f26889y;
        c1.g(j0Var);
        j0Var.K.b("Install Referrer Service disconnected");
    }
}
