package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeyw implements zzezk {
    private final zzfeb zza;
    private final Executor zzb;
    private final zzgcx zzc = new zzeyu(this);

    public zzeyw(zzfeb zzfebVar, Executor executor) {
        this.zza = zzfebVar;
        this.zzb = executor;
    }

    public static /* synthetic */ A4.a zza(zzeyw zzeywVar, zzcux zzcuxVar, zzeze zzezeVar) {
        zzfeb zzfebVar = zzeywVar.zza;
        zzfel zzfelVar = zzezeVar.zzb;
        zzbvo zzbvoVar = zzezeVar.zza;
        zzfek zzfekVarZzb = zzfebVar.zzb(zzfelVar);
        if (zzfekVarZzb != null && zzbvoVar != null) {
            zzgdb.zzr(zzcuxVar.zzb().zzg(zzbvoVar), zzeywVar.zzc, zzeywVar.zzb);
        }
        return zzgdb.zzh(new zzeyv(zzfelVar, zzbvoVar, zzfekVarZzb));
    }

    public final A4.a zzb(zzezl zzezlVar, zzezj zzezjVar, final zzcux zzcuxVar) {
        zzfeb zzfebVar = this.zza;
        Executor executor = this.zzb;
        return (zzgcs) zzgdb.zze((zzgcs) zzgdb.zzn(zzgcs.zzw(new zzezg(zzfebVar, zzcuxVar, executor).zzc()), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeys
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeyw.zza(this.zza, zzcuxVar, (zzeze) obj);
            }
        }, executor), Exception.class, new zzeyt(this), executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ A4.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzb(zzezlVar, zzezjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
