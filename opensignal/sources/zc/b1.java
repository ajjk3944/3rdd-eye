package zc;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26871a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.m0 f26872d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26873g;

    public /* synthetic */ b1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.m0 m0Var, int i10) {
        this.f26871a = i10;
        this.f26872d = m0Var;
        this.f26873g = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26871a) {
            case 0:
                x2 x2VarJ = this.f26873g.f5392d.j();
                com.google.android.gms.internal.measurement.m0 m0Var = this.f26872d;
                x2VarJ.s1();
                x2VarJ.t1();
                x2VarJ.G1(new bc.e0(x2VarJ, x2VarJ.I1(false), m0Var, 14));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f26873g;
                s3 s3Var = appMeasurementDynamiteService.f5392d.E;
                c1.e(s3Var);
                c1 c1Var = appMeasurementDynamiteService.f5392d;
                s3Var.e2(this.f26872d, c1Var.U != null && c1Var.U.booleanValue());
                break;
        }
    }
}
