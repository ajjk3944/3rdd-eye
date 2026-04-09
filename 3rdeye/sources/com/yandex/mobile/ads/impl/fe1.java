package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.aq1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.rq1;

/* loaded from: classes3.dex */
public final class fe1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27293a;

    /* renamed from: b, reason: collision with root package name */
    private final he1 f27294b;

    /* renamed from: c, reason: collision with root package name */
    private final aq1 f27295c;

    /* renamed from: d, reason: collision with root package name */
    private final ew1 f27296d;

    public fe1(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f27293a = context.getApplicationContext();
        this.f27294b = ie1.a(context);
        this.f27295c = aq1.a.a();
        this.f27296d = ew1.a.a();
    }

    public final class a implements rq1.b<String>, rq1.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f27297a;

        /* renamed from: b, reason: collision with root package name */
        private final pa2 f27298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ fe1 f27299c;

        public a(fe1 fe1Var, String omSdkControllerUrl, pa2 listener) {
            kotlin.jvm.internal.l.f(omSdkControllerUrl, "omSdkControllerUrl");
            kotlin.jvm.internal.l.f(listener, "listener");
            this.f27299c = fe1Var;
            this.f27297a = omSdkControllerUrl;
            this.f27298b = listener;
        }

        @Override // com.yandex.mobile.ads.impl.rq1.a
        public final void a(fi2 error) {
            kotlin.jvm.internal.l.f(error, "error");
            this.f27298b.a();
        }

        @Override // com.yandex.mobile.ads.impl.rq1.b
        public final void a(String str) {
            String response = str;
            kotlin.jvm.internal.l.f(response, "response");
            this.f27299c.f27294b.a(response);
            this.f27299c.f27294b.b(this.f27297a);
            this.f27298b.a();
        }
    }

    public final void a() {
        aq1 aq1Var = this.f27295c;
        Context appContext = this.f27293a;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        aq1Var.getClass();
        aq1.a(appContext, "om_sdk_js_request_tag");
    }

    public final void a(pa2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        ew1 ew1Var = this.f27296d;
        Context appContext = this.f27293a;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        du1 du1VarA = ew1Var.a(appContext);
        String strI = du1VarA != null ? du1VarA.I() : null;
        String strB = this.f27294b.b();
        if (strI != null && strI.length() > 0 && !strI.equals(strB)) {
            a aVar = new a(this, strI, listener);
            s22 s22Var = new s22(strI, aVar, aVar);
            s22Var.b((Object) "om_sdk_js_request_tag");
            aq1 aq1Var = this.f27295c;
            Context appContext2 = this.f27293a;
            kotlin.jvm.internal.l.e(appContext2, "appContext");
            synchronized (aq1Var) {
                xc1.a(appContext2).a(s22Var);
            }
            return;
        }
        ge1.a(ge1.this);
    }
}
