package com.google.android.gms.internal.ads;

import g0.C4356c;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgir {
    public static final /* synthetic */ int zza = 0;
    private static final zzgws zzb;
    private static final zzgnv zzc;
    private static final zzgnr zzd;
    private static final zzgml zze;
    private static final zzgmh zzf;

    static {
        zzgws zzgwsVarZzb = zzgox.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzgwsVarZzb;
        zzc = zzgnv.zzb(new zzgnt() { // from class: com.google.android.gms.internal.ads.zzgin
            @Override // com.google.android.gms.internal.ads.zzgnt
            public final zzgop zza(zzgfa zzgfaVar) {
                return zzgir.zzd((zzgim) zzgfaVar);
            }
        }, zzgim.class, zzgom.class);
        zzd = zzgnr.zzb(new zzgnp() { // from class: com.google.android.gms.internal.ads.zzgio
            @Override // com.google.android.gms.internal.ads.zzgnp
            public final zzgfa zza(zzgop zzgopVar) {
                return zzgir.zzb((zzgom) zzgopVar);
            }
        }, zzgwsVarZzb, zzgom.class);
        zze = zzgml.zzb(new zzgmj() { // from class: com.google.android.gms.internal.ads.zzgip
            @Override // com.google.android.gms.internal.ads.zzgmj
            public final zzgop zza(zzgen zzgenVar, zzgfb zzgfbVar) {
                return zzgir.zzc((zzgih) zzgenVar, zzgfbVar);
            }
        }, zzgih.class, zzgol.class);
        zzf = zzgmh.zzb(new zzgmf() { // from class: com.google.android.gms.internal.ads.zzgiq
            @Override // com.google.android.gms.internal.ads.zzgmf
            public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) {
                return zzgir.zza((zzgol) zzgopVar, zzgfbVar);
            }
        }, zzgwsVarZzb, zzgol.class);
    }

    public static /* synthetic */ zzgih zza(zzgol zzgolVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgolVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzgup zzgupVarZzd = zzgup.zzd(zzgolVar.zze(), zzgyf.zza());
            if (zzgupVarZzd.zza() == 0) {
                return zzgih.zzc(zzf(zzgupVarZzd.zzf(), zzgolVar.zzc()), zzgolVar.zzf());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzgupVarZzd)));
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e4);
        }
    }

    public static /* synthetic */ zzgim zzb(zzgom zzgomVar) throws GeneralSecurityException {
        if (!zzgomVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgomVar.zzc().zzi())));
        }
        try {
            return zzf(zzgus.zzf(zzgomVar.zzc().zzh(), zzgyf.zza()), zzgomVar.zzc().zzg());
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e4);
        }
    }

    public static /* synthetic */ zzgol zzc(zzgih zzgihVar, zzgfb zzgfbVar) {
        zzgun zzgunVarZzb = zzgup.zzb();
        zzgunVarZzb.zza(zzg(zzgihVar.zzd()));
        return zzgol.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgup) zzgunVarZzb.zzbr()).zzaN(), zzgtn.REMOTE, zzh(zzgihVar.zzd().zzc()), zzgihVar.zze());
    }

    public static /* synthetic */ zzgom zzd(zzgim zzgimVar) {
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzgtrVarZza.zzc(zzg(zzgimVar).zzaN());
        zzgtrVarZza.zza(zzh(zzgimVar.zzc()));
        return zzgom.zzb((zzgtt) zzgtrVarZza.zzbr());
    }

    public static void zze(zzgnm zzgnmVar) throws GeneralSecurityException {
        zzgnmVar.zzi(zzc);
        zzgnmVar.zzh(zzd);
        zzgnmVar.zzg(zze);
        zzgnmVar.zzf(zzf);
    }

    private static zzgim zzf(zzgus zzgusVar, zzgut zzgutVar) throws GeneralSecurityException {
        zzgij zzgijVar;
        zzgik zzgikVar;
        zzgtr zzgtrVarZza = zzgtt.zza();
        zzgtrVarZza.zzb(zzgusVar.zza().zzi());
        zzgtrVarZza.zzc(zzgusVar.zza().zzh());
        zzgtrVarZza.zza(zzgut.RAW);
        zzgfa zzgfaVarZza = zzgfc.zza(((zzgtt) zzgtrVarZza.zzbr()).zzaV());
        if (zzgfaVarZza instanceof zzgha) {
            zzgijVar = zzgij.zza;
        } else if (zzgfaVarZza instanceof zzghr) {
            zzgijVar = zzgij.zzc;
        } else if (zzgfaVarZza instanceof zzgjo) {
            zzgijVar = zzgij.zzb;
        } else if (zzgfaVarZza instanceof zzggf) {
            zzgijVar = zzgij.zzd;
        } else if (zzgfaVarZza instanceof zzggp) {
            zzgijVar = zzgij.zze;
        } else {
            if (!(zzgfaVarZza instanceof zzghl)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzgfaVarZza.toString()));
            }
            zzgijVar = zzgij.zzf;
        }
        zzgii zzgiiVar = new zzgii(null);
        int iOrdinal = zzgutVar.ordinal();
        if (iOrdinal == 1) {
            zzgikVar = zzgik.zza;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException(C4356c.h(zzgutVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            zzgikVar = zzgik.zzb;
        }
        zzgiiVar.zzd(zzgikVar);
        zzgiiVar.zzc(zzgusVar.zzg());
        zzgiiVar.zza((zzgfo) zzgfaVarZza);
        zzgiiVar.zzb(zzgijVar);
        return zzgiiVar.zze();
    }

    private static zzgus zzg(zzgim zzgimVar) throws GeneralSecurityException {
        try {
            zzgtt zzgttVarZzf = zzgtt.zzf(zzgfc.zzb(zzgimVar.zzb()), zzgyf.zza());
            zzguq zzguqVarZzb = zzgus.zzb();
            zzguqVarZzb.zzb(zzgimVar.zzd());
            zzguqVarZzb.zza(zzgttVarZzf);
            return (zzgus) zzguqVarZzb.zzbr();
        } catch (zzgzk e4) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e4);
        }
    }

    private static zzgut zzh(zzgik zzgikVar) throws GeneralSecurityException {
        if (zzgik.zza.equals(zzgikVar)) {
            return zzgut.TINK;
        }
        if (zzgik.zzb.equals(zzgikVar)) {
            return zzgut.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgikVar)));
    }
}
