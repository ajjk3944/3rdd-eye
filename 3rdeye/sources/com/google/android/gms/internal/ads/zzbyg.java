package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbyg extends zzbyn {
    final zzhgh zza;
    final zzhgh zzb;
    final zzhgh zzc;
    final zzhgh zzd;
    final zzhgh zze;
    final zzhgh zzf;
    final zzhgh zzg;
    final zzhgh zzh;
    private final Clock zzj;

    public zzbyg(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbym zzbymVar) {
        this.zzj = clock;
        zzhfy zzhfyVarZza = zzhfz.zza(context);
        this.zza = zzhfyVarZza;
        zzhfy zzhfyVarZza2 = zzhfz.zza(zzgVar);
        this.zzb = zzhfyVarZza2;
        this.zzc = zzhfx.zzc(new zzbya(zzhfyVarZza, zzhfyVarZza2));
        zzhfy zzhfyVarZza3 = zzhfz.zza(clock);
        this.zzd = zzhfyVarZza3;
        zzhfy zzhfyVarZza4 = zzhfz.zza(zzbymVar);
        this.zze = zzhfyVarZza4;
        zzhgh zzhghVarZzc = zzhfx.zzc(new zzbyc(zzhfyVarZza3, zzhfyVarZza2, zzhfyVarZza4));
        this.zzf = zzhghVarZzc;
        zzbye zzbyeVar = new zzbye(zzhfyVarZza3, zzhghVarZzc);
        this.zzg = zzbyeVar;
        this.zzh = zzhfx.zzc(new zzbys(zzhfyVarZza, zzbyeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final zzbyd zza() {
        return new zzbyd(this.zzj, (zzbyb) this.zzf.zzb());
    }
}
