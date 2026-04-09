package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class x7 implements w7 {

    /* renamed from: a, reason: collision with root package name */
    public static final m4 f5262a;

    /* renamed from: b, reason: collision with root package name */
    public static final m4 f5263b;

    /* renamed from: c, reason: collision with root package name */
    public static final m4 f5264c;

    static {
        ab.g gVar = new ab.g(l4.a(), true, true);
        gVar.z("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f5262a = gVar.z("measurement.audience.refresh_event_count_filters_timestamp", false);
        f5263b = gVar.z("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f5264c = gVar.z("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
