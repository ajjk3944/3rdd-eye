package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgig {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgic
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgig.zzd((zzgib) zzgfaVar);
            }
        }, zzgib.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgid
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgig.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgie
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgig.zzc((zzghz) zzgenVar, zzgfbVar);
            }
        }, zzghz.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgif
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgig.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzghz zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzguj zzgujVarZzd = zzguj.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgujVarZzd.zza() == 0) {
                return zzghz.zzc(zzgib.zzc(zzgujVarZzd.zzf().zzf(), zzf(zzgolVar.zzc())), zzgolVar.zzf());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzgujVarZzd)));
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e4);
        }
    }

    public static /* synthetic */ zzgib zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            return zzgib.zzc(zzgum.zzd(zzgomVar.zzc().zzh(), zzgyf.zza()).zzf(), zzf(zzgomVar.zzc().zzg()));
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzghz zzghzVar, zzgfb zzgfbVar) {
        zzguh zzguhVarZzb = zzguj.zzb();
        zzguk zzgukVarZza = zzgum.zza();
        zzgukVarZza.zza(zzghzVar.zzd().zzd());
        zzguhVarZzb.zza((zzgum) zzgukVarZza.zzbr());
        return zzgol.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzguj) zzguhVarZzb.zzbr()).zzaN(), zzgtn.REMOTE, zzg(zzghzVar.zzd().zzb()), zzghzVar.zze());
    }

    public static /* synthetic */ zzgom zzd(zzgib zzgibVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzguk zzgukVarZza = zzgum.zza();
        zzgukVarZza.zza(zzgibVar.zzd());
        zzgtrVarZza.zzc(((zzgum) zzgukVarZza.zzbr()).zzaN());
        zzgtrVarZza.zza(zzg(zzgibVar.zzb()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzgia zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzgia.zza;
        }
        if (iOrdinal == 3) {
            return zzgia.zzb;
        }
        throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgut zzg(zzgia zzgiaVar) throws GeneralSecurityException {
        if (zzgia.zza.equals(zzgiaVar)) {
            return zzgut.TINK;
        }
        if (zzgia.zzb.equals(zzgiaVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgiaVar.toString()));
    }
}
