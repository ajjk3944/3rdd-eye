package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class V6 implements S6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35133a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4453s3 f35134b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4453s3 f35135c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4453s3 f35136d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4453s3 f35137e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4453s3 f35138f;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35133a = b3E.d("measurement.test.boolean_flag", false);
        f35134b = b3E.b("measurement.test.cached_long_flag", -1L);
        f35135c = b3E.a("measurement.test.double_flag", -3.0d);
        f35136d = b3E.b("measurement.test.int_flag", -2L);
        f35137e = b3E.b("measurement.test.long_flag", -1L);
        f35138f = b3E.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final double zza() {
        return ((Double) f35135c.e()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final long zzb() {
        return ((Long) f35134b.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final long zzc() {
        return ((Long) f35136d.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final long zzd() {
        return ((Long) f35137e.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final String zze() {
        return (String) f35138f.e();
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final boolean zzf() {
        return ((Boolean) f35133a.e()).booleanValue();
    }
}
