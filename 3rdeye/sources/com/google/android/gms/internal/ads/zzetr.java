package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzetr implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzetr(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzetq zzc(zzetr zzetrVar) {
        return new zzetq(com.google.android.gms.ads.internal.util.zzad.zzb(zzetrVar.zzb, (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgm)));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetr.zzc(this.zza);
            }
        });
    }
}
