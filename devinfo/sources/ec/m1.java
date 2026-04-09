package ec;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.l0 f22896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f22897c;

    public /* synthetic */ m1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, int i4) {
        this.f22895a = i4;
        this.f22896b = l0Var;
        this.f22897c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22895a) {
            case 0:
                j3 j3VarP = this.f22897c.f20283a.p();
                com.google.android.gms.internal.measurement.l0 l0Var = this.f22896b;
                j3VarP.B();
                j3VarP.C();
                j3VarP.P(new b4.o(j3VarP, j3VarP.R(false), l0Var, 10));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f22897c;
                l4 l4Var = appMeasurementDynamiteService.f20283a.f22956i;
                o1.k(l4Var);
                o1 o1Var = appMeasurementDynamiteService.f20283a;
                l4Var.o0(this.f22896b, o1Var.f22971y != null && o1Var.f22971y.booleanValue());
                break;
        }
    }
}
