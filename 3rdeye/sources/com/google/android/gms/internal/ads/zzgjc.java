package com.google.android.gms.internal.ads;

import N7.C1154e9;
import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgjc extends zzgfn {
    private final zzgjh zza;
    private final zzgwt zzb;
    private final zzgws zzc;
    private final Integer zzd;

    private zzgjc(zzgjh zzgjhVar, zzgwt zzgwtVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzgjhVar;
        this.zzb = zzgwtVar;
        this.zzc = zzgwsVar;
        this.zzd = num;
    }

    public static zzgjc zzc(zzgjh zzgjhVar, zzgwt zzgwtVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        zzgjg zzgjgVarZzc = zzgjhVar.zzc();
        zzgjg zzgjgVar = zzgjg.zzb;
        if (zzgjgVarZzc != zzgjgVar && num == null) {
            throw new GeneralSecurityException(C1154e9.i("For given Variant ", zzgjhVar.zzc().toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgjhVar.zzc() == zzgjgVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwtVar.zza() != 32) {
            throw new GeneralSecurityException(C4356c.h(zzgwtVar.zza(), "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (zzgjhVar.zzc() == zzgjgVar) {
            zzgwsVarZzb = zzgnn.zza;
        } else {
            if (zzgjhVar.zzc() != zzgjg.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgjhVar.zzc().toString()));
            }
            zzgwsVarZzb = zzgnn.zzb(num.intValue());
        }
        return new zzgjc(zzgjhVar, zzgwtVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzc;
    }

    public final zzgjh zzd() {
        return this.zza;
    }

    public final zzgwt zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
