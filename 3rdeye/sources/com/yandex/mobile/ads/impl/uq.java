package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class uq<V extends ViewGroup> implements w00<V> {

    /* renamed from: a, reason: collision with root package name */
    private final w00<V>[] f34177a;

    @SafeVarargs
    public uq(w00<V>... designComponentBinders) {
        kotlin.jvm.internal.l.f(designComponentBinders, "designComponentBinders");
        this.f34177a = designComponentBinders;
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void a(V container) {
        kotlin.jvm.internal.l.f(container, "container");
        for (w00<V> w00Var : this.f34177a) {
            w00Var.a(container);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w00
    public final void c() {
        for (w00<V> w00Var : this.f34177a) {
            w00Var.c();
        }
    }
}
