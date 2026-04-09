package com.google.android.gms.internal.ads;

import j6.l;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgmd {
    private static final Logger zza = Logger.getLogger(zzgmd.class.getName());
    private static final zzgmd zzb = new zzgmd();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgmd zzc() {
        return zzb;
    }

    private final synchronized zzgeo zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzc;
        if (!concurrentMap.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (zzgeo) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzgeo zzgeoVar, boolean z10, boolean z11) throws GeneralSecurityException {
        try {
            String str = ((zzgmn) zzgeoVar).zza;
            ConcurrentMap concurrentMap = this.zzd;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            ConcurrentMap concurrentMap2 = this.zzc;
            zzgeo zzgeoVar2 = (zzgeo) concurrentMap2.get(str);
            if (zzgeoVar2 != null && !zzgeoVar2.getClass().equals(zzgeoVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + zzgeoVar2.getClass().getName() + ", cannot be re-registered with " + zzgeoVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(str, zzgeoVar);
            concurrentMap.put(str, Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzgeo zza(String str, Class cls) throws GeneralSecurityException {
        zzgeo zzgeoVarZzg = zzg(str);
        if (zzgeoVarZzg.zzb().equals(cls)) {
            return zzgeoVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgeoVarZzg.getClass());
        String string = zzgeoVarZzg.zzb().toString();
        StringBuilder sbD = l.d("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbD.append(string);
        throw new GeneralSecurityException(sbD.toString());
    }

    public final zzgeo zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzgeo zzgeoVar, boolean z10) throws GeneralSecurityException {
        zzf(zzgeoVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgeo zzgeoVar, int i, boolean z10) throws GeneralSecurityException {
        if (!zzglu.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgeoVar, false, true);
    }
}
