package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfcw implements zzfax {
    final zzgzy zza;
    final List zzb;

    public zzfcw(zzbgo zzbgoVar, zzgzy zzgzyVar, List list) {
        this.zza = zzgzyVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfcx(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 48;
    }
}
