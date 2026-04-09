package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzemn implements zzetu {
    private final Set zza;

    public zzemn(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgdb.zzh(new zzeml(arrayList, null));
    }
}
