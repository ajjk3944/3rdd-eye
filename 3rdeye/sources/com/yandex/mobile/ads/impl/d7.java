package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class d7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private og0 f25998b;

    public final void a(og0 og0Var) {
        this.f25998b = og0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        og0 og0Var = this.f25998b;
        if (og0Var != null) {
            og0Var.a(i7.l());
        }
    }
}
