package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.kk;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class v52<R, T> extends kk<T> {

    /* renamed from: A, reason: collision with root package name */
    private final bd f34391A;

    /* renamed from: B, reason: collision with root package name */
    private final q7 f34392B;

    /* renamed from: x, reason: collision with root package name */
    private final R f34393x;

    /* renamed from: y, reason: collision with root package name */
    private final fq1<R, T> f34394y;

    /* renamed from: z, reason: collision with root package name */
    private final mp1 f34395z;

    public /* synthetic */ v52(Context context, C4072a3 c4072a3, int i, String str, kk.a aVar, Object obj, fq1 fq1Var, yp1 yp1Var, int i10) {
        this(context, c4072a3, i, str, aVar, obj, fq1Var, (i10 & 128) != 0 ? null : yp1Var, c4072a3.q().c(), new bd(context), new q7());
    }

    private final void y() {
        ip1 ip1VarA = this.f34394y.a(this.f34393x);
        this.f34395z.a(ip1VarA);
        String strC = ip1VarA.c();
        ip1.b bVar = ip1.b.f28812k;
        if (kotlin.jvm.internal.l.b(strC, bVar.a())) {
            this.f34391A.a(bVar, ip1VarA.b(), null, null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final rq1<T> a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        int i = networkResponse.f30835a;
        rq1<T> rq1VarA = a(networkResponse, i);
        ip1 ip1VarA = this.f34394y.a(rq1VarA, i, this.f34393x);
        jp1 jp1Var = new jp1(ip1VarA.b(), 2);
        jp1Var.a(hf0.a(networkResponse.f30837c, gh0.f27740x), "server_log_id");
        Map<String, String> map = networkResponse.f30837c;
        if (map != null) {
            jp1Var.a(b8.a(map));
        }
        this.f34395z.a(ip1VarA);
        return rq1VarA;
    }

    public abstract rq1<T> a(nc1 nc1Var, int i);

    @Override // com.yandex.mobile.ads.impl.kk, com.yandex.mobile.ads.impl.op1
    public fi2 b(fi2 requestError) {
        kotlin.jvm.internal.l.f(requestError, "requestError");
        nc1 nc1Var = requestError.f27346b;
        this.f34395z.a(this.f34394y.a(null, nc1Var != null ? nc1Var.f30835a : -1, this.f34393x));
        return super.b(requestError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v52(Context context, C4072a3 adConfiguration, int i, String url, kk.a<T> listener, R r9, fq1<R, T> requestReporter, yp1 yp1Var, mp1 metricaReporter, bd metricaLibraryEventReporter, q7 adRequestRetryPolicyCreator) {
        super(context, i, url, listener, yp1Var);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(requestReporter, "requestReporter");
        kotlin.jvm.internal.l.f(metricaReporter, "metricaReporter");
        kotlin.jvm.internal.l.f(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        kotlin.jvm.internal.l.f(adRequestRetryPolicyCreator, "adRequestRetryPolicyCreator");
        this.f34393x = r9;
        this.f34394y = requestReporter;
        this.f34395z = metricaReporter;
        this.f34391A = metricaLibraryEventReporter;
        this.f34392B = adRequestRetryPolicyCreator;
        a(context);
        r();
        s();
        y();
    }

    private final void a(Context context) {
        Integer numX;
        du1 du1VarA = ew1.a.a().a(context);
        a(this.f34392B.a(context, (du1VarA == null || (numX = du1VarA.X()) == null) ? lh0.a() : numX.intValue()));
    }
}
