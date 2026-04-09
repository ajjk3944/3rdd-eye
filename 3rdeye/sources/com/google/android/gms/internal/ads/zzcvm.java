package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcvm {
    public static final zzbxy zza(Context context, VersionInfoParcel versionInfoParcel, zzfbt zzfbtVar, zzbxu zzbxuVar) {
        zzbxv zzbxvVar = zzfbtVar.zzA;
        if (zzbxvVar == null) {
            return null;
        }
        zzfby zzfbyVar = zzfbtVar.zzs;
        return new zzbxt(context, versionInfoParcel, zzbxvVar, zzfbyVar != null ? zzfbyVar.zzb : null, zzbxuVar);
    }
}
