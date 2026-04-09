package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class yf {

    /* renamed from: a, reason: collision with root package name */
    private final float f35780a;

    public yf(float f10) {
        this.f35780a = f10 == 0.0f ? 1.7777778f : f10;
    }

    public final int a(int i) {
        return Math.round(i / this.f35780a);
    }

    public final int b(int i) {
        return Math.round(i * this.f35780a);
    }
}
