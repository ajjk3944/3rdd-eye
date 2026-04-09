package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class o7 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35415a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4453s3 f35416b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4453s3 f35417c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4453s3 f35418d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4453s3 f35419e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4453s3 f35420f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC4453s3 f35421g;

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC4453s3 f35422h;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35415a = b3E.d("measurement.sgtm.client.scion_upload_action", true);
        f35416b = b3E.d("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        f35417c = b3E.d("measurement.sgtm.google_signal.enable", false);
        f35418d = b3E.d("measurement.sgtm.no_proxy.client", true);
        f35419e = b3E.d("measurement.sgtm.no_proxy.service", false);
        b3E.d("measurement.sgtm.preview_mode_enabled", true);
        b3E.d("measurement.sgtm.rollout_percentage_fix", true);
        b3E.d("measurement.sgtm.service", true);
        f35420f = b3E.d("measurement.sgtm.service.batching_on_backgrounded", false);
        f35421g = b3E.d("measurement.sgtm.upload_queue", false);
        f35422h = b3E.d("measurement.sgtm.upload_on_uninstall", true);
        b3E.b("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zza() {
        return ((Boolean) f35415a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zzb() {
        return ((Boolean) f35416b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zzc() {
        return ((Boolean) f35417c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zzd() {
        return ((Boolean) f35418d.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zze() {
        return ((Boolean) f35419e.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zzf() {
        return ((Boolean) f35420f.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zzg() {
        return ((Boolean) f35421g.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q7
    public final boolean zzh() {
        return ((Boolean) f35422h.e()).booleanValue();
    }
}
