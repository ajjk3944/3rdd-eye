package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbhi {
    private final zzbhh zza;

    public zzbhi(zzbhh zzbhhVar) {
        Context context;
        this.zza = zzbhhVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbhhVar.zzh());
        } catch (RemoteException | NullPointerException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e10);
            }
        }
    }

    public final zzbhh zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
            return null;
        }
    }
}
