package com.yandex.mobile.ads.impl;

import com.singular.sdk.internal.Constants;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class px0 implements e8 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f31943a;

    public px0(a8<?> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f31943a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.e8
    public final jp1 a() {
        jp1 jp1Var = new jp1(new HashMap(), 2);
        jp1Var.b(this.f31943a.m(), "ad_source");
        jp1Var.b(this.f31943a.p(), "block_id");
        jp1Var.b(this.f31943a.p(), Constants.ADMON_AD_UNIT_ID);
        jp1Var.a(this.f31943a.L(), "server_log_id");
        jp1Var.a(this.f31943a.a());
        return jp1Var;
    }
}
