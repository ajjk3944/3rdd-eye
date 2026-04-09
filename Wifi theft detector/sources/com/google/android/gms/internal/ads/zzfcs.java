package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfcs implements zzfax {
    public zzfcs(zzcdj zzcdjVar, zzgzy zzgzyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        final com.google.common.util.concurrent.a aVarZza = zzgzo.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgN)).booleanValue()) {
            aVarZza = zzgzo.zza(null);
        }
        final com.google.common.util.concurrent.a aVarZza2 = zzgzo.zza(null);
        return zzgzo.zzo(aVarZza, aVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfct((String) aVarZza.get(), (String) aVarZza2.get());
            }
        }, zzcei.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 47;
    }
}
