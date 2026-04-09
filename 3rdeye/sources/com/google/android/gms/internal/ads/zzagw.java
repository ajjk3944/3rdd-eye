package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzagw extends zzahd {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzahd[] zzg;

    public zzagw(String str, int i, int i10, long j4, long j10, zzahd[] zzahdVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i10;
        this.zzd = j4;
        this.zze = j10;
        this.zzg = zzahdVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagw.class == obj.getClass()) {
            zzagw zzagwVar = (zzagw) obj;
            if (this.zzb == zzagwVar.zzb && this.zzc == zzagwVar.zzc && this.zzd == zzagwVar.zzd && this.zze == zzagwVar.zze && Objects.equals(this.zza, zzagwVar.zza) && Arrays.equals(this.zzg, zzagwVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + 527;
        String str = this.zza;
        long j4 = this.zze;
        return str.hashCode() + (((((((i * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j4)) * 31);
    }
}
