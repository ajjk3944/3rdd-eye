package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzmi {
    public static final zzmi zza;
    public static final zzmi zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzmi zzmiVar = new zzmi(0L, 0L);
        zza = zzmiVar;
        new zzmi(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzmi(Long.MAX_VALUE, 0L);
        new zzmi(0L, Long.MAX_VALUE);
        zzb = zzmiVar;
    }

    public zzmi(long j4, long j10) {
        zzdd.zzd(j4 >= 0);
        zzdd.zzd(j10 >= 0);
        this.zzc = j4;
        this.zzd = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmi.class == obj.getClass()) {
            zzmi zzmiVar = (zzmi) obj;
            if (this.zzc == zzmiVar.zzc && this.zzd == zzmiVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
