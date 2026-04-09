package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzezg {
    private final zzfeb zza;
    private final zzcux zzb;
    private final Executor zzc;
    private zzeze zzd;

    public zzezg(zzfeb zzfebVar, zzcux zzcuxVar, Executor executor) {
        this.zza = zzfebVar;
        this.zzb = zzcuxVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfel zze() {
        zzfco zzfcoVarZzf = this.zzb.zzf();
        return this.zza.zzc(zzfcoVarZzf.zzd, zzfcoVarZzf.zzf, zzfcoVarZzf.zzj);
    }

    public final A4.a zzc() {
        A4.a aVarZzh;
        zzeze zzezeVar = this.zzd;
        if (zzezeVar != null) {
            return zzgdb.zzh(zzezeVar);
        }
        if (((Boolean) zzbfj.zza.zze()).booleanValue()) {
            zzgcs zzgcsVarZzw = zzgcs.zzw(this.zzb.zzb().zzf(this.zza.zza()));
            zzezd zzezdVar = new zzezd(this);
            Executor executor = this.zzc;
            aVarZzh = (zzgcs) zzgdb.zze((zzgcs) zzgdb.zzm(zzgcsVarZzw, zzezdVar, executor), zzdyp.class, new zzezc(this), executor);
        } else {
            zzeze zzezeVar2 = new zzeze(null, zze(), null);
            this.zzd = zzezeVar2;
            aVarZzh = zzgdb.zzh(zzezeVar2);
        }
        return zzgdb.zzm(aVarZzh, new zzfut() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return (zzeze) obj;
            }
        }, this.zzc);
    }
}
