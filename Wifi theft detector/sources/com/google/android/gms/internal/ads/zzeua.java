package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeua implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final zzcdz zzc;

    public zzeua(zzgzy zzgzyVar, zzfjk zzfjkVar, zzcdz zzcdzVar) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = zzcdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 9;
    }

    public final /* synthetic */ zzeub zzc() {
        return new zzeub(this.zzb.zzk, this.zzc.zzl());
    }
}
