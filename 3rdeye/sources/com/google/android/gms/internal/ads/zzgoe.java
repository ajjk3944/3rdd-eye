package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgoe {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgoe(Class cls, Class cls2, zzgod zzgodVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgoe zzb(zzgoc zzgocVar, Class cls, Class cls2) {
        return new zzgob(cls, cls2, zzgocVar);
    }

    public abstract Object zza(zzgen zzgenVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
