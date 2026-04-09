package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzhg extends zzhh {
    public zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(zzj(obj, j4));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(zzi(obj, j4));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzc(Object obj, long j4, boolean z10) {
        if (zzhi.zza) {
            zzhi.zzi(obj, j4, z10);
        } else {
            zzhi.zzj(obj, j4, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zzd(Object obj, long j4, double d10) {
        zzn(obj, j4, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final void zze(Object obj, long j4, float f10) {
        zzm(obj, j4, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.zzhh
    public final boolean zzf(Object obj, long j4) {
        return zzhi.zza ? zzhi.zzq(obj, j4) : zzhi.zzr(obj, j4);
    }
}
