package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzgyx extends zzgyz {
    public zzgyx(zzgub zzgubVar, boolean z10) {
        super(zzgubVar, z10);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyz
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgvf.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgyy zzgyyVar = (zzgyy) it.next();
            arrayListZzb.add(zzgyyVar != null ? zzgyyVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
