package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzghu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzghs
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            zzghz zzghzVar = (zzghz) zzgenVar;
            int i = zzghu.zza;
            return zzgla.zzc(zzgey.zza(zzghzVar.zzd().zzd()).zzb(), zzghzVar.zzb());
        }
    }, zzghz.class, zzgeh.class);
    private static final zzgeo zzc = zzgmn.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgeh.class, zzgtn.REMOTE, zzguj.zzg());
    private static final zzgnb zzd = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzght
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) {
            int i = zzghu.zza;
            return zzghz.zzc((zzgib) zzgfaVar, num);
        }
    };

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzglu.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzgig.zza;
        zzgig.zze(zzgnm.zzc());
        zzgnj.zza().zzc(zzb);
        zzgnc.zzb().zzc(zzd, zzgib.class);
        zzgmd.zzc().zzd(zzc, true);
    }
}
