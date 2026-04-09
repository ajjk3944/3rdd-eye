package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeji {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdps zzb;

    public zzeji(zzdps zzdpsVar) {
        this.zzb = zzdpsVar;
    }

    public final zzbrn zza(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbrn) concurrentHashMap.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e4);
        }
    }
}
