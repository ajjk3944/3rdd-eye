package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgjf {
    private static final zzgnb zza = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgjd
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            return zzgjc.zzc((zzgjh) zzgfaVar, zzgwt.zzc(32), num);
        }
    };
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgje
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzglc.zzb((zzgjc) zzgenVar);
        }
    }, zzgjc.class, zzgeh.class);

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i = zzglh.zza;
        zzglh.zze(zzgnm.zzc());
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzgjb.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzgjb.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzgjb.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzgjb.zzj);
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnj.zza().zzc(zzb);
        zzgnc.zzb().zzc(zza, zzgjh.class);
    }
}
