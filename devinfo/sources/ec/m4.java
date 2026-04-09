package ec;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m4 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.q0 f22899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f22900b;

    public m4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.q0 q0Var) {
        this.f22900b = appMeasurementDynamiteService;
        this.f22899a = q0Var;
    }

    @Override // ec.c2
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f22899a.N0(j, bundle, str, str2);
        } catch (RemoteException e2) {
            o1 o1Var = this.f22900b.f20283a;
            if (o1Var != null) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.j.e(e2, "Event listener threw exception");
            }
        }
    }
}
