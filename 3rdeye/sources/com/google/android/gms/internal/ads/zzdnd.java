package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdnd implements zzbkd {
    private final zzbhr zza;
    private final zzdnr zzb;
    private final zzhfs zzc;

    public zzdnd(zzdix zzdixVar, zzdim zzdimVar, zzdnr zzdnrVar, zzhfs zzhfsVar) {
        this.zza = zzdixVar.zzc(zzdimVar.zzA());
        this.zzb = zzdnrVar;
        this.zzc = zzhfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbhh) this.zzc.zzb(), str);
        } catch (RemoteException e4) {
            String strI = C1154e9.i("Failed to call onCustomClick for asset ", str, ".");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk(strI, e4);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
