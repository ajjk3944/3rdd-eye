package com.google.android.gms.internal.ads;

import androidx.work.s;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzahl {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzahl(long j4, long j10, int i) {
        zzdd.zzd(j4 < j10);
        this.zza = j4;
        this.zzb = j10;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahl.class == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.zza == zzahlVar.zza && this.zzb == zzahlVar.zzb && this.zzc == zzahlVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        long j4 = this.zza;
        long j10 = this.zzb;
        int i = this.zzc;
        String str = zzex.zza;
        Locale locale = Locale.US;
        StringBuilder sbJ = s.j("Segment: startTimeMs=", ", endTimeMs=", j4);
        sbJ.append(j10);
        sbJ.append(", speedDivisor=");
        sbJ.append(i);
        return sbJ.toString();
    }
}
