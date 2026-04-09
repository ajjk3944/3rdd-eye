package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzfjw implements zzgzl {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ int zzb;

    public zzfjw(zzfjx zzfjxVar, int i10) {
        this.zzb = i10;
        Objects.requireNonNull(zzfjxVar);
        this.zza = zzfjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
