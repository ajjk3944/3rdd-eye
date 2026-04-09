package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* loaded from: classes2.dex */
public final class zzeqf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdvp zzb;

    public zzeqf(zzdvp zzdvpVar) {
        this.zzb = zzdvpVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e10);
        }
    }

    @CheckForNull
    public final zzbvs zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbvs) concurrentHashMap.get(str);
        }
        return null;
    }
}
