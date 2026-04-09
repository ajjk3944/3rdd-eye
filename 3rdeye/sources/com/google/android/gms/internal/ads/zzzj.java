package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzzj {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzzk zzzkVar) {
        zzc(zzzkVar);
        this.zza.add(new zzzi(handler, zzzkVar));
    }

    public final void zzb(final int i, final long j4, final long j10) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzzi zzziVar = (zzzi) it.next();
            if (!zzziVar.zzc) {
                zzziVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzziVar.zzb.zzZ(i, j4, j10);
                    }
                });
            }
        }
    }

    public final void zzc(zzzk zzzkVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzzi zzziVar = (zzzi) it.next();
            if (zzziVar.zzb == zzzkVar) {
                zzziVar.zzc();
                copyOnWriteArrayList.remove(zzziVar);
            }
        }
    }
}
