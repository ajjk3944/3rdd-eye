package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4340e6 implements InterfaceC4349f6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35216a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35216a = b3E.d("measurement.service.ad_impression.convert_value_to_double", true);
        b3E.d("measurement.client.ad_impression", true);
        b3E.d("measurement.service.separate_public_internal_event_blacklisting", true);
        b3E.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4349f6
    public final boolean zza() {
        return ((Boolean) f35216a.e()).booleanValue();
    }
}
