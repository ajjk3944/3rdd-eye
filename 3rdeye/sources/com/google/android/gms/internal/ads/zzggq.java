package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzggq {
    private zzgha zza = null;
    private zzgwt zzb = null;
    private Integer zzc = null;

    private zzggq() {
    }

    public final zzggq zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggq zzb(zzgwt zzgwtVar) {
        this.zzb = zzgwtVar;
        return this;
    }

    public final zzggq zzc(zzgha zzghaVar) {
        this.zza = zzghaVar;
        return this;
    }

    public final zzggs zzd() throws GeneralSecurityException {
        zzgwt zzgwtVar;
        zzgws zzgwsVarZzb;
        zzgha zzghaVar = this.zza;
        if (zzghaVar == null || (zzgwtVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzghaVar.zzb() != zzgwtVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzghaVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzggy.zzc) {
            zzgwsVarZzb = zzgnn.zza;
        } else if (this.zza.zzd() == zzggy.zzb) {
            zzgwsVarZzb = zzgnn.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzggy.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzgwsVarZzb = zzgnn.zzb(this.zzc.intValue());
        }
        return new zzggs(this.zza, this.zzb, zzgwsVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzggq(zzggr zzggrVar) {
    }
}
