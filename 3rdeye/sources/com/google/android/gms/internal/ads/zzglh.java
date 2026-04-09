package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzglh {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzglh.zzd((zzgjh) zzgfaVar);
            }
        }, zzgjh.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgle
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzglh.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzglf
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzglh.zzc((zzgjc) zzgenVar, zzgfbVar);
            }
        }, zzgjc.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzglg
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzglh.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzgjc zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzguz zzguzVarZzd = zzguz.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzguzVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzguzVarZzd.zzg().zzd() == 32) {
                return zzgjc.zzc(zzgjh.zzd(zzf(zzgolVar.zzc()), zzguzVarZzd.zzf().zza()), zzgwt.zzb(zzguzVarZzd.zzg().zzA(), zzgfbVar), zzgolVar.zzf());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzgzk unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgjh zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgvc zzgvcVarZzd = zzgvc.zzd(zzgomVar.zzc().zzh(), zzgyf.zza());
            if (zzgvcVarZzd.zza() == 0) {
                return zzgjh.zzd(zzf(zzgomVar.zzc().zzg()), zzgvcVarZzd.zzf().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzgjc zzgjcVar, zzgfb zzgfbVar) {
        zzgux zzguxVarZzb = zzguz.zzb();
        byte[] bArrZzd = zzgjcVar.zze().zzd(zzgfbVar);
        zzguxVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        zzgvd zzgvdVarZzb = zzgvf.zzb();
        zzgvdVarZzb.zza(zzgjcVar.zzd().zzb());
        zzguxVarZzb.zzb((zzgvf) zzgvdVarZzb.zzbr());
        return zzgol.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzguz) zzguxVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzg(zzgjcVar.zzd().zzc()), zzgjcVar.zzf());
    }

    public static /* synthetic */ zzgom zzd(zzgjh zzgjhVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgva zzgvaVarZzb = zzgvc.zzb();
        zzgvd zzgvdVarZzb = zzgvf.zzb();
        zzgvdVarZzb.zza(zzgjhVar.zzb());
        zzgvaVarZzb.zza((zzgvf) zzgvdVarZzb.zzbr());
        zzgtrVarZza.zzc(((zzgvc) zzgvaVarZzb.zzbr()).zzaN());
        zzgtrVarZza.zza(zzg(zzgjhVar.zzc()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzgjg zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzgjg.zza;
        }
        if (iOrdinal == 3) {
            return zzgjg.zzb;
        }
        throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgut zzg(zzgjg zzgjgVar) throws GeneralSecurityException {
        if (Objects.equals(zzgjgVar, zzgjg.zza)) {
            return zzgut.TINK;
        }
        if (Objects.equals(zzgjgVar, zzgjg.zzb)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjgVar.toString()));
    }
}
