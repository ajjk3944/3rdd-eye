package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgoq {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgoq() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgoq zza(zzgmh zzgmhVar) throws GeneralSecurityException {
        zzgor zzgorVar = new zzgor(zzgmhVar.zzd(), zzgmhVar.zzc(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzgorVar)) {
            map.put(zzgorVar, zzgmhVar);
            return this;
        }
        zzgmh zzgmhVar2 = (zzgmh) map.get(zzgorVar);
        if (zzgmhVar2.equals(zzgmhVar) && zzgmhVar.equals(zzgmhVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgorVar.toString()));
    }

    public final zzgoq zzb(zzgml zzgmlVar) throws GeneralSecurityException {
        zzgos zzgosVar = new zzgos(zzgmlVar.zzc(), zzgmlVar.zzd(), null);
        Map map = this.zza;
        if (!map.containsKey(zzgosVar)) {
            map.put(zzgosVar, zzgmlVar);
            return this;
        }
        zzgml zzgmlVar2 = (zzgml) map.get(zzgosVar);
        if (zzgmlVar2.equals(zzgmlVar) && zzgmlVar.equals(zzgmlVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgosVar.toString()));
    }

    public final zzgoq zzc(zzgnr zzgnrVar) throws GeneralSecurityException {
        zzgor zzgorVar = new zzgor(zzgnrVar.zzd(), zzgnrVar.zzc(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzgorVar)) {
            map.put(zzgorVar, zzgnrVar);
            return this;
        }
        zzgnr zzgnrVar2 = (zzgnr) map.get(zzgorVar);
        if (zzgnrVar2.equals(zzgnrVar) && zzgnrVar.equals(zzgnrVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgorVar.toString()));
    }

    public final zzgoq zzd(zzgnv zzgnvVar) throws GeneralSecurityException {
        zzgos zzgosVar = new zzgos(zzgnvVar.zzc(), zzgnvVar.zzd(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzgosVar)) {
            map.put(zzgosVar, zzgnvVar);
            return this;
        }
        zzgnv zzgnvVar2 = (zzgnv) map.get(zzgosVar);
        if (zzgnvVar2.equals(zzgnvVar) && zzgnvVar.equals(zzgnvVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgosVar.toString()));
    }

    public zzgoq(zzgou zzgouVar) {
        this.zza = new HashMap(zzgouVar.zza);
        this.zzb = new HashMap(zzgouVar.zzb);
        this.zzc = new HashMap(zzgouVar.zzc);
        this.zzd = new HashMap(zzgouVar.zzd);
    }
}
