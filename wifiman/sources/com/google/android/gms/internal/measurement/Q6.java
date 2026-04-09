package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class Q6 implements R6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35099a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f35099a = b3E.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        b3E.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.R6
    public final boolean zza() {
        return ((Boolean) f35099a.e()).booleanValue();
    }
}
