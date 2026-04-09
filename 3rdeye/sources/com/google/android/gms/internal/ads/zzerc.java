package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzerc implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;

    public zzerc(zzgdm zzgdmVar, zzfco zzfcoVar) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
    }

    public static /* synthetic */ zzerd zzc(zzerc zzercVar) {
        return new zzerd("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzercVar.zzb.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerc.zzc(this.zza);
            }
        });
    }
}
