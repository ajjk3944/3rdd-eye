package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgeq {
    public static final zzgfa zza(zzgfa zzgfaVar) throws GeneralSecurityException {
        return zzgfaVar != null ? zzgfaVar : zzgfc.zza(zzb(null).zzaV());
    }

    public static final zzgtt zzb(zzgfa zzgfaVar) {
        try {
            return ((zzgom) zzgnm.zzc().zze(null, zzgom.class)).zzc();
        } catch (GeneralSecurityException e4) {
            throw new zzgow("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e4);
        }
    }
}
