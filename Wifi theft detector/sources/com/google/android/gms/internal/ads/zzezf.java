package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzezf implements zzfax {
    private final zzgzy zza;
    private final zzdzc zzb;

    public zzezf(zzgzy zzgzyVar, zzdzc zzdzcVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeze
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzezg zzc() {
        return new zzezg(this.zzb.zzb());
    }
}
