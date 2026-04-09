package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfdn {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgdm zzc;

    public zzfdn(Callable callable, zzgdm zzgdmVar) {
        this.zzb = callable;
        this.zzc = zzgdmVar;
    }

    public final synchronized A4.a zza() {
        zzc(1);
        return (A4.a) this.zza.poll();
    }

    public final synchronized void zzb(A4.a aVar) {
        this.zza.addFirst(aVar);
    }

    public final synchronized void zzc(int i) {
        Deque deque = this.zza;
        int size = i - deque.size();
        for (int i10 = 0; i10 < size; i10++) {
            deque.add(this.zzc.zzb(this.zzb));
        }
    }
}
