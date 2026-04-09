package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class uc0 implements g62, n82 {

    /* renamed from: a, reason: collision with root package name */
    private final as f34025a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f34026b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34027c;

    public uc0(as contentPresenter) {
        kotlin.jvm.internal.l.f(contentPresenter, "contentPresenter");
        this.f34025a = contentPresenter;
    }

    @Override // com.yandex.mobile.ads.impl.g62
    public final void a(Map<String, String> map) {
        this.f34026b = map;
    }

    @Override // com.yandex.mobile.ads.impl.n82
    public final void a(boolean z10) {
        this.f34027c = z10;
        this.f34025a.a(z10);
    }

    public final tc0 a() {
        return new tc0(this.f34027c, this.f34026b);
    }
}
