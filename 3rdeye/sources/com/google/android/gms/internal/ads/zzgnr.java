package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgnr {
    private final zzgws zza;
    private final Class zzb;

    public /* synthetic */ zzgnr(zzgws zzgwsVar, Class cls, zzgnq zzgnqVar) {
        this.zza = zzgwsVar;
        this.zzb = cls;
    }

    public static zzgnr zzb(zzgnp zzgnpVar, zzgws zzgwsVar, Class cls) {
        return new zzgno(zzgwsVar, cls, zzgnpVar);
    }

    public abstract zzgfa zza(zzgop zzgopVar) throws GeneralSecurityException;

    public final zzgws zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
