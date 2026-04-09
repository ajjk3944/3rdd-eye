package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgah {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static zzgaf zzb(Set set, Set set2) {
        zzfve.zzc(set, "set1");
        zzfve.zzc(set2, "set2");
        return new zzgab(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzc(Set set, zzfvf zzfvfVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgac)) {
                set.getClass();
                return new zzgac(set, zzfvfVar);
            }
            zzgac zzgacVar = (zzgac) set;
            return new zzgac((Set) zzgacVar.zza, zzfvi.zza(zzgacVar.zzb, zzfvfVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgac)) {
            sortedSet.getClass();
            return new zzgad(sortedSet, zzfvfVar);
        }
        zzgac zzgacVar2 = (zzgac) sortedSet;
        return new zzgad((SortedSet) zzgacVar2.zza, zzfvi.zza(zzgacVar2.zzb, zzfvfVar));
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfzn) {
            collection = ((zzfzn) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
