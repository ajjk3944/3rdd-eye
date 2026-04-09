package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgco extends zzgcb {
    private zzgcn zza;

    public zzgco(zzfya zzfyaVar, boolean z10, Executor executor, Callable callable) {
        super(zzfyaVar, z10, false);
        this.zza = new zzgcm(this, callable, executor);
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzA(int i) {
        super.zzA(i);
        if (i == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzk() {
        zzgcn zzgcnVar = this.zza;
        if (zzgcnVar != null) {
            zzgcnVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzy() {
        zzgcn zzgcnVar = this.zza;
        if (zzgcnVar != null) {
            zzgcnVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final void zzx(int i, Object obj) {
    }
}
