package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgou {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgou(zzgoq zzgoqVar, zzgot zzgotVar) {
        this.zza = new HashMap(zzgoqVar.zza);
        this.zzb = new HashMap(zzgoqVar.zzb);
        this.zzc = new HashMap(zzgoqVar.zzc);
        this.zzd = new HashMap(zzgoqVar.zzd);
    }

    public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        zzgor zzgorVar = new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null);
        Map map = this.zzb;
        if (map.containsKey(zzgorVar)) {
            return ((zzgmh) map.get(zzgorVar)).zza(zzgopVar, zzgfbVar);
        }
        throw new GeneralSecurityException(C1154e9.i("No Key Parser for requested key type ", zzgorVar.toString(), " available"));
    }

    public final zzgfa zzb(zzgop zzgopVar) throws GeneralSecurityException {
        zzgor zzgorVar = new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null);
        Map map = this.zzd;
        if (map.containsKey(zzgorVar)) {
            return ((zzgnr) map.get(zzgorVar)).zza(zzgopVar);
        }
        throw new GeneralSecurityException(C1154e9.i("No Parameters Parser for requested key type ", zzgorVar.toString(), " available"));
    }

    public final zzgop zzc(zzgen zzgenVar, Class cls, zzgfb zzgfbVar) throws GeneralSecurityException {
        zzgos zzgosVar = new zzgos(zzgenVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzgosVar)) {
            return ((zzgml) map.get(zzgosVar)).zza(zzgenVar, zzgfbVar);
        }
        throw new GeneralSecurityException(C1154e9.i("No Key serializer for ", zzgosVar.toString(), " available"));
    }

    public final zzgop zzd(zzgfa zzgfaVar, Class cls) throws GeneralSecurityException {
        zzgos zzgosVar = new zzgos(zzgfaVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzgosVar)) {
            return ((zzgnv) map.get(zzgosVar)).zza(zzgfaVar);
        }
        throw new GeneralSecurityException(C1154e9.i("No Key Format serializer for ", zzgosVar.toString(), " available"));
    }

    public final boolean zzi(zzgop zzgopVar) {
        return this.zzb.containsKey(new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null));
    }

    public final boolean zzj(zzgop zzgopVar) {
        return this.zzd.containsKey(new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null));
    }
}
