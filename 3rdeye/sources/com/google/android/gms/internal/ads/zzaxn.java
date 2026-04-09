package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxn implements Callable {
    private final zzawv zza;
    private final zzasr zzb;

    public zzaxn(zzawv zzawvVar, zzasr zzasrVar) {
        this.zza = zzawvVar;
        this.zzb = zzasrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzawv zzawvVar = this.zza;
        if (zzawvVar.zzk() != null) {
            zzawvVar.zzk().get();
        }
        zzato zzatoVarZzc = zzawvVar.zzc();
        if (zzatoVarZzc == null) {
            return null;
        }
        try {
            zzasr zzasrVar = this.zzb;
            synchronized (zzasrVar) {
                zzasrVar.zzaY(zzatoVarZzc.zzaV(), zzgyf.zza());
            }
            return null;
        } catch (zzgzk | NullPointerException unused) {
            return null;
        }
    }
}
