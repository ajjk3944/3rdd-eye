package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class o81 {

    /* renamed from: a, reason: collision with root package name */
    private final n81 f31295a;

    /* renamed from: b, reason: collision with root package name */
    private final l9 f31296b;

    /* renamed from: c, reason: collision with root package name */
    private final h41 f31297c;

    public /* synthetic */ o81(vu1 vu1Var) {
        this(vu1Var, new n81(), new l9(), new h41(vu1Var));
    }

    public final ArrayList a(Context context, j41 j41Var, ej0 ej0Var, j51 j51Var, ac0 ac0Var, v41 v41Var) {
        Context context2 = context;
        ej0 imageProvider = ej0Var;
        kotlin.jvm.internal.l.f(context2, "context");
        j41 nativeAdBlock = j41Var;
        kotlin.jvm.internal.l.f(nativeAdBlock, "nativeAdBlock");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        j51 nativeAdFactoriesProvider = j51Var;
        kotlin.jvm.internal.l.f(nativeAdFactoriesProvider, "nativeAdFactoriesProvider");
        ac0 forceController = ac0Var;
        kotlin.jvm.internal.l.f(forceController, "forceController");
        v41 nativeAdControllers = v41Var;
        kotlin.jvm.internal.l.f(nativeAdControllers, "nativeAdControllers");
        ArrayList arrayList = new ArrayList();
        List<w31> listE = nativeAdBlock.c().e();
        ub1 ub1VarD = nativeAdFactoriesProvider.d();
        for (w31 w31Var : listE) {
            tb1 tb1VarA = ub1VarD.a(w31Var);
            d61 d61Var = new d61(context2, w31Var, imageProvider, tb1VarA);
            el elVarA = this.f31297c.a(context2, nativeAdBlock, this.f31296b.a(w31Var), tb1VarA, nativeAdFactoriesProvider, forceController, w31Var, e9.f26737d);
            m81 m81VarA = this.f31295a.a(w31Var.g());
            if (m81VarA != null) {
                context2 = context;
                arrayList.add(m81VarA.a(context2, w31Var, d61Var, imageProvider, elVarA, nativeAdControllers));
            } else {
                context2 = context;
            }
            nativeAdBlock = j41Var;
            imageProvider = ej0Var;
            nativeAdFactoriesProvider = j51Var;
            forceController = ac0Var;
            nativeAdControllers = v41Var;
        }
        return arrayList;
    }

    public o81(vu1 sdkEnvironmentModule, n81 nativeGenericAdCreatorProvider, l9 adUnitAdNativeVisualBlockCreator, h41 nativeAdBinderConfigurationCreator) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(nativeGenericAdCreatorProvider, "nativeGenericAdCreatorProvider");
        kotlin.jvm.internal.l.f(adUnitAdNativeVisualBlockCreator, "adUnitAdNativeVisualBlockCreator");
        kotlin.jvm.internal.l.f(nativeAdBinderConfigurationCreator, "nativeAdBinderConfigurationCreator");
        this.f31295a = nativeGenericAdCreatorProvider;
        this.f31296b = adUnitAdNativeVisualBlockCreator;
        this.f31297c = nativeAdBinderConfigurationCreator;
    }
}
