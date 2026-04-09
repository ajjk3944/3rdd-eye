package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeoo implements zzetu {
    private final zzgdm zza;

    public zzeoo(zzgdm zzgdmVar) {
        this.zza = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeon
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeop(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis() - com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zza());
            }
        });
    }
}
