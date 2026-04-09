package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcmk implements zzgcx {
    final /* synthetic */ zzfjq zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcml zzd;

    public zzcmk(zzcml zzcmlVar, zzfjq zzfjqVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfjqVar;
        this.zzb = str;
        this.zzc = zzvVar;
        this.zzd = zzcmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(final Throwable th) {
        zzgdm zzgdmVar = this.zzd.zzg;
        final zzfjq zzfjqVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgdmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkB)).booleanValue();
                zzcmk zzcmkVar = this.zza;
                Throwable th2 = th;
                if (zBooleanValue) {
                    zzcml zzcmlVar = zzcmkVar.zzd;
                    zzbun zzbunVarZzc = zzbul.zzc(zzcmlVar.zzc);
                    zzcmlVar.zzb = zzbunVarZzc;
                    zzbunVarZzc.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcml zzcmlVar2 = zzcmkVar.zzd;
                    zzbun zzbunVarZza = zzbul.zza(zzcmlVar2.zzc);
                    zzcmlVar2.zza = zzbunVarZza;
                    zzbunVarZza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfjqVar.zzd(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfjq zzfjqVar = this.zza;
        final String str = (String) obj;
        zzgdm zzgdmVar = this.zzd.zzg;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgdmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmj
            @Override // java.lang.Runnable
            public final void run() {
                zzfjqVar.zzd(str, zzvVar, null, null);
            }
        });
    }
}
