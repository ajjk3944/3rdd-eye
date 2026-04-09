package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhf {
    private static final Pattern zza = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern zzb = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long zza(String str, String str2) throws NumberFormatException {
        long j4 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j4 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                zzea.zzc("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j4;
        }
        Matcher matcher = zza.matcher(str2);
        if (!matcher.matches()) {
            return j4;
        }
        try {
            String strGroup = matcher.group(2);
            if (strGroup == null) {
                throw null;
            }
            long j10 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            if (strGroup2 == null) {
                throw null;
            }
            long j11 = (j10 - Long.parseLong(strGroup2)) + 1;
            if (j4 < 0) {
                return j11;
            }
            if (j4 == j11) {
                return j4;
            }
            zzea.zzf("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j4, j11);
        } catch (NumberFormatException unused2) {
            zzea.zzc("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j4;
        }
    }

    public static long zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = zzb.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }
}
