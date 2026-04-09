package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbxd implements RewardItem {
    private final zzbwq zza;

    public zzbxd(zzbwq zzbwqVar) {
        this.zza = zzbwqVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbwq zzbwqVar = this.zza;
        if (zzbwqVar != null) {
            try {
                return zzbwqVar.zze();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getAmount to RewardItem", e4);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbwq zzbwqVar = this.zza;
        if (zzbwqVar != null) {
            try {
                return zzbwqVar.zzf();
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getType to RewardItem", e4);
            }
        }
        return null;
    }
}
