package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4441q6 implements InterfaceC4409m6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35440a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.client.3p_consent_state_v1", true);
        b3E.d("measurement.service.consent_state_v1_W36", true);
        f35440a = b3E.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4409m6
    public final long zza() {
        return ((Long) f35440a.e()).longValue();
    }
}
