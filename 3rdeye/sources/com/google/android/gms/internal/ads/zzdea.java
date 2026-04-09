package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdea {
    private final List zza;
    private final zzfjq zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzdea(zzfbt zzfbtVar, zzfjq zzfjqVar) {
        this.zza = zzfbtVar.zzp;
        this.zzb = zzfjqVar;
        this.zzc = zzfbtVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zze(this.zza, this.zzc);
        this.zzd = true;
    }
}
