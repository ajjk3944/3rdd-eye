package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nm;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class hh0 {
    public static Map<String, String> a(nm.a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = aVar.f30930b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j4 = aVar.f30932d;
        if (j4 > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put("If-Modified-Since", simpleDateFormat.format(new Date(j4)));
        }
        return map;
    }

    public static nm.a a(nc1 nc1Var) throws NumberFormatException {
        long j4;
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = nc1Var.f30837c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = map.get("Cache-Control");
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
                        j10 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
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
        String str3 = map.get("Expires");
        long jA2 = str3 != null ? a(str3) : j4;
        String str4 = map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : j4;
        String str5 = map.get("ETag");
        if (i != 0) {
            j13 = (j10 * 1000) + jCurrentTimeMillis;
            if (z10) {
                j12 = j13;
            } else {
                Long.signum(j11);
                j12 = (j11 * 1000) + j13;
            }
        } else {
            j12 = (jA <= j4 || jA2 < jA) ? j4 : (jA2 - jA) + jCurrentTimeMillis;
            j13 = j12;
        }
        nm.a aVar = new nm.a();
        aVar.f30929a = nc1Var.f30836b;
        aVar.f30930b = str5;
        aVar.f30934f = j13;
        aVar.f30933e = j12;
        aVar.f30931c = jA;
        aVar.f30932d = jA3;
        aVar.f30935g = map;
        aVar.f30936h = nc1Var.f30838d;
        return aVar;
    }

    public static String a(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] strArrSplit = str.split(";", 0);
        for (int i = 1; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
            if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                return strArrSplit2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long a(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException unused) {
            if (!CommonUrlParts.Values.FALSE_INTEGER.equals(str) && !"-1".equals(str)) {
                Object[] objArr = {str};
                boolean z10 = gi2.f27765a;
                fp0.c(objArr);
                return 0L;
            }
            Object[] objArr2 = {str};
            boolean z11 = gi2.f27765a;
            fp0.e(objArr2);
            return 0L;
        }
    }
}
