package com.google.android.gms.internal.ads;

import B4.g;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgor {
    private final Class zza;
    private final zzgws zzb;

    public /* synthetic */ zzgor(Class cls, zzgws zzgwsVar, zzgot zzgotVar) {
        this.zza = cls;
        this.zzb = zzgwsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgor)) {
            return false;
        }
        zzgor zzgorVar = (zzgor) obj;
        return zzgorVar.zza.equals(this.zza) && zzgorVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return g.o(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
