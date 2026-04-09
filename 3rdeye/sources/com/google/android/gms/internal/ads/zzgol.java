package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgol implements zzgop {
    private final String zza;
    private final zzgws zzb;
    private final zzgxn zzc;
    private final zzgtn zzd;
    private final zzgut zze;
    private final Integer zzf;

    private zzgol(String str, zzgws zzgwsVar, zzgxn zzgxnVar, zzgtn zzgtnVar, zzgut zzgutVar, Integer num) {
        this.zza = str;
        this.zzb = zzgwsVar;
        this.zzc = zzgxnVar;
        this.zzd = zzgtnVar;
        this.zze = zzgutVar;
        this.zzf = num;
    }

    public static zzgol zza(String str, zzgxn zzgxnVar, zzgtn zzgtnVar, zzgut zzgutVar, Integer num) throws GeneralSecurityException {
        if (zzgutVar == zzgut.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgol(str, zzgox.zza(str), zzgxnVar, zzgtnVar, zzgutVar, num);
    }

    public final zzgtn zzb() {
        return this.zzd;
    }

    public final zzgut zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final zzgws zzd() {
        return this.zzb;
    }

    public final zzgxn zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
