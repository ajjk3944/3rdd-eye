package com.yandex.mobile.ads.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class c42<T extends TextView> implements sd<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f25532a;

    /* renamed from: b, reason: collision with root package name */
    private final ArgbEvaluator f25533b;

    /* renamed from: c, reason: collision with root package name */
    private ValueAnimator f25534c;

    public static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f25535a;

        public a(TextView textView) {
            kotlin.jvm.internal.l.f(textView, "textView");
            this.f25535a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            kotlin.jvm.internal.l.f(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                this.f25535a.setTextColor(((Number) animatedValue).intValue());
            }
        }
    }

    public /* synthetic */ c42(int i) {
        this(i, new ArgbEvaluator());
    }

    @Override // com.yandex.mobile.ads.impl.sd
    public final void a(View view) {
        TextView textView = (TextView) view;
        kotlin.jvm.internal.l.f(textView, "textView");
        this.f25534c = ValueAnimator.ofObject(this.f25533b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f25532a));
        a aVar = new a(textView);
        ValueAnimator valueAnimator = this.f25534c;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(aVar);
        }
        ValueAnimator valueAnimator2 = this.f25534c;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(500);
        }
        ValueAnimator valueAnimator3 = this.f25534c;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sd
    public final void cancel() {
        ValueAnimator valueAnimator = this.f25534c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f25534c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public c42(int i, ArgbEvaluator argbEvaluator) {
        kotlin.jvm.internal.l.f(argbEvaluator, "argbEvaluator");
        this.f25532a = i;
        this.f25533b = argbEvaluator;
    }
}
