package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzhil {
    final zzhim zza;
    final long[] zzb;

    public zzhil(zzhim zzhimVar, long[] jArr) {
        this.zza = zzhimVar;
        this.zzb = jArr;
    }

    public zzhil() {
        this(new zzhim(), new long[10]);
    }

    public zzhil(zzhil zzhilVar) {
        this.zza = new zzhim(zzhilVar.zza);
        this.zzb = Arrays.copyOf(zzhilVar.zzb, 10);
    }
}
