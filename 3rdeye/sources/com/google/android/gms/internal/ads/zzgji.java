package com.google.android.gms.internal.ads;

import N7.C1154e9;
import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgji extends zzgfn {
    private final zzgjo zza;
    private final zzgwt zzb;
    private final zzgws zzc;
    private final Integer zzd;

    private zzgji(zzgjo zzgjoVar, zzgwt zzgwtVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzgjoVar;
        this.zzb = zzgwtVar;
        this.zzc = zzgwsVar;
        this.zzd = num;
    }

    public static zzgji zzc(zzgjn zzgjnVar, zzgwt zzgwtVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        zzgjn zzgjnVar2 = zzgjn.zzc;
        if (zzgjnVar != zzgjnVar2 && num == null) {
            throw new GeneralSecurityException(C1154e9.i("For given Variant ", zzgjnVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgjnVar == zzgjnVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgwtVar.zza() != 32) {
            throw new GeneralSecurityException(C4356c.h(zzgwtVar.zza(), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzgjo zzgjoVarZzc = zzgjo.zzc(zzgjnVar);
        if (zzgjoVarZzc.zzb() == zzgjnVar2) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (zzgjoVarZzc.zzb() == zzgjn.zzb) {
            zzgwsVarZzb = zzgnn.zza(num.intValue());
        } else {
            if (zzgjoVarZzc.zzb() != zzgjn.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgjoVarZzc.zzb().toString()));
            }
            zzgwsVarZzb = zzgnn.zzb(num.intValue());
        }
        return new zzgji(zzgjoVarZzc, zzgwtVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzc;
    }

    public final zzgjo zzd() {
        return this.zza;
    }

    public final zzgwt zze() {
        return this.zzb;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
