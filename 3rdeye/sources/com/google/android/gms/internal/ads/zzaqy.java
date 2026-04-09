package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaqy {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e4) {
            if (CommonUrlParts.Values.FALSE_INTEGER.equals(str) || "-1".equals(str)) {
                zzaqn.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzaqn.zzc(e4, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzapk zzb(zzapx zzapxVar) throws NumberFormatException {
        long j4;
        boolean z10;
        long j10;
        long j11;
        long j12;
        long jZza;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzapxVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZza2 = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(StringUtils.COMMA, 0);
            z10 = false;
            j10 = 0;
            j11 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i++;
            }
            j4 = 0;
            i = 1;
        } else {
            j4 = 0;
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZza3 = str3 != null ? zza(str3) : j4;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j12 = jCurrentTimeMillis;
            jZza = zza(str4);
        } else {
            j12 = jCurrentTimeMillis;
            jZza = j4;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j15 = (j11 * 1000) + j12;
            if (z10) {
                j14 = j15;
            } else {
                Long.signum(j10);
                j14 = (j10 * 1000) + j15;
            }
            j13 = j15;
        } else {
            j13 = (jZza2 <= j4 || jZza3 < jZza2) ? j4 : (jZza3 - jZza2) + j12;
            j14 = j13;
        }
        zzapk zzapkVar = new zzapk();
        zzapkVar.zza = zzapxVar.zzb;
        zzapkVar.zzb = str5;
        zzapkVar.zzf = j13;
        zzapkVar.zze = j14;
        zzapkVar.zzc = jZza2;
        zzapkVar.zzd = jZza;
        zzapkVar.zzg = map;
        zzapkVar.zzh = zzapxVar.zzd;
        return zzapkVar;
    }

    public static String zzc(long j4) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j4));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
