package com.yandex.mobile.ads.impl;

import d9.C4285c;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q41 {

    /* renamed from: a, reason: collision with root package name */
    private final String f32063a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32064b;

    /* renamed from: c, reason: collision with root package name */
    private final o71 f32065c;

    public q41(String assetName, String clickActionType, o71 o71Var) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        kotlin.jvm.internal.l.f(clickActionType, "clickActionType");
        this.f32063a = assetName;
        this.f32064b = clickActionType;
        this.f32065c = o71Var;
    }

    public final Map<String, Object> a() {
        C4285c c4285c = new C4285c();
        c4285c.put("asset_name", this.f32063a);
        c4285c.put("action_type", this.f32064b);
        o71 o71Var = this.f32065c;
        if (o71Var != null) {
            c4285c.putAll(o71Var.a().b());
        }
        return c4285c.c();
    }
}
