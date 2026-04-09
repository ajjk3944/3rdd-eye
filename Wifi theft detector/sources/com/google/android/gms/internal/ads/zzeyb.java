package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeyb implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;

    public zzeyb(zzgzy zzgzyVar, zzfjk zzfjkVar) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 21;
    }

    public final /* synthetic */ zzeyc zzc() {
        return new zzeyc("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(this.zzb.zzd)));
    }
}
