package com.yandex.mobile.ads.impl;

import c9.C2097r;
import com.yandex.mobile.ads.impl.or1;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qr1 {

    /* renamed from: a, reason: collision with root package name */
    private final lj f32329a;

    public /* synthetic */ qr1() {
        this(new lj());
    }

    public final or1 a(qq1 networkResponse) throws NumberFormatException {
        Integer numValueOf;
        String strA;
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        Map<String, String> responseHeaders = networkResponse.b();
        gh0 httpHeader = gh0.f27688B;
        int i = hf0.f28193b;
        kotlin.jvm.internal.l.f(responseHeaders, "responseHeaders");
        kotlin.jvm.internal.l.f(httpHeader, "httpHeader");
        String strA2 = hf0.a(responseHeaders, httpHeader);
        int i10 = aa.f24578b;
        gx1 gx1Var = null;
        if (strA2 != null) {
            try {
                numValueOf = Integer.valueOf(strA2);
            } catch (NumberFormatException unused) {
            }
        } else {
            numValueOf = null;
        }
        String strA3 = hf0.a(responseHeaders, gh0.f27690D);
        if (strA3 != null) {
            this.f32329a.getClass();
            strA = lj.a(strA3);
        } else {
            strA = null;
        }
        bp bpVar = (numValueOf == null || strA == null || strA.length() <= 0) ? null : new bp(numValueOf.intValue(), strA);
        gh0 header = gh0.f27691E;
        kotlin.jvm.internal.l.f(header, "header");
        String str = (String) C2097r.q0(hf0.c(responseHeaders, header));
        if (str != null && str.length() > 0) {
            gx1Var = new gx1(str);
        }
        gh0 httpHeader2 = gh0.f27696J;
        kotlin.jvm.internal.l.f(httpHeader2, "httpHeader");
        String strA4 = hf0.a(responseHeaders, httpHeader2);
        return new or1.a().a(bpVar).a(gx1Var).a(strA4 == null ? false : Boolean.parseBoolean(strA4)).a();
    }

    public qr1(lj base64Decoder) {
        kotlin.jvm.internal.l.f(base64Decoder, "base64Decoder");
        this.f32329a = base64Decoder;
    }
}
