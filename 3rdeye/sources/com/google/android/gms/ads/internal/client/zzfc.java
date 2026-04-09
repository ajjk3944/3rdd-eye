package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.internal.ads.zzbwt;
import com.google.android.gms.internal.ads.zzbxc;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzfc extends com.google.android.gms.ads.preload.zzb {
    public zzfc(Context context) {
        super(context, AdFormat.REWARDED);
    }

    public final RewardedAd zza(String str) {
        zzbwt zzbwtVarZzl;
        try {
            zzbwtVarZzl = this.zza.zzl(str);
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            zzbwtVarZzl = null;
        }
        if (zzbwtVarZzl == null) {
            return null;
        }
        return new zzbxc(zzc(), zzbwtVarZzl);
    }
}
