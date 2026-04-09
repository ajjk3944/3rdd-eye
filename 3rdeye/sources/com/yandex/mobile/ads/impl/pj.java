package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class pj implements qj {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31773a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31774b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj(Map map) {
        this(map, hf0.a((Map<String, String>) map, gh0.f27720e0, true), hf0.a((Map<String, String>) map, gh0.f27722f0, true));
        hf0.a((Map<String, String>) map, gh0.f27718d0, true);
    }

    @Override // com.yandex.mobile.ads.impl.qj
    public final boolean a() {
        return this.f31774b;
    }

    @Override // com.yandex.mobile.ads.impl.qj
    public final boolean b() {
        return this.f31773a;
    }

    public pj(Map headers, boolean z10, boolean z11) {
        kotlin.jvm.internal.l.f(headers, "headers");
        this.f31773a = z10;
        this.f31774b = z11;
    }
}
