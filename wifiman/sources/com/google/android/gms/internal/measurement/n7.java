package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class n7 implements k7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35406a;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        b3E.d("measurement.client.sessions.background_sessions_enabled", true);
        f35406a = b3E.d("measurement.client.sessions.enable_fix_background_engagement", false);
        b3E.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        b3E.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        b3E.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        b3E.d("measurement.client.sessions.session_id_enabled", true);
        b3E.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.k7
    public final boolean zza() {
        return ((Boolean) f35406a.e()).booleanValue();
    }
}
