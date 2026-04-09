package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgks {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgko
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgks.zzd((zzghr) zzgfaVar);
            }
        }, zzghr.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgkp
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgks.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgkq
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgks.zzc((zzghm) zzgenVar, zzgfbVar);
            }
        }, zzghm.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgkr
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgks.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzghm zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzgsy zzgsyVarZzd = zzgsy.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgsyVarZzd.zza() == 0) {
                return zzghm.zzc(zzf(zzgolVar.zzc()), zzgwt.zzb(zzgsyVarZzd.zzf().zzA(), zzgfbVar), zzgolVar.zzf());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzgzk unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzghr zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgtb.zzc(zzgomVar.zzc().zzh(), zzgyf.zza());
            return zzghr.zzc(zzf(zzgomVar.zzc().zzg()));
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzghm zzghmVar, zzgfb zzgfbVar) {
        zzgsw zzgswVarZzb = zzgsy.zzb();
        byte[] bArrZzd = zzghmVar.zze().zzd(zzgfbVar);
        zzgswVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgsy) zzgswVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzg(zzghmVar.zzd().zzb()), zzghmVar.zzf());
    }

    public static /* synthetic */ zzgom zzd(zzghr zzghrVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzgtrVarZza.zzc(zzgtb.zzb().zzaN());
        zzgtrVarZza.zza(zzg(zzghrVar.zzb()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzghq zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzghq.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzghq.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzghq.zzb;
    }

    private static zzgut zzg(zzghq zzghqVar) throws GeneralSecurityException {
        if (zzghq.zza.equals(zzghqVar)) {
            return zzgut.TINK;
        }
        if (zzghq.zzb.equals(zzghqVar)) {
            return zzgut.CRUNCHY;
        }
        if (zzghq.zzc.equals(zzghqVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghqVar.toString()));
    }
}
