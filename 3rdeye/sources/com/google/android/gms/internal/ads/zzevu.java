package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzevu implements zzetu {
    final zzgdm zza;
    final List zzb;

    public zzevu(zzbcl zzbclVar, zzgdm zzgdmVar, List list) {
        this.zza = zzgdmVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevv(this.zza.zzb);
            }
        });
    }
}
