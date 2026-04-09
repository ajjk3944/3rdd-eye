package com.yandex.mobile.ads.impl;

import c9.C2097r;
import com.yandex.mobile.ads.impl.a8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tc1<T> implements rc1<T> {

    /* renamed from: k, reason: collision with root package name */
    private static final long f33527k = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f33528a;

    /* renamed from: b, reason: collision with root package name */
    private final vq1<T> f33529b;

    /* renamed from: c, reason: collision with root package name */
    private final n80 f33530c;

    /* renamed from: d, reason: collision with root package name */
    private final wy0 f33531d;

    /* renamed from: e, reason: collision with root package name */
    private final qr1 f33532e;

    /* renamed from: f, reason: collision with root package name */
    private final ds f33533f;

    /* renamed from: g, reason: collision with root package name */
    private final zf0 f33534g;

    /* renamed from: h, reason: collision with root package name */
    private final hs0 f33535h;
    private final fd i;

    /* renamed from: j, reason: collision with root package name */
    private final b8 f33536j;

    public tc1(C4072a3 adConfiguration, vq1<T> responseBodyParser, n80 falseClickParser, wy0 mediationDataParser, qr1 rewardDataParser, ds contentTypeHeaderParser, zf0 htmlAdImpressionDataParser, hs0 localeParser, fd analyticsParametersParser, b8 adResponseAbExperimentDataParser) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(responseBodyParser, "responseBodyParser");
        kotlin.jvm.internal.l.f(falseClickParser, "falseClickParser");
        kotlin.jvm.internal.l.f(mediationDataParser, "mediationDataParser");
        kotlin.jvm.internal.l.f(rewardDataParser, "rewardDataParser");
        kotlin.jvm.internal.l.f(contentTypeHeaderParser, "contentTypeHeaderParser");
        kotlin.jvm.internal.l.f(htmlAdImpressionDataParser, "htmlAdImpressionDataParser");
        kotlin.jvm.internal.l.f(localeParser, "localeParser");
        kotlin.jvm.internal.l.f(analyticsParametersParser, "analyticsParametersParser");
        kotlin.jvm.internal.l.f(adResponseAbExperimentDataParser, "adResponseAbExperimentDataParser");
        this.f33528a = adConfiguration;
        this.f33529b = responseBodyParser;
        this.f33530c = falseClickParser;
        this.f33531d = mediationDataParser;
        this.f33532e = rewardDataParser;
        this.f33533f = contentTypeHeaderParser;
        this.f33534g = htmlAdImpressionDataParser;
        this.f33535h = localeParser;
        this.i = analyticsParametersParser;
        this.f33536j = adResponseAbExperimentDataParser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer b(String value) throws NumberFormatException {
        int i;
        kotlin.jvm.internal.l.f(value, "value");
        int i10 = aa.f24578b;
        try {
            i = Integer.parseInt(value);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        return Integer.valueOf(Math.min(i, 100));
    }

    @Override // com.yandex.mobile.ads.impl.rc1
    public final a8<T> a(qq1 networkResponse, Map<String, String> headers, ns responseAdType) throws NumberFormatException {
        Integer numValueOf;
        Integer numValueOf2;
        Locale locale;
        Long lValueOf;
        int i = 8;
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        kotlin.jvm.internal.l.f(headers, "headers");
        kotlin.jvm.internal.l.f(responseAdType, "responseAdType");
        a8.a aVar = new a8.a();
        aVar.f(this.f33528a.c());
        aVar.a(responseAdType);
        int iB = hf0.b(headers, gh0.f27715c);
        int iB2 = hf0.b(headers, gh0.f27717d);
        aVar.e(iB);
        aVar.b(iB2);
        String strA = hf0.a(headers, gh0.f27703Q);
        String strA2 = hf0.a(headers, gh0.f27704R);
        aVar.e(strA);
        aVar.k(strA2);
        aVar.b(hf0.a(headers, gh0.f27723g));
        String strA3 = hf0.a(headers, gh0.f27708V);
        if (strA3 != null) {
            this.i.getClass();
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(strA3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    kotlin.jvm.internal.l.c(next);
                    kotlin.jvm.internal.l.c(obj);
                    map.put(next, obj);
                }
            } catch (Throwable unused) {
            }
            aVar.a(map);
        }
        vy1 vy1VarR = this.f33528a.r();
        aVar.a(vy1VarR != null ? vy1VarR.a() : null);
        aVar.c(hf0.c(headers, gh0.f27725h));
        aVar.f(hf0.c(headers, gh0.f27733q));
        this.f33536j.getClass();
        aVar.a(b8.a(headers));
        aVar.a(hf0.a(headers, gh0.f27736t, new J0(i)));
        aVar.d(hf0.a(headers, gh0.f27701O, new S1(i)));
        aVar.e(hf0.c(headers, gh0.i));
        gh0 httpHeader = gh0.f27726j;
        kotlin.jvm.internal.l.f(httpHeader, "httpHeader");
        String strA4 = hf0.a(headers, httpHeader);
        int i10 = aa.f24578b;
        if (strA4 != null) {
            try {
                numValueOf = Integer.valueOf(strA4);
            } catch (NumberFormatException unused2) {
            }
        } else {
            numValueOf = null;
        }
        aVar.a(numValueOf != null ? Long.valueOf(numValueOf.intValue() * f33527k) : null);
        gh0 httpHeader2 = gh0.f27689C;
        int i11 = hf0.f28193b;
        kotlin.jvm.internal.l.f(httpHeader2, "httpHeader");
        String strA5 = hf0.a(headers, httpHeader2);
        int i12 = aa.f24578b;
        if (strA5 != null) {
            try {
                numValueOf2 = Integer.valueOf(strA5);
            } catch (NumberFormatException unused3) {
            }
        } else {
            numValueOf2 = null;
        }
        aVar.b(numValueOf2 != null ? Long.valueOf(numValueOf2.intValue() * f33527k) : null);
        aVar.g(hf0.a(headers, gh0.f27731o));
        this.f33535h.getClass();
        String strA6 = hf0.a(headers, gh0.f27732p);
        Locale[] availableLocales = Locale.getAvailableLocales();
        kotlin.jvm.internal.l.c(availableLocales);
        int length = availableLocales.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                locale = null;
                break;
            }
            if (kotlin.jvm.internal.l.b(availableLocales[i13].getLanguage(), strA6)) {
                locale = new Locale(strA6);
                break;
            }
            i13++;
        }
        aVar.a(locale);
        aVar.b(hf0.c(headers, gh0.f27730n));
        aVar.f(hf0.b(headers, gh0.f27741y));
        aVar.c(hf0.b(headers, gh0.f27742z));
        aVar.d(hf0.b(headers, gh0.f27687A));
        aVar.a(hf0.b(headers, gh0.f27692F));
        aVar.l(hf0.a(headers, gh0.f27740x));
        gh0 httpHeader3 = gh0.f27728l;
        kotlin.jvm.internal.l.f(httpHeader3, "httpHeader");
        String strA7 = hf0.a(headers, httpHeader3);
        aVar.i(strA7 == null ? false : Boolean.parseBoolean(strA7));
        aVar.h(hf0.a(headers, gh0.f27711Y));
        aVar.j(hf0.a(headers, gh0.f27712Z));
        aVar.i(hf0.a(headers, gh0.f27713a0));
        aVar.c(hf0.a(headers, gh0.f27693G));
        this.f33533f.getClass();
        aVar.a(ds.a(headers));
        aVar.a(this.f33532e.a(networkResponse));
        this.f33530c.getClass();
        Map<String, String> responseHeaders = networkResponse.b();
        gh0 header = gh0.f27738v;
        kotlin.jvm.internal.l.f(responseHeaders, "responseHeaders");
        kotlin.jvm.internal.l.f(header, "header");
        String str = (String) C2097r.q0(hf0.c(responseHeaders, header));
        gh0 httpHeader4 = gh0.f27739w;
        kotlin.jvm.internal.l.f(httpHeader4, "httpHeader");
        String strA8 = hf0.a(responseHeaders, httpHeader4);
        if (strA8 != null) {
            try {
                lValueOf = Long.valueOf(strA8);
            } catch (NumberFormatException unused4) {
            }
        } else {
            lValueOf = null;
        }
        aVar.a((str == null || lValueOf == null) ? null : new h80(str, lValueOf.longValue()));
        this.f33534g.getClass();
        String strA9 = hf0.a(headers, gh0.f27727k);
        aVar.a((strA9 == null || strA9.length() <= 0) ? null : new C4108f4(strA9));
        gh0 httpHeader5 = gh0.f27694H;
        kotlin.jvm.internal.l.f(httpHeader5, "httpHeader");
        String strA10 = hf0.a(headers, httpHeader5);
        aVar.j(strA10 == null ? false : Boolean.parseBoolean(strA10));
        gh0 httpHeader6 = gh0.f27702P;
        kotlin.jvm.internal.l.f(httpHeader6, "httpHeader");
        String strA11 = hf0.a(headers, httpHeader6);
        aVar.f(strA11 == null ? false : Boolean.parseBoolean(strA11));
        gh0 httpHeader7 = gh0.f27735s;
        kotlin.jvm.internal.l.f(httpHeader7, "httpHeader");
        String strA12 = hf0.a(headers, httpHeader7);
        boolean z10 = strA12 == null ? false : Boolean.parseBoolean(strA12);
        aVar.e(z10);
        if (z10) {
            aVar.a(this.f33531d.a(networkResponse));
        } else {
            aVar.a((a8.a) this.f33529b.a(networkResponse));
        }
        aVar.d(hf0.a(headers, gh0.f27705S));
        aVar.a(hf0.a(headers, gh0.f27721f));
        gh0 httpHeader8 = gh0.f27709W;
        kotlin.jvm.internal.l.f(httpHeader8, "httpHeader");
        String strA13 = hf0.a(headers, httpHeader8);
        aVar.c(strA13 == null ? false : Boolean.parseBoolean(strA13));
        String strA14 = hf0.a(headers, gh0.f27698L);
        aVar.a(strA14 != null ? new fa0(strA14) : null);
        gh0 httpHeader9 = gh0.f27729m;
        kotlin.jvm.internal.l.f(httpHeader9, "httpHeader");
        String strA15 = hf0.a(headers, httpHeader9);
        aVar.h(strA15 == null ? true : Boolean.parseBoolean(strA15));
        gh0 httpHeader10 = gh0.f27716c0;
        kotlin.jvm.internal.l.f(httpHeader10, "httpHeader");
        String strA16 = hf0.a(headers, httpHeader10);
        aVar.g(strA16 != null ? Boolean.parseBoolean(strA16) : false);
        gh0 httpHeader11 = gh0.f27718d0;
        kotlin.jvm.internal.l.f(httpHeader11, "httpHeader");
        String strA17 = hf0.a(headers, httpHeader11);
        aVar.a(strA17 == null ? true : Boolean.parseBoolean(strA17));
        gh0 httpHeader12 = gh0.f27720e0;
        kotlin.jvm.internal.l.f(httpHeader12, "httpHeader");
        String strA18 = hf0.a(headers, httpHeader12);
        aVar.d(strA18 == null ? true : Boolean.parseBoolean(strA18));
        gh0 httpHeader13 = gh0.f27722f0;
        kotlin.jvm.internal.l.f(httpHeader13, "httpHeader");
        String strA19 = hf0.a(headers, httpHeader13);
        aVar.b(strA19 != null ? Boolean.parseBoolean(strA19) : true);
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long a(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        int i = aa.f24578b;
        try {
            return Long.valueOf(value);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }
}
