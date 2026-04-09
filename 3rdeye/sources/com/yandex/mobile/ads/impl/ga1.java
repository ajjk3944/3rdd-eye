package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class ga1 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final bp1 f27599a;

    /* renamed from: b, reason: collision with root package name */
    private final ov0 f27600b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ga1(Context context, bp1 replayActionView, ov0 ov0Var) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(replayActionView, "replayActionView");
        this.f27599a = replayActionView;
        this.f27600b = ov0Var;
        addView(replayActionView);
        if (ov0Var == 0 || !(ov0Var instanceof View)) {
            return;
        }
        addView((View) ov0Var);
    }

    public final ov0 a() {
        return this.f27600b;
    }

    public final bp1 b() {
        return this.f27599a;
    }
}
