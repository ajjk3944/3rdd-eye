package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzezw implements zzelg {
    private final Context zza;
    private final Executor zzb;
    private final zzcgz zzc;
    private final zzekq zzd;
    private final zzfaw zze;
    private zzbdx zzf;
    private final zzfhp zzg;
    private final zzfcm zzh;
    private A4.a zzi;

    public zzezw(Context context, Executor executor, zzcgz zzcgzVar, zzekq zzekqVar, zzfaw zzfawVar, zzfcm zzfcmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgzVar;
        this.zzd = zzekqVar;
        this.zzh = zzfcmVar;
        this.zze = zzfawVar;
        this.zzg = zzcgzVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        A4.a aVar = this.zzi;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzele zzeleVar, zzelf zzelfVar) throws JSONException {
        zzdfy zzdfyVarZzf;
        zzfhm zzfhmVarZze;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdD(zzfdp.zzd(6, null, null));
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzk().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzezp) zzeleVar).zza;
        Bundle bundleZza = zzdrm.zza(new Pair(zzdrk.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdrk.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis())));
        zzfcm zzfcmVar = this.zzh;
        zzfcmVar.zzt(str);
        zzfcmVar.zzs(zzrVar);
        zzfcmVar.zzH(zzmVar);
        zzfcmVar.zzA(bundleZza);
        Context context = this.zza;
        zzfco zzfcoVarZzJ = zzfcmVar.zzJ();
        zzfhb zzfhbVarZzb = zzfha.zzb(context, zzfhl.zzf(zzfcoVarZzJ), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziu)).booleanValue()) {
            zzdfx zzdfxVarZzf = this.zzc.zzf();
            zzcuy zzcuyVar = new zzcuy();
            zzcuyVar.zzf(context);
            zzcuyVar.zzk(zzfcoVarZzJ);
            zzdfxVarZzf.zze(zzcuyVar.zzl());
            zzdbn zzdbnVar = new zzdbn();
            zzekq zzekqVar = this.zzd;
            Executor executor = this.zzb;
            zzdbnVar.zzj(zzekqVar, executor);
            zzdbnVar.zzk(zzekqVar, executor);
            zzdfxVarZzf.zzd(zzdbnVar.zzn());
            zzdfxVarZzf.zzc(new zzeiz(this.zzf));
            zzdfyVarZzf = zzdfxVarZzf.zzh();
        } else {
            zzdbn zzdbnVar2 = new zzdbn();
            zzfaw zzfawVar = this.zze;
            if (zzfawVar != null) {
                Executor executor2 = this.zzb;
                zzdbnVar2.zze(zzfawVar, executor2);
                zzdbnVar2.zzf(zzfawVar, executor2);
                zzdbnVar2.zzb(zzfawVar, executor2);
            }
            zzdfx zzdfxVarZzf2 = this.zzc.zzf();
            zzcuy zzcuyVar2 = new zzcuy();
            zzcuyVar2.zzf(context);
            zzcuyVar2.zzk(zzfcoVarZzJ);
            zzdfxVarZzf2.zze(zzcuyVar2.zzl());
            zzekq zzekqVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdbnVar2.zzj(zzekqVar2, executor3);
            zzdbnVar2.zze(zzekqVar2, executor3);
            zzdbnVar2.zzf(zzekqVar2, executor3);
            zzdbnVar2.zzb(zzekqVar2, executor3);
            zzdbnVar2.zza(zzekqVar2, executor3);
            zzdbnVar2.zzl(zzekqVar2, executor3);
            zzdbnVar2.zzk(zzekqVar2, executor3);
            zzdbnVar2.zzi(zzekqVar2, executor3);
            zzdbnVar2.zzc(zzekqVar2, executor3);
            zzdfxVarZzf2.zzd(zzdbnVar2.zzn());
            zzdfxVarZzf2.zzc(new zzeiz(this.zzf));
            zzdfyVarZzf = zzdfxVarZzf2.zzh();
        }
        zzdfy zzdfyVar = zzdfyVarZzf;
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzfhmVarZze = zzdfyVar.zze();
            zzfhmVarZze.zzi(4);
            zzfhmVarZze.zzb(zzmVar.zzp);
            zzfhmVarZze.zzf(zzmVar.zzm);
        } else {
            zzfhmVarZze = null;
        }
        zzfhm zzfhmVar = zzfhmVarZze;
        zzcrz zzcrzVarZza = zzdfyVar.zza();
        A4.a aVarZzh = zzcrzVarZza.zzh(zzcrzVarZza.zzi());
        this.zzi = aVarZzh;
        zzgdb.zzr(aVarZzh, new zzezv(this, zzelfVar, zzfhmVar, zzfhbVarZzb, zzdfyVar), this.zzb);
        return true;
    }

    public final void zzi(zzbdx zzbdxVar) {
        this.zzf = zzbdxVar;
    }
}
