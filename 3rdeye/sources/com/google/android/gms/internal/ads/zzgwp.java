package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgwp implements zzgez {
    private static final byte[] zza = {0};
    private final zzgrc zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgwp(zzgpa zzgpaVar) throws GeneralSecurityException {
        this.zzb = new zzgwm(zzgpaVar.zze().zzd(zzgem.zza()));
        this.zzc = zzgpaVar.zzc().zzb();
        this.zzd = zzgpaVar.zzd().zzd();
        if (zzgpaVar.zzc().zzf().equals(zzgpg.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgez zza(zzgpa zzgpaVar) throws GeneralSecurityException {
        return new zzgwp(zzgpaVar);
    }

    public static zzgez zzb(zzgpp zzgppVar) throws GeneralSecurityException {
        return new zzgwp(zzgppVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzgvs.zzb(this.zzd, this.zzb.zza(zzgvs.zzb(bArr, bArr2), this.zzc)) : zzgvs.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgwp(zzgpp zzgppVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzgppVar.zzc().zzf());
        this.zzb = new zzgwo("HMAC".concat(strValueOf), new SecretKeySpec(zzgppVar.zze().zzd(zzgem.zza()), "HMAC"));
        this.zzc = zzgppVar.zzc().zzb();
        this.zzd = zzgppVar.zzd().zzd();
        if (zzgppVar.zzc().zzg().equals(zzgpx.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgwp(zzgrc zzgrcVar, int i) throws GeneralSecurityException {
        this.zzb = zzgrcVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgrcVar.zza(new byte[0], i);
    }
}
