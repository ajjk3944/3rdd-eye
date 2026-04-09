package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import b9.m;
import java.net.URI;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class j82 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f29019a = new a(0);

    public static final class a {
        private a() {
        }

        public static String a(String url) {
            Object objA;
            kotlin.jvm.internal.l.f(url, "url");
            try {
                objA = Uri.parse(d(url)).getHost();
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (objA instanceof m.a) {
                objA = null;
            }
            return (String) objA;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean b(java.lang.String r6) {
            /*
                java.lang.String r0 = "url"
                kotlin.jvm.internal.l.f(r6, r0)
                int r0 = r6.length()
                r1 = 0
                if (r0 != 0) goto Ld
                goto L3f
            Ld:
                java.lang.String r0 = "http(s?)://"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.lang.String r2 = "compile(...)"
                kotlin.jvm.internal.l.e(r0, r2)
                java.util.regex.Matcher r0 = r0.matcher(r6)
                java.lang.String r2 = ""
                java.lang.String r0 = r0.replaceFirst(r2)
                java.lang.String r2 = "replaceFirst(...)"
                kotlin.jvm.internal.l.e(r0, r2)
                com.yandex.mobile.ads.impl.j82$b[] r2 = com.yandex.mobile.ads.impl.j82.b.values()
                int r3 = r2.length
                r4 = r1
            L2d:
                if (r4 >= r3) goto L3f
                r5 = r2[r4]
                java.lang.String r5 = r5.a()
                boolean r5 = y9.n.a0(r0, r5, r1)
                if (r5 == 0) goto L3c
                goto L47
            L3c:
                int r4 = r4 + 1
                goto L2d
            L3f:
                boolean r6 = android.webkit.URLUtil.isNetworkUrl(r6)
                if (r6 == 0) goto L47
                r6 = 1
                return r6
            L47:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.j82.a.b(java.lang.String):boolean");
        }

        public static boolean c(String url) {
            kotlin.jvm.internal.l.f(url, "url");
            if (url.length() != 0) {
                Pattern patternCompile = Pattern.compile("http(s?)://");
                kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
                String strReplaceFirst = patternCompile.matcher(url).replaceFirst("");
                kotlin.jvm.internal.l.e(strReplaceFirst, "replaceFirst(...)");
                b.f29020c.getClass();
                b[] bVarArr = {b.f29021d, b.f29022e, b.f29023f, b.f29024g};
                for (int i = 0; i < 4; i++) {
                    if (y9.n.a0(strReplaceFirst, bVarArr[i].a(), false)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static String d(String str) {
            return (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) ? str : androidx.work.s.d("https://", str);
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final a f29020c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f29021d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f29022e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f29023f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f29024g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ b[] f29025h;

        /* renamed from: b, reason: collision with root package name */
        private final String f29026b;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(int i) {
                this();
            }
        }

        static {
            b bVar = new b(0, "SMS_SCHEME", "sms:");
            b bVar2 = new b(1, "MAIL_SCHEME", "mailto:");
            b bVar3 = new b(2, "VOICE_MAIL_SCHEME", "voicemail:");
            b bVar4 = new b(3, "TEL_SCHEME", "tel:");
            b bVar5 = new b(4, "CALLTO", "callto:");
            b bVar6 = new b(5, "FAX", "fax:");
            b bVar7 = new b(6, "GEO_SCHEME", "geo:");
            b bVar8 = new b(7, "MAP_SCHEME", "map:");
            b bVar9 = new b(8, "MAPS_SCHEME", "maps:");
            b bVar10 = new b(9, "GOOGLE_MARKET_SCHEME", "market:");
            f29021d = bVar10;
            b bVar11 = new b(10, "GOOGLE_PLAY_SCHEME", "play:");
            f29022e = bVar11;
            b bVar12 = new b(11, "GOOGLE_STREET_VIEW_SCHEME", "google.streetview:");
            b bVar13 = new b(12, "GOOGLE_MARKET_HOST", "market.android");
            f29023f = bVar13;
            b bVar14 = new b(13, "GOOGLE_PLAY_HOST", "play.google");
            f29024g = bVar14;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, new b(14, "MAP_HOST", "map"), new b(15, "MAPS_HOST", "maps"), new b(16, "YMOBMAPS", "mobile.maps"), new b(17, "YSHORTMOBMAPS", "m.maps"), new b(18, "YOIDMAPS", "maps.yandex.ru"), new b(19, "MESSAGE", "message:"), new b(20, "SIP", "sip:"), new b(21, "SKYPE", "skype:"), new b(22, "SMS", "sms:"), new b(23, "GTALK", "gtalk:"), new b(24, "SPOTIFY", "spotify:"), new b(25, "LASTFM", "lastfm:"), new b(26, "YSTORE", "yastore:")};
            f29025h = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
            f29020c = new a(0);
        }

        private b(int i, String str, String str2) {
            this.f29026b = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f29025h.clone();
        }

        public final String a() {
            return this.f29026b;
        }
    }

    static {
        Pattern.compile("maps.yandex");
    }

    public static boolean a(String str) {
        Object objA;
        try {
            new URI(str);
            objA = Boolean.valueOf((str == null || str.length() == 0) ? false : true);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        Object obj = Boolean.FALSE;
        if (objA instanceof m.a) {
            objA = obj;
        }
        return ((Boolean) objA).booleanValue();
    }
}
