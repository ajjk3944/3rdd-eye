package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class I6 implements F6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35043a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.b("measurement.id.prune_ees_config", 0L);
        f35043a = b3E.d("measurement.fix_high_memory.prune_ees_config", false);
    }

    @Override // com.google.android.gms.internal.measurement.F6
    public final boolean zza() {
        return ((Boolean) f35043a.e()).booleanValue();
    }
}
