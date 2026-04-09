package com.google.android.gms.internal.ads;

import B4.g;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgos {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgos(Class cls, Class cls2, zzgot zzgotVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgos)) {
            return false;
        }
        zzgos zzgosVar = (zzgos) obj;
        return zzgosVar.zza.equals(this.zza) && zzgosVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return g.o(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
