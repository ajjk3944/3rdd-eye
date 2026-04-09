package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgpn {
    private zzgpz zza = null;
    private zzgwt zzb = null;
    private Integer zzc = null;

    private zzgpn() {
    }

    public final zzgpn zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpn zzb(zzgwt zzgwtVar) {
        this.zzb = zzgwtVar;
        return this;
    }

    public final zzgpn zzc(zzgpz zzgpzVar) {
        this.zza = zzgpzVar;
        return this;
    }

    public final zzgpp zzd() throws GeneralSecurityException {
        zzgwt zzgwtVar;
        zzgws zzgwsVarZza;
        zzgpz zzgpzVar = this.zza;
        if (zzgpzVar == null || (zzgwtVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgpzVar.zzc() != zzgwtVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgpzVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgpx.zzd) {
            zzgwsVarZza = zzgnn.zza;
        } else if (this.zza.zzg() == zzgpx.zzc || this.zza.zzg() == zzgpx.zzb) {
            zzgwsVarZza = zzgnn.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzg() != zzgpx.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zzgwsVarZza = zzgnn.zzb(this.zzc.intValue());
        }
        return new zzgpp(this.zza, this.zzb, zzgwsVarZza, this.zzc, null);
    }

    public /* synthetic */ zzgpn(zzgpo zzgpoVar) {
    }
}
