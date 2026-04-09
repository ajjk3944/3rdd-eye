package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbaj {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbaj(long j4, String str, int i) {
        this.zza = j4;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbaj)) {
            zzbaj zzbajVar = (zzbaj) obj;
            if (zzbajVar.zza == this.zza && zzbajVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
