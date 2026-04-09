package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeln implements zzelg {
    private final zzfcm zza;
    private final zzcgz zzb;
    private final Context zzc;
    private final zzeld zzd;
    private final zzfhp zze;
    private zzcrk zzf;

    public zzeln(zzcgz zzcgzVar, Context context, zzeld zzeldVar, zzfcm zzfcmVar) {
        this.zzb = zzcgzVar;
        this.zzc = context;
        this.zzd = zzeldVar;
        this.zza = zzfcmVar;
        this.zze = zzcgzVar.zzy();
        zzfcmVar.zzv(zzeldVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        zzcrk zzcrkVar = this.zzf;
        return zzcrkVar != null && zzcrkVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzele zzeleVar, zzelf zzelfVar) throws JSONException, RemoteException {
        com.google.android.gms.ads.internal.zzv.zzr();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzI(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeli
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza().zzdD(zzfdp.zzd(4, null, null));
                }
            });
            return false;
        }
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza().zzdD(zzfdp.zzd(6, null, null));
                }
            });
            return false;
        }
        boolean z10 = zzmVar.zzf;
        zzfdl.zza(context, z10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue() && z10) {
            this.zzb.zzk().zzo(true);
        }
        int i11 = ((zzelh) zzeleVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        String strZza = zzdrk.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdrm.zza(new Pair(strZza, lValueOf), new Pair(zzdrk.DYNAMITE_ENTER.zza(), lValueOf));
        zzfcm zzfcmVar = this.zza;
        zzfcmVar.zzH(zzmVar);
        zzfcmVar.zzA(bundleZza);
        zzfcmVar.zzC(i11);
        zzfco zzfcoVarZzJ = zzfcmVar.zzJ();
        zzfhb zzfhbVarZzb = zzfha.zzb(context, zzfhl.zzf(zzfcoVarZzJ), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zzfcoVarZzJ.zzn;
        if (zzcoVar != null) {
            this.zzd.zzd().zzm(zzcoVar);
        }
        zzcgz zzcgzVar = this.zzb;
        zzdgt zzdgtVarZzg = zzcgzVar.zzg();
        zzcuy zzcuyVar = new zzcuy();
        zzcuyVar.zzf(context);
        zzcuyVar.zzk(zzfcoVarZzJ);
        zzdgtVarZzg.zzf(zzcuyVar.zzl());
        zzdbn zzdbnVar = new zzdbn();
        zzeld zzeldVar = this.zzd;
        zzdbnVar.zzk(zzeldVar.zzd(), zzcgzVar.zzA());
        zzdgtVarZzg.zze(zzdbnVar.zzn());
        zzdgtVarZzg.zzd(zzeldVar.zzc());
        zzfhm zzfhmVarZzf = null;
        zzdgtVarZzg.zzc(new zzcok(null));
        zzdgu zzdguVarZzg = zzdgtVarZzg.zzg();
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzfhmVarZzf = zzdguVarZzg.zzf();
            zzfhmVarZzf.zzi(8);
            zzfhmVarZzf.zzb(zzmVar.zzp);
            zzfhmVarZzf.zzf(zzmVar.zzm);
        }
        zzfhm zzfhmVar = zzfhmVarZzf;
        zzcgzVar.zzx().zzc(1);
        zzgdm zzgdmVarZzc = zzffm.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzB = zzcgzVar.zzB();
        zzcrz zzcrzVarZza = zzdguVarZzg.zza();
        zzcrk zzcrkVar = new zzcrk(zzgdmVarZzc, scheduledExecutorServiceZzB, zzcrzVarZza.zzh(zzcrzVarZza.zzi()));
        this.zzf = zzcrkVar;
        zzcrkVar.zze(new zzelm(this, zzelfVar, zzfhmVar, zzfhbVarZzb, zzdguVarZzg));
        return true;
    }
}
