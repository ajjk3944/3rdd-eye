package com.google.android.gms.internal.ads;

import B4.i;
import N7.B8;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgjh extends zzgfo {
    private final zzgjg zza;
    private final int zzb;

    private zzgjh(zzgjg zzgjgVar, int i) {
        this.zza = zzgjgVar;
        this.zzb = i;
    }

    public static zzgjh zzd(zzgjg zzgjgVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzgjh(zzgjgVar, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjh)) {
            return false;
        }
        zzgjh zzgjhVar = (zzgjh) obj;
        return zzgjhVar.zza == this.zza && zzgjhVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgjh.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return i.j(B8.k("X-AES-GCM Parameters (variant: ", this.zza.toString(), "salt_size_bytes: "), this.zzb, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzgjg.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgjg zzc() {
        return this.zza;
    }
}
