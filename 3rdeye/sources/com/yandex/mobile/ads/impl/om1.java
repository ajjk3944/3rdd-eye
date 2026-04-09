package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class om1 implements js1 {

    /* renamed from: a, reason: collision with root package name */
    private js1 f31440a;

    @Override // com.yandex.mobile.ads.impl.js1
    public final void a(dw1 reward) {
        kotlin.jvm.internal.l.f(reward, "reward");
        js1 js1Var = this.f31440a;
        if (js1Var != null) {
            js1Var.a(reward);
        }
    }

    public final void a(js1 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31440a = listener;
    }
}
