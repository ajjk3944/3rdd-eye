package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgjy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgju
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgjy.zzd((zzggp) zzgfaVar);
            }
        }, zzggp.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgjv
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgjy.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgjw
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgjy.zzc((zzggi) zzgenVar, zzgfbVar);
            }
        }, zzggi.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgjx
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgjy.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzggi zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzgsd zzgsdVarZzd = zzgsd.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgsdVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzggm zzggmVarZzd = zzggp.zzd();
            zzggmVarZzd.zzb(zzgsdVarZzd.zzg().zzd());
            zzggmVarZzd.zza(zzgsdVarZzd.zzf().zza());
            zzggmVarZzd.zzc(16);
            zzggmVarZzd.zzd(zzf(zzgolVar.zzc()));
            zzggp zzggpVarZze = zzggmVarZzd.zze();
            zzggg zzgggVarZzc = zzggi.zzc();
            zzgggVarZzc.zzc(zzggpVarZze);
            zzgggVarZzc.zzb(zzgwt.zzb(zzgsdVarZzd.zzg().zzA(), zzgfbVar));
            zzgggVarZzc.zza(zzgolVar.zzf());
            return zzgggVarZzc.zzd();
        } catch (zzgzk unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzggp zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgsg zzgsgVarZzd = zzgsg.zzd(zzgomVar.zzc().zzh(), zzgyf.zza());
            zzggm zzggmVarZzd = zzggp.zzd();
            zzggmVarZzd.zzb(zzgsgVarZzd.zza());
            zzggmVarZzd.zza(zzgsgVarZzd.zzf().zza());
            zzggmVarZzd.zzc(16);
            zzggmVarZzd.zzd(zzf(zzgomVar.zzc().zzg()));
            return zzggmVarZzd.zze();
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzggi zzggiVar, zzgfb zzgfbVar) {
        zzgsb zzgsbVarZzb = zzgsd.zzb();
        zzgsbVarZzb.zzb(zzg(zzggiVar.zzd()));
        byte[] bArrZzd = zzggiVar.zze().zzd(zzgfbVar);
        zzgsbVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgsd) zzgsbVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzh(zzggiVar.zzd().zze()), zzggiVar.zzf());
    }

    public static /* synthetic */ zzgom zzd(zzggp zzggpVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgse zzgseVarZzb = zzgsg.zzb();
        zzgseVarZzb.zzb(zzg(zzggpVar));
        zzgseVarZzb.zza(zzggpVar.zzc());
        zzgtrVarZza.zzc(((zzgsg) zzgseVarZzb.zzbr()).zzaN());
        zzgtrVarZza.zza(zzh(zzggpVar.zze()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzggn zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzggn.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzggn.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzggn.zzb;
    }

    private static zzgsj zzg(zzggp zzggpVar) throws GeneralSecurityException {
        zzgsh zzgshVarZzb = zzgsj.zzb();
        zzgshVarZzb.zza(zzggpVar.zzb());
        return (zzgsj) zzgshVarZzb.zzbr();
    }

    private static zzgut zzh(zzggn zzggnVar) throws GeneralSecurityException {
        if (zzggn.zza.equals(zzggnVar)) {
            return zzgut.TINK;
        }
        if (zzggn.zzb.equals(zzggnVar)) {
            return zzgut.CRUNCHY;
        }
        if (zzggn.zzc.equals(zzggnVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggnVar)));
    }
}
