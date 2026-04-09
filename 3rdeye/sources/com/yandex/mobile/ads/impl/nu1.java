package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2100u;
import com.yandex.mobile.ads.impl.C4093d3;
import com.yandex.mobile.ads.impl.ew1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class nu1 extends kk<du1> {

    /* renamed from: A, reason: collision with root package name */
    private final gq1 f31018A;

    /* renamed from: x, reason: collision with root package name */
    private final Context f31019x;

    /* renamed from: y, reason: collision with root package name */
    private final bq1<du1> f31020y;

    /* renamed from: z, reason: collision with root package name */
    private final Map<String, String> f31021z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu1(Context context, String url, ou1 requestPolicy, Map customHeaders, pu1 requestListener, pu1 listener) {
        super(context, 0, url, listener, requestListener);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        kotlin.jvm.internal.l.f(customHeaders, "customHeaders");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31019x = context;
        this.f31020y = requestPolicy;
        this.f31021z = customHeaders;
        r();
        s();
        this.f31018A = gq1.f27873c;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final rq1<du1> a(nc1 response) {
        EnumC4135j3 enumC4135j3;
        kotlin.jvm.internal.l.f(response, "response");
        a(Integer.valueOf(response.f30835a));
        if (200 == response.f30835a) {
            du1 du1VarA = this.f31020y.a(response);
            if (du1VarA != null) {
                Map<String, String> map = response.f30837c;
                if (map == null) {
                    map = C2100u.f18582b;
                }
                a(map);
                rq1<du1> rq1VarA = rq1.a(du1VarA, hh0.a(response));
                kotlin.jvm.internal.l.e(rq1VarA, "success(...)");
                return rq1VarA;
            }
            enumC4135j3 = EnumC4135j3.f28933c;
        } else {
            enumC4135j3 = EnumC4135j3.f28935e;
        }
        rq1<du1> rq1VarA2 = rq1.a(new C4093d3(enumC4135j3, response));
        kotlin.jvm.internal.l.e(rq1VarA2, "error(...)");
        return rq1VarA2;
    }

    @Override // com.yandex.mobile.ads.impl.kk, com.yandex.mobile.ads.impl.op1
    public final fi2 b(fi2 volleyError) {
        kotlin.jvm.internal.l.f(volleyError, "volleyError");
        fp0.c(new Object[0]);
        int i = C4093d3.f25936d;
        return super.b((fi2) C4093d3.a.a(volleyError));
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final Map<String, String> e() throws th {
        HashMap map = new HashMap();
        Context context = this.f31019x;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA != null && du1VarA.i0()) {
            map.put(gh0.f27707U.a(), "1");
        }
        map.putAll(this.f31021z);
        return map;
    }

    @Override // com.yandex.mobile.ads.impl.kk
    public final gq1 w() {
        return this.f31018A;
    }
}
