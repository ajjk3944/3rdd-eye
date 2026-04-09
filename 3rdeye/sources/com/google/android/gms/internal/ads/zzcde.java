package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcde implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcdd zza(zzcbz zzcbzVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdd zzcddVar = (zzcdd) it.next();
            if (zzcddVar.zza == zzcbzVar) {
                return zzcddVar;
            }
        }
        return null;
    }

    public final void zzb(zzcdd zzcddVar) {
        this.zza.add(zzcddVar);
    }

    public final void zzc(zzcdd zzcddVar) {
        this.zza.remove(zzcddVar);
    }

    public final boolean zzd(zzcbz zzcbzVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdd zzcddVar = (zzcdd) it.next();
            if (zzcddVar.zza == zzcbzVar) {
                arrayList.add(zzcddVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcdd) it2.next()).zzb.zzf();
        }
        return true;
    }
}
