package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.kk;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class eh1 extends kk<nc1> {

    /* renamed from: x, reason: collision with root package name */
    private static final int f26868x = (int) TimeUnit.SECONDS.toMillis(10);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(Context context, String url, kk.a<nc1> listener) {
        super(context, url, listener);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(listener, "listener");
        a(context);
        r();
        s();
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final rq1<nc1> a(nc1 response) {
        kotlin.jvm.internal.l.f(response, "response");
        rq1<nc1> rq1VarA = rq1.a(response, hh0.a(response));
        kotlin.jvm.internal.l.e(rq1VarA, "success(...)");
        return rq1VarA;
    }

    private final void a(Context context) {
        Integer numL;
        Integer numW;
        du1 du1VarA = ew1.a.a().a(context);
        int iIntValue = (du1VarA == null || (numW = du1VarA.W()) == null) ? f26868x : numW.intValue();
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA2 = ew1.a.a().a(context);
        a(new h00(1.0f, iIntValue, (du1VarA2 == null || (numL = du1VarA2.L()) == null) ? 0 : numL.intValue()));
    }
}
