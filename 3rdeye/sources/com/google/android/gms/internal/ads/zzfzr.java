package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfzr extends zzfyf {
    static final zzfyf zza = new zzfzr(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzfzr(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfve.zza(i, this.zzc, "index");
        Object obj = this.zzb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfyf, com.google.android.gms.internal.ads.zzfya
    public final int zza(Object[] objArr, int i) {
        Object[] objArr2 = this.zzb;
        int i10 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i, i10);
        return i + i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final Object[] zzg() {
        return this.zzb;
    }
}
