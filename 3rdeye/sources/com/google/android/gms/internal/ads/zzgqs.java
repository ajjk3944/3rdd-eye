package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgqs {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgqo
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgqs.zzb((zzgpi) zzgfaVar);
            }
        }, zzgpi.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgqp
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgqs.zzd((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgqq
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgqs.zza((zzgpa) zzgenVar, zzgfbVar);
            }
        }, zzgpa.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgqr
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgqs.zzc((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzgol zza(zzgpa zzgpaVar, zzgfb zzgfbVar) {
        zzgrd zzgrdVarZzb = zzgrf.zzb();
        zzgrdVarZzb.zzb(zzg(zzgpaVar.zzc()));
        byte[] bArrZzd = zzgpaVar.zze().zzd(zzgfbVar);
        zzgrdVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgrf) zzgrdVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, zzh(zzgpaVar.zzc().zzf()), zzgpaVar.zzf());
    }

    public static /* synthetic */ zzgom zzb(zzgpi zzgpiVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgrg zzgrgVarZzb = zzgri.zzb();
        zzgrgVarZzb.zzb(zzg(zzgpiVar));
        zzgrgVarZzb.zza(zzgpiVar.zzc());
        zzgtrVarZza.zzc(((zzgri) zzgrgVarZzb.zzbr()).zzaN());
        zzgtrVarZza.zza(zzh(zzgpiVar.zzf()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static /* synthetic */ zzgpa zzc(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzgrf zzgrfVarZzd = zzgrf.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgrfVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgpf zzgpfVarZze = zzgpi.zze();
            zzgpfVarZze.zza(zzgrfVarZzd.zzg().zzd());
            zzgpfVarZze.zzb(zzgrfVarZzd.zzf().zza());
            zzgpfVarZze.zzc(zzf(zzgolVar.zzc()));
            zzgpi zzgpiVarZzd = zzgpfVarZze.zzd();
            zzgoy zzgoyVarZzb = zzgpa.zzb();
            zzgoyVarZzb.zzc(zzgpiVarZzd);
            zzgoyVarZzb.zza(zzgwt.zzb(zzgrfVarZzd.zzg().zzA(), zzgfbVar));
            zzgoyVarZzb.zzb(zzgolVar.zzf());
            return zzgoyVarZzb.zzd();
        } catch (zzgzk | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgpi zzd(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgri zzgriVarZzd = zzgri.zzd(zzgomVar.zzc().zzh(), zzgyf.zza());
            zzgpf zzgpfVarZze = zzgpi.zze();
            zzgpfVarZze.zza(zzgriVarZzd.zza());
            zzgpfVarZze.zzb(zzgriVarZzd.zzf().zza());
            zzgpfVarZze.zzc(zzf(zzgomVar.zzc().zzg()));
            return zzgpfVarZze.zzd();
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e4);
        }
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzgpg zzf(zzgut zzgutVar) throws GeneralSecurityException {
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            return zzgpg.zza;
        }
        if (iOrdinal == 2) {
            return zzgpg.zzc;
        }
        if (iOrdinal == 3) {
            return zzgpg.zzd;
        }
        if (iOrdinal == 4) {
            return zzgpg.zzb;
        }
        throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzgrl zzg(zzgpi zzgpiVar) {
        zzgrj zzgrjVarZzb = zzgrl.zzb();
        zzgrjVarZzb.zza(zzgpiVar.zzb());
        return (zzgrl) zzgrjVarZzb.zzbr();
    }

    private static zzgut zzh(zzgpg zzgpgVar) throws GeneralSecurityException {
        if (zzgpg.zza.equals(zzgpgVar)) {
            return zzgut.TINK;
        }
        if (zzgpg.zzb.equals(zzgpgVar)) {
            return zzgut.CRUNCHY;
        }
        if (zzgpg.zzd.equals(zzgpgVar)) {
            return zzgut.RAW;
        }
        if (zzgpg.zzc.equals(zzgpgVar)) {
            return zzgut.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgpgVar)));
    }
}
