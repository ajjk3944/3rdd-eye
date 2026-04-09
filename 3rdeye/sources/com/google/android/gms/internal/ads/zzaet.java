package com.google.android.gms.internal.ads;

import N7.C1094a9;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaet {
    public static final zzaet zza = new zzaet(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaet(long j4, long j10) {
        this.zzb = j4;
        this.zzc = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaet.class == obj.getClass()) {
            zzaet zzaetVar = (zzaet) obj;
            if (this.zzb == zzaetVar.zzb && this.zzc == zzaetVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.zzb);
        sb.append(", position=");
        return C1094a9.f(sb, this.zzc, "]");
    }
}
