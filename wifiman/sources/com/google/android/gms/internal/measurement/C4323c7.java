package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4323c7 implements InterfaceC4332d7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35189a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35189a = b3E.d("measurement.experiment.enable_phenotype_experiment_reporting", true);
        b3E.d("measurement.experiment.enable_experiment_reporting", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4332d7
    public final boolean zza() {
        return ((Boolean) f35189a.e()).booleanValue();
    }
}
