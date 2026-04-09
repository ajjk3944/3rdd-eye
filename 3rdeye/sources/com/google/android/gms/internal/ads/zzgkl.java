package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgkl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgkh
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgkl.zzd((zzghl) zzgfaVar);
            }
        }, zzghl.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgki
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgkl.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgkj
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgkl.zzc((zzghd) zzgenVar, zzgfbVar);
            }
        }, zzghd.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgkk
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgkl.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzghd zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgss zzgssVarZzd = zzgss.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgssVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzghi zzghiVarZzc = zzghl.zzc();
            zzghiVarZzc.zza(zzgssVarZzd.zzf().zzd());
            zzghiVarZzc.zzb(zzf(zzgolVar.zzc()));
            zzghl zzghlVarZzc = zzghiVarZzc.zzc();
            zzghb zzghbVarZzc = zzghd.zzc();
            zzghbVarZzc.zzc(zzghlVarZzc);
            zzghbVarZzc.zzb(zzgwt.zzb(zzgssVarZzd.zzf().zzA(), zzgfbVar));
            zzghbVarZzc.zza(zzgolVar.zzf());
            return zzghbVarZzc.zzd();
        } catch (zzgzk unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzghl zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgsv zzgsvVarZzf = zzgsv.zzf(zzgomVar.zzc().zzh(), zzgyf.zza());
            if (zzgsvVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzghi zzghiVarZzc = zzghl.zzc();
            zzghiVarZzc.zza(zzgsvVarZzf.zza());
            zzghiVarZzc.zzb(zzf(zzgomVar.zzc().zzg()));
            return zzghiVarZzc.zzc();
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzghd zzghdVar, zzgfb zzgfbVar) {
        zzgsq zzgsqVarZzb = zzgss.zzb();
        byte[] bArrZzd = zzghdVar.zze().zzd(zzgfbVar);
        zzgsqVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgss) zzgsqVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzg(zzghdVar.zzd().zzd()), zzghdVar.zzf());
    }

    public static /* synthetic */ zzgom zzd(zzghl zzghlVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgst zzgstVarZzc = zzgsv.zzc();
        zzgstVarZzc.zza(zzghlVar.zzb());
        zzgtrVarZza.zzc(((zzgsv) zzgstVarZzc.zzbr()).zzaN());
        zzgtrVarZza.zza(zzg(zzghlVar.zzd()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzghj zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzghj.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzghj.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
            }
        }
        return zzghj.zzb;
    }

    private static zzgut zzg(zzghj zzghjVar) throws GeneralSecurityException {
        if (zzghj.zza.equals(zzghjVar)) {
            return zzgut.TINK;
        }
        if (zzghj.zzb.equals(zzghjVar)) {
            return zzgut.CRUNCHY;
        }
        if (zzghj.zzc.equals(zzghjVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzghjVar)));
    }
}
