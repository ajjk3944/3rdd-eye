package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzahm implements zzau {
    public final List zza;

    public zzahm(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j4 = ((zzahl) list.get(0)).zzb;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((zzahl) list.get(i)).zza < j4) {
                    z10 = true;
                    break;
                } else {
                    j4 = ((zzahl) list.get(i)).zzb;
                    i++;
                }
            }
        }
        zzdd.zzd(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahm.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzahm) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
