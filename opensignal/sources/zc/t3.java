package zc;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class t3 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.r0 f27159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f27160b;

    public t3(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.r0 r0Var) {
        this.f27160b = appMeasurementDynamiteService;
        this.f27159a = r0Var;
    }

    @Override // zc.q1
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f27159a.l(j, bundle, str, str2);
        } catch (RemoteException e4) {
            c1 c1Var = this.f27160b.f5392d;
            if (c1Var != null) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.F.c(e4, "Event listener threw exception");
            }
        }
    }
}
