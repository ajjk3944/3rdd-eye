package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgml {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgml(Class cls, Class cls2, zzgmk zzgmkVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgml zzb(zzgmj zzgmjVar, Class cls, Class cls2) {
        return new zzgmi(cls, cls2, zzgmjVar);
    }

    public abstract zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
