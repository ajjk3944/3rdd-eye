package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class W6 implements X6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4453s3 f35142a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC4453s3 f35143b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC4453s3 f35144c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4453s3 f35145d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC4453s3 f35146e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC4453s3 f35147f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC4453s3 f35148g;

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC4453s3 f35149h;

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC4453s3 f35150i;

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC4453s3 f35151j;

    static {
        B3 b3E = new B3(AbstractC4461t3.a("com.google.android.gms.measurement")).f().e();
        f35142a = b3E.d("measurement.rb.attribution.ad_campaign_info", true);
        b3E.d("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        b3E.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f35143b = b3E.d("measurement.rb.attribution.client2", true);
        b3E.d("measurement.rb.attribution.dma_fix", true);
        f35144c = b3E.d("measurement.rb.attribution.followup1.service", false);
        f35145d = b3E.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f35146e = b3E.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        b3E.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f35147f = b3E.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f35148g = b3E.d("measurement.rb.attribution.retry_disposition", false);
        f35149h = b3E.d("measurement.rb.attribution.service", true);
        f35150i = b3E.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f35151j = b3E.d("measurement.rb.attribution.uuid_generation", true);
        b3E.b("measurement.id.rb.attribution.retry_disposition", 0L);
        b3E.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzb() {
        return ((Boolean) f35142a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzc() {
        return ((Boolean) f35143b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzd() {
        return ((Boolean) f35144c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zze() {
        return ((Boolean) f35145d.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzf() {
        return ((Boolean) f35146e.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzg() {
        return ((Boolean) f35147f.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzh() {
        return ((Boolean) f35148g.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzi() {
        return ((Boolean) f35149h.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzj() {
        return ((Boolean) f35150i.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final boolean zzk() {
        return ((Boolean) f35151j.e()).booleanValue();
    }
}
