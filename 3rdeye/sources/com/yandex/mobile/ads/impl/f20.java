package com.yandex.mobile.ads.impl;

import N7.B9;
import N7.C1175g0;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f20 extends j6.h {

    /* renamed from: a, reason: collision with root package name */
    private final tr f27184a;

    /* renamed from: b, reason: collision with root package name */
    private final g20 f27185b;

    /* renamed from: c, reason: collision with root package name */
    private final q20 f27186c;

    /* renamed from: d, reason: collision with root package name */
    private final f30 f27187d;

    /* renamed from: e, reason: collision with root package name */
    private final e30 f27188e;

    public /* synthetic */ f20(Context context, C4072a3 c4072a3, a8 a8Var, tr trVar, g20 g20Var, q20 q20Var) {
        this(context, c4072a3, a8Var, trVar, g20Var, q20Var, new f30(new fh1(context, c4072a3, m62.f30283d)), new e30(c4072a3, a8Var));
    }

    private final boolean a(JSONObject jSONObject, Uri uri, j6.y yVar) {
        if (!kotlin.jvm.internal.l.b(uri.getScheme(), "mobileads")) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != 94750088) {
                if (iHashCode != 866535483) {
                    if (iHashCode != 986975867) {
                        if (iHashCode == 1270469668 && host.equals("trackUrl")) {
                            this.f27187d.a(uri);
                            return true;
                        }
                    } else if (host.equals("trackAnalytics")) {
                        this.f27188e.a(uri, jSONObject);
                        return true;
                    }
                } else if (host.equals("closeAd")) {
                    this.f27184a.f();
                    return true;
                }
            } else if (host.equals("click")) {
                q20 q20Var = this.f27186c;
                View view = yVar.getView();
                kotlin.jvm.internal.l.e(view, "getView(...)");
                q20Var.a(uri, view);
                return true;
            }
        }
        return this.f27185b.a(uri);
    }

    @Override // j6.h
    public final boolean handleAction(C1175g0 action, j6.y view, A7.d expressionResolver) {
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(expressionResolver, "expressionResolver");
        if (!super.handleAction(action, view, expressionResolver)) {
            A7.b<Uri> bVar = action.f8262k;
            if (bVar == null) {
                return false;
            }
            if (!a(action.f8258f, bVar.a(expressionResolver), view)) {
                return false;
            }
        }
        return true;
    }

    public f20(Context context, C4072a3 adConfiguration, a8<?> adResponse, tr contentCloseListener, g20 delegate, q20 clickHandler, f30 trackingUrlHandler, e30 trackAnalyticsHandler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(delegate, "delegate");
        kotlin.jvm.internal.l.f(clickHandler, "clickHandler");
        kotlin.jvm.internal.l.f(trackingUrlHandler, "trackingUrlHandler");
        kotlin.jvm.internal.l.f(trackAnalyticsHandler, "trackAnalyticsHandler");
        this.f27184a = contentCloseListener;
        this.f27185b = delegate;
        this.f27186c = clickHandler;
        this.f27187d = trackingUrlHandler;
        this.f27188e = trackAnalyticsHandler;
    }

    @Override // j6.h
    public final boolean handleAction(B9 action, j6.y view, A7.d resolver) {
        A7.b<Uri> url;
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        return super.handleAction(action, view, resolver) || ((url = action.getUrl()) != null && a(action.c(), url.a(resolver), view));
    }

    public final void a(po poVar) {
        this.f27186c.a(poVar);
    }
}
