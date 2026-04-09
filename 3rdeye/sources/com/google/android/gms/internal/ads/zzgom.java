package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgom implements zzgop {
    private final zzgws zza;
    private final zzgtt zzb;

    private zzgom(zzgtt zzgttVar, zzgws zzgwsVar) {
        this.zzb = zzgttVar;
        this.zza = zzgwsVar;
    }

    public static zzgom zza(zzgtt zzgttVar) throws GeneralSecurityException {
        return new zzgom(zzgttVar, zzgox.zza(zzgttVar.zzi()));
    }

    public static zzgom zzb(zzgtt zzgttVar) {
        return new zzgom(zzgttVar, zzgox.zzb(zzgttVar.zzi()));
    }

    public final zzgtt zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final zzgws zzd() {
        return this.zza;
    }
}
