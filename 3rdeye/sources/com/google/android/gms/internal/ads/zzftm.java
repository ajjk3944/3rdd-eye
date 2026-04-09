package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzftm extends zzfsf {
    final /* synthetic */ zzftn zza;
    private final zzfts zzb;

    public zzftm(zzftn zzftnVar, zzfts zzftsVar) {
        this.zza = zzftnVar;
        this.zzb = zzftsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzftq zzftqVarZzc = zzftr.zzc();
        zzftqVarZzc.zzb(i);
        if (string != null) {
            zzftqVarZzc.zza(string);
        }
        this.zzb.zza(zzftqVarZzc.zzc());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
