package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class C6 implements InterfaceC4512z6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f34962a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4453s3 f34963b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4453s3 f34964c;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f34962a = b3E.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f34963b = b3E.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f34964c = b3E.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4512z6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4512z6
    public final boolean zzb() {
        return ((Boolean) f34962a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4512z6
    public final boolean zzc() {
        return ((Boolean) f34963b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4512z6
    public final boolean zzd() {
        return ((Boolean) f34964c.e()).booleanValue();
    }
}
