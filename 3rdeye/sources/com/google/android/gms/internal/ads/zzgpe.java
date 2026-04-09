package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgpe {
    private static final zzgnb zza = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgpb
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            return zzgpe.zzb((zzgpi) zzgfaVar, num);
        }
    };
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgpc
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgpe.zzc((zzgpa) zzgenVar);
        }
    }, zzgpa.class, zzgpj.class);
    private static final zzgoe zzc = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgpd
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgpe.zza((zzgpa) zzgenVar);
        }
    }, zzgpa.class, zzgez.class);
    private static final zzgeo zzd = zzgmn.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgez.class, zzgtn.SYMMETRIC, zzgrf.zzh());

    public static /* synthetic */ zzgez zza(zzgpa zzgpaVar) throws GeneralSecurityException {
        zze(zzgpaVar.zzc());
        return zzgwp.zza(zzgpaVar);
    }

    public static /* synthetic */ zzgpa zzb(zzgpi zzgpiVar, Integer num) throws GeneralSecurityException {
        zze(zzgpiVar);
        zzgoy zzgoyVar = new zzgoy(null);
        zzgoyVar.zzc(zzgpiVar);
        zzgoyVar.zza(zzgwt.zzc(zzgpiVar.zzc()));
        zzgoyVar.zzb(num);
        return zzgoyVar.zzd();
    }

    public static /* synthetic */ zzgpj zzc(zzgpa zzgpaVar) throws GeneralSecurityException {
        zze(zzgpaVar.zzc());
        return new zzgqu(zzgpaVar);
    }

    public static void zzd(boolean z10) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzgqs.zza;
        zzgqs.zze(zzgnm.zzc());
        zzgnc.zzb().zzc(zza, zzgpi.class);
        zzgnj.zza().zzc(zzb);
        zzgnj.zza().zzc(zzc);
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        zzgpi zzgpiVar = zzgqn.zzc;
        map.put("AES_CMAC", zzgpiVar);
        map.put("AES256_CMAC", zzgpiVar);
        zzgpf zzgpfVar = new zzgpf(null);
        zzgpfVar.zza(32);
        zzgpfVar.zzb(16);
        zzgpfVar.zzc(zzgpg.zzd);
        map.put("AES256_CMAC_RAW", zzgpfVar.zzd());
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgmd.zzc().zzd(zzd, true);
    }

    private static void zze(zzgpi zzgpiVar) throws GeneralSecurityException {
        if (zzgpiVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
