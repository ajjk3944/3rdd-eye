package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfzs extends zzfyf {
    final /* synthetic */ zzfzt zza;

    public zzfzs(zzfzt zzfztVar) {
        this.zza = zzfztVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfzt zzfztVar = this.zza;
        zzfve.zza(i, zzfztVar.zzc, "index");
        int i10 = i + i;
        Object obj = zzfztVar.zzb[i10];
        Objects.requireNonNull(obj);
        Object obj2 = zzfztVar.zzb[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final boolean zzf() {
        return true;
    }
}
