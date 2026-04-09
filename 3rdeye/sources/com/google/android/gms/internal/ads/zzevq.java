package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzevq implements zzetu {
    public zzevq(zzbze zzbzeVar, zzgdm zzgdmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        final A4.a aVarZzh = zzgdb.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfY)).booleanValue()) {
            aVarZzh = zzgdb.zzh(null);
        }
        final A4.a aVarZzh2 = zzgdb.zzh(null);
        return zzgdb.zzc(aVarZzh, aVarZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevr((String) aVarZzh.get(), (String) aVarZzh2.get());
            }
        }, zzcad.zza);
    }
}
