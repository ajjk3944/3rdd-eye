package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.graphics.Color;
import android.text.TextUtils;
import androidx.work.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzalk {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalk(String str, int i, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i10;
    }

    public static zzalk zzb(String str, zzali zzaliVar) throws NumberFormatException {
        zzalk zzalkVar;
        int i;
        zzdd.zzd(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), StringUtils.COMMA);
        int length = strArrSplit.length;
        int i10 = zzaliVar.zzk;
        if (length != i10) {
            String str2 = zzex.zza;
            Locale locale = Locale.US;
            StringBuilder sbI = s.i("Skipping malformed 'Style:' line (expected ", i10, " values, found ", length, "): '");
            sbI.append(str);
            sbI.append("'");
            zzea.zzf("SsaStyle", sbI.toString());
            return null;
        }
        try {
            String strTrim = strArrSplit[zzaliVar.zza].trim();
            int i11 = zzaliVar.zzb;
            int iZzd = i11 != -1 ? zzd(strArrSplit[i11].trim()) : -1;
            int i12 = zzaliVar.zzc;
            Integer numZzc = i12 != -1 ? zzc(strArrSplit[i12].trim()) : null;
            int i13 = zzaliVar.zzd;
            Integer numZzc2 = i13 != -1 ? zzc(strArrSplit[i13].trim()) : null;
            int i14 = zzaliVar.zze;
            float f10 = -3.4028235E38f;
            if (i14 != -1) {
                String strTrim2 = strArrSplit[i14].trim();
                try {
                    try {
                        f10 = Float.parseFloat(strTrim2);
                        zzalkVar = null;
                    } catch (NumberFormatException e4) {
                        zzalkVar = null;
                        zzea.zzg("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e4);
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    zzea.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                    return zzalkVar;
                }
            } else {
                zzalkVar = null;
            }
            int i15 = zzaliVar.zzf;
            boolean z10 = i15 != -1 && zze(strArrSplit[i15].trim());
            int i16 = zzaliVar.zzg;
            boolean z11 = i16 != -1 && zze(strArrSplit[i16].trim());
            int i17 = zzaliVar.zzh;
            boolean z12 = i17 != -1 && zze(strArrSplit[i17].trim());
            int i18 = zzaliVar.zzi;
            boolean z13 = i18 != -1 && zze(strArrSplit[i18].trim());
            int i19 = zzaliVar.zzj;
            if (i19 != -1) {
                String strTrim3 = strArrSplit[i19].trim();
                try {
                    int i20 = Integer.parseInt(strTrim3.trim());
                    if (i20 == 1 || i20 == 3) {
                        i = i20;
                    }
                } catch (NumberFormatException unused) {
                }
                zzea.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                i = -1;
            } else {
                i = -1;
            }
            return new zzalk(strTrim, iZzd, numZzc, numZzc2, f10, z10, z11, z12, z13, i);
        } catch (RuntimeException e11) {
            e = e11;
            zzalkVar = null;
        }
    }

    public static Integer zzc(String str) {
        try {
            long j4 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzdd.zzd(j4 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgbi.zzb(((j4 >> 24) & 255) ^ 255), zzgbi.zzb(j4 & 255), zzgbi.zzb((j4 >> 8) & 255), zzgbi.zzb((j4 >> 16) & 255)));
        } catch (IllegalArgumentException e4) {
            zzea.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) throws NumberFormatException {
        int i;
        try {
            i = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                C1154e9.n(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e4) {
            zzea.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e4);
            return false;
        }
    }
}
