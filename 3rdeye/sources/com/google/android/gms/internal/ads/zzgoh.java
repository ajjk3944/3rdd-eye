package com.google.android.gms.internal.ads;

import B4.g;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgoh {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgoh(Class cls, Class cls2, zzgoi zzgoiVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoh)) {
            return false;
        }
        zzgoh zzgohVar = (zzgoh) obj;
        return zzgohVar.zza.equals(this.zza) && zzgohVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return g.o(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
