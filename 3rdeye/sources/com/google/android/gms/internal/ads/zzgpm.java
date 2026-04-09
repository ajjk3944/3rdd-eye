package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.impl.Oo;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgpm implements zzgok {
    private static final zzgpm zza = new zzgpm();

    private zzgpm() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzgnj.zza().zzd(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zza() {
        return zzgpj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zzb() {
        return zzgpj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final /* bridge */ /* synthetic */ Object zze(zzgmm zzgmmVar, zzgmv zzgmvVar, zzgof zzgofVar) throws GeneralSecurityException {
        zzgws zzgwsVarZzc;
        zzgeu zzgeuVarZzc = ((zzgew) zzgmmVar).zzc();
        zzgnx zzgnxVar = new zzgnx();
        for (int i = 0; i < zzgmmVar.zza(); i++) {
            zzgeu zzgeuVarZzb = ((zzgew) zzgmmVar).zzb(i);
            if (zzgeuVarZzb.zzc().equals(zzgep.zza)) {
                zzgpj zzgpjVar = (zzgpj) zzgofVar.zza(zzgeuVarZzb);
                zzgen zzgenVarZzb = zzgeuVarZzb.zzb();
                if (zzgenVarZzb instanceof zzgqb) {
                    zzgwsVarZzc = ((zzgqb) zzgenVarZzb).zzd();
                } else {
                    if (!(zzgenVarZzb instanceof zzgmr)) {
                        throw new GeneralSecurityException(Oo.f("Cannot get output prefix for key of class ", zzgenVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzgenVarZzb.zza())));
                    }
                    zzgwsVarZzc = ((zzgmr) zzgenVarZzb).zzc();
                }
                zzgnxVar.zza(zzgwsVarZzc, zzgpjVar);
            }
        }
        return new zzgpk(zzgnxVar.zzb(), (zzgpj) zzgofVar.zza(zzgeuVarZzc), null);
    }
}
