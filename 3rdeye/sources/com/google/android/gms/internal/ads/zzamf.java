package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzamf {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzamf(String str, int i, String str2, Set set) {
        this.zzb = i;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzamf zza(String str, int i) {
        String str2;
        String strTrim = str.trim();
        zzdd.zzd(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = zzex.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i10 = 1; i10 < strArrSplit.length; i10++) {
            hashSet.add(strArrSplit[i10]);
        }
        return new zzamf(str4, i, str2, hashSet);
    }

    public static zzamf zzb() {
        return new zzamf("", 0, "", Collections.EMPTY_SET);
    }
}
