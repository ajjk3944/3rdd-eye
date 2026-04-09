package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgcd extends zzgcc {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgcg.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgcg.class, "remainingField");

    private zzgcd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final int zza(zzgcg zzgcgVar) {
        return zzb.decrementAndGet(zzgcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final void zzb(zzgcg zzgcgVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzgcgVar, null, set2)) {
            if (atomicReferenceFieldUpdater.get(zzgcgVar) != null && atomicReferenceFieldUpdater.get(zzgcgVar) != null) {
                return;
            }
        }
    }

    public /* synthetic */ zzgcd(zzgcf zzgcfVar) {
        super(null);
    }
}
