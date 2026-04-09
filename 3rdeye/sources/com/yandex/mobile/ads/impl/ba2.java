package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
final class ba2 extends kotlin.jvm.internal.m implements p9.l<cn1, cn1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ca2 f25150b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v92 f25151c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4072a3 f25152d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f25153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(ca2 ca2Var, v92 v92Var, C4072a3 c4072a3, Context context) {
        super(1);
        this.f25150b = ca2Var;
        this.f25151c = v92Var;
        this.f25152d = c4072a3;
        this.f25153e = context;
    }

    @Override // p9.l
    public final cn1 invoke(cn1 cn1Var) {
        cn1 queryParams = cn1Var;
        kotlin.jvm.internal.l.f(queryParams, "queryParams");
        ca2 ca2Var = this.f25150b;
        v92 v92Var = this.f25151c;
        C4072a3 c4072a3 = this.f25152d;
        Context context = this.f25153e;
        queryParams.a("charset", Constants.ENCODING);
        ca2Var.f25581a.getClass();
        queryParams.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        Map<String, String> mapA = v92Var.a();
        if (mapA != null) {
            for (Map.Entry<String, String> entry : mapA.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!y9.q.i0(key)) {
                    queryParams.a(key, value);
                }
            }
        }
        j50 j50VarK = c4072a3.k();
        ca2Var.f25583c.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        if (!zw1.a(context)) {
            queryParams.a(CommonUrlParts.UUID, j50VarK.g());
            queryParams.a("mauid", j50VarK.e());
        }
        ca2Var.f25582b.getClass();
        bq.a(context, queryParams);
        new l50(context, c4072a3).a(context, queryParams);
        return queryParams;
    }
}
