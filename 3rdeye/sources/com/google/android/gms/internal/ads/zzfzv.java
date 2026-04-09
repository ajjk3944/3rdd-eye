package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfzv extends zzfyf {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzfzv(Object[] objArr, int i, int i10) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfve.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return true;
    }
}
