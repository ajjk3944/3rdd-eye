package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class n7 {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f20604a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private static final Random f20605b = new Random(System.currentTimeMillis());

    public static void a(f7 f7Var, AppLovinAdLoadListener appLovinAdLoadListener, g7 g7Var, int i, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        Set setA = a(f7Var, kVar);
        if (CollectionUtils.isEmpty(setA)) {
            return;
        }
        a(setA, g7Var, kVar);
    }

    public static boolean b(b7 b7Var) {
        o7 o7VarX1;
        List listG;
        return (b7Var == null || (o7VarX1 = b7Var.x1()) == null || (listG = o7VarX1.g()) == null || listG.isEmpty()) ? false : true;
    }

    public static g7 c(b7 b7Var) {
        if (b(b7Var) || a(b7Var)) {
            return null;
        }
        return g7.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f20604a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean a(b7 b7Var) {
        e7 e7VarO1;
        j7 j7VarE;
        if (b7Var == null || (e7VarO1 = b7Var.o1()) == null || (j7VarE = e7VarO1.e()) == null) {
            return false;
        }
        return j7VarE.c() != null || StringUtils.isValidString(j7VarE.b());
    }

    public static boolean b(c8 c8Var) {
        if (c8Var != null) {
            return c8Var.b("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static Uri a(String str, long j4, Uri uri, g7 g7Var, com.applovin.impl.sdk.k kVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String string = Integer.toString(g7Var.b());
                String strReplace = str.replace("[ERRORCODE]", string).replace("[REASON]", string);
                if (j4 >= 0) {
                    strReplace = strReplace.replace("[CONTENTPLAYHEAD]", a(j4));
                }
                if (uri != null) {
                    strReplace = strReplace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(strReplace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                kVar.E().a("VastUtils", th);
                return null;
            }
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j4) {
        if (j4 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j4);
            long minutes = timeUnit.toMinutes(j4);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j4 % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    private static String a() {
        return Integer.toString(f20605b.nextInt(89999999) + 10000000);
    }

    public static void a(Set set, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, g7.UNSPECIFIED, kVar);
    }

    public static void a(Set set, g7 g7Var, com.applovin.impl.sdk.k kVar) {
        a(set, -1L, (Uri) null, g7Var, kVar);
    }

    public static void a(Set set, long j4, Uri uri, g7 g7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                l7 l7Var = (l7) it.next();
                long j10 = j4;
                Uri uri2 = uri;
                g7 g7Var2 = g7Var;
                com.applovin.impl.sdk.k kVar2 = kVar;
                Uri uriA = a(l7Var.c(), j10, uri2, g7Var2, kVar2);
                if (uriA != null) {
                    kVar2.e0().a(com.applovin.impl.sdk.network.d.b().d(uriA.toString()).a(false).b(l7Var.d()).a(), false);
                }
                j4 = j10;
                uri = uri2;
                g7Var = g7Var2;
                kVar = kVar2;
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(c8 c8Var, Map map, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        List<c8> listA;
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (c8Var == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        c8 c8VarC = c8Var.c("TrackingEvents");
        if (c8VarC == null || (listA = c8VarC.a("Tracking")) == null) {
            return;
        }
        for (c8 c8Var2 : listA) {
            String str = (String) c8Var2.a().get("event");
            if (StringUtils.isValidString(str)) {
                l7 l7VarA = l7.a(c8Var2, f7Var, kVar);
                if (l7VarA != null) {
                    Set set = (Set) map.get(str);
                    if (set != null) {
                        set.add(l7VarA);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(l7VarA);
                        map.put(str, hashSet);
                    }
                }
            } else {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().b("VastUtils", "Could not find event for tracking node = " + c8Var2);
                }
            }
        }
    }

    public static void a(List list, Set set, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l7 l7VarA = l7.a((c8) it.next(), f7Var, kVar);
            if (l7VarA != null) {
                set.add(l7VarA);
            }
        }
    }

    public static boolean a(c8 c8Var) {
        if (c8Var != null) {
            return c8Var.b("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static String a(f7 f7Var) {
        c8 c8VarB;
        if (f7Var != null) {
            List listA = f7Var.a();
            int size = f7Var.a().size();
            if (size <= 0 || (c8VarB = ((c8) listA.get(size - 1)).b("VASTAdTagURI")) == null) {
                return null;
            }
            return c8VarB.d();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(c8 c8Var, String str, String str2) {
        c8 c8VarC = c8Var.c(str);
        if (c8VarC != null) {
            String strD = c8VarC.d();
            if (StringUtils.isValidString(strD)) {
                return strD;
            }
        }
        return str2;
    }

    private static Set a(f7 f7Var, com.applovin.impl.sdk.k kVar) {
        List listA;
        if (f7Var == null) {
            return null;
        }
        List<c8> listA2 = f7Var.a();
        HashSet hashSet = new HashSet(listA2.size());
        for (c8 c8Var : listA2) {
            c8 c8VarB = c8Var.b("Wrapper");
            if (c8VarB == null) {
                c8VarB = c8Var.b("InLine");
            }
            if (c8VarB != null) {
                listA = c8VarB.a("Error");
            } else {
                listA = c8Var.a("Error");
            }
            hashSet = a(hashSet, listA, f7Var, kVar);
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static HashSet a(HashSet hashSet, List list, f7 f7Var, com.applovin.impl.sdk.k kVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l7 l7VarA = l7.a((c8) it.next(), f7Var, kVar);
                if (l7VarA != null) {
                    hashSet.add(l7VarA);
                }
            }
        }
        return hashSet;
    }
}
