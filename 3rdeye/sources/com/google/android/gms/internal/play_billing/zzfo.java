package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
abstract class zzfo {
    final Unsafe zza;

    public zzfo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j4);

    public abstract float zzb(Object obj, long j4);

    public abstract void zzc(Object obj, long j4, boolean z10);

    public abstract void zzd(Object obj, long j4, byte b10);

    public abstract void zze(Object obj, long j4, double d10);

    public abstract void zzf(Object obj, long j4, float f10);

    public abstract boolean zzg(Object obj, long j4);
}
