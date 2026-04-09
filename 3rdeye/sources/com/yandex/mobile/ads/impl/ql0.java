package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yc2;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class ql0 implements yc2.b {

    /* renamed from: a, reason: collision with root package name */
    private final pb2 f32242a;

    public ql0(tn0 videoAd, pb2 infoDataProvider) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(infoDataProvider, "infoDataProvider");
        this.f32242a = infoDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.yc2.b
    public final jp1 a() {
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(this.f32242a.a(), "product_type");
        return jp1Var;
    }
}
