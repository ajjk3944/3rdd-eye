package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfcc implements zzfax {
    private final Executor zza;
    private final String zzb;

    public zzfcc(zzcdm zzcdmVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final com.google.common.util.concurrent.a zza() {
        com.google.common.util.concurrent.a aVarZza = zzgzo.zza(this.zzb);
        zzfcb zzfcbVar = zzfcb.zza;
        Executor executor = this.zza;
        return zzgzo.zzh(zzgzo.zzk(aVarZza, zzfcbVar, executor), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 41;
    }

    public final /* synthetic */ com.google.common.util.concurrent.a zzc(Throwable th) {
        return zzgzo.zza(new zzfcd(this.zzb));
    }
}
