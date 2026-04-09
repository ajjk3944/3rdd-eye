package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2100u;
import com.yandex.mobile.ads.impl.C4093d3;
import com.yandex.mobile.ads.impl.C4142k3;
import d9.C4285c;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ai2 extends v52<bi2, xh2> {

    /* renamed from: C, reason: collision with root package name */
    private final C4072a3 f24685C;

    /* renamed from: D, reason: collision with root package name */
    private final zh2 f24686D;

    /* renamed from: E, reason: collision with root package name */
    private final ii2 f24687E;

    /* renamed from: F, reason: collision with root package name */
    private final gq1 f24688F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(Context context, C4072a3 adConfiguration, String url, mi2 listener, bi2 configuration, ei2 requestReporter, zh2 vmapParser, ii2 volleyNetworkResponseDecoder) {
        super(context, adConfiguration, 0, url, listener, configuration, requestReporter, null, 1920);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(requestReporter, "requestReporter");
        kotlin.jvm.internal.l.f(vmapParser, "vmapParser");
        kotlin.jvm.internal.l.f(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        this.f24685C = adConfiguration;
        this.f24686D = vmapParser;
        this.f24687E = volleyNetworkResponseDecoder;
        fp0.e(url);
        this.f24688F = gq1.f27874d;
    }

    @Override // com.yandex.mobile.ads.impl.v52
    public final rq1<xh2> a(nc1 networkResponse, int i) {
        byte[] bArr;
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        a(Integer.valueOf(i));
        if (200 != i || (bArr = networkResponse.f30836b) == null || bArr.length == 0) {
            int i10 = C4093d3.f25936d;
            rq1<xh2> rq1VarA = rq1.a(new fi2(C4142k3.a.a(null, C4093d3.a.a(networkResponse).a()).c()));
            kotlin.jvm.internal.l.e(rq1VarA, "error(...)");
            return rq1VarA;
        }
        String strA = this.f24687E.a(networkResponse);
        Map map = networkResponse.f30837c;
        if (map == null) {
            map = C2100u.f18582b;
        }
        pj pjVar = new pj(map);
        if (strA == null || strA.length() == 0) {
            rq1<xh2> rq1VarA2 = rq1.a(new wf1("Can't parse VMAP response"));
            kotlin.jvm.internal.l.c(rq1VarA2);
            return rq1VarA2;
        }
        try {
            rq1<xh2> rq1VarA3 = rq1.a(this.f24686D.a(strA, pjVar), null);
            kotlin.jvm.internal.l.e(rq1VarA3, "success(...)");
            return rq1VarA3;
        } catch (Exception e4) {
            rq1<xh2> rq1VarA4 = rq1.a(new wf1(e4));
            kotlin.jvm.internal.l.e(rq1VarA4, "error(...)");
            return rq1VarA4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final Map<String, String> e() {
        C4285c c4285c = new C4285c();
        c4285c.putAll(this.f24685C.k().d());
        return c4285c.c();
    }

    @Override // com.yandex.mobile.ads.impl.kk
    public final gq1 w() {
        return this.f24688F;
    }
}
