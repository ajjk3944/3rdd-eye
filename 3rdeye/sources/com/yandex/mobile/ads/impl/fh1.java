package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.kk;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class fh1 implements h82 {

    /* renamed from: a, reason: collision with root package name */
    private final m62 f27329a;

    /* renamed from: b, reason: collision with root package name */
    private final h62 f27330b;

    /* renamed from: c, reason: collision with root package name */
    private final aq1 f27331c;

    /* renamed from: d, reason: collision with root package name */
    private final f82 f27332d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f27333e;

    public /* synthetic */ fh1(Context context, C4072a3 c4072a3, m62 m62Var) {
        this(context, c4072a3, m62Var, new h62(context, c4072a3), aq1.a.a(), new f82(context));
    }

    @Override // com.yandex.mobile.ads.impl.h82
    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        eh1 eh1Var = new eh1(this.f27333e, this.f27332d.a(url), new a(url, ew1.a.a().a(this.f27333e), this.f27330b, this.f27329a));
        aq1 aq1Var = this.f27331c;
        Context context = this.f27333e;
        synchronized (aq1Var) {
            kotlin.jvm.internal.l.f(context, "context");
            xc1.a(context).a(eh1Var);
        }
    }

    public fh1(Context context, C4072a3 adConfiguration, m62 trackingUrlType, h62 trackingReporter, aq1 requestManager, f82 urlModifier) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(trackingUrlType, "trackingUrlType");
        kotlin.jvm.internal.l.f(trackingReporter, "trackingReporter");
        kotlin.jvm.internal.l.f(requestManager, "requestManager");
        kotlin.jvm.internal.l.f(urlModifier, "urlModifier");
        this.f27329a = trackingUrlType;
        this.f27330b = trackingReporter;
        this.f27331c = requestManager;
        this.f27332d = urlModifier;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f27333e = applicationContext;
    }

    public static final class a implements kk.a<nc1> {

        /* renamed from: a, reason: collision with root package name */
        private final String f27334a;

        /* renamed from: b, reason: collision with root package name */
        private final du1 f27335b;

        /* renamed from: c, reason: collision with root package name */
        private final h62 f27336c;

        /* renamed from: d, reason: collision with root package name */
        private final m62 f27337d;

        public a(String trackingUrl, du1 du1Var, h62 trackingReporter, m62 trackingUrlType) {
            kotlin.jvm.internal.l.f(trackingUrl, "trackingUrl");
            kotlin.jvm.internal.l.f(trackingReporter, "trackingReporter");
            kotlin.jvm.internal.l.f(trackingUrlType, "trackingUrlType");
            this.f27334a = trackingUrl;
            this.f27335b = du1Var;
            this.f27336c = trackingReporter;
            this.f27337d = trackingUrlType;
        }

        @Override // com.yandex.mobile.ads.impl.rq1.a
        public final void a(fi2 error) {
            kotlin.jvm.internal.l.f(error, "error");
            error.toString();
            int i = fp0.f27419b;
            b9.l lVar = new b9.l("tracking_result", "failure");
            String lowerCase = this.f27337d.name().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            b9.l lVar2 = new b9.l("tracking_url_type", lowerCase);
            String message = error.getMessage();
            if (message == null) {
                message = "Unknown Volley error";
            }
            LinkedHashMap linkedHashMapP = C2078B.p(lVar, lVar2, new b9.l("error_message", message));
            h62 h62Var = this.f27336c;
            ip1.b bVar = ip1.b.f28803c;
            h62Var.a(linkedHashMapP, this.f27335b);
        }

        @Override // com.yandex.mobile.ads.impl.rq1.b
        public final void a(Object obj) {
            nc1 response = (nc1) obj;
            kotlin.jvm.internal.l.f(response, "response");
            int i = response.f30835a;
            int i10 = fp0.f27419b;
            b9.l lVar = new b9.l("tracking_result", "success");
            String lowerCase = this.f27337d.name().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            LinkedHashMap linkedHashMapP = C2078B.p(lVar, new b9.l("tracking_url_type", lowerCase), new b9.l("code", Integer.valueOf(i)));
            h62 h62Var = this.f27336c;
            ip1.b bVar = ip1.b.f28803c;
            h62Var.a(linkedHashMapP, this.f27335b);
        }
    }
}
