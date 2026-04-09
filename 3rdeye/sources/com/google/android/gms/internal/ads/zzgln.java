package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgln {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzglj
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgln.zzd((zzgjo) zzgfaVar);
            }
        }, zzgjo.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzglk
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgln.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgll
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgln.zzc((zzgji) zzgenVar, zzgfbVar);
            }
        }, zzgji.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzglm
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgln.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzgji zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgvi zzgviVarZzd = zzgvi.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgviVarZzd.zza() == 0) {
                return zzgji.zzc(zzf(zzgolVar.zzc()), zzgwt.zzb(zzgviVarZzd.zzf().zzA(), zzgfbVar), zzgolVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgzk unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzgjo zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            if (zzgvl.zzd(zzgomVar.zzc().zzh(), zzgyf.zza()).zza() == 0) {
                return zzgjo.zzc(zzf(zzgomVar.zzc().zzg()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzgji zzgjiVar, zzgfb zzgfbVar) {
        zzgvg zzgvgVarZzb = zzgvi.zzb();
        byte[] bArrZzd = zzgjiVar.zze().zzd(zzgfbVar);
        zzgvgVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgvi) zzgvgVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzg(zzgjiVar.zzd().zzb()), zzgjiVar.zzf());
    }

    public static /* synthetic */ zzgom zzd(zzgjo zzgjoVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgtrVarZza.zzc(zzgvl.zzc().zzaN());
        zzgtrVarZza.zza(zzg(zzgjoVar.zzb()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzgjn zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzgjn.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgjn.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzgjn.zzb;
    }

    private static zzgut zzg(zzgjn zzgjnVar) throws GeneralSecurityException {
        if (zzgjn.zza.equals(zzgjnVar)) {
            return zzgut.TINK;
        }
        if (zzgjn.zzb.equals(zzgjnVar)) {
            return zzgut.CRUNCHY;
        }
        if (zzgjn.zzc.equals(zzgjnVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgjnVar.toString()));
    }
}
