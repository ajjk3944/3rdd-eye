package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgoe {
    private final zzgdh zza;
    private final zzgao zzb;

    public zzgoe(zzgao zzgaoVar, zzgdh zzgdhVar) {
        this.zza = zzgdhVar;
        this.zzb = zzgaoVar;
    }

    public final zzgoc zza(int i10) {
        return new zzgoc(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th) {
        this.zza.zzb(i10 - 1, -1L, th, null);
    }

    public final com.google.common.util.concurrent.a zze(int i10, com.google.common.util.concurrent.a aVar) {
        zzgoc zzgocVarZza = zza(i10);
        zzgocVarZza.zza();
        zzgzo.zzr(aVar, new zzgod(this, zzgocVarZza), zzhaf.zza());
        return aVar;
    }

    public final void zzf(int i10, Runnable runnable) {
        try {
            zza(i10).zza();
            runnable.run();
        } finally {
        }
    }
}
