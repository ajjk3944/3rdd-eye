package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdyi implements zzcyt {
    private final Context zza;
    private final zzbym zzb;

    public zzdyi(Context context, zzbym zzbymVar) {
        this.zza = context;
        this.zzb = zzbymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = zzfcfVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzbym zzbymVar = this.zzb;
        Context context = this.zza;
        zzbymVar.zzm(context, zzfcfVar.zza.zza.zzd);
        zzbymVar.zzi(context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
    }
}
