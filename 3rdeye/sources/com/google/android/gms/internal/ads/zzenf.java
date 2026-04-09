package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzenf implements zzetu {
    private final Executor zza;
    private final zzbzq zzb;

    public zzenf(Executor executor, zzbzq zzbzqVar) {
        this.zza = executor;
        this.zzb = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzde)).booleanValue() ? zzgdb.zzh(new zzeng(null)) : zzgdb.zzm(this.zzb.zzk(), new zzfut() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzeng(arrayList);
            }
        }, this.zza);
    }
}
