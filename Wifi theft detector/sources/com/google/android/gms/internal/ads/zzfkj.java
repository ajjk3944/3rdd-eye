package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class zzfkj {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgzy zzc;

    public zzfkj(Callable callable, zzgzy zzgzyVar) {
        this.zzb = callable;
        this.zzc = zzgzyVar;
    }

    public final synchronized void zza(int i10) {
        Deque deque = this.zza;
        int size = i10 - deque.size();
        for (int i11 = 0; i11 < size; i11++) {
            deque.add(this.zzc.zzc(this.zzb));
        }
    }

    @Nullable
    public final synchronized com.google.common.util.concurrent.a zzb() {
        zza(1);
        return (com.google.common.util.concurrent.a) this.zza.poll();
    }

    public final synchronized void zzc(com.google.common.util.concurrent.a aVar) {
        this.zza.addFirst(aVar);
    }
}
