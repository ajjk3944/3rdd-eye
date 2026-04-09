package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.impl.Oo;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgqh implements zzgok {
    private static final zzgqh zza = new zzgqh();
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgqd
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgrb.zza((zzgmr) zzgenVar);
        }
    }, zzgmr.class, zzgez.class);

    public static void zzc() throws GeneralSecurityException {
        zzgnj.zza().zzd(zza);
        zzgnj.zza().zzc(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zza() {
        return zzgez.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zzb() {
        return zzgez.class;
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
                zzgez zzgezVar = (zzgez) zzgofVar.zza(zzgeuVarZzb);
                zzgen zzgenVarZzb = zzgeuVarZzb.zzb();
                if (zzgenVarZzb instanceof zzgqb) {
                    zzgwsVarZzc = ((zzgqb) zzgenVarZzb).zzd();
                } else {
                    if (!(zzgenVarZzb instanceof zzgmr)) {
                        throw new GeneralSecurityException(Oo.f("Cannot get output prefix for key of class ", zzgenVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzgenVarZzb.zza())));
                    }
                    zzgwsVarZzc = ((zzgmr) zzgenVarZzb).zzc();
                }
                zzgnxVar.zza(zzgwsVarZzc, new zzgqe(zzgezVar, zzgeuVarZzb.zza()));
            }
        }
        if (zzgmvVar.zza()) {
            zzgmwVar = zzgmz.zza;
            zzgmwVarZza = zzgmwVar;
        } else {
            zzgmx zzgmxVarZza = zzgnh.zzb().zza();
            zzgmw zzgmwVarZza2 = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "mac", "compute");
            zzgmwVarZza = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "mac", "verify");
            zzgmwVar = zzgmwVarZza2;
        }
        zzgew zzgewVar = (zzgew) zzgmmVar;
        return new zzgqf(new zzgqe((zzgez) zzgofVar.zza(zzgewVar.zzc()), zzgewVar.zzc().zza()), zzgnxVar.zzb(), zzgmwVar, zzgmwVarZza, null);
    }
}
