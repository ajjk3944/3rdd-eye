package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzesc implements zzetu {
    private static String zza;
    private final zzgdm zzb;
    private final Context zzc;

    public zzesc(zzgdm zzgdmVar, Context context) {
        this.zzb = zzgdmVar;
        this.zzc = context;
    }

    public static /* synthetic */ zzesd zzc(zzesc zzescVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfu)).booleanValue()) {
            return new zzesd(null);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfD)).booleanValue()) {
            return new zzesd(com.google.android.gms.ads.internal.zzv.zzC().zzf(zzescVar.zzc));
        }
        if (zza == null) {
            zza = com.google.android.gms.ads.internal.zzv.zzC().zzf(zzescVar.zzc);
        }
        return new zzesd(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesc.zzc(this.zza);
            }
        });
    }
}
