package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgpu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgpq
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return new zzgqv((zzgpp) zzgenVar);
        }
    }, zzgpp.class, zzgpj.class);
    private static final zzgoe zzc = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgpr
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgwp.zzb((zzgpp) zzgenVar);
        }
    }, zzgpp.class, zzgez.class);
    private static final zzgeo zzd = zzgmn.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgez.class, zzgtn.SYMMETRIC, zzgtf.zzi());
    private static final zzgnd zze = new zzgnd() { // from class: com.google.android.gms.internal.ads.zzgps
    };
    private static final zzgnb zzf = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgpt
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            zzgpz zzgpzVar = (zzgpz) zzgfaVar;
            int i = zzgpu.zza;
            zzgpn zzgpnVar = new zzgpn(null);
            zzgpnVar.zzc(zzgpzVar);
            zzgpnVar.zzb(zzgwt.zzc(zzgpzVar.zzc()));
            zzgpnVar.zza(num);
            return zzgpnVar.zzd();
        }
    };
    private static final int zzg = 2;

    public static void zza(boolean z10) throws GeneralSecurityException {
        int i = zzg;
        if (!zzglu.zza(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzgra.zza;
        zzgra.zze(zzgnm.zzc());
        zzgnj.zza().zzc(zzb);
        zzgnj.zza().zzc(zzc);
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzgqn.zza);
        zzgpv zzgpvVar = new zzgpv(null);
        zzgpvVar.zzb(32);
        zzgpvVar.zzc(16);
        zzgpx zzgpxVar = zzgpx.zzd;
        zzgpvVar.zzd(zzgpxVar);
        zzgpw zzgpwVar = zzgpw.zzc;
        zzgpvVar.zza(zzgpwVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzgpvVar.zze());
        zzgpv zzgpvVar2 = new zzgpv(null);
        zzgpvVar2.zzb(32);
        zzgpvVar2.zzc(32);
        zzgpx zzgpxVar2 = zzgpx.zza;
        zzgpvVar2.zzd(zzgpxVar2);
        zzgpvVar2.zza(zzgpwVar);
        map.put("HMAC_SHA256_256BITTAG", zzgpvVar2.zze());
        zzgpv zzgpvVar3 = new zzgpv(null);
        zzgpvVar3.zzb(32);
        zzgpvVar3.zzc(32);
        zzgpvVar3.zzd(zzgpxVar);
        zzgpvVar3.zza(zzgpwVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzgpvVar3.zze());
        zzgpv zzgpvVar4 = new zzgpv(null);
        zzgpvVar4.zzb(64);
        zzgpvVar4.zzc(16);
        zzgpvVar4.zzd(zzgpxVar2);
        zzgpw zzgpwVar2 = zzgpw.zze;
        zzgpvVar4.zza(zzgpwVar2);
        map.put("HMAC_SHA512_128BITTAG", zzgpvVar4.zze());
        zzgpv zzgpvVar5 = new zzgpv(null);
        zzgpvVar5.zzb(64);
        zzgpvVar5.zzc(16);
        zzgpvVar5.zzd(zzgpxVar);
        zzgpvVar5.zza(zzgpwVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzgpvVar5.zze());
        zzgpv zzgpvVar6 = new zzgpv(null);
        zzgpvVar6.zzb(64);
        zzgpvVar6.zzc(32);
        zzgpvVar6.zzd(zzgpxVar2);
        zzgpvVar6.zza(zzgpwVar2);
        map.put("HMAC_SHA512_256BITTAG", zzgpvVar6.zze());
        zzgpv zzgpvVar7 = new zzgpv(null);
        zzgpvVar7.zzb(64);
        zzgpvVar7.zzc(32);
        zzgpvVar7.zzd(zzgpxVar);
        zzgpvVar7.zza(zzgpwVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzgpvVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzgqn.zzb);
        zzgpv zzgpvVar8 = new zzgpv(null);
        zzgpvVar8.zzb(64);
        zzgpvVar8.zzc(64);
        zzgpvVar8.zzd(zzgpxVar);
        zzgpvVar8.zza(zzgpwVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzgpvVar8.zze());
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnc.zzb().zzc(zzf, zzgpz.class);
        zzgne.zza().zzb(zze, zzgpz.class);
        zzgmd.zzc().zzf(zzd, i, true);
    }
}
