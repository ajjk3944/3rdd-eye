package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzdbm {
    protected final Map zza = new HashMap();

    public zzdbm(Set set) {
        zzp(set);
    }

    public final synchronized void zzk(zzddo zzddoVar) {
        zzo(zzddoVar.zza, zzddoVar.zzb);
    }

    public final synchronized void zzo(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzp(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzk((zzddo) it.next());
        }
    }

    public final synchronized void zzq(final zzdbl zzdblVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbk
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdblVar.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
