package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqf;
import com.google.android.gms.internal.ads.zzaqk;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzbi implements zzaqf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbk zzb;

    public zzbi(zzbo zzboVar, String str, zzbk zzbkVar) {
        this.zza = str;
        this.zzb = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqf
    public final void zza(zzaqk zzaqkVar) {
        String str = "Failed to load URL: " + this.zza + "\n" + zzaqkVar.toString();
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj(str);
        this.zzb.zza((Object) null);
    }
}
