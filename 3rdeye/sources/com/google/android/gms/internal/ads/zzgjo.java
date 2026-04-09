package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgjo extends zzgfo {
    private final zzgjn zza;

    private zzgjo(zzgjn zzgjnVar) {
        this.zza = zzgjnVar;
    }

    public static zzgjo zzc(zzgjn zzgjnVar) {
        return new zzgjo(zzgjnVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgjo) && ((zzgjo) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgjo.class, this.zza);
    }

    public final String toString() {
        return C1154e9.i("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzgjn.zzc;
    }

    public final zzgjn zzb() {
        return this.zza;
    }
}
