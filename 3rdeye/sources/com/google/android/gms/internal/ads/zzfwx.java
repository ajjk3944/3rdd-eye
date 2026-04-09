package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzfwx extends zzfxa implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfwx(Map map) {
        zzfve.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfwx zzfwxVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzfwxVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfwxVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public final Collection zzf() {
        return new zzfwz(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public final Iterator zzg() {
        return new zzfwh(this);
    }

    public final List zzh(Object obj, List list, zzfwu zzfwuVar) {
        return list instanceof RandomAccess ? new zzfwq(this, obj, list, zzfwuVar) : new zzfww(this, obj, list, zzfwuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfwo(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfwr(this, (SortedMap) map) : new zzfwk(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfwp(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfws(this, (SortedMap) map) : new zzfwn(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfzd
    public final void zzp() {
        Map map = this.zza;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa, com.google.android.gms.internal.ads.zzfzd
    public final boolean zzq(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        map.put(obj, collectionZza);
        return true;
    }
}
