package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfvc implements Serializable {
    public static zzfvc zzc() {
        return zzfui.zza;
    }

    public static zzfvc zzd(Object obj) {
        return obj == null ? zzfui.zza : new zzfvj(obj);
    }

    public abstract zzfvc zza(zzfut zzfutVar);

    public abstract Object zzb(Object obj);
}
