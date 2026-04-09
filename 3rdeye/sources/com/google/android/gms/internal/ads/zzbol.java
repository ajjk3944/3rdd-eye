package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbol {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbou zzc;
    private zzbou zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbou zza(Context context, VersionInfoParcel versionInfoParcel, zzfhp zzfhpVar) {
        zzbou zzbouVar;
        String str;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    if (((Boolean) zzbfi.zzf.zze()).booleanValue()) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zza);
                    } else {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzb);
                    }
                    this.zzc = new zzbou(zzc(context), versionInfoParcel, str, zzfhpVar);
                }
                zzbouVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbouVar;
    }

    public final zzbou zzb(Context context, VersionInfoParcel versionInfoParcel, zzfhp zzfhpVar) {
        zzbou zzbouVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbou(zzc(context), versionInfoParcel, (String) zzbfm.zza.zze(), zzfhpVar);
                }
                zzbouVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbouVar;
    }
}
