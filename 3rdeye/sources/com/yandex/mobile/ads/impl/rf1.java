package com.yandex.mobile.ads.impl;

import Q1.f;

/* loaded from: classes3.dex */
public final class rf1 extends f.e {

    /* renamed from: a, reason: collision with root package name */
    private final a31 f32609a;

    /* renamed from: b, reason: collision with root package name */
    private final w21 f32610b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f32611c;

    public rf1(a31 multiBannerEventTracker, w21 w21Var) {
        kotlin.jvm.internal.l.f(multiBannerEventTracker, "multiBannerEventTracker");
        this.f32609a = multiBannerEventTracker;
        this.f32610b = w21Var;
    }

    @Override // Q1.f.e
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.f32611c = false;
        } else {
            if (i != 1) {
                return;
            }
            w21 w21Var = this.f32610b;
            if (w21Var != null) {
                w21Var.a();
            }
            this.f32611c = true;
        }
    }

    @Override // Q1.f.e
    public final void onPageSelected(int i) {
        if (this.f32611c) {
            this.f32609a.c();
            this.f32611c = false;
        }
    }
}
