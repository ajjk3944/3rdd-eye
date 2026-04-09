package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class po0 extends kk<mx> {

    /* renamed from: x, reason: collision with root package name */
    private final Context f31854x;

    /* renamed from: y, reason: collision with root package name */
    private final bq1<mx> f31855y;

    /* renamed from: z, reason: collision with root package name */
    private final Map<String, String> f31856z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po0(Context context, String url, bq1 requestPolicy, Map customHeaders, al0 listener) {
        super(context, url, listener);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        kotlin.jvm.internal.l.f(customHeaders, "customHeaders");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31854x = context;
        this.f31855y = requestPolicy;
        this.f31856z = customHeaders;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final rq1<mx> a(nc1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        if (200 != response.f30835a) {
            rq1<mx> rq1VarA = rq1.a(new C4093d3(EnumC4135j3.f28935e, response));
            kotlin.jvm.internal.l.c(rq1VarA);
            return rq1VarA;
        }
        mx mxVarA = this.f31855y.a(response);
        rq1<mx> rq1VarA2 = mxVarA != null ? rq1.a(mxVarA, hh0.a(response)) : rq1.a(new C4093d3(EnumC4135j3.f28933c, response));
        kotlin.jvm.internal.l.c(rq1VarA2);
        return rq1VarA2;
    }

    @Override // com.yandex.mobile.ads.impl.kk, com.yandex.mobile.ads.impl.op1
    public final fi2 b(fi2 volleyError) {
        kotlin.jvm.internal.l.f(volleyError, "volleyError");
        fp0.c(new Object[0]);
        return super.b(volleyError);
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final Map<String, String> e() {
        HashMap map = new HashMap();
        Context context = this.f31854x;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        if (du1VarA != null && du1VarA.i0()) {
            map.put(gh0.f27707U.a(), "1");
        }
        map.putAll(this.f31856z);
        return map;
    }
}
