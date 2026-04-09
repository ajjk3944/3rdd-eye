package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgih extends zzgfn {
    private final zzgim zza;
    private final zzgws zzb;
    private final Integer zzc;

    private zzgih(zzgim zzgimVar, zzgws zzgwsVar, Integer num) {
        this.zza = zzgimVar;
        this.zzb = zzgwsVar;
        this.zzc = num;
    }

    public static zzgih zzc(zzgim zzgimVar, Integer num) throws GeneralSecurityException {
        zzgws zzgwsVarZzb;
        if (zzgimVar.zzc() == zzgik.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzgwsVarZzb = zzgnn.zza;
        } else {
            if (zzgimVar.zzc() != zzgik.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgimVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzgwsVarZzb = zzgnn.zzb(num.intValue());
        }
        return new zzgih(zzgimVar, zzgwsVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgfn, com.google.android.gms.internal.ads.zzgen
    public final /* synthetic */ zzgfa zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfn
    public final zzgws zzb() {
        return this.zzb;
    }

    public final zzgim zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
