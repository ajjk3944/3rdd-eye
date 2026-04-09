package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzbg {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzv[] zzd;
    private int zze;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbg(String str, zzv... zzvVarArr) {
        int length = zzvVarArr.length;
        int i10 = 1;
        zzgrc.zza(length > 0);
        this.zzb = str;
        this.zzd = zzvVarArr;
        this.zza = length;
        int iZzf = zzas.zzf(zzvVarArr[0].zzo);
        this.zzc = iZzf == -1 ? zzas.zzf(zzvVarArr[0].zzn) : iZzf;
        zzv zzvVar = zzvVarArr[0];
        String strZzc = zzc(zzvVar.zzd);
        int i11 = zzvVar.zzf | 16384;
        while (true) {
            zzv[] zzvVarArr2 = this.zzd;
            if (i10 >= zzvVarArr2.length) {
                return;
            }
            zzv zzvVar2 = zzvVarArr2[i10];
            String str2 = zzvVar2.zzd;
            if (!strZzc.equals(zzc(str2))) {
                zzd("languages", zzvVarArr2[0].zzd, str2, i10);
                return;
            } else {
                if (i11 != (zzvVar2.zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzvVarArr2[0].zzf), Integer.toBinaryString(this.zzd[i10].zzf), i10);
                    return;
                }
                i10++;
            }
        }
    }

    private static String zzc(@Nullable String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static void zzd(String str, @Nullable String str2, @Nullable String str3, int i10) {
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 17 + length2 + 9 + String.valueOf(i10).length() + 1);
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i10);
        sb.append(")");
        zzee.zzf("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.zzb.equals(zzbgVar.zzb) && Arrays.equals(this.zzd, zzbgVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((this.zzb.hashCode() + 527) * 31) + Arrays.hashCode(this.zzd);
        this.zze = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String string = Arrays.toString(this.zzd);
        String str = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(string).length());
        sb.append(str);
        sb.append(": ");
        sb.append(string);
        return sb.toString();
    }

    public final zzv zza(int i10) {
        return this.zzd[i10];
    }

    public final int zzb(zzv zzvVar) {
        int i10 = 0;
        while (true) {
            zzv[] zzvVarArr = this.zzd;
            if (i10 >= zzvVarArr.length) {
                return -1;
            }
            if (zzvVar == zzvVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }
}
