package com.google.android.gms.internal.ads;

import F3.h;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfxb extends zzfzq implements Serializable {
    final zzfut zza;
    final zzfzq zzb;

    public zzfxb(zzfut zzfutVar, zzfzq zzfzqVar) {
        this.zza = zzfutVar;
        this.zzb = zzfzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzfut zzfutVar = this.zza;
        return this.zzb.compare(zzfutVar.apply(obj), zzfutVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxb) {
            zzfxb zzfxbVar = (zzfxb) obj;
            if (this.zza.equals(zzfxbVar.zza) && this.zzb.equals(zzfxbVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return h.i(this.zzb.toString(), ".onResultOf(", this.zza.toString(), ")");
    }
}
