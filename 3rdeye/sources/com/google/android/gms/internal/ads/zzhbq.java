package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhbq extends zzhbr {
    public zzhbq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte zza(long j4) {
        return Memory.peekByte(j4);
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
        Memory.peekByteArray(j4, bArr, (int) j10, (int) j11);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhbs.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhbs.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.ads.zzhbs.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.ads.zzhbs.zzl(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zze(Object obj, long j4, boolean z10) {
        if (zzhbs.zzb) {
            zzhbs.zzk(obj, j4, z10);
        } else {
            zzhbs.zzl(obj, j4, z10);
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
