package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzghh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzghe
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzglq.zzb((zzghd) zzgenVar);
        }
    }, zzghd.class, zzgeh.class);
    private static final zzgnb zzc = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzghf
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            zzghl zzghlVar = (zzghl) zzgfaVar;
            int i = zzghh.zza;
            zzghb zzghbVar = new zzghb(null);
            zzghbVar.zzc(zzghlVar);
            zzghbVar.zza(num);
            zzghbVar.zzb(zzgwt.zzc(zzghlVar.zzb()));
            return zzghbVar.zzd();
        }
    };
    private static final zzgnd zzd = new zzgnd() { // from class: com.google.android.gms.internal.ads.zzghg
    };
    private static final zzgeo zze = zzgmn.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgeh.class, zzgtn.SYMMETRIC, zzgss.zzg());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzgkl.zza;
        zzgkl.zze(zzgnm.zzc());
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        zzghi zzghiVar = new zzghi(null);
        zzghiVar.zza(16);
        zzghj zzghjVar = zzghj.zza;
        zzghiVar.zzb(zzghjVar);
        map.put("AES128_GCM_SIV", zzghiVar.zzc());
        zzghi zzghiVar2 = new zzghi(null);
        zzghiVar2.zza(16);
        zzghj zzghjVar2 = zzghj.zzc;
        zzghiVar2.zzb(zzghjVar2);
        map.put("AES128_GCM_SIV_RAW", zzghiVar2.zzc());
        zzghi zzghiVar3 = new zzghi(null);
        zzghiVar3.zza(32);
        zzghiVar3.zzb(zzghjVar);
        map.put("AES256_GCM_SIV", zzghiVar3.zzc());
        zzghi zzghiVar4 = new zzghi(null);
        zzghiVar4.zza(32);
        zzghiVar4.zzb(zzghjVar2);
        map.put("AES256_GCM_SIV_RAW", zzghiVar4.zzc());
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgne.zza().zzb(zzd, zzghl.class);
        zzgnc.zzb().zzc(zzc, zzghl.class);
        zzgnj.zza().zzc(zzb);
        zzgmd.zzc().zzd(zze, true);
    }
}
