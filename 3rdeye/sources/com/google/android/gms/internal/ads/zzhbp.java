package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhbp extends zzhbr {
    public zzhbp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte zza(long j4) {
        return Memory.peekByte((int) j4);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final double zzb(Object obj, long j4) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final float zzc(Object obj, long j4) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzd(long j4, byte[] bArr, long j10, long j11) {
        Memory.peekByteArray((int) j4, bArr, (int) j10, (int) j11);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zze(Object obj, long j4, boolean z10) {
        if (zzhbs.zzb) {
            zzhbs.zzG(obj, j4, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzhbs.zzH(obj, j4, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzf(Object obj, long j4, byte b10) {
        if (zzhbs.zzb) {
            zzhbs.zzG(obj, j4, b10);
        } else {
            zzhbs.zzH(obj, j4, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzg(Object obj, long j4, double d10) {
        this.zza.putLong(obj, j4, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzh(Object obj, long j4, float f10) {
        this.zza.putInt(obj, j4, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final boolean zzi(Object obj, long j4) {
        return zzhbs.zzb ? zzhbs.zzw(obj, j4) : zzhbs.zzx(obj, j4);
    }
}
