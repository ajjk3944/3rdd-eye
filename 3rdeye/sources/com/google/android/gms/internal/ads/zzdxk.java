package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdxk implements zzgcx {
    final /* synthetic */ zzdxl zza;

    public zzdxk(zzdxl zzdxlVar) {
        this.zza = zzdxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgq)).booleanValue()) {
            Matcher matcher = zzdxl.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcf zzfcfVar = (zzfcf) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgq)).booleanValue()) {
            zzdxl zzdxlVar = this.zza;
            zzeao zzeaoVar = zzdxlVar.zzf;
            zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
            zzeaoVar.zzi(zzfbwVar.zzf);
            zzdxlVar.zzf.zzj(zzfbwVar.zzg);
        }
    }
}
