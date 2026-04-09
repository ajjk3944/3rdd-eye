package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class J6 implements K6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35049a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.b("measurement.id.upload_controller_wait_initialization", 0L);
        f35049a = b3E.d("measurement.upload_controller.wait_initialization", false);
    }

    @Override // com.google.android.gms.internal.measurement.K6
    public final boolean zza() {
        return ((Boolean) f35049a.e()).booleanValue();
    }
}
