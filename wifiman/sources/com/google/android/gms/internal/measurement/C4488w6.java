package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4488w6 implements InterfaceC4464t6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35520a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4453s3 f35521b;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35520a = b3E.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f35521b = b3E.d("measurement.set_default_event_parameters_propagate_clear.service", false);
        b3E.b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4464t6
    public final boolean zza() {
        return ((Boolean) f35520a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4464t6
    public final boolean zzb() {
        return ((Boolean) f35521b.e()).booleanValue();
    }
}
