package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbou {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbos();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbot();
    private final zzbog zzc;

    public zzbou(Context context, VersionInfoParcel versionInfoParcel, String str, zzfhp zzfhpVar) {
        this.zzc = new zzbog(context, versionInfoParcel, str, zza, zzb, zzfhpVar);
    }

    public final zzbok zza(String str, zzbon zzbonVar, zzbom zzbomVar) {
        return new zzboy(this.zzc, str, zzbonVar, zzbomVar);
    }

    public final zzbpd zzb() {
        return new zzbpd(this.zzc);
    }
}
