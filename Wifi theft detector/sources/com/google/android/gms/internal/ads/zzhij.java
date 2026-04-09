package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
class zzhij {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhij(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void zzb(zzhij zzhijVar, int i10) {
        zzhii.zza(this.zza, zzhijVar.zza, i10);
        zzhii.zza(this.zzb, zzhijVar.zzb, i10);
        zzhii.zza(this.zzc, zzhijVar.zzc, i10);
    }

    public zzhij() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhij(zzhij zzhijVar) {
        this.zza = Arrays.copyOf(zzhijVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhijVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhijVar.zzc, 10);
    }
}
