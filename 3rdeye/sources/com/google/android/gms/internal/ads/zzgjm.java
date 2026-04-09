package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgjm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgjj
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            zzgji zzgjiVar = (zzgji) zzgenVar;
            int i = zzgjm.zza;
            return zzgli.zzc() ? zzgli.zzb(zzgjiVar) : zzgwr.zzb(zzgjiVar);
        }
    }, zzgji.class, zzgeh.class);
    private static final zzgeo zzc = zzgmn.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgeh.class, zzgtn.SYMMETRIC, zzgvi.zzg());
    private static final zzgnd zzd = new zzgnd() { // from class: com.google.android.gms.internal.ads.zzgjk
    };
    private static final zzgnb zze = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgjl
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            int i = zzgjm.zza;
            return zzgji.zzc(((zzgjo) zzgfaVar).zzb(), zzgwt.zzc(32), num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgln.zza;
        zzgln.zze(zzgnm.zzc());
        zzgnj.zza().zzc(zzb);
        zzgni zzgniVarZzb = zzgni.zzb();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzgjo.zzc(zzgjn.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzgjo.zzc(zzgjn.zzc));
        zzgniVarZzb.zzd(Collections.unmodifiableMap(map));
        zzgnc.zzb().zzc(zze, zzgjo.class);
        zzgne.zza().zzb(zzd, zzgjo.class);
        zzgmd.zzc().zzd(zzc, true);
    }
}
