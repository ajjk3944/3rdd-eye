package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgnj {
    private static final zzgnj zza = new zzgnj();
    private final AtomicReference zzb = new AtomicReference(new zzgoj(new zzgog(null), null));

    public static zzgnj zza() {
        return zza;
    }

    public final Object zzb(zzgen zzgenVar, Class cls) throws GeneralSecurityException {
        return ((zzgoj) this.zzb.get()).zzb(zzgenVar, cls);
    }

    public final synchronized void zzc(zzgoe zzgoeVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgog zzgogVar = new zzgog((zzgoj) atomicReference.get(), null);
        zzgogVar.zza(zzgoeVar);
        atomicReference.set(new zzgoj(zzgogVar, null));
    }

    public final synchronized void zzd(zzgok zzgokVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzgog zzgogVar = new zzgog((zzgoj) atomicReference.get(), null);
        zzgogVar.zzb(zzgokVar);
        atomicReference.set(new zzgoj(zzgogVar, null));
    }
}
