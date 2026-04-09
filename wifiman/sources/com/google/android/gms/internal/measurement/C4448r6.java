package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4448r6 implements InterfaceC4456s6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35447a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4453s3 f35448b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4453s3 f35449c;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        b3E.d("measurement.defensively_copy_bundles_validate_default_params", true);
        b3E.d("measurement.set_default_event_parameters_with_backfill.service", true);
        f35447a = b3E.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f35448b = b3E.d("measurement.set_default_event_parameters.fix_deferred_analytics_collection", true);
        f35449c = b3E.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        b3E.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4456s6
    public final boolean zza() {
        return ((Boolean) f35447a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4456s6
    public final boolean zzb() {
        return ((Boolean) f35448b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4456s6
    public final boolean zzc() {
        return ((Boolean) f35449c.e()).booleanValue();
    }
}
