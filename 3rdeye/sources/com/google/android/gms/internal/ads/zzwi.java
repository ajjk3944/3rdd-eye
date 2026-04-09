package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzwi implements zzwz {
    final /* synthetic */ zzwl zza;
    private final int zzb;

    public zzwi(zzwl zzwlVar, int i) {
        this.zza = zzwlVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zza(zzkv zzkvVar, zzhs zzhsVar, int i) {
        return this.zza.zzi(this.zzb, zzkvVar, zzhsVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb(long j4) {
        return this.zza.zzk(this.zzb, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final boolean zze() {
        return this.zza.zzQ(this.zzb);
    }
}
