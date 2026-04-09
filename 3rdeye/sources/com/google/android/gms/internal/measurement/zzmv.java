package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzmv extends zzmw {
    public zzmv(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(zzk(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(zzj(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzc(Object obj, long j4, boolean z10) {
        if (zzmx.zzb) {
            zzmx.zzD(obj, j4, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzmx.zzE(obj, j4, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzd(Object obj, long j4, byte b10) {
        if (zzmx.zzb) {
            zzmx.zzD(obj, j4, b10);
        } else {
            zzmx.zzE(obj, j4, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zze(Object obj, long j4, double d10) {
        zzo(obj, j4, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final void zzf(Object obj, long j4, float f10) {
        zzn(obj, j4, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmw
    public final boolean zzg(Object obj, long j4) {
        return zzmx.zzb ? zzmx.zzt(obj, j4) : zzmx.zzu(obj, j4);
    }
}
