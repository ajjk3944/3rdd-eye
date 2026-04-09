package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ob2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final fc2<T> f31337a;

    public ob2(fc2<T> videoAdPlaybackInfoCreator) {
        kotlin.jvm.internal.l.f(videoAdPlaybackInfoCreator, "videoAdPlaybackInfoCreator");
        this.f31337a = videoAdPlaybackInfoCreator;
    }

    public final mb2<T> a(ea2 vastVideoAdData, int i, int i10) {
        kotlin.jvm.internal.l.f(vastVideoAdData, "vastVideoAdData");
        za2 za2VarE = vastVideoAdData.e();
        nu nuVarB = vastVideoAdData.b();
        sv0 sv0VarC = vastVideoAdData.c();
        w02 w02VarD = vastVideoAdData.d();
        String strF = vastVideoAdData.f();
        JSONObject jSONObjectG = vastVideoAdData.g();
        mc2 mc2Var = new mc2(i, i10 + 1);
        i9 i9VarA = vastVideoAdData.a();
        return new mb2<>(nuVarB, za2VarE, sv0VarC, this.f31337a.a(za2VarE, nuVarB, sv0VarC, mc2Var, strF, i9VarA != null ? j9.a(i9VarA) : null, jSONObjectG), w02VarD, String.valueOf(hi0.a()), i9VarA);
    }
}
