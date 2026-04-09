package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k7 implements j7 {

    /* renamed from: a, reason: collision with root package name */
    public static final n4 f19808a;

    /* renamed from: b, reason: collision with root package name */
    public static final n4 f19809b;

    static {
        a4.d dVar = new a4.d(m4.a(), true, true);
        dVar.A("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        dVar.A("measurement.set_default_event_parameters_with_backfill.service", true);
        dVar.x(0L, "measurement.id.set_default_event_parameters.fix_service_request_ordering");
        f19808a = dVar.A("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f19809b = dVar.A("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        dVar.A("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
