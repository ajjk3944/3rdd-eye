package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
class zzfwr extends zzfwk implements SortedMap {
    SortedSet zzd;
    final /* synthetic */ zzfwx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwr(zzfwx zzfwxVar, SortedMap sortedMap) {
        super(zzfwxVar, sortedMap);
        this.zze = zzfwxVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfwr(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfwr(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfwr(this.zze, zzf().tailMap(obj));
    }

    public SortedMap zzf() {
        return (SortedMap) ((zzfwk) this).zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzb
    public SortedSet zzg() {
        return new zzfws(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfwk, com.google.android.gms.internal.ads.zzfzb, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetZzg = zzg();
        this.zzd = sortedSetZzg;
        return sortedSetZzg;
    }
}
