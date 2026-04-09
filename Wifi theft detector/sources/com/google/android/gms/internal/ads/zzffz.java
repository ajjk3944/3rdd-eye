package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzffz implements zzfgj {

    @Nullable
    private zzdam zza;

    @Override // com.google.android.gms.internal.ads.zzfgj
    @Nullable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zza;
    }

    public final synchronized com.google.common.util.concurrent.a zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable zzdam zzdamVar) {
        zzcxj zzcxjVarZza;
        try {
            if (zzdamVar != null) {
                this.zza = zzdamVar;
            } else {
                this.zza = (zzdam) zzfgiVar.zza(zzfgkVar.zzb).zzh();
            }
            zzcxjVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzcxjVarZza.zzc(zzcxjVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, @Nullable Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }
}
