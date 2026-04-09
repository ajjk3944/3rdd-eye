package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcxj {
    private final zzeeg zza;
    private final zzfjk zzb;
    private final zzfnu zzc;
    private final zzcqj zzd;
    private final zzeny zze;
    private final zzdgu zzf;

    @Nullable
    private zzfjc zzg;
    private final zzefr zzh;
    private final zzdaj zzi;
    private final Executor zzj;
    private final zzefc zzk;
    private final zzekl zzl;

    public zzcxj(zzeeg zzeegVar, zzfjk zzfjkVar, zzfnu zzfnuVar, zzcqj zzcqjVar, zzeny zzenyVar, zzdgu zzdguVar, @Nullable zzfjc zzfjcVar, zzefr zzefrVar, zzdaj zzdajVar, Executor executor, zzefc zzefcVar, zzekl zzeklVar) {
        this.zza = zzeegVar;
        this.zzb = zzfjkVar;
        this.zzc = zzfnuVar;
        this.zzd = zzcqjVar;
        this.zze = zzenyVar;
        this.zzf = zzdguVar;
        this.zzg = zzfjcVar;
        this.zzh = zzefrVar;
        this.zzi = zzdajVar;
        this.zzj = executor;
        this.zzk = zzefcVar;
        this.zzl = zzeklVar;
    }

    public final com.google.common.util.concurrent.a zza(com.google.common.util.concurrent.a aVar) {
        if (this.zzg != null) {
            zzfnu zzfnuVar = this.zzc;
            zzfno zzfnoVar = zzfno.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfnuVar);
            return zzfnf.zza(zzgzo.zza(this.zzg), zzfnoVar, zzfnuVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfnl zzfnlVarZza = this.zzc.zza(zzfno.SERVER_TRANSACTION, aVar);
        final zzefc zzefcVar = this.zzk;
        Objects.requireNonNull(zzefcVar);
        return zzfnlVarZza.zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcxi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return zzefcVar.zza((zzbzu) obj);
            }
        }).zzi();
    }

    public final com.google.common.util.concurrent.a zzb() {
        zzfjk zzfjkVar = this.zzb;
        if (!zzfjkVar.zzv) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzfjkVar.zzd;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                zzfnu zzfnuVar = this.zzc;
                zzfno zzfnoVar = zzfno.PRELOADED_LOADER;
                Objects.requireNonNull(zzfnuVar);
                return zzfnf.zza(this.zza.zza(), zzfnoVar, zzfnuVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final com.google.common.util.concurrent.a zzc(com.google.common.util.concurrent.a aVar) {
        zzfnl zzfnlVarZzc = this.zzc.zza(zzfno.RENDERER, aVar).zzb(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzcxh
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) throws Exception {
                zzfjc zzfjcVar = (zzfjc) obj;
                this.zza.zzi(zzfjcVar);
                return zzfjcVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgB)).booleanValue()) {
            zzfnlVarZzc = zzfnlVarZzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
        }
        return zzfnlVarZzc.zzi();
    }

    public final zzdgu zzd() {
        return this.zzf;
    }

    public final com.google.common.util.concurrent.a zze(final zzflg zzflgVar) {
        zzfnb zzfnbVarZzi = this.zzc.zza(zzfno.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcxg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return this.zza.zzj(zzflgVar, (zzbzu) obj);
            }
        }).zzi();
        zzgzo.zzr(zzfnbVarZzi, new zzcxe(this), this.zzj);
        return zzfnbVarZzi;
    }

    public final com.google.common.util.concurrent.a zzf(zzbzu zzbzuVar) {
        zzfnb zzfnbVarZzi = this.zzc.zza(zzfno.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbzuVar)).zzi();
        zzgzo.zzr(zzfnbVarZzi, new zzcxf(this), this.zzj);
        return zzfnbVarZzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th) {
        return zzfkm.zzb(th, this.zzl);
    }

    public final void zzh(zzfjc zzfjcVar) {
        this.zzg = zzfjcVar;
    }

    public final /* synthetic */ zzfjc zzi(zzfjc zzfjcVar) throws Exception {
        this.zzd.zza(zzfjcVar);
        return zzfjcVar;
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzj(zzflg zzflgVar, zzbzu zzbzuVar) {
        zzbzuVar.zzi = zzflgVar;
        return this.zzh.zza(zzbzuVar);
    }

    public final /* synthetic */ zzdgu zzk() {
        return this.zzf;
    }
}
