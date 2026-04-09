package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzhbr {
    final Unsafe zza;

    public zzhbr(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j4);

    public abstract double zzb(Object obj, long j4);

    public abstract float zzc(Object obj, long j4);

    public abstract void zzd(long j4, byte[] bArr, long j10, long j11);

    public abstract void zze(Object obj, long j4, boolean z10);

    public abstract void zzf(Object obj, long j4, byte b10);

    public abstract void zzg(Object obj, long j4, double d10);

    public abstract void zzh(Object obj, long j4, float f10);

    public abstract boolean zzi(Object obj, long j4);
}
