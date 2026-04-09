package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgnv {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgnv(Class cls, Class cls2, zzgnu zzgnuVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgnv zzb(zzgnt zzgntVar, Class cls, Class cls2) {
        return new zzgns(cls, cls2, zzgntVar);
    }

    public abstract zzgop zza(zzgfa zzgfaVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
