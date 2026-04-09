package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeva implements zzetu {
    private final Executor zza;
    private final String zzb;

    public zzeva(zzbzh zzbzhVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        A4.a aVarZzh = zzgdb.zzh(this.zzb);
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zzeuy
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzevb((String) obj);
            }
        };
        Executor executor = this.zza;
        return zzgdb.zzf(zzgdb.zzm(aVarZzh, zzfutVar, executor), Throwable.class, new zzgci() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzgdb.zzh(new zzevb(this.zza.zzb));
            }
        }, executor);
    }
}
