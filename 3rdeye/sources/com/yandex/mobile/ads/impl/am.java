package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class am {

    /* renamed from: b, reason: collision with root package name */
    private int f24723b;

    public final void b(int i) {
        this.f24723b = i | this.f24723b;
    }

    public final void c() {
        this.f24723b &= Integer.MAX_VALUE;
    }

    public final boolean d() {
        return c(268435456);
    }

    public final boolean e() {
        return c(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean f() {
        return c(4);
    }

    public final boolean g() {
        return c(1);
    }

    public void b() {
        this.f24723b = 0;
    }

    public final boolean c(int i) {
        return (this.f24723b & i) == i;
    }

    public final void d(int i) {
        this.f24723b = i;
    }
}
