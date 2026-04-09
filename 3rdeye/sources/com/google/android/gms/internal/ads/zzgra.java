package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgra {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzglz zzc;
    private static final zzglz zzd;
    private static final zzgnv zze;
    private static final zzgnr zzf;
    private static final zzgml zzg;
    private static final zzgmh zzh;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgwsVarZzb;
        zzglx zzglxVarZza = zzglz.zza();
        zzglxVarZza.zza(zzgut.RAW, zzgpx.zzd);
        zzglxVarZza.zza(zzgut.TINK, zzgpx.zza);
        zzglxVarZza.zza(zzgut.LEGACY, zzgpx.zzc);
        zzglxVarZza.zza(zzgut.CRUNCHY, zzgpx.zzb);
        zzc = zzglxVarZza.zzb();
        zzglx zzglxVarZza2 = zzglz.zza();
        zzglxVarZza2.zza(zzgtc.SHA1, zzgpw.zza);
        zzglxVarZza2.zza(zzgtc.SHA224, zzgpw.zzb);
        zzglxVarZza2.zza(zzgtc.SHA256, zzgpw.zzc);
        zzglxVarZza2.zza(zzgtc.SHA384, zzgpw.zzd);
        zzglxVarZza2.zza(zzgtc.SHA512, zzgpw.zze);
        zzd = zzglxVarZza2.zzb();
        zze = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgqw
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgra.zzb((zzgpz) zzgfaVar);
            }
        }, zzgpz.class, zzgom.class);
        zzf = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgqx
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgra.zzd((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zzg = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgqy
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgra.zza((zzgpp) zzgenVar, zzgfbVar);
            }
        }, zzgpp.class, zzgol.class);
        zzh = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgqz
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgra.zzc((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzgol zza(zzgpp zzgppVar, zzgfb zzgfbVar) {
        zzgtd zzgtdVarZzb = zzgtf.zzb();
        zzgtdVarZzb.zzb(zzf(zzgppVar.zzc()));
        byte[] bArrZzd = zzgppVar.zze().zzd(zzgfbVar);
        zzgtdVarZzb.zza(zzgxn.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgtf) zzgtdVarZzb.zzbr()).zzaN(), zzgtn.SYMMETRIC, (zzgut) zzc.zzb(zzgppVar.zzc().zzg()), zzgppVar.zzf());
    }

    public static /* synthetic */ zzgom zzb(zzgpz zzgpzVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgtg zzgtgVarZzc = zzgti.zzc();
        zzgtgVarZzc.zzb(zzf(zzgpzVar));
        zzgtgVarZzc.zza(zzgpzVar.zzc());
        zzgtrVarZza.zzc(((zzgti) zzgtgVarZzc.zzbr()).zzaN());
        zzgtrVarZza.zza((zzgut) zzc.zzb(zzgpzVar.zzg()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static /* synthetic */ zzgpp zzc(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgtf zzgtfVarZzf = zzgtf.zzf(zzgolVar.zze(), zzgyf.zza());
            if (zzgtfVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgpv zzgpvVarZze = zzgpz.zze();
            zzgpvVarZze.zzb(zzgtfVarZzf.zzh().zzd());
            zzgpvVarZze.zzc(zzgtfVarZzf.zzg().zza());
            zzgpvVarZze.zza((zzgpw) zzd.zzc(zzgtfVarZzf.zzg().zzb()));
            zzgpvVarZze.zzd((zzgpx) zzc.zzc(zzgolVar.zzc()));
            zzgpz zzgpzVarZze = zzgpvVarZze.zze();
            zzgpn zzgpnVarZzb = zzgpp.zzb();
            zzgpnVarZzb.zzc(zzgpzVarZze);
            zzgpnVarZzb.zzb(zzgwt.zzb(zzgtfVarZzf.zzh().zzA(), zzgfbVar));
            zzgpnVarZzb.zza(zzgolVar.zzf());
            return zzgpnVarZzb.zzd();
        } catch (zzgzk | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgpz zzd(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            zzgti zzgtiVarZzg = zzgti.zzg(zzgomVar.zzc().zzh(), zzgyf.zza());
            if (zzgtiVarZzg.zzb() != 0) {
                throw new GeneralSecurityException(C4356c.h(zzgtiVarZzg.zzb(), "Parsing HmacParameters failed: unknown Version "));
            }
            zzgpv zzgpvVarZze = zzgpz.zze();
            zzgpvVarZze.zzb(zzgtiVarZzg.zza());
            zzgpvVarZze.zzc(zzgtiVarZzg.zzh().zza());
            zzgpvVarZze.zza((zzgpw) zzd.zzc(zzgtiVarZzg.zzh().zzb()));
            zzgpvVarZze.zzd((zzgpx) zzc.zzc(zzgomVar.zzc().zzg()));
            return zzgpvVarZze.zze();
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e4);
        }
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zze);
        zzgnmVar.zzh(zzf);
        zzgnmVar.zzg(zzg);
        zzgnmVar.zzf(zzh);
    }

    private static zzgtl zzf(zzgpz zzgpzVar) throws GeneralSecurityException {
        zzgtj zzgtjVarZzc = zzgtl.zzc();
        zzgtjVarZzc.zzb(zzgpzVar.zzb());
        zzgtjVarZzc.zza((zzgtc) zzd.zzb(zzgpzVar.zzf()));
        return (zzgtl) zzgtjVarZzc.zzbr();
    }
}
