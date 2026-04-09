package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbp;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzgcg extends zzgbp.zzf {
    private static final zzgcc zzbg;
    private static final zzgdk zzbh = new zzgdk(zzgcg.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzgcc zzgceVar;
        zzgcf zzgcfVar = null;
        try {
            zzgceVar = new zzgcd(zzgcfVar);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgceVar = new zzgce(zzgcfVar);
        }
        zzbg = zzgceVar;
        if (th != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgcg(int i) {
        this.remainingField = i;
    }

    public final int zzB() {
        return zzbg.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzw(setNewSetFromMap);
        zzbg.zzb(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public abstract void zzw(Set set);
}
