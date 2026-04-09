package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class P6 implements L6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35094a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.gmscore_feature_tracking", true);
        f35094a = b3E.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.L6
    public final boolean zza() {
        return ((Boolean) f35094a.e()).booleanValue();
    }
}
