package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgzf extends AbstractList {
    private final zzgzd zza;
    private final zzgze zzb;

    public zzgzf(zzgzd zzgzdVar, zzgze zzgzeVar) {
        this.zza = zzgzdVar;
        this.zzb = zzgzeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzd(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
