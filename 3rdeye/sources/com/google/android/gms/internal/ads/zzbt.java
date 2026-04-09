package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbt {
    public static final zzbt zza = new zzbt(zzfyf.zzn());
    private final zzfyf zzb;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
    }

    public zzbt(List list) {
        this.zzb = zzfyf.zzl(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbt.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbt) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfyf zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        int i10 = 0;
        while (true) {
            zzfyf zzfyfVar = this.zzb;
            if (i10 >= zzfyfVar.size()) {
                return false;
            }
            zzbs zzbsVar = (zzbs) zzfyfVar.get(i10);
            if (zzbsVar.zzc() && zzbsVar.zza() == i) {
                return true;
            }
            i10++;
        }
    }
}
