package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgga {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfx
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgvu.zzb((zzgfw) zzgenVar);
        }
    }, zzgfw.class, zzgeh.class);
    private static final zzgeo zzc = zzgmn.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgeh.class, zzgtn.SYMMETRIC, zzgro.zzh());
    private static final zzgnd zzd = new zzgnd() { // from class: com.google.android.gms.internal.ads.zzgfy
    };
    private static final zzgnb zze = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgfz
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) throws GeneralSecurityException {
            zzggf zzggfVar = (zzggf) zzgfaVar;
            int i = zzgga.zza;
            if (zzggfVar.zzb() != 16 && zzggfVar.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzgfu zzgfuVar = new zzgfu(null);
            zzgfuVar.zzd(zzggfVar);
            zzgfuVar.zzc(num);
            zzgfuVar.zza(zzgwt.zzc(zzggfVar.zzb()));
            zzgfuVar.zzb(zzgwt.zzc(zzggfVar.zzc()));
            return zzgfuVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i = zzf;
        if (!zzglu.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzgjt.zza;
        zzgjt.zze(zzgnm.zzc());
        zzgnj.zza().zzc(zzb);
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzgjb.zze);
        zzggb zzggbVar = new zzggb(null);
        zzggbVar.zza(16);
        zzggbVar.zzc(32);
        zzggbVar.zze(16);
        zzggbVar.zzd(16);
        zzggc zzggcVar = zzggc.zzc;
        zzggbVar.zzb(zzggcVar);
        zzggd zzggdVar = zzggd.zzc;
        zzggbVar.zzf(zzggdVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzggbVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzgjb.zzf);
        zzggb zzggbVar2 = new zzggb(null);
        zzggbVar2.zza(32);
        zzggbVar2.zzc(32);
        zzggbVar2.zze(32);
        zzggbVar2.zzd(16);
        zzggbVar2.zzb(zzggcVar);
        zzggbVar2.zzf(zzggdVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzggbVar2.zzg());
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgne.zza().zzb(zzd, zzggf.class);
        zzgnc.zzb().zzc(zze, zzggf.class);
        zzgmd.zzc().zzf(zzc, i, true);
    }
}
