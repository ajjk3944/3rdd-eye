package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4377i7 implements j7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35272a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        f35272a = b3E.d("measurement.session_stitching_token_enabled", false);
        b3E.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.j7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.j7
    public final boolean zzb() {
        return ((Boolean) f35272a.e()).booleanValue();
    }
}
