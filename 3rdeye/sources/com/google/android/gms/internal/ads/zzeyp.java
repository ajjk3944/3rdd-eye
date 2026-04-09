package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeyp implements zzfew {
    public final zzezj zza;
    public final zzezl zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final zzfel zzg;

    public zzeyp(zzezj zzezjVar, zzezl zzezlVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, zzfel zzfelVar) {
        this.zza = zzezjVar;
        this.zzb = zzezlVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfew
    public final zzfel zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfew
    public final Executor zzb() {
        return this.zze;
    }
}
