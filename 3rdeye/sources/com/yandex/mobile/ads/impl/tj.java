package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import c9.C2097r;
import c9.C2100u;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.C4093d3;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.hx1;
import com.yandex.mobile.ads.impl.kk;
import com.yandex.mobile.ads.impl.ns;
import d9.C4285c;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class tj<T> extends v52<C4072a3, a8<T>> {

    /* renamed from: C, reason: collision with root package name */
    private final C4072a3 f33635C;

    /* renamed from: D, reason: collision with root package name */
    private final String f33636D;

    /* renamed from: E, reason: collision with root package name */
    private final sc1<T> f33637E;

    /* renamed from: F, reason: collision with root package name */
    private final hx1 f33638F;

    /* renamed from: G, reason: collision with root package name */
    private final C4073a4 f33639G;

    /* renamed from: H, reason: collision with root package name */
    private final q7 f33640H;

    /* renamed from: I, reason: collision with root package name */
    private final Context f33641I;

    /* renamed from: J, reason: collision with root package name */
    private final gq1 f33642J;

    public static final class a extends kotlin.jvm.internal.m implements p9.l<bn1, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f33643b = new a();

        public a() {
            super(1);
        }

        public static String a(bn1 it) {
            kotlin.jvm.internal.l.f(it, "it");
            return B4.g.o(it.getKey(), "=", it.getValue());
        }

        @Override // p9.l
        public final /* bridge */ /* synthetic */ CharSequence invoke(bn1 bn1Var) {
            return a(bn1Var);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tj(Context context, C4072a3 c4072a3, String str, String str2, sc1 sc1Var, yp1 yp1Var, kk.a aVar, fq1 fq1Var, hx1 hx1Var, int i) {
        hx1 hx1VarA;
        if ((i & 256) != 0) {
            hx1.f28410a.getClass();
            hx1VarA = hx1.a.a(context);
        } else {
            hx1VarA = hx1Var;
        }
        this(context, c4072a3, str, str2, sc1Var, yp1Var, aVar, fq1Var, hx1VarA, new C4073a4(), new q7());
    }

    private final a8<T> a(nc1 nc1Var, Map<String, String> map, ns nsVar) {
        sc1<T> sc1Var = this.f33637E;
        Context context = this.f33641I;
        kotlin.jvm.internal.l.e(context, "context");
        ki2 ki2VarA = sc1Var.a(context, this.f33635C);
        gh0 gh0Var = gh0.f27697K;
        String strA = hf0.a(map, gh0Var);
        gh0Var.a();
        fp0.e(new Object[0]);
        this.f33638F.a(strA);
        return ki2VarA.a(nc1Var, map, nsVar);
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final byte[] b() throws th {
        if (1 != f()) {
            return null;
        }
        try {
            String str = this.f33636D;
            Charset charsetForName = Charset.forName(Constants.ENCODING);
            kotlin.jvm.internal.l.e(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            fp0.a(new Object[0]);
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public Map<String, String> e() {
        C4285c c4285c = new C4285c();
        String strA = this.f33638F.a();
        if (strA != null) {
            fp0.e(new Object[0]);
        }
        String strA2 = gh0.f27699M.a();
        C4073a4 c4073a4 = this.f33639G;
        Context context = this.f33641I;
        kotlin.jvm.internal.l.e(context, "context");
        c4285c.put(strA2, c4073a4.b(context));
        String strA3 = gh0.f27700N.a();
        C4073a4 c4073a42 = this.f33639G;
        Context context2 = this.f33641I;
        kotlin.jvm.internal.l.e(context2, "context");
        c4285c.put(strA3, c4073a42.a(context2));
        c4285c.putAll(this.f33635C.k().d());
        return c4285c.c();
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final String l() {
        StringBuilder sb = new StringBuilder();
        if (f() == 0) {
            sb.append(this.f33636D);
        }
        List<bn1> listF = this.f33635C.k().f();
        if (sb.length() > 0 && !listF.isEmpty()) {
            sb.append("&");
        }
        sb.append(C2097r.u0(listF, "&", null, null, a.f33643b, 30));
        String string = Uri.parse(super.l()).buildUpon().encodedQuery(sb.toString()).build().toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    @Override // com.yandex.mobile.ads.impl.kk
    public final gq1 w() {
        return this.f33642J;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(Context context, C4072a3 adConfiguration, String url, String query, sc1<T> networkResponseParserCreator, yp1 yp1Var, kk.a<a8<T>> listener, fq1<C4072a3, a8<T>> requestReporter, hx1 sessionStorage, C4073a4 adIdHeaderProvider, q7 adRequestRetryPolicyCreator) {
        super(context, adConfiguration, 1, url, listener, adConfiguration, requestReporter, yp1Var, 1792);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(query, "query");
        kotlin.jvm.internal.l.f(networkResponseParserCreator, "networkResponseParserCreator");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(requestReporter, "requestReporter");
        kotlin.jvm.internal.l.f(sessionStorage, "sessionStorage");
        kotlin.jvm.internal.l.f(adIdHeaderProvider, "adIdHeaderProvider");
        kotlin.jvm.internal.l.f(adRequestRetryPolicyCreator, "adRequestRetryPolicyCreator");
        adConfiguration.k().getClass();
        this.f33635C = adConfiguration;
        this.f33636D = query;
        this.f33637E = networkResponseParserCreator;
        this.f33638F = sessionStorage;
        this.f33639G = adIdHeaderProvider;
        this.f33640H = adRequestRetryPolicyCreator;
        this.f33641I = context.getApplicationContext();
        fp0.e(new Object[0]);
        a(context);
        this.f33642J = gq1.f27875e;
    }

    @Override // com.yandex.mobile.ads.impl.v52, com.yandex.mobile.ads.impl.kk, com.yandex.mobile.ads.impl.op1
    public final fi2 b(fi2 requestError) {
        kotlin.jvm.internal.l.f(requestError, "requestError");
        fp0.c(new Object[0]);
        int i = C4093d3.f25936d;
        return super.b((fi2) C4093d3.a.a(requestError.f27346b));
    }

    @Override // com.yandex.mobile.ads.impl.v52
    public final rq1<a8<T>> a(nc1 response, int i) {
        kotlin.jvm.internal.l.f(response, "response");
        a(Integer.valueOf(i));
        if (b(response, i)) {
            Map<String, String> map = response.f30837c;
            if (map == null) {
                map = C2100u.f18582b;
            }
            a(map);
            String strA = hf0.a(map, gh0.f27719e);
            if (strA == null) {
                strA = "";
            }
            ns.f30987c.getClass();
            ns nsVarA = ns.a.a(strA);
            if (nsVarA == this.f33635C.b()) {
                a8<T> a8VarA = a(response, map, nsVarA);
                if (204 != i) {
                    rq1<a8<T>> rq1VarA = rq1.a(a8VarA, hh0.a(response));
                    kotlin.jvm.internal.l.e(rq1VarA, "success(...)");
                    return rq1VarA;
                }
            }
        }
        int i10 = C4093d3.f25936d;
        rq1<a8<T>> rq1VarA2 = rq1.a(C4093d3.a.a(response));
        kotlin.jvm.internal.l.e(rq1VarA2, "error(...)");
        return rq1VarA2;
    }

    public boolean b(nc1 networkResponse, int i) {
        byte[] bArr;
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        if (200 == i && (bArr = networkResponse.f30836b) != null) {
            if (!(bArr.length == 0)) {
                return true;
            }
        }
        return false;
    }

    private final void a(Context context) {
        Integer numX;
        du1 du1VarA = ew1.a.a().a(context);
        a(this.f33640H.a(context, (du1VarA == null || (numX = du1VarA.X()) == null) ? this.f33635C.h() : numX.intValue()));
    }
}
