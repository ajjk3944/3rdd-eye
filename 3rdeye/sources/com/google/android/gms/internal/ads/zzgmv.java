package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgmv {
    public static final zzgmv zza = new zzgmt().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmv) {
            return this.zzb.equals(((zzgmv) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
