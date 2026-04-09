package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfkw {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbpo zze;
    private final Clock zzf;

    public zzfkw(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
    }

    private static zzfjy zzd() {
        return new zzfjy(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzz)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzA)).longValue(), 0.2d);
    }

    public final zzfkv zza(com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfvVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return new zzfka(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfvVar, zzceVar, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal == 2) {
            return new zzfkz(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfvVar, zzceVar, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfjx(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfvVar, zzceVar, this.zzc, zzd(), this.zzf);
    }

    public final zzfkv zzb(String str, com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzfvVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return new zzfka(str, this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfvVar, zzchVar, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal == 2) {
            return new zzfkz(str, this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfvVar, zzchVar, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfjx(str, this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzfvVar, zzchVar, this.zzc, zzd(), this.zzf);
    }

    public final void zzc(zzbpo zzbpoVar) {
        this.zze = zzbpoVar;
    }
}
