package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzggm {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzggn zzd = zzggn.zzc;

    private zzggm() {
    }

    public final zzggm zza(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzggm zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzggm zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzggm zzd(zzggn zzggnVar) {
        this.zzd = zzggnVar;
        return this;
    }

    public final zzggp zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.getClass();
        return new zzggp(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    public /* synthetic */ zzggm(zzggo zzggoVar) {
    }
}
