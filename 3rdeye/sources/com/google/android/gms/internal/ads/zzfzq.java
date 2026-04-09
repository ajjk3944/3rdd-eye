package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfzq implements Comparator {
    public static zzfzq zzb(Comparator comparator) {
        return new zzfxq(comparator);
    }

    public static zzfzq zzc() {
        return zzfzo.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfzq zza() {
        return new zzfzz(this);
    }

    public final zzfzq zzd(zzfut zzfutVar) {
        return new zzfxb(zzfutVar, this);
    }
}
