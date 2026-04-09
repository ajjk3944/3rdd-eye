package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class c22<T extends View> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final T f25519b;

    /* renamed from: c, reason: collision with root package name */
    private final sd<T> f25520c;

    public c22(T view, sd<T> animator) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(animator, "animator");
        this.f25519b = view;
        this.f25520c = animator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25520c.a(this.f25519b);
    }
}
