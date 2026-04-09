package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfyu extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfut zzb;

    public zzfyu(List list, zzfut zzfutVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzfutVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zzfyt(this, this.zza.listIterator(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        this.zza.subList(i, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
