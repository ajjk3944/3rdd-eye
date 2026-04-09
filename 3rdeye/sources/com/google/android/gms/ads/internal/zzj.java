package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfpa;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzj implements zzfpa {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final void zza(int i, long j4) {
        this.zza.zzj.zzd(i, System.currentTimeMillis() - j4);
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final void zzb(int i, long j4, String str) {
        this.zza.zzj.zze(i, System.currentTimeMillis() - j4, str);
    }
}
