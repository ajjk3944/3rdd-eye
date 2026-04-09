package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzchk implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcge zzcgeVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzchj zzchjVar = (zzchj) it.next();
            if (zzchjVar.zza == zzcgeVar) {
                arrayList.add(zzchjVar);
            }
        }
        int i10 = 0;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((zzchj) obj).zzb.zzl();
        }
        return true;
    }

    @Nullable
    public final zzchj zzb(zzcge zzcgeVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzchj zzchjVar = (zzchj) it.next();
            if (zzchjVar.zza == zzcgeVar) {
                return zzchjVar;
            }
        }
        return null;
    }

    public final void zzc(zzchj zzchjVar) {
        this.zza.add(zzchjVar);
    }

    public final void zzd(zzchj zzchjVar) {
        this.zza.remove(zzchjVar);
    }
}
