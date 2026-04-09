package com.google.android.gms.internal.ads;

import N7.C1154e9;
import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzghm extends zzgfn {
    private final zzghr zza;
    private final zzgwt zzb;
    private final zzgws zzc;
    private final Integer zzd;

    private zzghm(zzghr zzghrVar, zzgwt zzgwtVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzghrVar;
        this.zzb = zzgwtVar;
        this.zzc = zzgwsVar;
        this.zzd = num;
    }

    public static zzghm zzc(zzghq zzghqVar, zzgwt zzgwtVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        zzghq zzghqVar2 = zzghq.zzc;
        if (zzghqVar != zzghqVar2 && num == null) {
            throw new GeneralSecurityException(C1154e9.i("For given Variant ", zzghqVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzghqVar == zzghqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwtVar.zza() != 32) {
            throw new GeneralSecurityException(C4356c.h(zzgwtVar.zza(), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzghr zzghrVarZzc = zzghr.zzc(zzghqVar);
        if (zzghrVarZzc.zzb() == zzghqVar2) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (zzghrVarZzc.zzb() == zzghq.zzb) {
            zzgwsVarZzb = zzgnn.zza(num.intValue());
        } else {
            if (zzghrVarZzc.zzb() != zzghq.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzghrVarZzc.zzb().toString()));
            }
            zzgwsVarZzb = zzgnn.zzb(num.intValue());
        }
        return new zzghm(zzghrVarZzc, zzgwtVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzc;
    }

    public final zzghr zzd() {
        return this.zza;
    }

    public final zzgwt zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
