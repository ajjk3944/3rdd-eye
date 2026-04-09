package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhfo implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhfp zzb;

    public zzhfo(zzhfp zzhfpVar) {
        this.zzb = zzhfpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        zzhfp zzhfpVar = this.zzb;
        return i < zzhfpVar.zza.size() || zzhfpVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zza;
        zzhfp zzhfpVar = this.zzb;
        List list = zzhfpVar.zza;
        if (i >= list.size()) {
            list.add(zzhfpVar.zzb.next());
            return next();
        }
        int i10 = this.zza;
        this.zza = i10 + 1;
        return list.get(i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
