package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.impl.Oo;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgft implements zzgok {
    private static final zzgft zza = new zzgft();
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfp
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgla.zzb((zzgmr) zzgenVar);
        }
    }, zzgmr.class, zzgeh.class);

    public static void zzc() throws GeneralSecurityException {
        zzgnj.zza().zzd(zza);
        zzgnj.zza().zzc(zzb);
    }

    public static void zzd(zzgog zzgogVar) throws GeneralSecurityException {
        zzgogVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zza() {
        return zzgeh.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zzb() {
        return zzgeh.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final /* bridge */ /* synthetic */ Object zze(zzgmm zzgmmVar, zzgmv zzgmvVar, zzgof zzgofVar) throws GeneralSecurityException {
        zzgmw zzgmwVar;
        zzgmw zzgmwVarZza;
        zzgws zzgwsVarZzc;
        zzgnx zzgnxVar = new zzgnx();
        for (int i = 0; i < zzgmmVar.zza(); i++) {
            zzgeu zzgeuVarZzb = ((zzgew) zzgmmVar).zzb(i);
            if (zzgeuVarZzb.zzc().equals(zzgep.zza)) {
                zzgen zzgenVarZzb = zzgeuVarZzb.zzb();
                if (zzgenVarZzb instanceof zzgfn) {
                    zzgwsVarZzc = ((zzgfn) zzgenVarZzb).zzb();
                } else {
                    if (!(zzgenVarZzb instanceof zzgmr)) {
                        throw new GeneralSecurityException(Oo.f("Cannot get output prefix for key of class ", zzgenVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzgenVarZzb.zza())));
                    }
                    zzgwsVarZzc = ((zzgmr) zzgenVarZzb).zzc();
                }
                zzgnxVar.zza(zzgwsVarZzc, new zzgfq((zzgeh) zzgofVar.zza(zzgeuVarZzb), zzgeuVarZzb.zza()));
            }
        }
        if (zzgmvVar.zza()) {
            zzgmwVar = zzgmz.zza;
            zzgmwVarZza = zzgmwVar;
        } else {
            zzgmx zzgmxVarZza = zzgnh.zzb().zza();
            zzgmw zzgmwVarZza2 = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "aead", "encrypt");
            zzgmwVarZza = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "aead", "decrypt");
            zzgmwVar = zzgmwVarZza2;
        }
        zzgew zzgewVar = (zzgew) zzgmmVar;
        return new zzgfr(new zzgfq((zzgeh) zzgofVar.zza(zzgewVar.zzc()), zzgewVar.zzc().zza()), zzgnxVar.zzb(), zzgmwVar, zzgmwVarZza, null);
    }
}
