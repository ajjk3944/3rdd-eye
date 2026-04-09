package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzggw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzggt
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgvr.zzb((zzggs) zzgenVar);
        }
    }, zzggs.class, zzgeh.class);
    private static final zzgeo zzc = zzgmn.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgeh.class, zzgtn.SYMMETRIC, zzgsm.zzg());
    private static final zzgnd zzd = new zzgnd() { // from class: com.google.android.gms.internal.ads.zzggu
    };
    private static final zzgnb zze = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzggv
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) throws GeneralSecurityException {
            zzgha zzghaVar = (zzgha) zzgfaVar;
            int i = zzggw.zza;
            if (zzghaVar.zzb() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzggq zzggqVar = new zzggq(null);
            zzggqVar.zzc(zzghaVar);
            zzggqVar.zza(num);
            zzggqVar.zzb(zzgwt.zzc(zzghaVar.zzb()));
            return zzggqVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i = zzf;
        if (!zzglu.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzgkf.zza;
        zzgkf.zze(zzgnm.zzc());
        zzgnj.zza().zzc(zzb);
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgjb.zza);
        zzggx zzggxVar = new zzggx(null);
        zzggxVar.zza(12);
        zzggxVar.zzb(16);
        zzggxVar.zzc(16);
        zzggy zzggyVar = zzggy.zzc;
        zzggxVar.zzd(zzggyVar);
        map.put("AES128_GCM_RAW", zzggxVar.zze());
        map.put("AES256_GCM", zzgjb.zzb);
        zzggx zzggxVar2 = new zzggx(null);
        zzggxVar2.zza(12);
        zzggxVar2.zzb(32);
        zzggxVar2.zzc(16);
        zzggxVar2.zzd(zzggyVar);
        map.put("AES256_GCM_RAW", zzggxVar2.zze());
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgne.zza().zzb(zzd, zzgha.class);
        zzgnc.zzb().zzc(zze, zzgha.class);
        zzgmd.zzc().zzf(zzc, i, true);
    }
}
