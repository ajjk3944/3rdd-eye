package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class zzgre implements Serializable, zzgrd {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgre) {
            return this.zza.equals(((zzgre) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
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

    @Override // com.google.android.gms.internal.ads.zzgrd
    public final boolean zza(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((zzgrd) list.get(i10)).zza(obj)) {
                return false;
            }
            i10++;
        }
    }
}
