package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzhno extends zzhnr {
    private final int zza;

    private zzhno(int i10) {
        this.zza = i10;
    }

    public static zzhno zzb(int i10) throws GeneralSecurityException {
        if (i10 == 16 || i10 == 32) {
            return new zzhno(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhno) && ((zzhno) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhno.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i10 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 34);
        sb.append("AesCmac PRF Parameters (");
        sb.append(i10);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
