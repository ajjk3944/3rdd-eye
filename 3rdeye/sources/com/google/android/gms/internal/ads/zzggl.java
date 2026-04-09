package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzggl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzggj
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgvq.zzb((zzggi) zzgenVar);
        }
    }, zzggi.class, zzgeh.class);
    private static final zzgeo zzc = zzgmn.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgeh.class, zzgtn.SYMMETRIC, zzgsd.zzh());
    private static final zzgnb zzd = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzggk
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) throws GeneralSecurityException {
            zzggp zzggpVar = (zzggp) zzgfaVar;
            int i = zzggl.zza;
            if (zzggpVar.zzc() == 24) {
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
            zzggg zzgggVar = new zzggg(null);
            zzgggVar.zzc(zzggpVar);
            zzgggVar.zza(num);
            zzgggVar.zzb(zzgwt.zzc(zzggpVar.zzc()));
            return zzgggVar.zzd();
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzgjy.zza;
        zzgjy.zze(zzgnm.zzc());
        zzgnj.zza().zzc(zzb);
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzgjb.zzc);
        zzggm zzggmVar = new zzggm(null);
        zzggmVar.zza(16);
        zzggmVar.zzb(16);
        zzggmVar.zzc(16);
        zzggn zzggnVar = zzggn.zzc;
        zzggmVar.zzd(zzggnVar);
        map.put("AES128_EAX_RAW", zzggmVar.zze());
        map.put("AES256_EAX", zzgjb.zzd);
        zzggm zzggmVar2 = new zzggm(null);
        zzggmVar2.zza(16);
        zzggmVar2.zzb(32);
        zzggmVar2.zzc(16);
        zzggmVar2.zzd(zzggnVar);
        map.put("AES256_EAX_RAW", zzggmVar2.zze());
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnc.zzb().zzc(zzd, zzggp.class);
        zzgmd.zzc().zzd(zzc, true);
    }
}
