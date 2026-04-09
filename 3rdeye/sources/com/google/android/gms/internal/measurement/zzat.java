package com.google.android.gms.internal.measurement;

import B4.g;
import N7.C1154e9;
import N7.G8;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-measurement@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return C1154e9.i("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c10;
        int i;
        String strZzi;
        int i10;
        int i11;
        int i12;
        zzg zzgVar2;
        int iZza;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || AppLovinEventTypes.USER_EXECUTED_SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(G8.s(str, " is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                if (str.equals(str4)) {
                    c10 = 2;
                    break;
                } else {
                    c10 = 65535;
                    break;
                }
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    c10 = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c10 = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c10 = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c10 = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    c10 = 0;
                    break;
                }
                str4 = str2;
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    c10 = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c10 = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case -906336856:
                if (str.equals(AppLovinEventTypes.USER_EXECUTED_SEARCH)) {
                    c10 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c10 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c10 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c10 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c10 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c10 = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c10 = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c10 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    c10 = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                zzh.zzj(str5, 1, list);
                int iZza2 = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                String str6 = this.zza;
                return (iZza2 < 0 || iZza2 >= str6.length()) ? zzap.zzm : new zzat(String.valueOf(str6.charAt(iZza2)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb = new StringBuilder(this.zza);
                for (int i13 = 0; i13 < list.size(); i13++) {
                    sb.append(zzgVar.zzb((zzap) list.get(i13)).zzi());
                }
                return new zzat(sb.toString());
            case 2:
                zzh.zzh(str4, 1, list);
                String str7 = this.zza;
                zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzapVarZzb.zzi())) {
                    return zzap.zzk;
                }
                double dDoubleValue = zzapVarZzb.zzh().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str7.length()) ? zzap.zzl : zzap.zzk;
            case 3:
                zzh.zzj("indexOf", 2, list);
                return new zzah(Double.valueOf(this.zza.indexOf(list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined", (int) zzh.zza(list.size() >= 2 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : 0.0d))));
            case 4:
                zzh.zzj("lastIndexOf", 2, list);
                String str8 = this.zza;
                String strZzi2 = list.size() > 0 ? zzgVar.zzb((zzap) list.get(0)).zzi() : "undefined";
                return new zzah(Double.valueOf(str8.lastIndexOf(strZzi2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r3)))));
            case 5:
                zzh.zzj("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
            case 6:
                zzh.zzj("replace", 2, list);
                zzap zzapVarZza = zzap.zzf;
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                String str9 = strZzi;
                String str10 = this.zza;
                int iIndexOf = str10.indexOf(str9);
                if (iIndexOf < 0) {
                    return this;
                }
                if (zzapVarZza instanceof zzai) {
                    i10 = 0;
                    zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str9), new zzah(Double.valueOf(iIndexOf)), this));
                } else {
                    i10 = 0;
                }
                return new zzat(g.o(str10.substring(i10, iIndexOf), zzapVarZza.zzi(), str10.substring(str9.length() + iIndexOf)));
            case 7:
                zzh.zzj(AppLovinEventTypes.USER_EXECUTED_SEARCH, 1, list);
                return Pattern.compile(list.isEmpty() ? "undefined" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza).find() ? new zzah(Double.valueOf(r0.start())) : new zzah(Double.valueOf(-1.0d));
            case '\b':
                zzh.zzj("slice", 2, list);
                String str11 = this.zza;
                double dZza = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : 0.0d);
                int iMax = (int) (dZza < 0.0d ? Math.max(str11.length() + dZza, 0.0d) : Math.min(dZza, str11.length()));
                double dZza2 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str11.length());
                return new zzat(str11.substring(iMax, Math.max(0, ((int) (dZza2 < 0.0d ? Math.max(str11.length() + dZza2, 0.0d) : Math.min(dZza2, str11.length()))) - iMax) + iMax));
            case '\t':
                zzh.zzj("split", 2, list);
                String str12 = this.zza;
                if (str12.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    long jZzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                    if (jZzd == 0) {
                        return new zzae();
                    }
                    String[] strArrSplit = str12.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                    int length = strArrSplit.length;
                    if (!strZzi3.isEmpty() || length <= 0) {
                        i11 = length;
                        i12 = 0;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i11 = length - 1;
                        i12 = zIsEmpty;
                        if (!strArrSplit[i11].isEmpty()) {
                            i11 = length;
                            i12 = zIsEmpty;
                        }
                    }
                    if (length > jZzd) {
                        i11--;
                    }
                    while (i12 < i11) {
                        arrayList.add(new zzat(strArrSplit[i12]));
                        i12++;
                    }
                }
                return new zzae(arrayList);
            case '\n':
                zzh.zzj("substring", 2, list);
                String str13 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZza = 0;
                } else {
                    zzgVar2 = zzgVar;
                    iZza = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                }
                int iZza3 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str13.length();
                int iMin = Math.min(Math.max(iZza, 0), str13.length());
                int iMin2 = Math.min(Math.max(iZza3, 0), str13.length());
                return new zzat(str13.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                zzh.zzh("toLocaleUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase());
            case '\f':
                zzh.zzh("toLocaleLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase());
            case '\r':
                zzh.zzh("toLowerCase", 0, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zzh("toString", 0, list);
                return this;
            case 15:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", 0, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
