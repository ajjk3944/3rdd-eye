package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfyl {
    public static Object zza(Iterable iterable, Object obj) {
        zzgal it = ((zzgab) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfvf zzfvfVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfvfVar.getClass();
            return zzd((List) iterable, zzfvfVar);
        }
        Iterator it = iterable.iterator();
        zzfvfVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfvfVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzc(List list, zzfvf zzfvfVar, int i, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (zzfvfVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 < i) {
                return;
            } else {
                list.remove(i10);
            }
        }
    }

    private static boolean zzd(List list, zzfvf zzfvfVar) {
        int i = 0;
        int i10 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfvfVar.zza(obj)) {
                if (i > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfvfVar, i10, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfvfVar, i10, i);
                        return true;
                    }
                }
                i10++;
            }
            i++;
        }
        list.subList(i10, list.size()).clear();
        return i != i10;
    }
}
