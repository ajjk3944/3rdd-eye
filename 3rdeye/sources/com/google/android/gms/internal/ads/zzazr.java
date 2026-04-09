package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzazr {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzazq zzazqVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    String str = "Queue is full, current size = " + list.size();
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze(str);
                    list.remove(0);
                }
                int i10 = this.zza;
                this.zza = i10 + 1;
                zzazqVar.zzg(i10);
                zzazqVar.zzk();
                list.add(zzazqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzazq zzazqVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzazq zzazqVar2 = (zzazq) it.next();
                    if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                        if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL() && !zzazqVar.equals(zzazqVar2) && zzazqVar2.zzd().equals(zzazqVar.zzd())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzazqVar.equals(zzazqVar2) && zzazqVar2.zzc().equals(zzazqVar.zzc())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzazq zzazqVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzazqVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
