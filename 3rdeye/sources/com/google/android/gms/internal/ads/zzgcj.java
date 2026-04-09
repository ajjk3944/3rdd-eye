package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgcj extends zzgcl {
    public zzgcj(zzfya zzfyaVar, boolean z10) {
        super(zzfyaVar, z10);
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzfyv.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgck zzgckVar = (zzgck) it.next();
            arrayListZzb.add(zzgckVar != null ? zzgckVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
