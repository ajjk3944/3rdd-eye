package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfyv {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i) {
        zzfxc.zza(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzc(List list, zzfut zzfutVar) {
        return list instanceof RandomAccess ? new zzfys(list, zzfutVar) : new zzfyu(list, zzfutVar);
    }
}
