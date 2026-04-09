package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzery implements zzetu {
    private final zzgdm zza;
    private final zzfco zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzery(zzgdm zzgdmVar, zzfco zzfcoVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgdmVar;
        this.zzb = zzfcoVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzerz zzc(zzery zzeryVar) {
        return new zzerz(zzeryVar.zzb, zzeryVar.zzc, zzeryVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzery.zzc(this.zza);
            }
        });
    }
}
