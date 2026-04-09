package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzchg implements zzhfy {
    private final zzchc zza;

    public zzchg(zzchc zzchcVar) {
        this.zza = zzchcVar;
    }

    public static Context zzc(zzchc zzchcVar) {
        Context contextZzb = zzchcVar.zzb();
        zzhgg.zzb(contextZzb);
        return contextZzb;
    }

    public final Context zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
