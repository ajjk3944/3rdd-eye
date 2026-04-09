package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
abstract class zzmw {
    final Unsafe zza;

    public zzmw(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j4);

    public abstract float zzb(Object obj, long j4);

    public abstract void zzc(Object obj, long j4, boolean z10);

    public abstract void zzd(Object obj, long j4, byte b10);

    public abstract void zze(Object obj, long j4, double d10);

    public abstract void zzf(Object obj, long j4, float f10);

    public abstract boolean zzg(Object obj, long j4);

    public final int zzh(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzi(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzj(Object obj, long j4) {
        return this.zza.getInt(obj, j4);
    }

    public final long zzk(Object obj, long j4) {
        return this.zza.getLong(obj, j4);
    }

    public final long zzl(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzm(Object obj, long j4) {
        return this.zza.getObject(obj, j4);
    }

    public final void zzn(Object obj, long j4, int i) {
        this.zza.putInt(obj, j4, i);
    }

    public final void zzo(Object obj, long j4, long j10) {
        this.zza.putLong(obj, j4, j10);
    }

    public final void zzp(Object obj, long j4, Object obj2) {
        this.zza.putObject(obj, j4, obj2);
    }
}
