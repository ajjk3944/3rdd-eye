package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcrz {
    private final zzdxt zza;
    private final zzfco zzb;
    private final zzfgs zzc;
    private final zzckz zzd;
    private final zzeha zze;
    private final zzdbd zzf;
    private zzfcf zzg;
    private final zzdzb zzh;
    private final zzcuu zzi;
    private final Executor zzj;
    private final zzdym zzk;
    private final zzedj zzl;

    public zzcrz(zzdxt zzdxtVar, zzfco zzfcoVar, zzfgs zzfgsVar, zzckz zzckzVar, zzeha zzehaVar, zzdbd zzdbdVar, zzfcf zzfcfVar, zzdzb zzdzbVar, zzcuu zzcuuVar, Executor executor, zzdym zzdymVar, zzedj zzedjVar) {
        this.zza = zzdxtVar;
        this.zzb = zzfcoVar;
        this.zzc = zzfgsVar;
        this.zzd = zzckzVar;
        this.zze = zzehaVar;
        this.zzf = zzdbdVar;
        this.zzg = zzfcfVar;
        this.zzh = zzdzbVar;
        this.zzi = zzcuuVar;
        this.zzj = executor;
        this.zzk = zzdymVar;
        this.zzl = zzedjVar;
    }

    public static /* synthetic */ zzfcf zzd(zzcrz zzcrzVar, zzfcf zzfcfVar) throws Exception {
        zzcrzVar.zzd.zza(zzfcfVar);
        return zzfcfVar;
    }

    public static /* synthetic */ A4.a zze(zzcrz zzcrzVar, zzfei zzfeiVar, zzbvo zzbvoVar) {
        zzbvoVar.zzi = zzfeiVar;
        return zzcrzVar.zzh.zze(zzbvoVar);
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfdp.zzb(th, this.zzl);
    }

    public final zzdbd zzc() {
        return this.zzf;
    }

    public final A4.a zzf(final zzfei zzfeiVar) {
        zzffy zzffyVarZza = this.zzc.zzb(zzfgm.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgci() { // from class: com.google.android.gms.internal.ads.zzcrv
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzcrz.zze(this.zza, zzfeiVar, (zzbvo) obj);
            }
        }).zza();
        zzgdb.zzr(zzffyVarZza, new zzcrx(this), this.zzj);
        return zzffyVarZza;
    }

    public final A4.a zzg(zzbvo zzbvoVar) {
        zzffy zzffyVarZza = this.zzc.zzb(zzfgm.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbvoVar)).zza();
        zzgdb.zzr(zzffyVarZza, new zzcry(this), this.zzj);
        return zzffyVarZza;
    }

    public final A4.a zzh(A4.a aVar) {
        zzfgi zzfgiVarZzf = this.zzc.zzb(zzfgm.RENDERER, aVar).zze(new zzffw() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) throws Exception {
                zzfcf zzfcfVar = (zzfcf) obj;
                zzcrz.zzd(this.zza, zzfcfVar);
                return zzfcfVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfM)).booleanValue()) {
            zzfgiVarZzf = zzfgiVarZzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS);
        }
        return zzfgiVarZzf.zza();
    }

    public final A4.a zzi() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfgs zzfgsVar = this.zzc;
        zzdxt zzdxtVar = this.zza;
        return zzfgc.zzc(zzdxtVar.zze(), zzfgm.PRELOADED_LOADER, zzfgsVar).zza();
    }

    public final A4.a zzj(A4.a aVar) {
        zzfcf zzfcfVar = this.zzg;
        if (zzfcfVar != null) {
            zzfgs zzfgsVar = this.zzc;
            return zzfgc.zzc(zzgdb.zzh(zzfcfVar), zzfgm.SERVER_TRANSACTION, zzfgsVar).zza();
        }
        com.google.android.gms.ads.internal.zzv.zzc().zzj();
        zzfgi zzfgiVarZzb = this.zzc.zzb(zzfgm.SERVER_TRANSACTION, aVar);
        final zzdym zzdymVar = this.zzk;
        Objects.requireNonNull(zzdymVar);
        return zzfgiVarZzb.zzf(new zzgci() { // from class: com.google.android.gms.internal.ads.zzcrw
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdymVar.zzc((zzbvo) obj);
            }
        }).zza();
    }

    public final void zzk(zzfcf zzfcfVar) {
        this.zzg = zzfcfVar;
    }
}
