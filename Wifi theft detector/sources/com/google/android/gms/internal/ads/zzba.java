package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzba {

    @Nullable
    public final Object zza;
    public final int zzb;

    @Nullable
    public final zzak zzc;

    @Nullable
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzba(@Nullable Object obj, int i10, @Nullable zzak zzakVar, @Nullable Object obj2, int i11, long j10, long j11, int i12, int i13) {
        zzgrc.zza(i10 >= 0);
        zzgrc.zza(i11 >= 0);
        this.zza = obj;
        this.zzb = i10;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i11;
        this.zzf = j10;
        this.zzg = j11;
        this.zzh = i12;
        this.zzi = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zza, zzbaVar.zza) && Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zze;
        int length2 = String.valueOf(i11).length();
        long j10 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j10).length());
        sb.append("mediaItem=");
        sb.append(i10);
        sb.append(", period=");
        sb.append(i11);
        sb.append(", pos=");
        sb.append(j10);
        String string = sb.toString();
        int i12 = this.zzh;
        if (i12 == -1) {
            return string;
        }
        long j11 = this.zzg;
        int i13 = this.zzi;
        int length3 = string.length();
        StringBuilder sb2 = new StringBuilder(length3 + 13 + String.valueOf(j11).length() + 10 + String.valueOf(i12).length() + 5 + String.valueOf(i13).length());
        sb2.append(string);
        sb2.append(", contentPos=");
        sb2.append(j11);
        sb2.append(", adGroup=");
        sb2.append(i12);
        sb2.append(", ad=");
        sb2.append(i13);
        return sb2.toString();
    }
}
