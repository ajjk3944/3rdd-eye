package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class u7 implements r7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35497a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35497a = b3E.d("measurement.tcf.consent_fix", false);
        b3E.d("measurement.tcf.client", true);
        b3E.d("measurement.tcf.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean zza() {
        return ((Boolean) f35497a.e()).booleanValue();
    }
}
