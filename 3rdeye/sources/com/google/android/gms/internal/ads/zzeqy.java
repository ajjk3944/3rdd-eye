package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeqy implements zzetu {
    private final Context zza;
    private final zzgdm zzb;

    public zzeqy(zzgdm zzgdmVar, Context context) {
        this.zzb = zzgdmVar;
        this.zza = context;
    }

    public static /* synthetic */ zzeqz zzc(zzeqy zzeqyVar) {
        com.google.android.gms.ads.internal.zzv.zzr();
        return new zzeqz(com.google.android.gms.ads.internal.util.zzs.zzt(zzeqyVar.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqy.zzc(this.zza);
            }
        });
    }
}
