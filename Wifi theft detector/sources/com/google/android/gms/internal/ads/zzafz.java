package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzafz {
    public static final zzafz zza = new zzafz(0, 0);
    public final long zzb;
    public final long zzc;

    public zzafz(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j10 = this.zzb;
        int length = String.valueOf(j10).length();
        long j11 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j11).length() + 1);
        sb.append("[timeUs=");
        sb.append(j10);
        sb.append(", position=");
        sb.append(j11);
        sb.append("]");
        return sb.toString();
    }
}
