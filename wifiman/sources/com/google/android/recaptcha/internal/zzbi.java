package com.google.android.recaptcha.internal;

import Ii.AbstractC3063k;
import Ii.AbstractC3077r0;
import Ii.C3048c0;
import Ii.N;
import Ii.O;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class zzbi {
    private final N zza = O.b();
    private final N zzb;
    private final N zzc;
    private final N zzd;

    public zzbi() {
        N nA = O.a(AbstractC3077r0.b(Executors.newSingleThreadExecutor()));
        AbstractC3063k.d(nA, null, null, new zzbh(null), 3, null);
        this.zzb = nA;
        this.zzc = O.a(C3048c0.b());
        N nA2 = O.a(AbstractC3077r0.b(Executors.newSingleThreadExecutor()));
        AbstractC3063k.d(nA2, null, null, new zzbg(null), 3, null);
        this.zzd = nA2;
    }

    public final N zza() {
        return this.zzc;
    }

    public final N zzb() {
        return this.zza;
    }

    public final N zzc() {
        return this.zzd;
    }

    public final N zzd() {
        return this.zzb;
    }
}
