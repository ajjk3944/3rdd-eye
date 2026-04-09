package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class l7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final m4 f5107a;

    /* renamed from: b, reason: collision with root package name */
    public static final m4 f5108b;

    static {
        ab.g gVar = new ab.g(l4.a(), true, true);
        gVar.z("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        gVar.z("measurement.set_default_event_parameters_with_backfill.service", true);
        gVar.y(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        f5107a = gVar.z("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f5108b = gVar.z("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        gVar.z("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
