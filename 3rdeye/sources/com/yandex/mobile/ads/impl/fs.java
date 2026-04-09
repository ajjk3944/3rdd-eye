package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class fs implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final a31 f27441a;

    /* renamed from: b, reason: collision with root package name */
    private final w21 f27442b;

    public static final class a extends fs {

        /* renamed from: c, reason: collision with root package name */
        private final h31 f27443c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h31 multiBannerSwiper, a31 multiBannerEventTracker, w21 w21Var) {
            super(multiBannerEventTracker, w21Var, 0);
            kotlin.jvm.internal.l.f(multiBannerSwiper, "multiBannerSwiper");
            kotlin.jvm.internal.l.f(multiBannerEventTracker, "multiBannerEventTracker");
            this.f27443c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.fs, android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f27443c.b();
            super.onClick(view);
        }
    }

    public static final class b extends fs {

        /* renamed from: c, reason: collision with root package name */
        private final h31 f27444c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h31 multiBannerSwiper, a31 multiBannerEventTracker, w21 w21Var) {
            super(multiBannerEventTracker, w21Var, 0);
            kotlin.jvm.internal.l.f(multiBannerSwiper, "multiBannerSwiper");
            kotlin.jvm.internal.l.f(multiBannerEventTracker, "multiBannerEventTracker");
            this.f27444c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.fs, android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f27444c.a();
            super.onClick(view);
        }
    }

    private fs(a31 a31Var, w21 w21Var) {
        this.f27441a = a31Var;
        this.f27442b = w21Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        w21 w21Var = this.f27442b;
        if (w21Var != null) {
            w21Var.a();
        }
        this.f27441a.b();
    }

    public /* synthetic */ fs(a31 a31Var, w21 w21Var, int i) {
        this(a31Var, w21Var);
    }
}
