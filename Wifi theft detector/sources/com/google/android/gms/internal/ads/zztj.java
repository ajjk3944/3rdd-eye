package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zztj {
    public final int zza;

    @Nullable
    public final zzwk zzb;
    private final CopyOnWriteArrayList zzc;

    private zztj(CopyOnWriteArrayList copyOnWriteArrayList, int i10, @Nullable zzwk zzwkVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzwkVar;
    }

    @CheckResult
    public final zztj zza(int i10, @Nullable zzwk zzwkVar) {
        return new zztj(this.zzc, 0, zzwkVar);
    }

    public final void zzb(Handler handler, zztk zztkVar) {
        this.zzc.add(new zzti(handler, zztkVar));
    }

    public final void zzc(zztk zztkVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzti zztiVar = (zzti) it.next();
            if (zztiVar.zza == zztkVar) {
                copyOnWriteArrayList.remove(zztiVar);
            }
        }
    }

    public zztj() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
