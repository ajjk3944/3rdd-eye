package com.google.android.gms.internal.ads;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes2.dex */
public final class zzeso implements zzfav {
    private final boolean zza;

    public zzeso(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzdah) obj).zza.putString("adid_p", true != this.zza ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public /* synthetic */ void zzb(Object obj) {
        t1.a(this, obj);
    }
}
