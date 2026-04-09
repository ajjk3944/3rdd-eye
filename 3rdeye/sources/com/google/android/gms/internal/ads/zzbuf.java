package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbuf {
    private static zzbyy zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final com.google.android.gms.ads.internal.client.zzek zzd;
    private final String zze;

    public zzbuf(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzek zzekVar, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzekVar;
        this.zze = str;
    }

    public static zzbyy zza(Context context) {
        zzbyy zzbyyVar;
        synchronized (zzbuf.class) {
            try {
                if (zza == null) {
                    zza = com.google.android.gms.ads.internal.client.zzbb.zza().zzt(context, new zzbpk());
                }
                zzbyyVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyyVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zzb;
        zzbyy zzbyyVarZza = zza(context);
        if (zzbyyVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zzd;
        if (zzekVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzg(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzekVar.zzo(jCurrentTimeMillis);
            zzmVarZza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzekVar);
        }
        try {
            zzbyyVarZza.zzf(iObjectWrapperWrap, new zzbzc(this.zze, this.zzc.name(), null, zzmVarZza, 0, null), new zzbue(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
