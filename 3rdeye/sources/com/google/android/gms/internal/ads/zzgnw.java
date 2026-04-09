package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgnw implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzgnw(zzgoa zzgoaVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzgny(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
