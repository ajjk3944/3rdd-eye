package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgmh {
    private final zzgws zza;
    private final Class zzb;

    public /* synthetic */ zzgmh(zzgws zzgwsVar, Class cls, zzgmg zzgmgVar) {
        this.zza = zzgwsVar;
        this.zzb = cls;
    }

    public static zzgmh zzb(zzgmf zzgmfVar, zzgws zzgwsVar, Class cls) {
        return new zzgme(zzgwsVar, cls, zzgmfVar);
    }

    public abstract zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) throws GeneralSecurityException;

    public final zzgws zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
