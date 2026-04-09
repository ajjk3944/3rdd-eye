package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfvg implements Serializable, zzfvf {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfvg) {
            return this.zza.equals(((zzfvg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.zza) {
            if (!z10) {
                sb.append(',');
            }
            sb.append(obj);
            z10 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final boolean zza(Object obj) {
        int i = 0;
        while (true) {
            List list = this.zza;
            if (i >= list.size()) {
                return true;
            }
            if (!((zzfvf) list.get(i)).zza(obj)) {
                return false;
            }
            i++;
        }
    }
}
