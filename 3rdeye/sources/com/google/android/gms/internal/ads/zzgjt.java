package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgjt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgjp
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgjt.zzd((zzggf) zzgfaVar);
            }
        }, zzggf.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgjq
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgjt.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgjr
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgjt.zzc((zzgfw) zzgenVar, zzgfbVar);
            }
        }, zzgfw.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgjt.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzgfw zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgro zzgroVarZzd = zzgro.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgroVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgroVarZzd.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgroVarZzd.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzggb zzggbVarZzf = zzggf.zzf();
            zzggbVarZzf.zza(zzgroVarZzd.zzf().zzg().zzd());
            zzggbVarZzf.zzc(zzgroVarZzd.zzg().zzh().zzd());
            zzggbVarZzf.zzd(zzgroVarZzd.zzf().zzf().zza());
            zzggbVarZzf.zze(zzgroVarZzd.zzg().zzg().zza());
            zzggbVarZzf.zzb(zzf(zzgroVarZzd.zzg().zzg().zzb()));
            zzggbVarZzf.zzf(zzg(zzgolVar.zzc()));
            zzggf zzggfVarZzg = zzggbVarZzf.zzg();
            zzgfu zzgfuVarZzc = zzgfw.zzc();
            zzgfuVarZzc.zzd(zzggfVarZzg);
            zzgfuVarZzc.zza(zzgwt.zzb(zzgroVarZzd.zzf().zzg().zzA(), zzgfbVar));
            zzgfuVarZzc.zzb(zzgwt.zzb(zzgroVarZzd.zzg().zzh().zzA(), zzgfbVar));
            zzgfuVarZzc.zzc(zzgolVar.zzf());
            return zzgfuVarZzc.zze();
        } catch (zzgzk unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzggf zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgrr zzgrrVarZzc = zzgrr.zzc(zzgomVar.zzc().zzh(), zzgyf.zza());
            if (zzgrrVarZzc.zzf().zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzggb zzggbVarZzf = zzggf.zzf();
            zzggbVarZzf.zza(zzgrrVarZzc.zzd().zza());
            zzggbVarZzf.zzc(zzgrrVarZzc.zzf().zza());
            zzggbVarZzf.zzd(zzgrrVarZzc.zzd().zzf().zza());
            zzggbVarZzf.zze(zzgrrVarZzc.zzf().zzh().zza());
            zzggbVarZzf.zzb(zzf(zzgrrVarZzc.zzf().zzh().zzb()));
            zzggbVarZzf.zzf(zzg(zzgomVar.zzc().zzg()));
            return zzggbVarZzf.zzg();
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzgfw zzgfwVar, zzgfb zzgfbVar) {
        zzgrm zzgrmVarZzb = zzgro.zzb();
        zzgrs zzgrsVarZzb = zzgru.zzb();
        zzgry zzgryVarZzb = zzgsa.zzb();
        zzgryVarZzb.zza(zzgfwVar.zzd().zzd());
        zzgrsVarZzb.zzb((zzgsa) zzgryVarZzb.zzbr());
        byte[] bArrZzd = zzgfwVar.zze().zzd(zzgfbVar);
        zzgrsVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        zzgrmVarZzb.zza((zzgru) zzgrsVarZzb.zzbr());
        zzgtd zzgtdVarZzb = zzgtf.zzb();
        zzgtdVarZzb.zzb(zzh(zzgfwVar.zzd()));
        byte[] bArrZzd2 = zzgfwVar.zzf().zzd(zzgfbVar);
        zzgtdVarZzb.zza(zzgxn.zzv(bArrZzd2, 0, bArrZzd2.length));
        zzgrmVarZzb.zzb((zzgtf) zzgtdVarZzb.zzbr());
        return zzgol.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgro) zzgrmVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzi(zzgfwVar.zzd().zzh()), zzgfwVar.zzg());
    }

    public static /* synthetic */ zzgom zzd(zzggf zzggfVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgrp zzgrpVarZza = zzgrr.zza();
        zzgrv zzgrvVarZzb = zzgrx.zzb();
        zzgry zzgryVarZzb = zzgsa.zzb();
        zzgryVarZzb.zza(zzggfVar.zzd());
        zzgrvVarZzb.zzb((zzgsa) zzgryVarZzb.zzbr());
        zzgrvVarZzb.zza(zzggfVar.zzb());
        zzgrpVarZza.zza((zzgrx) zzgrvVarZzb.zzbr());
        zzgtg zzgtgVarZzc = zzgti.zzc();
        zzgtgVarZzc.zzb(zzh(zzggfVar));
        zzgtgVarZzc.zza(zzggfVar.zzc());
        zzgrpVarZza.zzb((zzgti) zzgtgVarZzc.zzbr());
        zzgtrVarZza.zzc(((zzgrr) zzgrpVarZza.zzbr()).zzaN());
        zzgtrVarZza.zza(zzi(zzggfVar.zzh()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzggc zzf(zzgtc zzgtcVar) throws GeneralSecurityException {
        int iOrdinal = zzgtcVar.ordinal();
        if (iOrdinal == 1) {
            return zzggc.zza;
        }
        if (iOrdinal == 2) {
            return zzggc.zzd;
        }
        if (iOrdinal == 3) {
            return zzggc.zzc;
        }
        if (iOrdinal == 4) {
            return zzggc.zze;
        }
        if (iOrdinal == 5) {
            return zzggc.zzb;
        }
        throw new GeneralSecurityException(C4356c.h(zzgtcVar.zza(), "Unable to parse HashType: "));
    }

    private static zzggd zzg(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzggd.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzggd.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzggd.zzb;
    }

    private static zzgtl zzh(zzggf zzggfVar) throws GeneralSecurityException {
        zzgtc zzgtcVar;
        zzgtj zzgtjVarZzc = zzgtl.zzc();
        zzgtjVarZzc.zzb(zzggfVar.zze());
        zzggc zzggcVarZzg = zzggfVar.zzg();
        if (zzggc.zza.equals(zzggcVarZzg)) {
            zzgtcVar = zzgtc.SHA1;
        } else if (zzggc.zzb.equals(zzggcVarZzg)) {
            zzgtcVar = zzgtc.SHA224;
        } else if (zzggc.zzc.equals(zzggcVarZzg)) {
            zzgtcVar = zzgtc.SHA256;
        } else if (zzggc.zzd.equals(zzggcVarZzg)) {
            zzgtcVar = zzgtc.SHA384;
        } else {
            if (!zzggc.zze.equals(zzggcVarZzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzggcVarZzg)));
            }
            zzgtcVar = zzgtc.SHA512;
        }
        zzgtjVarZzc.zza(zzgtcVar);
        return (zzgtl) zzgtjVarZzc.zzbr();
    }

    private static zzgut zzi(zzggd zzggdVar) throws GeneralSecurityException {
        if (zzggd.zza.equals(zzggdVar)) {
            return zzgut.TINK;
        }
        if (zzggd.zzb.equals(zzggdVar)) {
            return zzgut.CRUNCHY;
        }
        if (zzggd.zzc.equals(zzggdVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggdVar)));
    }
}
