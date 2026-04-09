package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfxr extends zzfxu {
    public zzfxr() {
        super(null);
    }

    public static final zzfxu zzf(int i) {
        return i < 0 ? zzfxu.zzb : i > 0 ? zzfxu.zzc : zzfxu.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zzb(int i, int i10) {
        return zzf(Integer.compare(i, i10));
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zze(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }
}
