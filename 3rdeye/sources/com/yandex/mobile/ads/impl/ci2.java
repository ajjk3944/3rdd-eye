package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ci2 {

    /* renamed from: g, reason: collision with root package name */
    private static final String f25661g = "https://yandex.ru/ads";

    /* renamed from: a, reason: collision with root package name */
    private final n7 f25662a;

    /* renamed from: b, reason: collision with root package name */
    private final ei2 f25663b;

    /* renamed from: c, reason: collision with root package name */
    private final vp1 f25664c;

    /* renamed from: d, reason: collision with root package name */
    private final bq f25665d;

    /* renamed from: e, reason: collision with root package name */
    private final f50 f25666e;

    /* renamed from: f, reason: collision with root package name */
    private final zw1 f25667f;

    public ci2(n7 adRequestProvider, ei2 requestReporter, vp1 requestHelper, bq cmpRequestConfigurator, f50 encryptedQueryConfigurator, zw1 sensitiveModeChecker) {
        kotlin.jvm.internal.l.f(adRequestProvider, "adRequestProvider");
        kotlin.jvm.internal.l.f(requestReporter, "requestReporter");
        kotlin.jvm.internal.l.f(requestHelper, "requestHelper");
        kotlin.jvm.internal.l.f(cmpRequestConfigurator, "cmpRequestConfigurator");
        kotlin.jvm.internal.l.f(encryptedQueryConfigurator, "encryptedQueryConfigurator");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        this.f25662a = adRequestProvider;
        this.f25663b = requestReporter;
        this.f25664c = requestHelper;
        this.f25665d = cmpRequestConfigurator;
        this.f25666e = encryptedQueryConfigurator;
        this.f25667f = sensitiveModeChecker;
    }

    public final ai2 a(Context context, C4072a3 adConfiguration, bi2 requestConfiguration, Object requestTag, di2 requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        String strA = requestConfiguration.a();
        String strB = requestConfiguration.b();
        n7 n7Var = this.f25662a;
        Map<String, String> parameters = requestConfiguration.getParameters();
        n7Var.getClass();
        HashMap mapA = n7.a(parameters);
        j50 j50VarK = adConfiguration.k();
        String strG = j50VarK.g();
        String strE = j50VarK.e();
        String strA2 = j50VarK.a();
        if (strA2 == null || strA2.length() == 0) {
            strA2 = f25661g;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(strA2).buildUpon().appendPath("v2").appendPath("vmap").appendPath(strA).appendQueryParameter("video-category-id", strB);
        this.f25667f.getClass();
        if (!zw1.a(context)) {
            vp1 vp1Var = this.f25664c;
            kotlin.jvm.internal.l.c(builderAppendQueryParameter);
            vp1Var.getClass();
            if (strG != null && strG.length() != 0) {
                kotlin.jvm.internal.l.c(builderAppendQueryParameter.appendQueryParameter(CommonUrlParts.UUID, strG));
            }
            this.f25664c.getClass();
            if (strE != null && strE.length() != 0) {
                kotlin.jvm.internal.l.c(builderAppendQueryParameter.appendQueryParameter("mauid", strE));
            }
        }
        bq bqVar = this.f25665d;
        kotlin.jvm.internal.l.c(builderAppendQueryParameter);
        bqVar.a(context, builderAppendQueryParameter);
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        new l50(context, adConfiguration).a(context, builderAppendQueryParameter);
        for (bn1 bn1Var : j50VarK.f()) {
            builderAppendQueryParameter.appendQueryParameter(bn1Var.getKey(), bn1Var.getValue());
        }
        f50 f50Var = this.f25666e;
        String string = builderAppendQueryParameter.build().toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        ai2 ai2Var = new ai2(context, adConfiguration, f50Var.a(context, string), new mi2(requestListener), requestConfiguration, this.f25663b, new zh2(), mc1.a());
        ai2Var.b(requestTag);
        return ai2Var;
    }
}
