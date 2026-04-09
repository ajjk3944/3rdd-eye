package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdi {
    public static final void zza(zzbdh zzbdhVar, zzbdf zzbdfVar) {
        if (zzbdfVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbdfVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbdhVar.zzd(zzbdfVar.zza(), zzbdfVar.zzb(), zzbdfVar.zzc(), zzbdfVar.zzd());
    }
}
