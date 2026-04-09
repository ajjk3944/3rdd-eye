package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzghr extends zzgfo {
    private final zzghq zza;

    private zzghr(zzghq zzghqVar) {
        this.zza = zzghqVar;
    }

    public static zzghr zzc(zzghq zzghqVar) {
        return new zzghr(zzghqVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzghr) && ((zzghr) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzghr.class, this.zza);
    }

    public final String toString() {
        return C1154e9.i("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzghq.zzc;
    }

    public final zzghq zzb() {
        return this.zza;
    }
}
