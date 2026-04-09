package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbyb {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzbyb(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbym zzbymVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i, long j4) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaG)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zza;
        if (j4 - zzgVar.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaH)).booleanValue()) {
            zzgVar.zzH(i);
            zzgVar.zzI(j4);
        } else {
            zzgVar.zzH(-1);
            zzgVar.zzI(j4);
        }
    }
}
