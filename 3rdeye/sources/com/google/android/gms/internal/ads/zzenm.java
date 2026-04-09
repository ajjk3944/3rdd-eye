package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzenm implements zzett {
    final String zza;
    final int zzb;

    public zzenm(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i;
        Bundle bundle = ((zzcut) obj).zza;
        String str = this.zza;
        if (TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        Bundle bundleZza = zzfdc.zza(bundle, "pii");
        bundle.putBundle("pii", bundleZza);
        bundleZza.putString("pvid", str);
        bundleZza.putInt("pvid_s", i);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
