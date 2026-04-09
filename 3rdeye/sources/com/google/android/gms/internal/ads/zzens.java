package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzens implements zzetu {
    private final zzgdm zza;
    private final VersionInfoParcel zzb;

    public zzens(VersionInfoParcel versionInfoParcel, zzgdm zzgdmVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzent.zzc(this.zza.zzb);
            }
        });
    }
}
