package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
final class zzin implements Runnable {
    final /* synthetic */ zzik zza;
    final /* synthetic */ zzik zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzis zze;

    public zzin(zzis zzisVar, zzik zzikVar, zzik zzikVar2, long j4, boolean z10) {
        this.zze = zzisVar;
        this.zza = zzikVar;
        this.zzb = zzikVar2;
        this.zzc = j4;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
