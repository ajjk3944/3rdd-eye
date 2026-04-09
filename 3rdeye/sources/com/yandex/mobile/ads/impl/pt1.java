package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pt1 implements e8 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f31914a;

    public pt1(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f31914a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.e8
    public final jp1 a() {
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(this.f31914a.m(), "ad_source");
        jp1Var.b(this.f31914a.o(), "ad_type_format");
        jp1Var.b(this.f31914a.p(), "block_id");
        jp1Var.b(this.f31914a.p(), Constants.ADMON_AD_UNIT_ID);
        jp1Var.b(this.f31914a.H(), "product_type");
        jp1Var.a(this.f31914a.L(), "server_log_id");
        jp1Var.b(this.f31914a.M().a().a(), "size_type");
        jp1Var.b(Integer.valueOf(this.f31914a.M().getWidth()), "width");
        jp1Var.b(Integer.valueOf(this.f31914a.M().getHeight()), "height");
        jp1Var.a(this.f31914a.a());
        return jp1Var;
    }
}
