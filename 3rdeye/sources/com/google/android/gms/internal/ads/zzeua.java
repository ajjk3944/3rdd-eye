package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeua implements zzetu {
    private final Context zza;
    private final zzgdm zzb;

    public zzeua(Context context, zzgdm zzgdmVar) {
        this.zza = context;
        this.zzb = zzgdmVar;
    }

    public static /* synthetic */ zzeub zzc(zzeua zzeuaVar) {
        Context context = zzeuaVar.zza;
        return new zzeub(zzbcm.zzb(context), zzbcm.zza(context));
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return ((Boolean) zzbeu.zzb.zze()).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeua.zzc(this.zza);
            }
        }) : zzgdb.zzh(new zzeub(-1, -1));
    }
}
