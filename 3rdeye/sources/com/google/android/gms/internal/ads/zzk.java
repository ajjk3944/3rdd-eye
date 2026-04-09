package com.google.android.gms.internal.ads;

import B4.g;
import N7.C1154e9;
import g0.C4356c;
import j6.l;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzk {
    public static final zzk zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzi zziVar = new zzi();
        zziVar.zzc(1);
        zziVar.zzb(2);
        zziVar.zzd(3);
        zza = zziVar.zzg();
        zzi zziVar2 = new zzi();
        zziVar2.zzc(1);
        zziVar2.zzb(1);
        zziVar2.zzd(2);
        zziVar2.zzg();
        String str = zzex.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzk(int i, int i10, int i11, byte[] bArr, int i12, int i13, zzj zzjVar) {
        this.zzb = i;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = bArr;
        this.zzf = i12;
        this.zzg = i13;
    }

    public static int zza(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean zzg(zzk zzkVar) {
        if (zzkVar == null) {
            return true;
        }
        int i = zzkVar.zzb;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i10 = zzkVar.zzc;
        if (i10 != -1 && i10 != 2) {
            return false;
        }
        int i11 = zzkVar.zzd;
        if ((i11 != -1 && i11 != 3) || zzkVar.zze != null) {
            return false;
        }
        int i12 = zzkVar.zzg;
        if (i12 != -1 && i12 != 8) {
            return false;
        }
        int i13 = zzkVar.zzf;
        return i13 == -1 || i13 == 8;
    }

    private static String zzh(int i) {
        return i != -1 ? i != 1 ? i != 2 ? C4356c.h(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    private static String zzi(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? C4356c.h(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzj(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? C4356c.h(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzk.class == obj.getClass()) {
            zzk zzkVar = (zzk) obj;
            if (this.zzb == zzkVar.zzb && this.zzc == zzkVar.zzc && this.zzd == zzkVar.zzd && Arrays.equals(this.zze, zzkVar.zze) && this.zzf == zzkVar.zzf && this.zzg == zzkVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i = this.zzf;
        int i10 = this.zzd;
        int i11 = this.zzc;
        String strZzi = zzi(this.zzb);
        String strZzh = zzh(i11);
        String strZzj = zzj(i10);
        String str2 = "NA";
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        int i12 = this.zzg;
        if (i12 != -1) {
            str2 = i12 + "bit Chroma";
        }
        boolean z10 = this.zze != null;
        StringBuilder sbD = l.d("ColorInfo(", strZzi, ", ", strZzh, ", ");
        sbD.append(strZzj);
        sbD.append(", ");
        sbD.append(z10);
        sbD.append(", ");
        return C1154e9.j(sbD, str, ", ", str2, ")");
    }

    public final zzi zzc() {
        return new zzi(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            String strZzi = zzi(this.zzb);
            String strZzh = zzh(this.zzc);
            String strZzj = zzj(this.zzd);
            String str3 = zzex.zza;
            Locale locale = Locale.US;
            str = strZzi + "/" + strZzh + "/" + strZzj;
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + "/" + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return g.o(str, "/", str2);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }
}
