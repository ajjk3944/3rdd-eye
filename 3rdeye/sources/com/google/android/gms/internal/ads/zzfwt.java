package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
class zzfwt implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfwu zzc;

    public zzfwt(zzfwu zzfwuVar, Iterator it) {
        this.zzc = zzfwuVar;
        this.zzb = zzfwuVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzfwu zzfwuVar = this.zzc;
        zzfwx zzfwxVar = zzfwuVar.zze;
        zzfwxVar.zzb--;
        zzfwuVar.zzc();
    }

    public final void zza() {
        zzfwu zzfwuVar = this.zzc;
        zzfwuVar.zzb();
        if (zzfwuVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzfwt(zzfwu zzfwuVar) {
        this.zzc = zzfwuVar;
        Collection collection = zzfwuVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
