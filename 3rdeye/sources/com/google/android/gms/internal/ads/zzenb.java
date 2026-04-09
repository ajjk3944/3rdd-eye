package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzenb implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;
    private final zzbzu zzc;

    public zzenb(zzgdm zzgdmVar, zzfco zzfcoVar, zzbzu zzbzuVar) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
        this.zzc = zzbzuVar;
    }

    public static /* synthetic */ zzenc zzc(zzenb zzenbVar) {
        return new zzenc(zzenbVar.zzb.zzj, zzenbVar.zzc.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzena
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenb.zzc(this.zza);
            }
        });
    }
}
